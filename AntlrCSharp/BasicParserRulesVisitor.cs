using System;
using System.Globalization;
using Antlr4.Runtime.Misc;
using AntlrCSharp;
using static ParserRulesParser;

//for(int i=0;i<10;i=i+1){if((i%2)==0){continue;}i;}
public class BasicParserRulesVisitor : ParserRulesBaseVisitor<Variable> 
{
	VariableEnvironment variableEnvironment = new VariableEnvironment();
	VariableType returnType = VariableType.NULL;

	static Dictionary<string, FunctionContext> functions = new();
	static readonly Variable _nullValue = new Variable(VariableType.NULL, null);
	static readonly Variable _breakValue = new Variable(VariableType.BREAK_HNDL, null);
	static readonly Variable _continueValue = new Variable(VariableType.CONTINUE_HNDL, null);
	static readonly string entryPoint = "main";


	public override Variable VisitProgram([NotNull] ProgramContext context)
	{
		foreach (FunctionContext func in context.function())
		{
			functions.Add(func.IDENTIFIER().GetText(), func);
		}
		if(!functions.ContainsKey(entryPoint)) throw new LanguageError($"No entry function named:{entryPoint}");
		VisitFunction(functions[entryPoint]);
		return _nullValue;
	}

	public static void ClearFunctions()
	{
		functions.Clear();
	}

	public override Variable VisitFunction([NotNull] FunctionContext context)
	{
		returnType = VisitType(context.type()).type;
		foreach(StatementContext stmnt in context.statement())
		{
			Variable value = VisitStatement(stmnt);
			if (value.type == VariableType.RETURN_HNDL) return (Variable)value.value;
		}
		return _nullValue;
	}

	public override Variable VisitCall([NotNull] CallContext context)
	{
		string funcName = context.IDENTIFIER().GetText();
		if (!functions.ContainsKey(funcName)) throw new LanguageError($"No function named:{funcName}");

		BasicParserRulesVisitor visitor = new BasicParserRulesVisitor();

		ExpressionContext[] paramValues = context.expression();
		ParameterContext[] paramIdentifiers = functions[funcName].parameter();
		if (paramIdentifiers.Length != paramValues.Length) throw new LanguageError($"Number of parameters in call must be equal to that in definition when calling:{funcName}.");
		for(int i = 0; i < paramValues.Length; i++)
		{//should type check
			visitor.variableEnvironment.AddVariable(paramIdentifiers[i].IDENTIFIER().GetText(),
				VariableEnvironment.ConvertType(VisitExpression(paramValues[i]), VisitType(paramIdentifiers[i].type()).type));
		}
		return visitor.VisitFunction(functions[funcName]);
	}

	public override Variable VisitType([NotNull] TypeContext context)
	{
		VariableType type = VariableType.NULL;
		switch (context.GetText())
		{
			case "int":
				type = VariableType.INT;
				break;
			case "float":
				type = VariableType.FLOAT;
				break;
		}
		return new Variable(type, null);
	}

	public override Variable VisitReturnStatement([NotNull] ReturnStatementContext context)
	{
		if (context.expression() == null) return _nullValue;
		Variable returnValue = VisitExpression(context.expression());
		returnValue = VariableEnvironment.ConvertType(returnValue, returnType);
		return new Variable(VariableType.RETURN_HNDL, returnValue);
	}

	public override Variable VisitBreakStatement([NotNull] BreakStatementContext context)
	{
		return _breakValue;
	}

	public override Variable VisitContinueStatement([NotNull] ContinueStatementContext context)
	{
		return _continueValue;
	}

	public override Variable VisitIfStatement([NotNull] IfStatementContext context)
	{
		if(isTrue(VisitGrouping(context.GetChild<GroupingContext>(0))))
		{
			return VisitBlockStatement(context.GetChild<BlockStatementContext>(0));
		}else if(context.ChildCount > 3)
		{
			return VisitBlockStatement(context.GetChild<BlockStatementContext>(1));
		}
		return _nullValue;
	}

	public override Variable VisitStatement([NotNull] StatementContext context)
	{
		return Visit(context.GetChild(0));
	}

