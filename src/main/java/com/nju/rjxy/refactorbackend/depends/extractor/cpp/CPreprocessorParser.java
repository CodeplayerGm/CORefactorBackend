// Generated from D:/Development/idea_projects/depends-0.9.6/src/main/antlr4/depends/extractor/cpp\CPreprocessor.g4 by ANTLR 4.9.1
package com.nju.rjxy.refactorbackend.depends.extractor.cpp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CHAR=8, COMMENT=9, 
		HEXADECIMAL=10, ID=11, INT=12, LineEscape=13, NL=14, SL_COMMENT=15, SPECIAL=16, 
		STRING=17, WS=18;
	public static final int
		RULE_program = 0, RULE_translation_unit = 1, RULE_non_preprocessor = 2, 
		RULE_preprocessor = 3, RULE_pp_include = 4, RULE_pp_define = 5, RULE_pp_ignore = 6, 
		RULE_token_sequence = 7, RULE_ignore = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "translation_unit", "non_preprocessor", "preprocessor", "pp_include", 
			"pp_define", "pp_ignore", "token_sequence", "ignore"
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

	@Override
	public String getGrammarFileName() { return "CPreprocessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			translation_unit();
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

	public static class Translation_unitContext extends ParserRuleContext {
		public List<PreprocessorContext> preprocessor() {
			return getRuleContexts(PreprocessorContext.class);
		}
		public PreprocessorContext preprocessor(int i) {
			return getRuleContext(PreprocessorContext.class,i);
		}
		public List<Non_preprocessorContext> non_preprocessor() {
			return getRuleContexts(Non_preprocessorContext.class);
		}
		public Non_preprocessorContext non_preprocessor(int i) {
			return getRuleContext(Non_preprocessorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(CPreprocessorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(CPreprocessorParser.NL, i);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitTranslation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitTranslation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					match(T__0);
					setState(21);
					preprocessor();
					}
					break;
				case 2:
					{
					setState(22);
					non_preprocessor();
					}
					break;
				case 3:
					{
					setState(23);
					match(NL);
					}
					break;
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << CHAR) | (1L << COMMENT) | (1L << HEXADECIMAL) | (1L << ID) | (1L << INT) | (1L << LineEscape) | (1L << NL) | (1L << SL_COMMENT) | (1L << SPECIAL) | (1L << STRING) | (1L << WS))) != 0) );
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

	public static class Non_preprocessorContext extends ParserRuleContext {
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public Non_preprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterNon_preprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitNon_preprocessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitNon_preprocessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_preprocessorContext non_preprocessor() throws RecognitionException {
		Non_preprocessorContext _localctx = new Non_preprocessorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_non_preprocessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			ignore();
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

	public static class PreprocessorContext extends ParserRuleContext {
		public Pp_defineContext pp_define() {
			return getRuleContext(Pp_defineContext.class,0);
		}
		public Pp_includeContext pp_include() {
			return getRuleContext(Pp_includeContext.class,0);
		}
		public Pp_ignoreContext pp_ignore() {
			return getRuleContext(Pp_ignoreContext.class,0);
		}
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterPreprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitPreprocessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitPreprocessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_preprocessor);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				pp_define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				pp_include();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				pp_ignore();
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

	public static class Pp_includeContext extends ParserRuleContext {
		public Token_sequenceContext token_sequence() {
			return getRuleContext(Token_sequenceContext.class,0);
		}
		public Pp_includeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterPp_include(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitPp_include(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitPp_include(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pp_includeContext pp_include() throws RecognitionException {
		Pp_includeContext _localctx = new Pp_includeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pp_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__1);
			setState(36);
			token_sequence();
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

	public static class Pp_defineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPreprocessorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPreprocessorParser.ID, i);
		}
		public Token_sequenceContext token_sequence() {
			return getRuleContext(Token_sequenceContext.class,0);
		}
		public Pp_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterPp_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitPp_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitPp_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pp_defineContext pp_define() throws RecognitionException {
		Pp_defineContext _localctx = new Pp_defineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pp_define);
		int _la;
		try {
			int _alt;
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__2);
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				setState(41);
				match(ID);
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(42);
						match(T__4);
						setState(43);
						match(ID);
						}
						} 
					}
					setState(48);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(49);
					match(T__4);
					setState(50);
					match(T__5);
					}
				}

				setState(53);
				match(T__6);
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(54);
					token_sequence();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__2);
				setState(58);
				match(ID);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(59);
					token_sequence();
					}
					break;
				}
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

	public static class Pp_ignoreContext extends ParserRuleContext {
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public Pp_ignoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterPp_ignore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitPp_ignore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitPp_ignore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pp_ignoreContext pp_ignore() throws RecognitionException {
		Pp_ignoreContext _localctx = new Pp_ignoreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pp_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			ignore();
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

	public static class Token_sequenceContext extends ParserRuleContext {
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public Token_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterToken_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitToken_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitToken_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_sequenceContext token_sequence() throws RecognitionException {
		Token_sequenceContext _localctx = new Token_sequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			ignore();
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

	public static class IgnoreContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(CPreprocessorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(CPreprocessorParser.NL, i);
		}
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPreprocessorListener ) ((CPreprocessorListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPreprocessorVisitor ) return ((CPreprocessorVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ignore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << CHAR) | (1L << COMMENT) | (1L << HEXADECIMAL) | (1L << ID) | (1L << INT) | (1L << LineEscape) | (1L << SL_COMMENT) | (1L << SPECIAL) | (1L << STRING) | (1L << WS))) != 0) );
			setState(73);
			match(NL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\4\3\4\3\5\3\5\3\5\5\5$\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7/\n\7\f\7\16\7\62\13\7\3\7\3\7\5\7\66"+
		"\n\7\3\7\3\7\5\7:\n\7\3\7\3\7\3\7\5\7?\n\7\5\7A\n\7\3\b\3\b\3\t\3\t\3"+
		"\n\6\nH\n\n\r\n\16\nI\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2"+
		"\20\20\2O\2\24\3\2\2\2\4\32\3\2\2\2\6\36\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2"+
		"\f@\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22G\3\2\2\2\24\25\5\4\3\2\25\3\3\2"+
		"\2\2\26\27\7\3\2\2\27\33\5\b\5\2\30\33\5\6\4\2\31\33\7\20\2\2\32\26\3"+
		"\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\5\3\2\2\2\36\37\5\22\n\2\37\7\3\2\2\2 $\5\f\7\2!$\5\n\6\2\""+
		"$\5\16\b\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\t\3\2\2\2%&\7\4\2\2&\'\5\20"+
		"\t\2\'\13\3\2\2\2()\7\5\2\2)*\7\r\2\2*+\7\6\2\2+\60\7\r\2\2,-\7\7\2\2"+
		"-/\7\r\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\65\3\2\2"+
		"\2\62\60\3\2\2\2\63\64\7\7\2\2\64\66\7\b\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\679\7\t\2\28:\5\20\t\298\3\2\2\29:\3\2\2\2:A\3\2\2\2"+
		";<\7\5\2\2<>\7\r\2\2=?\5\20\t\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@(\3\2\2"+
		"\2@;\3\2\2\2A\r\3\2\2\2BC\5\22\n\2C\17\3\2\2\2DE\5\22\n\2E\21\3\2\2\2"+
		"FH\n\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\20\2"+
		"\2L\23\3\2\2\2\13\32\34#\60\659>@I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}