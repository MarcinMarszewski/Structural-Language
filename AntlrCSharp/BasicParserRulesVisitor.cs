using System.Globalization;
using Antlr4.Runtime.Misc;
using AntlrCSharp;
using static ParserRulesParser;

public class BasicParserRulesVisitor : ParserRulesBaseVisitor<object> 
{
	VariableEnvironment variableEnvironment = new VariableEnvironment();

    public override object VisitStatement([NotNull] StatementContext context)
    {
		foreach (var child in context.children) Visit(child);
        //Visit(context.GetChild(0));

		return null;
    }

    public override object VisitVariableDeclaration([NotNull] VariableDeclarationContext context)
    {
		Type type = typeof(int);
		switch (context.type().GetText())
		{
			case "int":
				type = typeof(int);
				break;
			case "float": 
				type = typeof(float);
				break;
			default:
				break;
		}

		object value = null;
		if(context.expression() != null)
			value = VisitExpression(context.expression());

		variableEnvironment.AddVariable(context.IDENTIFIER().GetText(), type, value);
        return null;
    }

    public override object VisitExpressionStatement([NotNull] ExpressionStatementContext context)
    {
		Console.WriteLine(VisitExpression(context.expression()));
		return null;
    }
    public override object VisitExpression([NotNull] ExpressionContext context)
	{
		return VisitTernary(context.ternary());
	}

	public override object VisitTernary([NotNull] TernaryContext context)
	{
		if (context.ChildCount > 1) { 
			return isTrue(VisitBinary(context.binary())) 
				? VisitExpression(context.expression(0)) : VisitExpression(context.expression(1));
		} 
		else 
			return VisitBinary(context.binary());
	}

	public override object VisitBinary([NotNull] BinaryContext context)
	{
		if(context.ChildCount > 1) { 
			return binaryCalculate(VisitPrimary(context.primary()), VisitBinary(context.binary()), context.binaryOp().GetText()+" ");
		}
		else
			return VisitPrimary(context.primary());
	}

	public override object VisitPrimary([NotNull] PrimaryContext context)
	{
		return Visit(context.GetChild(0));
	}

    public override object VisitGrouping([NotNull] GroupingContext context)
    {
        return Visit(context.expression());
    }

    public override object VisitVariableAssignment([NotNull] VariableAssignmentContext context)
    {
		object val = VisitExpression(context.expression());
		string id = context.IDENTIFIER().GetText();
		variableEnvironment.UpdateVariable(id, val.GetType(), val);

        return val;
    }

    public override object VisitVariableAccess([NotNull] VariableAccessContext context)
    {
        return variableEnvironment.GetVariable(context.IDENTIFIER().GetText());
    }

    public override object VisitValue([NotNull] ValueContext context)
	{
		return Visit(context.GetChild(0));
	}

    public override object VisitUnary([NotNull] UnaryContext context)
    {
        object val = VisitPrimary(context.primary());
        switch (context.GetChild(0).GetText()[0])
		{
			case '!':
				return !isTrue(val);
			case '-':
				if (val is float) return -(float)val;
				else if (val is int) return -(int)val;
				break;
		}
        throw new LanguageError($"Cannot perform unary operation: {context.GetChild(0).GetText()[0]}");
    }

    public override object VisitNumber([NotNull] NumberContext context)
	{
		string num = context.GetText();
		if (num.Contains('.')) 
			return float.Parse(num, CultureInfo.InvariantCulture.NumberFormat); 
		else 
			return int.Parse(num);
	}
	public override object VisitTrue([NotNull] TrueContext context)
	{
		return 1;
	}
	public override object VisitFalse([NotNull] FalseContext context)
	{
		return 0;
	}

	private bool isTrue(object obj)
	{
		if (obj is int) return (int)obj !=0;
		if (obj is float) return (float)obj != 0;
		return false;
	}

	//only for int and float operations
	private object binaryCalculate(object v1, object v2, string op)
	{
		if (!(v1 is float || v1 is int) || !(v2 is float || v2 is int))
			throw new Exception("Cannot use numeric binary operators for non-numeric values");

		if (v1 is float || v2 is float)
		{
			float val1 = Convert.ToSingle(v1);
			float val2 = Convert.ToSingle(v2);

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
					if (op[1] == '=') return val1 <= val2;
					if (op[1] == '<') throw new Exception("No binary operation found for operator: " + op);
					return val1 < val2;
				case '>':
					if (op[1] == '=') return val1 >= val2;
					if (op[1] == '>') throw new Exception("No binary operation found for operator: " + op);
					return val1 > val2;
				case '!':
					return val1 != val2;
				case '=':
					return val1 != val2;
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
			int val1 = Convert.ToInt32(v1);
            int val2 = Convert.ToInt32(v2);

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
					if (op[1] == '=') return val1 <= val2;
					if (op[1] == '<') return val1 << val2;
					return val1 < val2;
				case '>':
					if (op[1] == '=') return val1 >= val2;
					if (op[1] == '>') return val1 >> val2;
					return val1 > val2;
				case '!':
					return val1 != val2;
				case '=':
					return val1 != val2;
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
}