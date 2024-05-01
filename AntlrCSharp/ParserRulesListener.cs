//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c://Users//marci//Desktop//Structural Language//AntlrCSharp//ParserRules.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="ParserRulesParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public interface IParserRulesListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] ParserRulesParser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] ParserRulesParser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] ParserRulesParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] ParserRulesParser.StatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclaration([NotNull] ParserRulesParser.VariableDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclaration([NotNull] ParserRulesParser.VariableDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.variableDeclarationExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclarationExpression([NotNull] ParserRulesParser.VariableDeclarationExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.variableDeclarationExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclarationExpression([NotNull] ParserRulesParser.VariableDeclarationExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterType([NotNull] ParserRulesParser.TypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitType([NotNull] ParserRulesParser.TypeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpressionStatement([NotNull] ParserRulesParser.ExpressionStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpressionStatement([NotNull] ParserRulesParser.ExpressionStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlockStatement([NotNull] ParserRulesParser.BlockStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlockStatement([NotNull] ParserRulesParser.BlockStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStatement([NotNull] ParserRulesParser.WhileStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStatement([NotNull] ParserRulesParser.WhileStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForStatement([NotNull] ParserRulesParser.ForStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForStatement([NotNull] ParserRulesParser.ForStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] ParserRulesParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] ParserRulesParser.ExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.ternary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTernary([NotNull] ParserRulesParser.TernaryContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.ternary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTernary([NotNull] ParserRulesParser.TernaryContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.binary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBinary([NotNull] ParserRulesParser.BinaryContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.binary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBinary([NotNull] ParserRulesParser.BinaryContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.primary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrimary([NotNull] ParserRulesParser.PrimaryContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.primary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrimary([NotNull] ParserRulesParser.PrimaryContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.variableAssignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableAssignment([NotNull] ParserRulesParser.VariableAssignmentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.variableAssignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableAssignment([NotNull] ParserRulesParser.VariableAssignmentContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.variableAccess"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableAccess([NotNull] ParserRulesParser.VariableAccessContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.variableAccess"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableAccess([NotNull] ParserRulesParser.VariableAccessContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.grouping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGrouping([NotNull] ParserRulesParser.GroupingContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.grouping"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGrouping([NotNull] ParserRulesParser.GroupingContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValue([NotNull] ParserRulesParser.ValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.value"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValue([NotNull] ParserRulesParser.ValueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.unary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnary([NotNull] ParserRulesParser.UnaryContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.unary"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnary([NotNull] ParserRulesParser.UnaryContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.binaryOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBinaryOp([NotNull] ParserRulesParser.BinaryOpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.binaryOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBinaryOp([NotNull] ParserRulesParser.BinaryOpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumber([NotNull] ParserRulesParser.NumberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.number"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumber([NotNull] ParserRulesParser.NumberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.true"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTrue([NotNull] ParserRulesParser.TrueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.true"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTrue([NotNull] ParserRulesParser.TrueContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ParserRulesParser.false"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFalse([NotNull] ParserRulesParser.FalseContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ParserRulesParser.false"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFalse([NotNull] ParserRulesParser.FalseContext context);
}