	public override Variable VisitVariableDeclaration([NotNull] VariableDeclarationContext context)
	{
		return VisitVariableDeclarationExpression(context.variableDeclarationExpression());
	}

	public override Variable VisitVariableDeclarationExpression([NotNull] VariableDeclarationExpressionContext context)
	{
		VariableType type = VisitType(context.type()).type;
		Variable value = new Variable(type, null);

		
		if (context.expression() != null) value = VisitExpression(context.expression());
		value = VariableEnvironment.ConvertType(value, type);

		variableEnvironment.AddVariable(context.IDENTIFIER().GetText(), value);
		return _nullValue;
	}

	public override Variable VisitBlockStatement([NotNull] BlockStatementContext context)
	{
		UpScope();
		for(int i = 1; i < context.children.Count - 1; i++)
		{
			Variable val = Visit(context.GetChild(i));
			if (val.type == VariableType.CONTINUE_HNDL || val.type == VariableType.BREAK_HNDL || val.type == VariableType.RETURN_HNDL) { DownScope(); return val; }
		}
		DownScope();
		return _nullValue;
	}

	public override Variable VisitWhileStatement([NotNull] WhileStatementContext context)
	{
		while(isTrue(Visit(context.GetChild(1))))
		{
			Variable val = Visit(context.GetChild(2));
			if (val.type == VariableType.CONTINUE_HNDL) continue;
			if (val.type == VariableType.BREAK_HNDL) break;
			if (val.type == VariableType.RETURN_HNDL) return val;
		}
		return _nullValue;
	}

	public override Variable VisitForStatement([NotNull] ForStatementContext context)
	{
		UpScope();
		VisitVariableDeclarationExpression(context.GetChild<VariableDeclarationExpressionContext>(0));
		while (isTrue(VisitExpression(context.GetChild<ExpressionContext>(0))))
		{
			Variable val = VisitBlockStatement(context.GetChild<BlockStatementContext>(0));
			if (val.type == VariableType.RETURN_HNDL) 
			{
				DownScope();
				return val; 
			}
			if (val.type == VariableType.BREAK_HNDL) break;
			VisitExpression(context.GetChild<ExpressionContext>(1));
			if (val.type == VariableType.CONTINUE_HNDL) continue;
		}
		DownScope();
		return _nullValue;
	}

	public override Variable VisitExpressionStatement([NotNull] ExpressionStatementContext context)
	{
		//Console.WriteLine do usuniêcia póŸniej
		object val = VisitExpression(context.expression()).value;
		Console.WriteLine(val);
		return _nullValue;
	}
	public override Variable VisitExpression([NotNull] ExpressionContext context)
	{
		return VisitTernary(context.ternary());
	}

	public override Variable VisitTernary([NotNull] TernaryContext context)
	{
		if (context.ChildCount > 1) { 
			return isTrue(VisitBinaryLogic(context.binaryLogic())) 
				? VisitExpression(context.expression(0)) : VisitExpression(context.expression(1));
		} 
		else 
			return VisitBinaryLogic(context.binaryLogic());
	}

	public override Variable VisitBinaryLogic([NotNull] BinaryLogicContext context)
	{
		Variable leftVal = VisitBinaryCompare(context.binaryCompare());
		if (context.ChildCount > 1)
		{
			return binaryLogicCalculate(leftVal, VisitBinaryLogic(context.binaryLogic()), context.binaryLogicOp().GetText());
		}
		else
			return leftVal;
	}

	private Variable binaryLogicCalculate(Variable leftVal, Variable rightVal, string operand)
	{
		switch (operand[0])
		{
			case '&':
				return new Variable(VariableType.INT, isTrue(leftVal) && isTrue(rightVal)?1:0);
			case '|':
				return new Variable(VariableType.INT, isTrue(leftVal) || isTrue(rightVal) ? 1 : 0);
		}
		throw new LanguageError($"Unexpected operand {operand}.");
	}

