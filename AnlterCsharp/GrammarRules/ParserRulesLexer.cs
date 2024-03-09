//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from ParserRules.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public partial class ParserRulesLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		DIGIT=1, NUMBER=2, DECIMAL=3, ALPHA=4, IDENTIFIER=5, UNARYOP=6, BINARYMATH=7, 
		BINARYBITWISE=8, BINARYLOGIC=9, TYPE=10, BOOLVAL=11, FOR=12, LCURLYBRACKET=13, 
		RCURLYBRACKET=14, LSQUAREBRACKET=15, RSQUAREBRACKET=16, SEMICOLON=17, 
		ENUM=18, STRUCT=19, EQUAL=20, COMMA=21, DOT=22, LPARENTHESIS=23, RPARENTHESIS=24, 
		WHILE=25, DO=26, SWITCH=27, DEFAULT=28, CASE=29, CONTINUE=30, BREAK=31, 
		COLON=32, QUESTIONMARK=33, RETURN=34, WS=35;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"DIGIT", "NUMBER", "DECIMAL", "ALPHA", "IDENTIFIER", "UNARYOP", "BINARYMATH", 
		"BINARYBITWISE", "BINARYLOGIC", "TYPE", "BOOLVAL", "FOR", "LCURLYBRACKET", 
		"RCURLYBRACKET", "LSQUAREBRACKET", "RSQUAREBRACKET", "SEMICOLON", "ENUM", 
		"STRUCT", "EQUAL", "COMMA", "DOT", "LPARENTHESIS", "RPARENTHESIS", "WHILE", 
		"DO", "SWITCH", "DEFAULT", "CASE", "CONTINUE", "BREAK", "COLON", "QUESTIONMARK", 
		"RETURN", "WS"
	};


	public ParserRulesLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public ParserRulesLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'for'", "'{'", "'}'", "'['", "']'", "';'", "'enum'", "'struct'", "'='", 
		"','", "'.'", "'('", "')'", "'while'", "'do'", "'switch'", "'default'", 
		"'case'", "'continue'", "'break'", "':'", "'?'", "'return'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "DIGIT", "NUMBER", "DECIMAL", "ALPHA", "IDENTIFIER", "UNARYOP", 
		"BINARYMATH", "BINARYBITWISE", "BINARYLOGIC", "TYPE", "BOOLVAL", "FOR", 
		"LCURLYBRACKET", "RCURLYBRACKET", "LSQUAREBRACKET", "RSQUAREBRACKET", 
		"SEMICOLON", "ENUM", "STRUCT", "EQUAL", "COMMA", "DOT", "LPARENTHESIS", 
		"RPARENTHESIS", "WHILE", "DO", "SWITCH", "DEFAULT", "CASE", "CONTINUE", 
		"BREAK", "COLON", "QUESTIONMARK", "RETURN", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "ParserRules.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static ParserRulesLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '%', '\x103', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x3', '\x6', '\x3', 'M', '\n', '\x3', '\r', '\x3', '\xE', '\x3', 'N', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\a', '\x6', 'Z', 
		'\n', '\x6', '\f', '\x6', '\xE', '\x6', ']', '\v', '\x6', '\x3', '\a', 
		'\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\t', '\x3', '\t', '\x5', '\t', 'h', '\n', '\t', '\x3', '\n', 
		'\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', 
		'\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', 
		'\x5', '\n', 'v', '\n', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', 
		'\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', 
		'\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', 
		'\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', 
		'\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', 
		'\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x5', '\v', '\x95', '\n', 
		'\v', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', 
		'\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x5', '\f', '\xA0', 
		'\n', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', 
		'\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', '\x3', 
		'\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', 
		'\x16', '\x3', '\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', 
		'\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', 
		'\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', '\x3', 
		'\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', 
		'\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', '\x3', '\x1D', '\x3', 
		'\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', 
		'\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', 
		'\x1E', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', 
		'\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', '\x3', 
		' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', 
		'!', '\x3', '!', '\x3', '\"', '\x3', '\"', '\x3', '#', '\x3', '#', '\x3', 
		'#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '$', '\x6', 
		'$', '\xFE', '\n', '$', '\r', '$', '\xE', '$', '\xFF', '\x3', '$', '\x3', 
		'$', '\x2', '\x2', '%', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', '\t', 
		'\x6', '\v', '\a', '\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', '\v', 
		'\x15', '\f', '\x17', '\r', '\x19', '\xE', '\x1B', '\xF', '\x1D', '\x10', 
		'\x1F', '\x11', '!', '\x12', '#', '\x13', '%', '\x14', '\'', '\x15', ')', 
		'\x16', '+', '\x17', '-', '\x18', '/', '\x19', '\x31', '\x1A', '\x33', 
		'\x1B', '\x35', '\x1C', '\x37', '\x1D', '\x39', '\x1E', ';', '\x1F', '=', 
		' ', '?', '!', '\x41', '\"', '\x43', '#', '\x45', '$', 'G', '%', '\x3', 
		'\x2', '\a', '\x5', '\x2', '\x43', '\\', '\x61', '\x61', '\x63', '|', 
		'\x4', '\x2', '#', '#', '/', '/', '\x5', '\x2', ',', '-', '/', '/', '\x31', 
		'\x31', '\x5', '\x2', '(', '(', '`', '`', '~', '~', '\x5', '\x2', '\v', 
		'\f', '\xF', '\xF', '\"', '\"', '\x2', '\x114', '\x2', '\x3', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', '\a', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', '\x2', '\x2', '\v', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', '\x2', '\x15', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x19', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', '\x2', '#', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x33', '\x3', '\x2', '\x2', '\x2', '\x2', '\x35', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x37', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x39', '\x3', '\x2', '\x2', '\x2', '\x2', ';', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '=', '\x3', '\x2', '\x2', '\x2', '\x2', '?', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x41', '\x3', '\x2', '\x2', '\x2', '\x2', '\x43', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'G', '\x3', '\x2', '\x2', '\x2', '\x3', 'I', '\x3', '\x2', '\x2', 
		'\x2', '\x5', 'L', '\x3', '\x2', '\x2', '\x2', '\a', 'P', '\x3', '\x2', 
		'\x2', '\x2', '\t', 'T', '\x3', '\x2', '\x2', '\x2', '\v', 'V', '\x3', 
		'\x2', '\x2', '\x2', '\r', '^', '\x3', '\x2', '\x2', '\x2', '\xF', '`', 
		'\x3', '\x2', '\x2', '\x2', '\x11', 'g', '\x3', '\x2', '\x2', '\x2', '\x13', 
		'u', '\x3', '\x2', '\x2', '\x2', '\x15', '\x94', '\x3', '\x2', '\x2', 
		'\x2', '\x17', '\x9F', '\x3', '\x2', '\x2', '\x2', '\x19', '\xA1', '\x3', 
		'\x2', '\x2', '\x2', '\x1B', '\xA5', '\x3', '\x2', '\x2', '\x2', '\x1D', 
		'\xA7', '\x3', '\x2', '\x2', '\x2', '\x1F', '\xA9', '\x3', '\x2', '\x2', 
		'\x2', '!', '\xAB', '\x3', '\x2', '\x2', '\x2', '#', '\xAD', '\x3', '\x2', 
		'\x2', '\x2', '%', '\xAF', '\x3', '\x2', '\x2', '\x2', '\'', '\xB4', '\x3', 
		'\x2', '\x2', '\x2', ')', '\xBB', '\x3', '\x2', '\x2', '\x2', '+', '\xBD', 
		'\x3', '\x2', '\x2', '\x2', '-', '\xBF', '\x3', '\x2', '\x2', '\x2', '/', 
		'\xC1', '\x3', '\x2', '\x2', '\x2', '\x31', '\xC3', '\x3', '\x2', '\x2', 
		'\x2', '\x33', '\xC5', '\x3', '\x2', '\x2', '\x2', '\x35', '\xCB', '\x3', 
		'\x2', '\x2', '\x2', '\x37', '\xCE', '\x3', '\x2', '\x2', '\x2', '\x39', 
		'\xD5', '\x3', '\x2', '\x2', '\x2', ';', '\xDD', '\x3', '\x2', '\x2', 
		'\x2', '=', '\xE2', '\x3', '\x2', '\x2', '\x2', '?', '\xEB', '\x3', '\x2', 
		'\x2', '\x2', '\x41', '\xF1', '\x3', '\x2', '\x2', '\x2', '\x43', '\xF3', 
		'\x3', '\x2', '\x2', '\x2', '\x45', '\xF5', '\x3', '\x2', '\x2', '\x2', 
		'G', '\xFD', '\x3', '\x2', '\x2', '\x2', 'I', 'J', '\x4', '\x32', ';', 
		'\x2', 'J', '\x4', '\x3', '\x2', '\x2', '\x2', 'K', 'M', '\x5', '\x3', 
		'\x2', '\x2', 'L', 'K', '\x3', '\x2', '\x2', '\x2', 'M', 'N', '\x3', '\x2', 
		'\x2', '\x2', 'N', 'L', '\x3', '\x2', '\x2', '\x2', 'N', 'O', '\x3', '\x2', 
		'\x2', '\x2', 'O', '\x6', '\x3', '\x2', '\x2', '\x2', 'P', 'Q', '\x5', 
		'\x5', '\x3', '\x2', 'Q', 'R', '\a', '\x30', '\x2', '\x2', 'R', 'S', '\x5', 
		'\x5', '\x3', '\x2', 'S', '\b', '\x3', '\x2', '\x2', '\x2', 'T', 'U', 
		'\t', '\x2', '\x2', '\x2', 'U', '\n', '\x3', '\x2', '\x2', '\x2', 'V', 
		'[', '\x5', '\t', '\x5', '\x2', 'W', 'Z', '\x5', '\x5', '\x3', '\x2', 
		'X', 'Z', '\x5', '\t', '\x5', '\x2', 'Y', 'W', '\x3', '\x2', '\x2', '\x2', 
		'Y', 'X', '\x3', '\x2', '\x2', '\x2', 'Z', ']', '\x3', '\x2', '\x2', '\x2', 
		'[', 'Y', '\x3', '\x2', '\x2', '\x2', '[', '\\', '\x3', '\x2', '\x2', 
		'\x2', '\\', '\f', '\x3', '\x2', '\x2', '\x2', ']', '[', '\x3', '\x2', 
		'\x2', '\x2', '^', '_', '\t', '\x3', '\x2', '\x2', '_', '\xE', '\x3', 
		'\x2', '\x2', '\x2', '`', '\x61', '\t', '\x4', '\x2', '\x2', '\x61', '\x10', 
		'\x3', '\x2', '\x2', '\x2', '\x62', 'h', '\t', '\x5', '\x2', '\x2', '\x63', 
		'\x64', '\a', '@', '\x2', '\x2', '\x64', 'h', '\a', '@', '\x2', '\x2', 
		'\x65', '\x66', '\a', '>', '\x2', '\x2', '\x66', 'h', '\a', '>', '\x2', 
		'\x2', 'g', '\x62', '\x3', '\x2', '\x2', '\x2', 'g', '\x63', '\x3', '\x2', 
		'\x2', '\x2', 'g', '\x65', '\x3', '\x2', '\x2', '\x2', 'h', '\x12', '\x3', 
		'\x2', '\x2', '\x2', 'i', 'j', '\a', '(', '\x2', '\x2', 'j', 'v', '\a', 
		'(', '\x2', '\x2', 'k', 'l', '\a', '~', '\x2', '\x2', 'l', 'v', '\a', 
		'~', '\x2', '\x2', 'm', 'n', '\a', '?', '\x2', '\x2', 'n', 'v', '\a', 
		'?', '\x2', '\x2', 'o', 'p', '\a', '#', '\x2', '\x2', 'p', 'v', '\a', 
		'?', '\x2', '\x2', 'q', 'r', '\a', '>', '\x2', '\x2', 'r', 'v', '\a', 
		'?', '\x2', '\x2', 's', 't', '\a', '@', '\x2', '\x2', 't', 'v', '\a', 
		'?', '\x2', '\x2', 'u', 'i', '\x3', '\x2', '\x2', '\x2', 'u', 'k', '\x3', 
		'\x2', '\x2', '\x2', 'u', 'm', '\x3', '\x2', '\x2', '\x2', 'u', 'o', '\x3', 
		'\x2', '\x2', '\x2', 'u', 'q', '\x3', '\x2', '\x2', '\x2', 'u', 's', '\x3', 
		'\x2', '\x2', '\x2', 'v', '\x14', '\x3', '\x2', '\x2', '\x2', 'w', 'x', 
		'\a', 'k', '\x2', '\x2', 'x', 'y', '\a', 'p', '\x2', '\x2', 'y', '\x95', 
		'\a', 'v', '\x2', '\x2', 'z', '{', '\a', 'h', '\x2', '\x2', '{', '|', 
		'\a', 'n', '\x2', '\x2', '|', '}', '\a', 'q', '\x2', '\x2', '}', '~', 
		'\a', '\x63', '\x2', '\x2', '~', '\x95', '\a', 'v', '\x2', '\x2', '\x7F', 
		'\x80', '\a', 'u', '\x2', '\x2', '\x80', '\x81', '\a', 'j', '\x2', '\x2', 
		'\x81', '\x82', '\a', 'q', '\x2', '\x2', '\x82', '\x83', '\a', 't', '\x2', 
		'\x2', '\x83', '\x95', '\a', 'v', '\x2', '\x2', '\x84', '\x85', '\a', 
		'\x65', '\x2', '\x2', '\x85', '\x86', '\a', 'j', '\x2', '\x2', '\x86', 
		'\x87', '\a', '\x63', '\x2', '\x2', '\x87', '\x95', '\a', 't', '\x2', 
		'\x2', '\x88', '\x89', '\a', 'n', '\x2', '\x2', '\x89', '\x8A', '\a', 
		'q', '\x2', '\x2', '\x8A', '\x8B', '\a', 'p', '\x2', '\x2', '\x8B', '\x95', 
		'\a', 'i', '\x2', '\x2', '\x8C', '\x8D', '\a', '\x66', '\x2', '\x2', '\x8D', 
		'\x8E', '\a', 'g', '\x2', '\x2', '\x8E', '\x8F', '\a', '\x65', '\x2', 
		'\x2', '\x8F', '\x90', '\a', 'k', '\x2', '\x2', '\x90', '\x91', '\a', 
		'o', '\x2', '\x2', '\x91', '\x92', '\a', '\x63', '\x2', '\x2', '\x92', 
		'\x95', '\a', 'n', '\x2', '\x2', '\x93', '\x95', '\x5', '\v', '\x6', '\x2', 
		'\x94', 'w', '\x3', '\x2', '\x2', '\x2', '\x94', 'z', '\x3', '\x2', '\x2', 
		'\x2', '\x94', '\x7F', '\x3', '\x2', '\x2', '\x2', '\x94', '\x84', '\x3', 
		'\x2', '\x2', '\x2', '\x94', '\x88', '\x3', '\x2', '\x2', '\x2', '\x94', 
		'\x8C', '\x3', '\x2', '\x2', '\x2', '\x94', '\x93', '\x3', '\x2', '\x2', 
		'\x2', '\x95', '\x16', '\x3', '\x2', '\x2', '\x2', '\x96', '\x97', '\a', 
		'v', '\x2', '\x2', '\x97', '\x98', '\a', 't', '\x2', '\x2', '\x98', '\x99', 
		'\a', 'w', '\x2', '\x2', '\x99', '\xA0', '\a', 'g', '\x2', '\x2', '\x9A', 
		'\x9B', '\a', 'h', '\x2', '\x2', '\x9B', '\x9C', '\a', '\x63', '\x2', 
		'\x2', '\x9C', '\x9D', '\a', 'n', '\x2', '\x2', '\x9D', '\x9E', '\a', 
		'u', '\x2', '\x2', '\x9E', '\xA0', '\a', 'g', '\x2', '\x2', '\x9F', '\x96', 
		'\x3', '\x2', '\x2', '\x2', '\x9F', '\x9A', '\x3', '\x2', '\x2', '\x2', 
		'\xA0', '\x18', '\x3', '\x2', '\x2', '\x2', '\xA1', '\xA2', '\a', 'h', 
		'\x2', '\x2', '\xA2', '\xA3', '\a', 'q', '\x2', '\x2', '\xA3', '\xA4', 
		'\a', 't', '\x2', '\x2', '\xA4', '\x1A', '\x3', '\x2', '\x2', '\x2', '\xA5', 
		'\xA6', '\a', '}', '\x2', '\x2', '\xA6', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', '\xA7', '\xA8', '\a', '\x7F', '\x2', '\x2', '\xA8', '\x1E', '\x3', 
		'\x2', '\x2', '\x2', '\xA9', '\xAA', '\a', ']', '\x2', '\x2', '\xAA', 
		' ', '\x3', '\x2', '\x2', '\x2', '\xAB', '\xAC', '\a', '_', '\x2', '\x2', 
		'\xAC', '\"', '\x3', '\x2', '\x2', '\x2', '\xAD', '\xAE', '\a', '=', '\x2', 
		'\x2', '\xAE', '$', '\x3', '\x2', '\x2', '\x2', '\xAF', '\xB0', '\a', 
		'g', '\x2', '\x2', '\xB0', '\xB1', '\a', 'p', '\x2', '\x2', '\xB1', '\xB2', 
		'\a', 'w', '\x2', '\x2', '\xB2', '\xB3', '\a', 'o', '\x2', '\x2', '\xB3', 
		'&', '\x3', '\x2', '\x2', '\x2', '\xB4', '\xB5', '\a', 'u', '\x2', '\x2', 
		'\xB5', '\xB6', '\a', 'v', '\x2', '\x2', '\xB6', '\xB7', '\a', 't', '\x2', 
		'\x2', '\xB7', '\xB8', '\a', 'w', '\x2', '\x2', '\xB8', '\xB9', '\a', 
		'\x65', '\x2', '\x2', '\xB9', '\xBA', '\a', 'v', '\x2', '\x2', '\xBA', 
		'(', '\x3', '\x2', '\x2', '\x2', '\xBB', '\xBC', '\a', '?', '\x2', '\x2', 
		'\xBC', '*', '\x3', '\x2', '\x2', '\x2', '\xBD', '\xBE', '\a', '.', '\x2', 
		'\x2', '\xBE', ',', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xC0', '\a', 
		'\x30', '\x2', '\x2', '\xC0', '.', '\x3', '\x2', '\x2', '\x2', '\xC1', 
		'\xC2', '\a', '*', '\x2', '\x2', '\xC2', '\x30', '\x3', '\x2', '\x2', 
		'\x2', '\xC3', '\xC4', '\a', '+', '\x2', '\x2', '\xC4', '\x32', '\x3', 
		'\x2', '\x2', '\x2', '\xC5', '\xC6', '\a', 'y', '\x2', '\x2', '\xC6', 
		'\xC7', '\a', 'j', '\x2', '\x2', '\xC7', '\xC8', '\a', 'k', '\x2', '\x2', 
		'\xC8', '\xC9', '\a', 'n', '\x2', '\x2', '\xC9', '\xCA', '\a', 'g', '\x2', 
		'\x2', '\xCA', '\x34', '\x3', '\x2', '\x2', '\x2', '\xCB', '\xCC', '\a', 
		'\x66', '\x2', '\x2', '\xCC', '\xCD', '\a', 'q', '\x2', '\x2', '\xCD', 
		'\x36', '\x3', '\x2', '\x2', '\x2', '\xCE', '\xCF', '\a', 'u', '\x2', 
		'\x2', '\xCF', '\xD0', '\a', 'y', '\x2', '\x2', '\xD0', '\xD1', '\a', 
		'k', '\x2', '\x2', '\xD1', '\xD2', '\a', 'v', '\x2', '\x2', '\xD2', '\xD3', 
		'\a', '\x65', '\x2', '\x2', '\xD3', '\xD4', '\a', 'j', '\x2', '\x2', '\xD4', 
		'\x38', '\x3', '\x2', '\x2', '\x2', '\xD5', '\xD6', '\a', '\x66', '\x2', 
		'\x2', '\xD6', '\xD7', '\a', 'g', '\x2', '\x2', '\xD7', '\xD8', '\a', 
		'h', '\x2', '\x2', '\xD8', '\xD9', '\a', '\x63', '\x2', '\x2', '\xD9', 
		'\xDA', '\a', 'w', '\x2', '\x2', '\xDA', '\xDB', '\a', 'n', '\x2', '\x2', 
		'\xDB', '\xDC', '\a', 'v', '\x2', '\x2', '\xDC', ':', '\x3', '\x2', '\x2', 
		'\x2', '\xDD', '\xDE', '\a', '\x65', '\x2', '\x2', '\xDE', '\xDF', '\a', 
		'\x63', '\x2', '\x2', '\xDF', '\xE0', '\a', 'u', '\x2', '\x2', '\xE0', 
		'\xE1', '\a', 'g', '\x2', '\x2', '\xE1', '<', '\x3', '\x2', '\x2', '\x2', 
		'\xE2', '\xE3', '\a', '\x65', '\x2', '\x2', '\xE3', '\xE4', '\a', 'q', 
		'\x2', '\x2', '\xE4', '\xE5', '\a', 'p', '\x2', '\x2', '\xE5', '\xE6', 
		'\a', 'v', '\x2', '\x2', '\xE6', '\xE7', '\a', 'k', '\x2', '\x2', '\xE7', 
		'\xE8', '\a', 'p', '\x2', '\x2', '\xE8', '\xE9', '\a', 'w', '\x2', '\x2', 
		'\xE9', '\xEA', '\a', 'g', '\x2', '\x2', '\xEA', '>', '\x3', '\x2', '\x2', 
		'\x2', '\xEB', '\xEC', '\a', '\x64', '\x2', '\x2', '\xEC', '\xED', '\a', 
		't', '\x2', '\x2', '\xED', '\xEE', '\a', 'g', '\x2', '\x2', '\xEE', '\xEF', 
		'\a', '\x63', '\x2', '\x2', '\xEF', '\xF0', '\a', 'm', '\x2', '\x2', '\xF0', 
		'@', '\x3', '\x2', '\x2', '\x2', '\xF1', '\xF2', '\a', '<', '\x2', '\x2', 
		'\xF2', '\x42', '\x3', '\x2', '\x2', '\x2', '\xF3', '\xF4', '\a', '\x41', 
		'\x2', '\x2', '\xF4', '\x44', '\x3', '\x2', '\x2', '\x2', '\xF5', '\xF6', 
		'\a', 't', '\x2', '\x2', '\xF6', '\xF7', '\a', 'g', '\x2', '\x2', '\xF7', 
		'\xF8', '\a', 'v', '\x2', '\x2', '\xF8', '\xF9', '\a', 'w', '\x2', '\x2', 
		'\xF9', '\xFA', '\a', 't', '\x2', '\x2', '\xFA', '\xFB', '\a', 'p', '\x2', 
		'\x2', '\xFB', '\x46', '\x3', '\x2', '\x2', '\x2', '\xFC', '\xFE', '\t', 
		'\x6', '\x2', '\x2', '\xFD', '\xFC', '\x3', '\x2', '\x2', '\x2', '\xFE', 
		'\xFF', '\x3', '\x2', '\x2', '\x2', '\xFF', '\xFD', '\x3', '\x2', '\x2', 
		'\x2', '\xFF', '\x100', '\x3', '\x2', '\x2', '\x2', '\x100', '\x101', 
		'\x3', '\x2', '\x2', '\x2', '\x101', '\x102', '\b', '$', '\x2', '\x2', 
		'\x102', 'H', '\x3', '\x2', '\x2', '\x2', '\v', '\x2', 'N', 'Y', '[', 
		'g', 'u', '\x94', '\x9F', '\xFF', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
