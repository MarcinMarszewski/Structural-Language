// Generated from c://Users//marci//Desktop//Structural Language//AnlterCsharp//GrammarRules//ParserRules.g4 by ANTLR 4.13.1
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
		STRUCT=1, IDENTIFIER=2, LCURLYBRACKET=3, TYPE=4, LSQUAREBRACKET=5, RSQUAREBRACKET=6, 
		SEMICOLON=7, RCURLYBRACKET=8, ENUM=9, EQUAL=10, NUMBER=11, COMMA=12, LPARENTHESIS=13, 
		RPARENTHESIS=14, WHILE=15, FOR=16, DO=17, SWITCH=18, DEFAULT=19, COLON=20, 
		CASE=21, RETURN=22, BREAK=23, CONTINUE=24, QUESTIONMARK=25, BINARYMATH=26, 
		BINARYBITWISE=27, BINARYLOGIC=28, DECIMAL=29, BOOLVAL=30, UNARYOP=31, 
		DOT=32;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_structDefinition = 2, RULE_enumerableDefinition = 3, 
		RULE_function = 4, RULE_variableDeclaration = 5, RULE_arrayDeclaration = 6, 
		RULE_arrayAssignment = 7, RULE_statement = 8, RULE_block = 9, RULE_expressionStatement = 10, 
		RULE_whileStatement = 11, RULE_forStatement = 12, RULE_doWhileStatement = 13, 
		RULE_switchStatement = 14, RULE_case = 15, RULE_returnStatement = 16, 
		RULE_breakStatement = 17, RULE_continueStatement = 18, RULE_expression = 19, 
		RULE_ternary = 20, RULE_binary = 21, RULE_primary = 22, RULE_unary = 23, 
		RULE_grouping = 24, RULE_arrayAccess = 25, RULE_call = 26, RULE_typeCast = 27, 
		RULE_assignment = 28, RULE_fieldAccess = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "structDefinition", "enumerableDefinition", 
			"function", "variableDeclaration", "arrayDeclaration", "arrayAssignment", 
			"statement", "block", "expressionStatement", "whileStatement", "forStatement", 
			"doWhileStatement", "switchStatement", "case", "returnStatement", "breakStatement", 
			"continueStatement", "expression", "ternary", "binary", "primary", "unary", 
			"grouping", "arrayAccess", "call", "typeCast", "assignment", "fieldAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRUCT", "IDENTIFIER", "LCURLYBRACKET", "TYPE", "LSQUAREBRACKET", 
			"RSQUAREBRACKET", "SEMICOLON", "RCURLYBRACKET", "ENUM", "EQUAL", "NUMBER", 
			"COMMA", "LPARENTHESIS", "RPARENTHESIS", "WHILE", "FOR", "DO", "SWITCH", 
			"DEFAULT", "COLON", "CASE", "RETURN", "BREAK", "CONTINUE", "QUESTIONMARK", 
			"BINARYMATH", "BINARYBITWISE", "BINARYLOGIC", "DECIMAL", "BOOLVAL", "UNARYOP", 
			"DOT"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0)) {
				{
				{
				setState(60);
				definition();
				}
				}
				setState(65);
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
	public static class DefinitionContext extends ParserRuleContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public EnumerableDefinitionContext enumerableDefinition() {
			return getRuleContext(EnumerableDefinitionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				structDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				enumerableDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				arrayDeclaration();
				}
				break;
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
	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ParserRulesParser.STRUCT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLYBRACKET() { return getToken(ParserRulesParser.LCURLYBRACKET, 0); }
		public TerminalNode RCURLYBRACKET() { return getToken(ParserRulesParser.RCURLYBRACKET, 0); }
		public List<TerminalNode> TYPE() { return getTokens(ParserRulesParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParserRulesParser.TYPE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserRulesParser.SEMICOLON, i);
		}
		public List<TerminalNode> LSQUAREBRACKET() { return getTokens(ParserRulesParser.LSQUAREBRACKET); }
		public TerminalNode LSQUAREBRACKET(int i) {
			return getToken(ParserRulesParser.LSQUAREBRACKET, i);
		}
		public List<TerminalNode> RSQUAREBRACKET() { return getTokens(ParserRulesParser.RSQUAREBRACKET); }
		public TerminalNode RSQUAREBRACKET(int i) {
			return getToken(ParserRulesParser.RSQUAREBRACKET, i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRUCT);
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(LCURLYBRACKET);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(TYPE);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUAREBRACKET) {
					{
					setState(77);
					match(LSQUAREBRACKET);
					setState(78);
					match(RSQUAREBRACKET);
					}
				}

				setState(81);
				match(IDENTIFIER);
				setState(82);
				match(SEMICOLON);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(87);
			match(RCURLYBRACKET);
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
	public static class EnumerableDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ParserRulesParser.ENUM, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLYBRACKET() { return getToken(ParserRulesParser.LCURLYBRACKET, 0); }
		public TerminalNode RCURLYBRACKET() { return getToken(ParserRulesParser.RCURLYBRACKET, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(ParserRulesParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ParserRulesParser.EQUAL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserRulesParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserRulesParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserRulesParser.COMMA, i);
		}
		public EnumerableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerableDefinition; }
	}

	public final EnumerableDefinitionContext enumerableDefinition() throws RecognitionException {
		EnumerableDefinitionContext _localctx = new EnumerableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enumerableDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ENUM);
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(LCURLYBRACKET);
			setState(92);
			match(IDENTIFIER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(93);
				match(EQUAL);
				setState(94);
				match(NUMBER);
				}
			}

			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(COMMA);
					setState(98);
					match(IDENTIFIER);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(99);
						match(EQUAL);
						setState(100);
						match(NUMBER);
						}
					}

					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(108);
				match(COMMA);
				}
			}

			setState(111);
			match(RCURLYBRACKET);
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
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(ParserRulesParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ParserRulesParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public TerminalNode LCURLYBRACKET() { return getToken(ParserRulesParser.LCURLYBRACKET, 0); }
		public TerminalNode RCURLYBRACKET() { return getToken(ParserRulesParser.RCURLYBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserRulesParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(TYPE);
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(LPARENTHESIS);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(116);
				match(TYPE);
				setState(117);
				match(IDENTIFIER);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					match(TYPE);
					setState(120);
					match(IDENTIFIER);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(128);
			match(RPARENTHESIS);
			setState(129);
			match(LCURLYBRACKET);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3787958300L) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(RCURLYBRACKET);
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
		public TerminalNode TYPE() { return getToken(ParserRulesParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserRulesParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TYPE);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(139);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(140);
				assignment();
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(144);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(145);
					assignment();
					}
					break;
				}
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ParserRulesParser.TYPE, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(ParserRulesParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(ParserRulesParser.RSQUAREBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public List<ArrayAssignmentContext> arrayAssignment() {
			return getRuleContexts(ArrayAssignmentContext.class);
		}
		public ArrayAssignmentContext arrayAssignment(int i) {
			return getRuleContext(ArrayAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserRulesParser.COMMA, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(TYPE);
			setState(156);
			match(LSQUAREBRACKET);
			setState(157);
			match(RSQUAREBRACKET);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(158);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(159);
				arrayAssignment();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(163);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(164);
					arrayAssignment();
					}
					break;
				}
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(ParserRulesParser.EQUAL, 0); }
		public TerminalNode TYPE() { return getToken(ParserRulesParser.TYPE, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(ParserRulesParser.LSQUAREBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(ParserRulesParser.RSQUAREBRACKET, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IDENTIFIER);
			setState(175);
			match(EQUAL);
			setState(176);
			match(TYPE);
			setState(177);
			match(LSQUAREBRACKET);
			setState(178);
			expression();
			setState(179);
			match(RSQUAREBRACKET);
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
	public static class StatementContext extends ParserRuleContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				switchStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				arrayDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				forStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				doWhileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				breakStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				continueStatement();
				}
				break;
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACKET() { return getToken(ParserRulesParser.LCURLYBRACKET, 0); }
		public TerminalNode RCURLYBRACKET() { return getToken(ParserRulesParser.RCURLYBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LCURLYBRACKET);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3787958300L) != 0)) {
				{
				{
				setState(195);
				statement();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(RCURLYBRACKET);
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
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expression();
			setState(204);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserRulesParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(WHILE);
			setState(207);
			match(LPARENTHESIS);
			setState(208);
			expression();
			setState(209);
			match(RPARENTHESIS);
			setState(210);
			statement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserRulesParser.FOR, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ParserRulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ParserRulesParser.SEMICOLON, i);
		}
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(FOR);
			setState(213);
			match(LPARENTHESIS);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(214);
				variableDeclaration();
				}
				break;
			case SEMICOLON:
				{
				setState(215);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758106628L) != 0)) {
				{
				setState(218);
				expression();
				}
			}

			setState(221);
			match(SEMICOLON);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758106628L) != 0)) {
				{
				setState(222);
				expression();
				}
			}

			setState(225);
			match(RPARENTHESIS);
			setState(226);
			statement();
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
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParserRulesParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ParserRulesParser.WHILE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DO);
			setState(229);
			statement();
			setState(230);
			match(WHILE);
			setState(231);
			match(LPARENTHESIS);
			setState(232);
			expression();
			setState(233);
			match(RPARENTHESIS);
			setState(234);
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
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ParserRulesParser.SWITCH, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public TerminalNode LCURLYBRACKET() { return getToken(ParserRulesParser.LCURLYBRACKET, 0); }
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public TerminalNode RCURLYBRACKET() { return getToken(ParserRulesParser.RCURLYBRACKET, 0); }
		public TerminalNode DEFAULT() { return getToken(ParserRulesParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(ParserRulesParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(SWITCH);
			setState(237);
			match(LPARENTHESIS);
			setState(238);
			expression();
			setState(239);
			match(RPARENTHESIS);
			setState(240);
			match(LCURLYBRACKET);
			setState(241);
			case_();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3790055452L) != 0)) {
				{
				{
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(242);
					case_();
					}
					break;
				case IDENTIFIER:
				case LCURLYBRACKET:
				case TYPE:
				case NUMBER:
				case LPARENTHESIS:
				case WHILE:
				case FOR:
				case DO:
				case SWITCH:
				case RETURN:
				case BREAK:
				case CONTINUE:
				case DECIMAL:
				case BOOLVAL:
				case UNARYOP:
					{
					setState(243);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(251);
				match(DEFAULT);
				setState(252);
				match(COLON);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3787958300L) != 0)) {
					{
					{
					setState(253);
					statement();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(261);
			match(RCURLYBRACKET);
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
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ParserRulesParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserRulesParser.COLON, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CASE);
			setState(264);
			expression();
			setState(265);
			match(COLON);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserRulesParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(268);
			expression();
			setState(269);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(ParserRulesParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BREAK);
			setState(272);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(ParserRulesParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserRulesParser.SEMICOLON, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(CONTINUE);
			setState(275);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ternary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			binary();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(280);
				match(QUESTIONMARK);
				setState(281);
				expression();
				setState(282);
				match(COLON);
				setState(283);
				expression();
				}
				break;
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
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public TerminalNode BINARYMATH() { return getToken(ParserRulesParser.BINARYMATH, 0); }
		public TerminalNode BINARYBITWISE() { return getToken(ParserRulesParser.BINARYBITWISE, 0); }
		public TerminalNode BINARYLOGIC() { return getToken(ParserRulesParser.BINARYLOGIC, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			primary();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(288);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				primary();
				}
				break;
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
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(ParserRulesParser.NUMBER, 0); }
		public TerminalNode DECIMAL() { return getToken(ParserRulesParser.DECIMAL, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ParserRulesParser.BOOLVAL, 0); }
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(DECIMAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				grouping();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				unary();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				arrayAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				fieldAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(301);
				typeCast();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(302);
				match(BOOLVAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(303);
				arrayAssignment();
				}
				break;
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
	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode UNARYOP() { return getToken(ParserRulesParser.UNARYOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(UNARYOP);
			setState(307);
			expression();
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
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(LPARENTHESIS);
			setState(310);
			expression();
			setState(311);
			match(RPARENTHESIS);
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
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(ParserRulesParser.LSQUAREBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(ParserRulesParser.RSQUAREBRACKET, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IDENTIFIER);
			setState(314);
			match(LSQUAREBRACKET);
			setState(315);
			expression();
			setState(316);
			match(RSQUAREBRACKET);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserRulesParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IDENTIFIER);
			setState(319);
			match(LPARENTHESIS);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758106628L) != 0)) {
				{
				setState(320);
				expression();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					expression();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(330);
			match(RPARENTHESIS);
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
	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode LPARENTHESIS() { return getToken(ParserRulesParser.LPARENTHESIS, 0); }
		public TerminalNode TYPE() { return getToken(ParserRulesParser.TYPE, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(ParserRulesParser.RPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LPARENTHESIS);
			setState(333);
			match(TYPE);
			setState(334);
			match(RPARENTHESIS);
			setState(335);
			expression();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserRulesParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(ParserRulesParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BINARYMATH() { return getToken(ParserRulesParser.BINARYMATH, 0); }
		public TerminalNode BINARYBITWISE() { return getToken(ParserRulesParser.BINARYBITWISE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(IDENTIFIER);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BINARYMATH || _la==BINARYBITWISE) {
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==BINARYMATH || _la==BINARYBITWISE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(341);
			match(EQUAL);
			setState(342);
			expression();
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
	public static class FieldAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserRulesParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ParserRulesParser.DOT, 0); }
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IDENTIFIER);
			setState(345);
			match(DOT);
			setState(346);
			match(IDENTIFIER);
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
		"\u0004\u0001 \u015d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002T\b\u0002\u000b\u0002\f\u0002U\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003f\b\u0003\u0005\u0003h\b\u0003\n\u0003\f"+
		"\u0003k\t\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004z\b\u0004\n\u0004\f\u0004}\t\u0004"+
		"\u0003\u0004\u007f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0084\b\u0004\n\u0004\f\u0004\u0087\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0005\u0005\u0095\b\u0005"+
		"\n\u0005\f\u0005\u0098\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a1\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a6\b\u0006\u0005\u0006\u00a8"+
		"\b\u0006\n\u0006\f\u0006\u00ab\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00c1\b\b\u0001\t\u0001\t\u0005\t\u00c5\b\t"+
		"\n\t\f\t\u00c8\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001\f\u0003\f\u00dc\b\f\u0001\f"+
		"\u0001\f\u0003\f\u00e0\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f5\b\u000e\u0005\u000e\u00f7\b\u000e\n\u000e\f\u000e\u00fa\t"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ff\b\u000e\n"+
		"\u000e\f\u000e\u0102\t\u000e\u0003\u000e\u0104\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u011e"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0123\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0131\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0144\b\u001a\n\u001a\f\u001a\u0147\t\u001a\u0003"+
		"\u001a\u0149\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0154"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:\u0000\u0002\u0001\u0000\u001a\u001c\u0001\u0000\u001a\u001b\u0174"+
		"\u0000?\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004I"+
		"\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\bq\u0001\u0000"+
		"\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u009b\u0001\u0000\u0000"+
		"\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010\u00c0\u0001\u0000\u0000"+
		"\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000"+
		"\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018\u00d4\u0001\u0000\u0000"+
		"\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00ec\u0001\u0000\u0000"+
		"\u0000\u001e\u0107\u0001\u0000\u0000\u0000 \u010b\u0001\u0000\u0000\u0000"+
		"\"\u010f\u0001\u0000\u0000\u0000$\u0112\u0001\u0000\u0000\u0000&\u0115"+
		"\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000\u0000*\u011f\u0001\u0000"+
		"\u0000\u0000,\u0130\u0001\u0000\u0000\u0000.\u0132\u0001\u0000\u0000\u0000"+
		"0\u0135\u0001\u0000\u0000\u00002\u0139\u0001\u0000\u0000\u00004\u013e"+
		"\u0001\u0000\u0000\u00006\u014c\u0001\u0000\u0000\u00008\u0151\u0001\u0000"+
		"\u0000\u0000:\u0158\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001\u0000"+
		"=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u0001\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BH\u0003\u0004\u0002\u0000CH\u0003\u0006\u0003\u0000"+
		"DH\u0003\n\u0005\u0000EH\u0003\b\u0004\u0000FH\u0003\f\u0006\u0000GB\u0001"+
		"\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000H\u0003\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0005\u0002\u0000\u0000KS\u0005"+
		"\u0003\u0000\u0000LO\u0005\u0004\u0000\u0000MN\u0005\u0005\u0000\u0000"+
		"NP\u0005\u0006\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0002\u0000\u0000RT\u0005\u0007"+
		"\u0000\u0000SL\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WX\u0005\b\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0005\t\u0000"+
		"\u0000Z[\u0005\u0002\u0000\u0000[\\\u0005\u0003\u0000\u0000\\_\u0005\u0002"+
		"\u0000\u0000]^\u0005\n\u0000\u0000^`\u0005\u000b\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`i\u0001\u0000\u0000\u0000ab\u0005"+
		"\f\u0000\u0000be\u0005\u0002\u0000\u0000cd\u0005\n\u0000\u0000df\u0005"+
		"\u000b\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0005\f\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005"+
		"\b\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000\u0000"+
		"rs\u0005\u0002\u0000\u0000s~\u0005\r\u0000\u0000tu\u0005\u0004\u0000\u0000"+
		"u{\u0005\u0002\u0000\u0000vw\u0005\f\u0000\u0000wx\u0005\u0004\u0000\u0000"+
		"xz\u0005\u0002\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~t\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u000e\u0000\u0000\u0081\u0085\u0005\u0003\u0000\u0000\u0082"+
		"\u0084\u0003\u0010\b\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\b\u0000\u0000\u0089\t\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0005\u0004\u0000\u0000\u008b\u008e\u0005"+
		"\u0002\u0000\u0000\u008c\u008e\u00038\u001c\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0096\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0005\f\u0000\u0000\u0090\u0093\u0005\u0002\u0000"+
		"\u0000\u0091\u0093\u00038\u001c\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\u0007\u0000\u0000\u009a\u000b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u009d\u0005\u0005\u0000\u0000"+
		"\u009d\u00a0\u0005\u0006\u0000\u0000\u009e\u00a1\u0005\u0002\u0000\u0000"+
		"\u009f\u00a1\u0003\u000e\u0007\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0005\f\u0000\u0000\u00a3\u00a6\u0005\u0002\u0000\u0000\u00a4"+
		"\u00a6\u0003\u000e\u0007\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\u0007\u0000\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0002\u0000\u0000\u00af\u00b0\u0005\n\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0004\u0000\u0000\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2\u00b3\u0003"+
		"&\u0013\u0000\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u000f\u0001\u0000"+
		"\u0000\u0000\u00b5\u00c1\u0003\u001c\u000e\u0000\u00b6\u00c1\u0003\n\u0005"+
		"\u0000\u00b7\u00c1\u0003\f\u0006\u0000\u00b8\u00c1\u0003\u0014\n\u0000"+
		"\u00b9\u00c1\u0003\u0016\u000b\u0000\u00ba\u00c1\u0003\u0012\t\u0000\u00bb"+
		"\u00c1\u0003\u0018\f\u0000\u00bc\u00c1\u0003\u001a\r\u0000\u00bd\u00c1"+
		"\u0003 \u0010\u0000\u00be\u00c1\u0003\"\u0011\u0000\u00bf\u00c1\u0003"+
		"$\u0012\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b7\u0001\u0000\u0000\u0000\u00c0\u00b8\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0011\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c6\u0005\u0003\u0000\u0000\u00c3\u00c5\u0003\u0010"+
		"\b\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0003&\u0013\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd"+
		"\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u000f\u0000\u0000\u00cf"+
		"\u00d0\u0005\r\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1\u00d2"+
		"\u0005\u000e\u0000\u0000\u00d2\u00d3\u0003\u0010\b\u0000\u00d3\u0017\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0010\u0000\u0000\u00d5\u00d8\u0005"+
		"\r\u0000\u0000\u00d6\u00d9\u0003\n\u0005\u0000\u00d7\u00d9\u0005\u0007"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00dc\u0003&\u0013"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\u0007\u0000"+
		"\u0000\u00de\u00e0\u0003&\u0013\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u000e\u0000\u0000\u00e2\u00e3\u0003\u0010\b\u0000\u00e3"+
		"\u0019\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0011\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0010\b\u0000\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00e8"+
		"\u0005\r\u0000\u0000\u00e8\u00e9\u0003&\u0013\u0000\u00e9\u00ea\u0005"+
		"\u000e\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb\u001b\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0012\u0000\u0000\u00ed\u00ee\u0005"+
		"\r\u0000\u0000\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u00f0\u0005\u000e"+
		"\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000\u00f1\u00f8\u0003\u001e"+
		"\u000f\u0000\u00f2\u00f5\u0003\u001e\u000f\u0000\u00f3\u00f5\u0003\u0010"+
		"\b\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0103\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0013\u0000"+
		"\u0000\u00fc\u0100\u0005\u0014\u0000\u0000\u00fd\u00ff\u0003\u0010\b\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005\b\u0000\u0000\u0106"+
		"\u001d\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0015\u0000\u0000\u0108"+
		"\u0109\u0003&\u0013\u0000\u0109\u010a\u0005\u0014\u0000\u0000\u010a\u001f"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0016\u0000\u0000\u010c\u010d"+
		"\u0003&\u0013\u0000\u010d\u010e\u0005\u0007\u0000\u0000\u010e!\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u0017\u0000\u0000\u0110\u0111\u0005\u0007"+
		"\u0000\u0000\u0111#\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0018\u0000"+
		"\u0000\u0113\u0114\u0005\u0007\u0000\u0000\u0114%\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0003(\u0014\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117"+
		"\u011d\u0003*\u0015\u0000\u0118\u0119\u0005\u0019\u0000\u0000\u0119\u011a"+
		"\u0003&\u0013\u0000\u011a\u011b\u0005\u0014\u0000\u0000\u011b\u011c\u0003"+
		"&\u0013\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u0118\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e)\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0003,\u0016\u0000\u0120\u0121\u0007\u0000\u0000\u0000"+
		"\u0121\u0123\u0003,\u0016\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0131"+
		"\u0005\u0002\u0000\u0000\u0125\u0131\u0005\u000b\u0000\u0000\u0126\u0131"+
		"\u0005\u001d\u0000\u0000\u0127\u0131\u00034\u001a\u0000\u0128\u0131\u0003"+
		"0\u0018\u0000\u0129\u0131\u0003.\u0017\u0000\u012a\u0131\u00038\u001c"+
		"\u0000\u012b\u0131\u00032\u0019\u0000\u012c\u0131\u0003:\u001d\u0000\u012d"+
		"\u0131\u00036\u001b\u0000\u012e\u0131\u0005\u001e\u0000\u0000\u012f\u0131"+
		"\u0003\u000e\u0007\u0000\u0130\u0124\u0001\u0000\u0000\u0000\u0130\u0125"+
		"\u0001\u0000\u0000\u0000\u0130\u0126\u0001\u0000\u0000\u0000\u0130\u0127"+
		"\u0001\u0000\u0000\u0000\u0130\u0128\u0001\u0000\u0000\u0000\u0130\u0129"+
		"\u0001\u0000\u0000\u0000\u0130\u012a\u0001\u0000\u0000\u0000\u0130\u012b"+
		"\u0001\u0000\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131-\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"\u001f\u0000\u0000\u0133\u0134\u0003&\u0013\u0000\u0134/\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\r\u0000\u0000\u0136\u0137\u0003&\u0013\u0000"+
		"\u0137\u0138\u0005\u000e\u0000\u0000\u01381\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005\u0002\u0000\u0000\u013a\u013b\u0005\u0005\u0000\u0000\u013b"+
		"\u013c\u0003&\u0013\u0000\u013c\u013d\u0005\u0006\u0000\u0000\u013d3\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005\u0002\u0000\u0000\u013f\u0148\u0005"+
		"\r\u0000\u0000\u0140\u0145\u0003&\u0013\u0000\u0141\u0142\u0005\f\u0000"+
		"\u0000\u0142\u0144\u0003&\u0013\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0140\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u000e\u0000\u0000\u014b5\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005\r\u0000\u0000\u014d\u014e\u0005\u0004\u0000\u0000\u014e\u014f"+
		"\u0005\u000e\u0000\u0000\u014f\u0150\u0003&\u0013\u0000\u01507\u0001\u0000"+
		"\u0000\u0000\u0151\u0153\u0005\u0002\u0000\u0000\u0152\u0154\u0007\u0001"+
		"\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005\n\u0000"+
		"\u0000\u0156\u0157\u0003&\u0013\u0000\u01579\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005\u0002\u0000\u0000\u0159\u015a\u0005 \u0000\u0000\u015a\u015b"+
		"\u0005\u0002\u0000\u0000\u015b;\u0001\u0000\u0000\u0000 ?GOU_eim{~\u0085"+
		"\u008d\u0092\u0096\u00a0\u00a5\u00a9\u00c0\u00c6\u00d8\u00db\u00df\u00f4"+
		"\u00f8\u0100\u0103\u011d\u0122\u0130\u0145\u0148\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}