	public override Variable VisitBinaryCompare([NotNull] BinaryCompareContext context)
	{
		Variable leftVal = VisitBinaryBitwise(context.binaryBitwise());
		if (context.ChildCount > 1)
		{
			return binaryCompareCalculate(leftVal, VisitBinaryCompare(context.binaryCompare()), context.binaryCompareOp().GetText());
		}
		else
			return leftVal;
	}

	private Variable binaryCompareCalculate(Variable leftVal, Variable rightVal, string operand)
	{
		if (!(leftVal.type == VariableType.FLOAT || leftVal.type == VariableType.INT)
			|| !(rightVal.type == VariableType.FLOAT || rightVal.type == VariableType.INT))
			throw new Exception("Cannot use numeric binary operators for non-numeric values");
		float val1 = Convert.ToSingle(leftVal.value);
		float val2 = Convert.ToSingle(rightVal.value);

		if (operand.Length == 2)
		switch (operand[0])
		{
			case '<':
				return new Variable(VariableType.INT, val1 <= val2 ? 1 : 0);
			case '=':
				return new Variable(VariableType.INT, val1 == val2 ? 1 : 0);
			case '>':
				return new Variable(VariableType.INT, val1 >= val2 ? 1 : 0);
			case '!':
				return new Variable(VariableType.INT, val1 != val2 ? 1 : 0);
		}
		if(operand.Length == 1)
		switch (operand[0])
		{
			case '<':
				return new Variable(VariableType.INT, val1 < val2 ? 1 : 0);
			case '>':
				return new Variable(VariableType.INT, val1 > val2 ? 1 : 0);
		}

		throw new LanguageError($"Unexpected operand {operand}.");
	}

    public override Variable VisitBinaryBitwise([NotNull] BinaryBitwiseContext context)
    {
        Variable leftVal = VisitBinaryAdditive(context.binaryAdditive());
        if (context.ChildCount > 1)
        {
            return binaryBitwiseCalculate(leftVal, VisitBinaryBitwise(context.binaryBitwise()), context.binaryBitwiseOp().GetText());
        }
        else
            return leftVal;
    }

    private Variable binaryBitwiseCalculate(Variable leftVal, Variable rightVal, string operand)
    {
		if (leftVal.type != VariableType.INT || rightVal.type != VariableType.INT) throw new LanguageError("Only INT type can be used in binary operations.");
        int val1 = Convert.ToInt32(leftVal.value);
		int val2 = Convert.ToInt32(rightVal.value);
		switch (operand[0])
        {
            case '&':
                return new Variable(VariableType.INT, val1 & val2);
            case '|':
                return new Variable(VariableType.INT, val1 | val2);
			case '^':
                return new Variable(VariableType.INT, val1 ^ val2);
            case '<':
                return new Variable(VariableType.INT, val1 << val2);
            case '>':
                return new Variable(VariableType.INT, val1 >> val2);
        }
        throw new LanguageError($"Unexpected operand {operand}.");
    }

    public override Variable VisitBinaryMultiplicative([NotNull] BinaryMultiplicativeContext context)
    {
        Variable leftVal = VisitPrimary(context.primary());
        if (context.ChildCount > 1)
        {
            return binaryMultiplicativeCalculate(leftVal, VisitBinaryMultiplicative(context.binaryMultiplicative()), context.binaryMultiplicativeOp().GetText());
        }
        else
            return leftVal;
    }

    private Variable binaryMultiplicativeCalculate(Variable leftVal, Variable rightVal, string operand)
    {
        if (!(leftVal.type == VariableType.FLOAT || leftVal.type == VariableType.INT)
            || !(rightVal.type == VariableType.FLOAT || rightVal.type == VariableType.INT))
            throw new Exception("Cannot use numeric binary operators for non-numeric values");

		if(leftVal.type == VariableType.INT && rightVal.type == VariableType.INT)
		{
            int vali1 = Convert.ToInt32(leftVal.value);
            int vali2 = Convert.ToInt32(rightVal.value);
            switch (operand[0])
            {
                case '%':
                    return new Variable(VariableType.INT, vali1 % vali2);
                case '/':
                    return new Variable(VariableType.INT, vali1 / vali2);
                case '*':
                    return new Variable(VariableType.INT, vali1 * vali2);
            }
            throw new LanguageError($"Unexpected operand {operand}.");
        }
        float val1 = Convert.ToSingle(leftVal.value);
        float val2 = Convert.ToSingle(rightVal.value);

            switch (operand[0])
            {
                case '%':
                    return new Variable(VariableType.FLOAT, val1 % val2);
                case '/':
                    return new Variable(VariableType.FLOAT, val1 / val2);
				case '*':
					return new Variable(VariableType.FLOAT, val1 * val2);
        }

        throw new LanguageError($"Unexpected operand {operand}.");
    }

