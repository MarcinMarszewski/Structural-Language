//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c://Users//marci//Desktop//Structural-Language//AntlrCSharp//ParserRules.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="ParserRulesParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public interface IParserRulesVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] ParserRulesParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunction([NotNull] ParserRulesParser.FunctionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParameter([NotNull] ParserRulesParser.ParameterContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] ParserRulesParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStatement([NotNull] ParserRulesParser.ReturnStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.breakStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBreakStatement([NotNull] ParserRulesParser.BreakStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.continueStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitContinueStatement([NotNull] ParserRulesParser.ContinueStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStatement([NotNull] ParserRulesParser.IfStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableDeclaration([NotNull] ParserRulesParser.VariableDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.variableDeclarationExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableDeclarationExpression([NotNull] ParserRulesParser.VariableDeclarationExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitType([NotNull] ParserRulesParser.TypeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpressionStatement([NotNull] ParserRulesParser.ExpressionStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlockStatement([NotNull] ParserRulesParser.BlockStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhileStatement([NotNull] ParserRulesParser.WhileStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForStatement([NotNull] ParserRulesParser.ForStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] ParserRulesParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.ternary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTernary([NotNull] ParserRulesParser.TernaryContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryLogic"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryLogic([NotNull] ParserRulesParser.BinaryLogicContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryCompare"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryCompare([NotNull] ParserRulesParser.BinaryCompareContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryBitwise"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryBitwise([NotNull] ParserRulesParser.BinaryBitwiseContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryAdditive"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryAdditive([NotNull] ParserRulesParser.BinaryAdditiveContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryMultiplicative"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryMultiplicative([NotNull] ParserRulesParser.BinaryMultiplicativeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.primary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrimary([NotNull] ParserRulesParser.PrimaryContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.createArray"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCreateArray([NotNull] ParserRulesParser.CreateArrayContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.arrayAssignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayAssignment([NotNull] ParserRulesParser.ArrayAssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.arrayAccess"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayAccess([NotNull] ParserRulesParser.ArrayAccessContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.call"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCall([NotNull] ParserRulesParser.CallContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.variableAssignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableAssignment([NotNull] ParserRulesParser.VariableAssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.variableAccess"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableAccess([NotNull] ParserRulesParser.VariableAccessContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.grouping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGrouping([NotNull] ParserRulesParser.GroupingContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitValue([NotNull] ParserRulesParser.ValueContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.unary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnary([NotNull] ParserRulesParser.UnaryContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryLogicOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryLogicOp([NotNull] ParserRulesParser.BinaryLogicOpContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryCompareOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryCompareOp([NotNull] ParserRulesParser.BinaryCompareOpContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryBitwiseOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryBitwiseOp([NotNull] ParserRulesParser.BinaryBitwiseOpContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryMultiplicativeOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryMultiplicativeOp([NotNull] ParserRulesParser.BinaryMultiplicativeOpContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.binaryAdditiveOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBinaryAdditiveOp([NotNull] ParserRulesParser.BinaryAdditiveOpContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumber([NotNull] ParserRulesParser.NumberContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.true"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTrue([NotNull] ParserRulesParser.TrueContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ParserRulesParser.false"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFalse([NotNull] ParserRulesParser.FalseContext context);
}
