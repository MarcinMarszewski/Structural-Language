// Generated from c://Users//marci//Desktop//Structural Language//AntlrCSharp//ParserRules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, TRUE=3, FALSE=4, LROUNDBRACKET=5, RROUNDBRACKET=6, LSQUAREBRACKET=7, 
		RSQUAREBRACKET=8, LCURLYBRACKET=9, RCURLYBRACKET=10, QUESTIONMARK=11, 
		COLON=12, EXCLAMATION=13, SEMICOLON=14, PLUS=15, MINUS=16, RSLASH=17, 
		STAR=18, AND=19, OR=20, CARROT=21, PERCENT=22, SHIFTLEFT=23, SHIFTRIGHT=24, 
		ANDAND=25, OROR=26, EQUALEQUAL=27, EXCLAMATIONEQUAL=28, LESSEQUAL=29, 
		GREATEREQUAL=30, LESS=31, GREATER=32, NUMBER=33, IDENTIFIER=34, WS=35;
	public static final int
		RULE_statement = 0, RULE_variableDeclaration = 1, RULE_type = 2, RULE_expressionStatement = 3, 
		RULE_expression = 4, RULE_ternary = 5, RULE_binary = 6, RULE_primary = 7, 
		RULE_grouping = 8, RULE_value = 9, RULE_binaryOp = 10, RULE_number = 11, 
		RULE_true = 12, RULE_false = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "variableDeclaration", "type", "expressionStatement", "expression", 
			"ternary", "binary", "primary", "grouping", "value", "binaryOp", "number", 
			"true", "false"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'true'", "'false'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'?'", "':'", "'!'", "';'", "'+'", "'-'", "'/'", "'*'", 
			"'&'", "'|'", "'^'", "'%'", "'<<'", "'>>'", "'&&'", "'||'", "'=='", "'!='", 
			"'<='", "'>='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "TRUE", "FALSE", "LROUNDBRACKET", "RROUNDBRACKET", 
			"LSQUAREBRACKET", "RSQUAREBRACKET", "LCURLYBRACKET", "RCURLYBRACKET", 
			"QUESTIONMARK", "COLON", "EXCLAMATION", "SEMICOLON", "PLUS", "MINUS", 
			"RSLASH", "STAR", "AND", "OR", "CARROT", "PERCENT", "SHIFTLEFT", "SHIFTRIGHT", 
			"ANDAND", "OROR", "EQUALEQUAL", "EXCLAMATIONEQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"LESS", "GREATER", "NUMBER", "IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LROUNDBRACKET:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				expressionStatement();
				}
				break;
			case INT:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			type();
			setState(33);
			match(IDENTIFIER);
			setState(34);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(ParserRulesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParserRulesParser.FLOAT, 0); }
		public List<TerminalNode> LSQUAREBRACKET() { return getTokens(ParserRulesParser.LSQUAREBRACKET); }
		public TerminalNode LSQUAREBRACKET(int i) {
			return getToken(ParserRulesParser.LSQUAREBRACKET, i);
		}
		public List<TerminalNode> RSQUAREBRACKET() { return getTokens(ParserRulesParser.RSQUAREBRACKET); }
		public TerminalNode RSQUAREBRACKET(int i) {
			return getToken(ParserRulesParser.RSQUAREBRACKET, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869190L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQUAREBRACKET) {
				{
				{
				setState(37);
				match(LSQUAREBRACKET);
				setState(38);
				match(RSQUAREBRACKET);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			expression();
			setState(45);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			ternary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryContext extends ParserRuleContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public TerminalNode QUESTIONMARK() { return getToken(ParserRulesParser.QUESTIONMARK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ParserRulesParser.COLON, 0); }
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitTernary(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ternary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			binary();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTIONMARK) {
				{
				setState(50);
				match(QUESTIONMARK);
				setState(51);
				expression();
				setState(52);
				match(COLON);
				setState(53);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitBinary(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			primary();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8589901824L) != 0)) {
				{
				setState(58);
				binaryOp();
				setState(59);
				binary();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primary);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				value();
				}
				break;
			case LROUNDBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				grouping();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode LROUNDBRACKET() { return getToken(ParserRulesParser.LROUNDBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RROUNDBRACKET() { return getToken(ParserRulesParser.RROUNDBRACKET, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitGrouping(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LROUNDBRACKET);
			setState(68);
			expression();
			setState(69);
			match(RROUNDBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TrueContext true_() {
			return getRuleContext(TrueContext.class,0);
		}
		public FalseContext false_() {
			return getRuleContext(FalseContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				number();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				true_();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				false_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParserRulesParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserRulesParser.MINUS, 0); }
		public TerminalNode AND() { return getToken(ParserRulesParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(ParserRulesParser.ANDAND, 0); }
		public TerminalNode CARROT() { return getToken(ParserRulesParser.CARROT, 0); }
		public TerminalNode EQUALEQUAL() { return getToken(ParserRulesParser.EQUALEQUAL, 0); }
		public TerminalNode EXCLAMATIONEQUAL() { return getToken(ParserRulesParser.EXCLAMATIONEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(ParserRulesParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(ParserRulesParser.GREATEREQUAL, 0); }
		public TerminalNode LESS() { return getToken(ParserRulesParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(ParserRulesParser.LESSEQUAL, 0); }
		public TerminalNode OR() { return getToken(ParserRulesParser.OR, 0); }
		public TerminalNode OROR() { return getToken(ParserRulesParser.OROR, 0); }
		public TerminalNode PERCENT() { return getToken(ParserRulesParser.PERCENT, 0); }
		public TerminalNode RSLASH() { return getToken(ParserRulesParser.RSLASH, 0); }
		public TerminalNode SHIFTLEFT() { return getToken(ParserRulesParser.SHIFTLEFT, 0); }
		public TerminalNode SHIFTRIGHT() { return getToken(ParserRulesParser.SHIFTRIGHT, 0); }
		public TerminalNode STAR() { return getToken(ParserRulesParser.STAR, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitBinaryOp(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8589901824L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ParserRulesParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ParserRulesParser.TRUE, 0); }
		public TrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitTrue(this);
		}
	}

	public final TrueContext true_() throws RecognitionException {
		TrueContext _localctx = new TrueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(ParserRulesParser.FALSE, 0); }
		public FalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserRulesListener ) ((ParserRulesListener)listener).exitFalse(this);
		}
	}

	public final FalseContext false_() throws RecognitionException {
		FalseContext _localctx = new FalseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#U\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003\u0000\u001f\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00058\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006>\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\tK\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0002\u0002\u0000\u0001\u0002\"\"\u0001\u0000\u000f M\u0000\u001e\u0001"+
		"\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000"+
		"\u0000\u0006,\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001"+
		"\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000"+
		"\u0000\u0010C\u0001\u0000\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014"+
		"L\u0001\u0000\u0000\u0000\u0016N\u0001\u0000\u0000\u0000\u0018P\u0001"+
		"\u0000\u0000\u0000\u001aR\u0001\u0000\u0000\u0000\u001c\u001f\u0003\u0006"+
		"\u0003\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0001\u0001\u0000"+
		"\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\"\u0000\u0000\"#\u0005"+
		"\u000e\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$)\u0007\u0000\u0000"+
		"\u0000%&\u0005\u0007\u0000\u0000&(\u0005\b\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0003\b\u0004\u0000-.\u0005\u000e\u0000\u0000.\u0007\u0001\u0000"+
		"\u0000\u0000/0\u0003\n\u0005\u00000\t\u0001\u0000\u0000\u000017\u0003"+
		"\f\u0006\u000023\u0005\u000b\u0000\u000034\u0003\b\u0004\u000045\u0005"+
		"\f\u0000\u000056\u0003\b\u0004\u000068\u0001\u0000\u0000\u000072\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u000b\u0001\u0000\u0000"+
		"\u00009=\u0003\u000e\u0007\u0000:;\u0003\u0014\n\u0000;<\u0003\f\u0006"+
		"\u0000<>\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\r\u0001\u0000\u0000\u0000?B\u0003\u0012\t\u0000@B\u0003"+
		"\u0010\b\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u000f"+
		"\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0003\b\u0004\u0000"+
		"EF\u0005\u0006\u0000\u0000F\u0011\u0001\u0000\u0000\u0000GK\u0003\u0016"+
		"\u000b\u0000HK\u0003\u0018\f\u0000IK\u0003\u001a\r\u0000JG\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0013"+
		"\u0001\u0000\u0000\u0000LM\u0007\u0001\u0000\u0000M\u0015\u0001\u0000"+
		"\u0000\u0000NO\u0005!\u0000\u0000O\u0017\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0003\u0000\u0000Q\u0019\u0001\u0000\u0000\u0000RS\u0005\u0004\u0000"+
		"\u0000S\u001b\u0001\u0000\u0000\u0000\u0006\u001e)7=AJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}