    public override Variable VisitBinaryAdditive([NotNull] BinaryAdditiveContext context)
    {
        Variable leftVal = VisitBinaryMultiplicative(context.binaryMultiplicative());
        if (context.ChildCount > 1)
        {
            return binaryAdditiveCalculate(leftVal, VisitBinaryAdditive(context.binaryAdditive()), context.binaryAdditiveOp().GetText());
        }
        else
            return leftVal;
    }

    private Variable binaryAdditiveCalculate(Variable leftVal, Variable rightVal, string operand)
    {
        if (!(leftVal.type == VariableType.FLOAT || leftVal.type == VariableType.INT)
            || !(rightVal.type == VariableType.FLOAT || rightVal.type == VariableType.INT))
            throw new Exception("Cannot use numeric binary operators for non-numeric values");

		if (leftVal.type == VariableType.INT && rightVal.type == VariableType.INT)
		{
			int vali1 = Convert.ToInt32(leftVal.value);
			int vali2 = Convert.ToInt32(rightVal.value);

            switch (operand[0])
            {
                case '+':
                    return new Variable(VariableType.INT, vali1 + vali2);
                case '-':
                    return new Variable(VariableType.INT, vali1 - vali2);
            }
            throw new LanguageError($"Unexpected operand {operand}.");
        }

        float val1 = Convert.ToSingle(leftVal.value);
        float val2 = Convert.ToSingle(rightVal.value);

        switch (operand[0])
        {
            case '+':
                return new Variable(VariableType.FLOAT, val1 + val2);
            case '-':
                return new Variable(VariableType.FLOAT, val1 - val2);
        }

        throw new LanguageError($"Unexpected operand {operand}.");
    }

    public override Variable VisitPrimary([NotNull] PrimaryContext context)
	{
		return Visit(context.GetChild(0));
	}

	public override Variable VisitGrouping([NotNull] GroupingContext context)
	{
		return Visit(context.expression());
	}

	public override Variable VisitVariableAssignment([NotNull] VariableAssignmentContext context)
	{
		Variable val = VisitExpression(context.expression());
		string id = context.IDENTIFIER().GetText();
		variableEnvironment.UpdateVariable(id, val);

		return val;
	}

	public override Variable VisitVariableAccess([NotNull] VariableAccessContext context)
	{
		return variableEnvironment.GetVariable(context.IDENTIFIER().GetText());
	}

	public override Variable VisitValue([NotNull] ValueContext context)
	{
		return Visit(context.GetChild(0));
	}

	//account for (to be implemented) null type
	public override Variable VisitUnary([NotNull] UnaryContext context)
	{
		Variable val = VisitPrimary(context.primary());
		switch (context.GetChild(0).GetText()[0])
		{
			case '!':
				val.value=!isTrue(val);
				return val;
			case '-':
				if (val.type == VariableType.FLOAT)
				{
					val.value = -(float)val.value;
					return val;
				}
				else if (val.type == VariableType.INT)
				{
					val.value = -(int)val.value;
					return val;
				}
				break;
		}
		throw new LanguageError($"Cannot perform unary operation: {context.GetChild(0).GetText()[0]}");
	}

