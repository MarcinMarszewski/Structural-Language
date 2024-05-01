using System;
using System.Globalization;
using Antlr4.Runtime.Misc;
using AntlrCSharp;
using static ParserRulesParser;

//for(int i=0;i<10;i=i+1){if((i%2)==0){continue;}i;}
public class BasicParserRulesVisitor : ParserRulesBaseVisitor<Variable> 
{
	VariableEnvironment variableEnvironment = new VariableEnvironment();
	static readonly Variable _nullValue = new Variable(VariableType.NULL, null);
	static readonly Variable _breakValue = new Variable(VariableType.BREAK_HNDL, null);
	static readonly Variable _continueValue = new Variable(VariableType.CONTINUE_HNDL, null);


    public override Variable VisitProgram([NotNull] ProgramContext context)
    {
		foreach (var stmnt in context.children) Visit(stmnt);
		return _nullValue;
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
        if(isTrue(VisitGrouping(context.GetChild<GroupingContext>(0)).value))
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
        VariableType type = VariableType.NULL;
        switch (context.type().GetText())
        {
            case "int":
                type = VariableType.INT;
                break;
            case "float":
                type = VariableType.FLOAT;
                break;
        }

        object value = default;
        if (context.expression() != null) value = VisitExpression(context.expression()).value;

        variableEnvironment.AddVariable(context.IDENTIFIER().GetText(), type, value);
        return _nullValue;
    }

    public override Variable VisitBlockStatement([NotNull] BlockStatementContext context)
    {
		UpScope();
		for(int i = 1; i < context.children.Count - 1; i++)
		{
			Variable val = Visit(context.GetChild(i));
			if (val.type == VariableType.CONTINUE_HNDL || val.type == VariableType.BREAK_HNDL) { DownScope(); return val; }
		}
		DownScope();
		return _nullValue;
    }

    public override Variable VisitWhileStatement([NotNull] WhileStatementContext context)
    {
        while(isTrue(Visit(context.GetChild(1)).value))
		{
			Variable val = Visit(context.GetChild(2));
            if (val.type == VariableType.CONTINUE_HNDL) continue;
            if (val.type == VariableType.BREAK_HNDL) break;
        }
		return _nullValue;
    }

    public override Variable VisitForStatement([NotNull] ForStatementContext context)
    {
		UpScope();
		VisitVariableDeclarationExpression(context.GetChild<VariableDeclarationExpressionContext>(0));
		while (isTrue(VisitExpression(context.GetChild<ExpressionContext>(0)).value))
		{
			Variable val = VisitBlockStatement(context.GetChild<BlockStatementContext>(0));
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
			return isTrue(VisitBinary(context.binary())) 
				? VisitExpression(context.expression(0)) : VisitExpression(context.expression(1));
		} 
		else 
			return VisitBinary(context.binary());
	}

	public override Variable VisitBinary([NotNull] BinaryContext context)
	{
		if(context.ChildCount > 1) {
			VariableType type;
			object value = binaryCalculate(VisitPrimary(context.primary()), VisitBinary(context.binary()), context.binaryOp().GetText()+" ",out type);
			return new Variable(type, value);
		}
		else
			return VisitPrimary(context.primary());
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
		variableEnvironment.UpdateVariable(id, val.type, val.value);

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

    public override Variable VisitUnary([NotNull] UnaryContext context)
    {
        Variable val = VisitPrimary(context.primary());
        switch (context.GetChild(0).GetText()[0])
		{
			case '!':
				val.value=!isTrue(val.value);
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

	private bool isTrue(object obj)
	{
		if (obj is int) return (int)obj !=0;
		if (obj is float) return (float)obj != 0;
		return false;
	}

	//only for int and float operations
	private object binaryCalculate(Variable v1, Variable v2, string op, out VariableType resultType)
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