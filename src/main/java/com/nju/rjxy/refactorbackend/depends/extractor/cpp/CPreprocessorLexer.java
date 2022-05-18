// Generated from D:/Development/idea_projects/depends-0.9.6/src/main/antlr4/depends/extractor/cpp\CPreprocessor.g4 by ANTLR 4.9.1
package com.nju.rjxy.refactorbackend.depends.extractor.cpp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPreprocessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CHAR=8, COMMENT=9, 
		HEXADECIMAL=10, ID=11, INT=12, LineEscape=13, NL=14, SL_COMMENT=15, SPECIAL=16, 
		STRING=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CHAR", "COMMENT", 
			"HEXADECIMAL", "ID", "INT", "LineEscape", "NL", "SL_COMMENT", "SPECIAL", 
			"STRING", "WS", "DIGIT", "ID_FIRST", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'define'", "'('", "','", "'...'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CHAR", "COMMENT", "HEXADECIMAL", 
			"ID", "INT", "LineEscape", "NL", "SL_COMMENT", "SPECIAL", "STRING", "WS"
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


	public CPreprocessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CPreprocessor.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\5\tK\n\t\3\t\6\tN\n\t\r\t\16\tO\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6"+
		"\13e\n\13\r\13\16\13f\3\f\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\3\r\6\rr\n\r"+
		"\r\r\16\rs\3\16\3\16\3\16\5\16y\n\16\3\16\5\16|\n\16\3\16\3\16\3\17\3"+
		"\17\5\17\u0082\n\17\3\17\5\17\u0085\n\17\3\20\3\20\3\20\3\20\7\20\u008b"+
		"\n\20\f\20\16\20\u008e\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\5"+
		"\22\u0098\n\22\3\22\7\22\u009b\n\22\f\22\16\22\u009e\13\22\3\22\3\22\3"+
		"\23\6\23\u00a3\n\23\r\23\16\23\u00a4\3\23\3\23\3\24\3\24\3\25\3\25\5\25"+
		"\u00ad\n\25\3\26\3\26\6OY\u008c\u009c\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2"+
		"\3\2\b\4\2ZZzz\5\2\62;CHch\t\2##\'(*\61<A]]_`}\177\4\2\13\13\"\"\3\2\62"+
		";\4\2C\\c|\2\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\67\3\2\2\2\t>"+
		"\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23S\3\2\2\2\25"+
		"a\3\2\2\2\27h\3\2\2\2\31q\3\2\2\2\33u\3\2\2\2\35\u0084\3\2\2\2\37\u0086"+
		"\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u00a2\3\2\2\2\'\u00a8\3\2\2\2"+
		")\u00ac\3\2\2\2+\u00ae\3\2\2\2-.\7%\2\2.\4\3\2\2\2/\60\7k\2\2\60\61\7"+
		"p\2\2\61\62\7e\2\2\62\63\7n\2\2\63\64\7w\2\2\64\65\7f\2\2\65\66\7g\2\2"+
		"\66\6\3\2\2\2\678\7f\2\289\7g\2\29:\7h\2\2:;\7k\2\2;<\7p\2\2<=\7g\2\2"+
		"=\b\3\2\2\2>?\7*\2\2?\n\3\2\2\2@A\7.\2\2A\f\3\2\2\2BC\7\60\2\2CD\7\60"+
		"\2\2DE\7\60\2\2E\16\3\2\2\2FG\7+\2\2G\20\3\2\2\2HM\7)\2\2IK\7^\2\2JI\3"+
		"\2\2\2JK\3\2\2\2KL\3\2\2\2LN\13\2\2\2MJ\3\2\2\2NO\3\2\2\2OP\3\2\2\2OM"+
		"\3\2\2\2PQ\3\2\2\2QR\7)\2\2R\22\3\2\2\2ST\7\61\2\2TU\7,\2\2UY\3\2\2\2"+
		"VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2"+
		"\2\\]\7,\2\2]^\7\61\2\2^_\3\2\2\2_`\b\n\2\2`\24\3\2\2\2ab\7\62\2\2bd\t"+
		"\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\26\3\2\2\2h"+
		"m\5)\25\2il\5)\25\2jl\5\'\24\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"mn\3\2\2\2n\30\3\2\2\2om\3\2\2\2pr\5\'\24\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t\32\3\2\2\2u{\7^\2\2vx\7\17\2\2wy\7\f\2\2xw\3\2\2\2xy\3"+
		"\2\2\2y|\3\2\2\2z|\7\f\2\2{v\3\2\2\2{z\3\2\2\2|}\3\2\2\2}~\b\16\3\2~\34"+
		"\3\2\2\2\177\u0081\7\17\2\2\u0080\u0082\7\f\2\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0085\7\f\2\2\u0084\177\3\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\36\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088"+
		"\7\61\2\2\u0088\u008c\3\2\2\2\u0089\u008b\13\2\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\f\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\b\20\2\2\u0092 \3\2\2\2\u0093\u0094\t\4\2\2\u0094\"\3\2\2\2\u0095"+
		"\u009c\7$\2\2\u0096\u0098\7^\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009b\13\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0$\3\2\2\2\u00a1\u00a3"+
		"\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\23\2\2\u00a7&\3\2\2\2"+
		"\u00a8\u00a9\t\6\2\2\u00a9(\3\2\2\2\u00aa\u00ad\5+\26\2\u00ab\u00ad\7"+
		"a\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad*\3\2\2\2\u00ae\u00af"+
		"\t\7\2\2\u00af,\3\2\2\2\23\2JOYfkmsx{\u0081\u0084\u008c\u0097\u009c\u00a4"+
		"\u00ac\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}