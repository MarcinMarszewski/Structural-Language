using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static ParserRulesParser;
using Antlr4.Runtime.Misc;

namespace AntlrCSharp
{
    internal class TreeStructurePrinter : ParserRulesBaseVisitor<object>
    {
        public override object VisitStatement([NotNull] StatementContext context)
        {
            Console.Write("STATEMENT ");
            return base.VisitStatement(context);
        }

        public override object VisitVariableDeclaration([NotNull] VariableDeclarationContext context)
        {
            Console.Write("VARIABLEDECLARATION ");
            return base.VisitVariableDeclaration(context);
        }

        public override object VisitExpressionStatement([NotNull] ExpressionStatementContext context)
        {
            Console.Write("EXPRESSIONSTATEMENT ");
            return base.VisitExpressionStatement(context);
        }
        public override object VisitExpression([NotNull] ExpressionContext context)
        {
            Console.Write("EXPRESSION ");
            return base.VisitExpression(context);
        }

        public override object VisitTernary([NotNull] TernaryContext context)
        {
            Console.Write("TERNARY ");
            return base.VisitTernary(context);
        }

        public override object VisitBinary([NotNull] BinaryContext context)
        {
            Console.Write("BINARY ");
            return base.VisitBinary(context);
        }

        public override object VisitPrimary([NotNull] PrimaryContext context)
        {
            Console.Write("PRIMARY ");
            return base.VisitPrimary(context);
        }

        public override object VisitGrouping([NotNull] GroupingContext context)
        {
            Console.Write("GROUPING ");
            return base.VisitGrouping(context);
        }

        public override object VisitVariableAccess([NotNull] VariableAccessContext context)
        {
            Console.Write("VARIABLEACCESS ");
            return base.VisitVariableAccess(context);
        }

        public override object VisitValue([NotNull] ValueContext context)
        {
            Console.Write("VALUE ");
            return base.VisitValue(context);
        }

        public override object VisitNumber([NotNull] NumberContext context)
        {
            Console.Write($"NUMBER: {context.GetText()}");
            return base.VisitNumber(context);
        }
        public override object VisitTrue([NotNull] TrueContext context)
        {
            Console.Write("TRUE ");
            return base.VisitTrue(context);
        }
        public override object VisitFalse([NotNull] FalseContext context)
        {
            Console.Write("FALSE ");
            return base.VisitFalse(context);
        }
        public override object VisitBinaryOp([NotNull] BinaryOpContext context)
        {
            Console.Write("BINARYOP ");
            return base.VisitBinaryOp(context);
        }
    }
}
