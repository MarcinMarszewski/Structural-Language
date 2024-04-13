// Generated from c://Users//marci//Desktop//Structural Language//AntlrCSharp//LexerRules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LexerRules extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "TRUE", "FALSE", "LROUNDBRACKET", "RROUNDBRACKET", "LSQUAREBRACKET", 
			"RSQUAREBRACKET", "LCURLYBRACKET", "RCURLYBRACKET", "QUESTIONMARK", "COLON", 
			"EXCLAMATION", "SEMICOLON", "PLUS", "MINUS", "RSLASH", "STAR", "AND", 
			"OR", "CARROT", "PERCENT", "SHIFTLEFT", "SHIFTRIGHT", "ANDAND", "OROR", 
			"EQUALEQUAL", "EXCLAMATIONEQUAL", "LESSEQUAL", "GREATEREQUAL", "LESS", 
			"GREATER", "NUMBER", "DIGIT", "IDENTIFIER", "ALPHA", "WS"
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


	public LexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000#\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0004 \u00a2\b \u000b \f \u00a3\u0001 \u0001"+
		" \u0004 \u00a8\b \u000b \f \u00a9\u0003 \u00ac\b \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u00b3\b\"\n\"\f\"\u00b6\t\"\u0001#\u0001#\u0001"+
		"$\u0004$\u00bb\b$\u000b$\f$\u00bc\u0001$\u0001$\u0000\u0000%\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\u0000E\"G\u0000"+
		"I#\u0001\u0000\u0002\u0003\u0000AZ__az\u0003\u0000\t\n\r\r  \u00c3\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0001K\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005U"+
		"\u0001\u0000\u0000\u0000\u0007Z\u0001\u0000\u0000\u0000\t`\u0001\u0000"+
		"\u0000\u0000\u000bb\u0001\u0000\u0000\u0000\rd\u0001\u0000\u0000\u0000"+
		"\u000ff\u0001\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000\u0013j"+
		"\u0001\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n\u0001\u0000"+
		"\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000"+
		"\u001dt\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000!x\u0001"+
		"\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000%|\u0001\u0000\u0000\u0000"+
		"\'~\u0001\u0000\u0000\u0000)\u0080\u0001\u0000\u0000\u0000+\u0082\u0001"+
		"\u0000\u0000\u0000-\u0084\u0001\u0000\u0000\u0000/\u0087\u0001\u0000\u0000"+
		"\u00001\u008a\u0001\u0000\u0000\u00003\u008d\u0001\u0000\u0000\u00005"+
		"\u0090\u0001\u0000\u0000\u00007\u0093\u0001\u0000\u0000\u00009\u0096\u0001"+
		"\u0000\u0000\u0000;\u0099\u0001\u0000\u0000\u0000=\u009c\u0001\u0000\u0000"+
		"\u0000?\u009e\u0001\u0000\u0000\u0000A\u00a1\u0001\u0000\u0000\u0000C"+
		"\u00ad\u0001\u0000\u0000\u0000E\u00af\u0001\u0000\u0000\u0000G\u00b7\u0001"+
		"\u0000\u0000\u0000I\u00ba\u0001\u0000\u0000\u0000KL\u0005i\u0000\u0000"+
		"LM\u0005n\u0000\u0000MN\u0005t\u0000\u0000N\u0002\u0001\u0000\u0000\u0000"+
		"OP\u0005f\u0000\u0000PQ\u0005l\u0000\u0000QR\u0005o\u0000\u0000RS\u0005"+
		"a\u0000\u0000ST\u0005t\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005"+
		"t\u0000\u0000VW\u0005r\u0000\u0000WX\u0005u\u0000\u0000XY\u0005e\u0000"+
		"\u0000Y\u0006\u0001\u0000\u0000\u0000Z[\u0005f\u0000\u0000[\\\u0005a\u0000"+
		"\u0000\\]\u0005l\u0000\u0000]^\u0005s\u0000\u0000^_\u0005e\u0000\u0000"+
		"_\b\u0001\u0000\u0000\u0000`a\u0005(\u0000\u0000a\n\u0001\u0000\u0000"+
		"\u0000bc\u0005)\u0000\u0000c\f\u0001\u0000\u0000\u0000de\u0005[\u0000"+
		"\u0000e\u000e\u0001\u0000\u0000\u0000fg\u0005]\u0000\u0000g\u0010\u0001"+
		"\u0000\u0000\u0000hi\u0005{\u0000\u0000i\u0012\u0001\u0000\u0000\u0000"+
		"jk\u0005}\u0000\u0000k\u0014\u0001\u0000\u0000\u0000lm\u0005?\u0000\u0000"+
		"m\u0016\u0001\u0000\u0000\u0000no\u0005:\u0000\u0000o\u0018\u0001\u0000"+
		"\u0000\u0000pq\u0005!\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005"+
		";\u0000\u0000s\u001c\u0001\u0000\u0000\u0000tu\u0005+\u0000\u0000u\u001e"+
		"\u0001\u0000\u0000\u0000vw\u0005-\u0000\u0000w \u0001\u0000\u0000\u0000"+
		"xy\u0005/\u0000\u0000y\"\u0001\u0000\u0000\u0000z{\u0005*\u0000\u0000"+
		"{$\u0001\u0000\u0000\u0000|}\u0005&\u0000\u0000}&\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005|\u0000\u0000\u007f(\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005^\u0000\u0000\u0081*\u0001\u0000\u0000\u0000\u0082\u0083\u0005%"+
		"\u0000\u0000\u0083,\u0001\u0000\u0000\u0000\u0084\u0085\u0005<\u0000\u0000"+
		"\u0085\u0086\u0005<\u0000\u0000\u0086.\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005>\u0000\u0000\u0088\u0089\u0005>\u0000\u0000\u00890\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005&\u0000\u0000\u008b\u008c\u0005&\u0000\u0000"+
		"\u008c2\u0001\u0000\u0000\u0000\u008d\u008e\u0005|\u0000\u0000\u008e\u008f"+
		"\u0005|\u0000\u0000\u008f4\u0001\u0000\u0000\u0000\u0090\u0091\u0005="+
		"\u0000\u0000\u0091\u0092\u0005=\u0000\u0000\u00926\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005!\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u00958"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005<\u0000\u0000\u0097\u0098\u0005"+
		"=\u0000\u0000\u0098:\u0001\u0000\u0000\u0000\u0099\u009a\u0005>\u0000"+
		"\u0000\u009a\u009b\u0005=\u0000\u0000\u009b<\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005<\u0000\u0000\u009d>\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		">\u0000\u0000\u009f@\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003C!\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00ab\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005.\u0000\u0000\u00a6"+
		"\u00a8\u0003C!\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00acB\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u000209\u0000\u00aeD\u0001\u0000\u0000\u0000"+
		"\u00af\u00b4\u0003G#\u0000\u00b0\u00b3\u0003C!\u0000\u00b1\u00b3\u0003"+
		"G#\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5F\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0000\u0000\u0000"+
		"\u00b8H\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0001\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0006$\u0000\u0000\u00bfJ\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u00a3\u00a9\u00ab\u00b2\u00b4\u00bc\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}