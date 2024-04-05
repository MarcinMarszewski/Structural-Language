// Generated from c://Users//marci//Desktop//Structural Language//AntlrCSharp//ParserRules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserRulesParser}.
 */
public interface ParserRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserRulesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserRulesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(ParserRulesParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(ParserRulesParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ParserRulesParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ParserRulesParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ParserRulesParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ParserRulesParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ParserRulesParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ParserRulesParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(ParserRulesParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(ParserRulesParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ParserRulesParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ParserRulesParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#true}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ParserRulesParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#true}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ParserRulesParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserRulesParser#false}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ParserRulesParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserRulesParser#false}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ParserRulesParser.FalseContext ctx);
}