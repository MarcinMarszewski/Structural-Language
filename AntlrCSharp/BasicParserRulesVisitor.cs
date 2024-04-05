using System.Globalization;
using Antlr4.Runtime.Misc;
using static ParserRulesParser;

public class BasicParserRulesVisitor : ParserRulesBaseVisitor<object> 
{
	public override object VisitExpression([NotNull] ExpressionContext context)
	{
		Console.WriteLine(VisitTernary(context.ternary()));
		return base.VisitExpression(context);
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

	public override object VisitValue([NotNull] ValueContext context)
	{
		return Visit(context.GetChild(0));
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