	public override Variable VisitNumber([NotNull] NumberContext context)
	{
		string num = context.GetText();
		if (num.Contains('.')) 
			return new Variable(VariableType.FLOAT, float.Parse(num, CultureInfo.InvariantCulture.NumberFormat));
		else
			return new Variable(VariableType.INT, int.Parse(num));
	}
	public override Variable VisitTrue([NotNull] TrueContext context)
	{
		return new Variable(VariableType.INT, 1);
	}
	public override Variable VisitFalse([NotNull] FalseContext context)
	{
		return new Variable(VariableType.INT, 0);
	}

	//make it use variable instead
	private bool isTrue(Variable obj)
	{
		if (obj.type == VariableType.INT) return (int)obj.value !=0;
		if (obj.type == VariableType.FLOAT) return (float)obj.value != 0;
		return false;
	}

	//implement order of operations, better type converting, null values
	/*private object binaryCalculate(Variable v1, Variable v2, string op, out VariableType resultType)
	{
		if (!(v1.type == VariableType.FLOAT || v1.type == VariableType.INT) 
			|| !(v2.type  == VariableType.FLOAT || v2.type == VariableType.INT))
			throw new Exception("Cannot use numeric binary operators for non-numeric values");

		if (v1.type == VariableType.FLOAT || v2.type == VariableType.FLOAT)
		{
			float val1 = Convert.ToSingle(v1.value);
			float val2 = Convert.ToSingle(v2.value);
			resultType = VariableType.FLOAT;

			switch (op[0])
			{
				case '+':
					return val1 + val2;
				case '-':
					return val1 - val2;
				case '*':
					return val1 * val2;
				case '/':
					return val1 / val2;
				case '%':
					return val1 % val2;
				case '<':
					if (op[1] == '=') return val1 <= val2?1:0;
					if (op[1] == '<') throw new Exception("No binary operation found for operator: " + op);
					return val1 < val2?1:0;
				case '>':
					if (op[1] == '=') return val1 >= val2 ? 1 : 0;
					if (op[1] == '>') throw new Exception("No binary operation found for operator: " + op);
					return val1 > val2 ? 1 : 0;
				case '!':
					return val1 != val2 ? 1 : 0;
				case '=':
					return val1 == val2 ? 1 : 0;
				case '&':
					if (op[1] == '&') return isTrue(val1) && isTrue(val2) ? 1 : 0;
					throw new Exception("No binary operation found for operator: " + op);
				case '|':
					if (op[1] == '|') return isTrue(val1) || isTrue(val2) ? 1 : 0;
					throw new Exception("No binary operation found for operator: " + op);
				case '^':
				default:
					throw new Exception("No binary operation found for operator: " + op);
			}
		}
		else
		{
			int val1 = Convert.ToInt32(v1.value);
			int val2 = Convert.ToInt32(v2.value);
			resultType = VariableType.INT;

			switch (op[0])
			{
				case '+':
					return val1 + val2;
				case '-':
					return val1 - val2;
				case '*':
					return val1 * val2;
				case '/':
					return val1 / val2;
				case '%':
					return val1 % val2;
				case '<':
					if (op[1] == '=') return val1 <= val2 ? 1 : 0;
					if (op[1] == '<') return val1 << val2;
					return val1 < val2 ? 1 : 0;
				case '>':
					if (op[1] == '=') return val1 >= val2 ? 1 : 0;
					if (op[1] == '>') return val1 >> val2;
					return val1 > val2 ? 1 : 0;
				case '!':
					return val1 != val2 ? 1 : 0;
				case '=':
					return val1 == val2 ? 1 : 0;
				case '&':
					if (op[1] == '&') return isTrue(val1) && isTrue(val2) ? 1 : 0;
					return val1 & val2;
				case '|':
					if (op[1] == '|') return isTrue(val1) || isTrue(val2) ? 1 : 0;
					return val1 | val2;
				case '^':
					return val1 ^ val2;
				default:
					throw new Exception("No binary operation found for operator: " + op);
			}
		}
	}
	*/
	private void UpScope()
	{
		variableEnvironment = new VariableEnvironment(variableEnvironment);
	}
	private void DownScope() 
	{
		if (variableEnvironment.previous is null) throw new LanguageError("Cannot lower scope.");
		variableEnvironment = variableEnvironment.previous;
	}
}