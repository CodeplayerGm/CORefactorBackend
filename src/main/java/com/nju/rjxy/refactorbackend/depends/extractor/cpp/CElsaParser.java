// Generated from D:/Development/idea_projects/RefactorBackend/src/main/antlr4/depends/extractor/cpp\CElsa.g4 by ANTLR 4.9.2
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
public class CElsaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, LINE_ESCAPE=99, MultiLineMacro=100, 
		Directive=101, Operator=102, Template=103, Mutable=104, Static=105, Extern=106, 
		Register=107, Auto=108, Virtual=109, Inline=110, Explicit=111, Namespace=112, 
		Using=113, Asm=114, NestedName=115, WS=116, COMMENT=117, LINE_COMMENT=118, 
		GCC_ATTRIBUTE=119, Identifier=120, DotDot=121, Integerliteral=122, Decimalliteral=123, 
		Hexadecimalliteral=124, Octalliteral=125, Binaryliteral=126, Floatingliteral=127, 
		Booleanliteral=128, Characterliteral=129, Stringliteral=130, IDENTIFIER=131;
	public static final int
		RULE_translationUnit = 0, RULE_declaration = 1, RULE_macroInvocation = 2, 
		RULE_typedefName = 3, RULE_namespaceName = 4, RULE_originalNamespaceName = 5, 
		RULE_namespaceAlias = 6, RULE_className = 7, RULE_enumName = 8, RULE_templateName = 9, 
		RULE_stringBlock = 10, RULE_idExpression = 11, RULE_unqualifiedId = 12, 
		RULE_qualifiedId = 13, RULE_nestedNameSpecifier = 14, RULE_classOrNamespaceName = 15, 
		RULE_primaryExpression = 16, RULE_expression = 17, RULE_expressionList = 18, 
		RULE_expressions = 19, RULE_pseudoDestructorName = 20, RULE_newExpression = 21, 
		RULE_newPlacement = 22, RULE_newTypeId = 23, RULE_newInitializer = 24, 
		RULE_deleteExpression = 25, RULE_pmExpression = 26, RULE_statement = 27, 
		RULE_labeledStatement = 28, RULE_expressionStatement = 29, RULE_compoundStatement = 30, 
		RULE_selectionStatement = 31, RULE_condition = 32, RULE_iterationStatement = 33, 
		RULE_forInitStatement = 34, RULE_jumpStatement = 35, RULE_blockDeclaration = 36, 
		RULE_simpleDeclaration = 37, RULE_initDeclaratorList = 38, RULE_initDeclarator = 39, 
		RULE_declSpecifier = 40, RULE_functionPtr = 41, RULE_storageClassSpecifier = 42, 
		RULE_functionSpecifier = 43, RULE_typeSpecifier = 44, RULE_simpleTypeSpecifier = 45, 
		RULE_typeName = 46, RULE_elaboratedTypeSpecifier = 47, RULE_enumSpecifier = 48, 
		RULE_enumeratorList = 49, RULE_enumeratorDefinition = 50, RULE_namespaceDefinition = 51, 
		RULE_namespaceAliasDefinition = 52, RULE_qualifiedNamespaceSpecifier = 53, 
		RULE_usingDeclaration = 54, RULE_usingDirective = 55, RULE_asmDefinition = 56, 
		RULE_linkageSpecification = 57, RULE_declarator = 58, RULE_parameters = 59, 
		RULE_ptrOperator = 60, RULE_cvQualifierSeq = 61, RULE_cvQualifier = 62, 
		RULE_declaratorId = 63, RULE_typeId = 64, RULE_parameterDeclarationClause = 65, 
		RULE_parameterDeclaration = 66, RULE_functionDefinition = 67, RULE_functionBody = 68, 
		RULE_initializer = 69, RULE_initializerClause = 70, RULE_classSpecifier = 71, 
		RULE_classHead = 72, RULE_classKey = 73, RULE_memberSpecification = 74, 
		RULE_memberDeclaration = 75, RULE_memberDeclaratorList = 76, RULE_memberDeclarator = 77, 
		RULE_pureSpecifier = 78, RULE_constantInitializer = 79, RULE_baseClause = 80, 
		RULE_baseSpecifierList = 81, RULE_baseSpecifier = 82, RULE_accessSpecifier = 83, 
		RULE_conversionFunctionId = 84, RULE_ctorInitializer = 85, RULE_memInitializer = 86, 
		RULE_memInitializerId = 87, RULE_operatorFunctionId = 88, RULE_operatorFunc = 89, 
		RULE_templateDeclaration = 90, RULE_templateParameterList = 91, RULE_templateParameter = 92, 
		RULE_typeParameter = 93, RULE_templateId = 94, RULE_templateArgumentList = 95, 
		RULE_templateArgument = 96, RULE_explicitInstantiation = 97, RULE_explicitSpecialization = 98, 
		RULE_tryBlock = 99, RULE_functionTryBlock = 100, RULE_handlerSeq = 101, 
		RULE_handler = 102, RULE_exceptionDeclaration = 103, RULE_throwExpression = 104, 
		RULE_exceptionSpecification = 105, RULE_typeIdList = 106, RULE_literal = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "declaration", "macroInvocation", "typedefName", "namespaceName", 
			"originalNamespaceName", "namespaceAlias", "className", "enumName", "templateName", 
			"stringBlock", "idExpression", "unqualifiedId", "qualifiedId", "nestedNameSpecifier", 
			"classOrNamespaceName", "primaryExpression", "expression", "expressionList", 
			"expressions", "pseudoDestructorName", "newExpression", "newPlacement", 
			"newTypeId", "newInitializer", "deleteExpression", "pmExpression", "statement", 
			"labeledStatement", "expressionStatement", "compoundStatement", "selectionStatement", 
			"condition", "iterationStatement", "forInitStatement", "jumpStatement", 
			"blockDeclaration", "simpleDeclaration", "initDeclaratorList", "initDeclarator", 
			"declSpecifier", "functionPtr", "storageClassSpecifier", "functionSpecifier", 
			"typeSpecifier", "simpleTypeSpecifier", "typeName", "elaboratedTypeSpecifier", 
			"enumSpecifier", "enumeratorList", "enumeratorDefinition", "namespaceDefinition", 
			"namespaceAliasDefinition", "qualifiedNamespaceSpecifier", "usingDeclaration", 
			"usingDirective", "asmDefinition", "linkageSpecification", "declarator", 
			"parameters", "ptrOperator", "cvQualifierSeq", "cvQualifier", "declaratorId", 
			"typeId", "parameterDeclarationClause", "parameterDeclaration", "functionDefinition", 
			"functionBody", "initializer", "initializerClause", "classSpecifier", 
			"classHead", "classKey", "memberSpecification", "memberDeclaration", 
			"memberDeclaratorList", "memberDeclarator", "pureSpecifier", "constantInitializer", 
			"baseClause", "baseSpecifierList", "baseSpecifier", "accessSpecifier", 
			"conversionFunctionId", "ctorInitializer", "memInitializer", "memInitializerId", 
			"operatorFunctionId", "operatorFunc", "templateDeclaration", "templateParameterList", 
			"templateParameter", "typeParameter", "templateId", "templateArgumentList", 
			"templateArgument", "explicitInstantiation", "explicitSpecialization", 
			"tryBlock", "functionTryBlock", "handlerSeq", "handler", "exceptionDeclaration", 
			"throwExpression", "exceptionSpecification", "typeIdList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'('", "')'", "'~'", "'this'", "'.'", "'->'", "'+'", 
			"'-'", "'++'", "'--'", "'*'", "'&'", "'!'", "'['", "']'", "'sizeof'", 
			"'typename'", "'dynamic_cast'", "'static_cast'", "'reinterpret_cast'", 
			"'const_cast'", "'typeid'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'<='", 
			"'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", "'?'", "':'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'>>='", "'>>>='", 
			"'<<='", "'%='", "'{'", "','", "'}'", "'new'", "'delete'", "'.*'", "'case'", 
			"'default'", "';'", "'if'", "'else'", "'switch'", "'while'", "'do'", 
			"'for'", "'break'", "'continue'", "'return'", "'goto'", "'friend'", "'typedef'", 
			"'char'", "'wchar_t'", "'bool'", "'short'", "'int'", "'long'", "'signed'", 
			"'unsigned'", "'float'", "'double'", "'void'", "'enum'", "'const'", "'volatile'", 
			"'...'", "'class'", "'struct'", "'union'", "'private'", "'protected'", 
			"'public'", "'try'", "'catch'", "'throw'", "'nullptr'", "'null'", null, 
			null, null, "'operator'", "'template'", "'mutable'", "'static'", "'extern'", 
			"'register'", "'auto'", "'virtual'", "'inline'", "'explicit'", "'namespace'", 
			"'using'", "'asm'", null, null, null, null, null, null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "LINE_ESCAPE", "MultiLineMacro", "Directive", "Operator", 
			"Template", "Mutable", "Static", "Extern", "Register", "Auto", "Virtual", 
			"Inline", "Explicit", "Namespace", "Using", "Asm", "NestedName", "WS", 
			"COMMENT", "LINE_COMMENT", "GCC_ATTRIBUTE", "Identifier", "DotDot", "Integerliteral", 
			"Decimalliteral", "Hexadecimalliteral", "Octalliteral", "Binaryliteral", 
			"Floatingliteral", "Booleanliteral", "Characterliteral", "Stringliteral", 
			"IDENTIFIER"
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
	public String getGrammarFileName() { return "CElsa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CElsaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CElsaParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__59))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)) | (1L << (T__81 - 71)) | (1L << (T__82 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__85 - 71)) | (1L << (T__87 - 71)) | (1L << (T__88 - 71)) | (1L << (T__89 - 71)) | (1L << (T__95 - 71)) | (1L << (T__96 - 71)) | (1L << (T__97 - 71)) | (1L << (Operator - 71)) | (1L << (Template - 71)) | (1L << (Mutable - 71)) | (1L << (Static - 71)) | (1L << (Extern - 71)) | (1L << (Register - 71)) | (1L << (Auto - 71)) | (1L << (Virtual - 71)) | (1L << (Inline - 71)) | (1L << (Explicit - 71)) | (1L << (Namespace - 71)) | (1L << (Using - 71)) | (1L << (Asm - 71)) | (1L << (NestedName - 71)) | (1L << (Identifier - 71)) | (1L << (DotDot - 71)) | (1L << (Integerliteral - 71)) | (1L << (Floatingliteral - 71)) | (1L << (Booleanliteral - 71)) | (1L << (Characterliteral - 71)) | (1L << (Stringliteral - 71)))) != 0)) {
				{
				{
				setState(216);
				declaration();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public ExplicitInstantiationContext explicitInstantiation() {
			return getRuleContext(ExplicitInstantiationContext.class,0);
		}
		public ExplicitSpecializationContext explicitSpecialization() {
			return getRuleContext(ExplicitSpecializationContext.class,0);
		}
		public LinkageSpecificationContext linkageSpecification() {
			return getRuleContext(LinkageSpecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				macroInvocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				templateDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				explicitInstantiation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				explicitSpecialization();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				linkageSpecification();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				namespaceDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(232);
				expressionList();
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

	public static class MacroInvocationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMacroInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMacroInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_macroInvocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Identifier);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(236);
				match(T__0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__83 - 73)) | (1L << (T__84 - 73)) | (1L << (T__85 - 73)) | (1L << (T__87 - 73)) | (1L << (T__88 - 73)) | (1L << (T__89 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(237);
					templateArgumentList();
					}
				}

				setState(240);
				match(T__1);
				}
			}

			setState(248); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(243);
					match(T__2);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
						{
						setState(244);
						expressionList();
						}
					}

					setState(247);
					match(T__3);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(250); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Identifier);
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

	public static class NamespaceNameContext extends ParserRuleContext {
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespaceName);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				namespaceAlias();
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

	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitOriginalNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(Identifier);
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

	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNamespaceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Identifier);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_className);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				templateId();
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Identifier);
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

	public static class TemplateNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(Identifier);
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

	public static class StringBlockContext extends ParserRuleContext {
		public List<TerminalNode> Stringliteral() { return getTokens(CElsaParser.Stringliteral); }
		public TerminalNode Stringliteral(int i) {
			return getToken(CElsaParser.Stringliteral, i);
		}
		public StringBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterStringBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitStringBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitStringBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringBlockContext stringBlock() throws RecognitionException {
		StringBlockContext _localctx = new StringBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Stringliteral);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					match(Stringliteral);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class IdExpressionContext extends ParserRuleContext {
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idExpression);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				qualifiedId();
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

	public static class UnqualifiedIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public UnqualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitUnqualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unqualifiedId);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__4);
				setState(283);
				className();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				operatorFunctionId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				conversionFunctionId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				templateId();
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

	public static class QualifiedIdContext extends ParserRuleContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public TerminalNode NestedName() { return getToken(CElsaParser.NestedName, 0); }
		public OperatorFuncContext operatorFunc() {
			return getRuleContext(OperatorFuncContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualifiedId);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(289);
					match(DotDot);
					}
				}

				setState(292);
				nestedNameSpecifier();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(293);
					match(Template);
					}
				}

				setState(296);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(NestedName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(NestedName);
				setState(300);
				operatorFunc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(Identifier);
				setState(302);
				match(DotDot);
				setState(303);
				operatorFunctionId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(DotDot);
				setState(305);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				match(DotDot);
				setState(307);
				operatorFunctionId();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				match(DotDot);
				setState(309);
				templateId();
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

	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public ClassOrNamespaceNameContext classOrNamespaceName() {
			return getRuleContext(ClassOrNamespaceNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nestedNameSpecifier);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				classOrNamespaceName();
				setState(313);
				match(DotDot);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(314);
					nestedNameSpecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				classOrNamespaceName();
				setState(318);
				match(DotDot);
				setState(319);
				match(Template);
				setState(320);
				nestedNameSpecifier();
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

	public static class ClassOrNamespaceNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public ClassOrNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterClassOrNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitClassOrNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitClassOrNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrNamespaceNameContext classOrNamespaceName() throws RecognitionException {
		ClassOrNamespaceNameContext _localctx = new ClassOrNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classOrNamespaceName);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				namespaceName();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryExpression);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(T__2);
				setState(331);
				expression(0);
				setState(332);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				idExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				newExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				deleteExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				throwExpression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(341);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(342);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				expression(28);
				}
				break;
			case 3:
				{
				setState(344);
				match(T__17);
				setState(345);
				expression(25);
				}
				break;
			case 4:
				{
				setState(346);
				match(T__17);
				setState(347);
				match(T__2);
				setState(348);
				typeId();
				setState(349);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(351);
				match(T__18);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(352);
					match(DotDot);
					}
				}

				setState(355);
				nestedNameSpecifier();
				setState(356);
				match(Identifier);
				setState(357);
				match(T__2);
				setState(358);
				expressionList();
				setState(359);
				match(T__3);
				}
				break;
			case 6:
				{
				setState(361);
				match(T__18);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(362);
					match(DotDot);
					}
				}

				setState(365);
				nestedNameSpecifier();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(366);
					match(Template);
					}
				}

				setState(369);
				templateId();
				setState(370);
				match(T__2);
				setState(371);
				expressionList();
				setState(372);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(374);
				simpleTypeSpecifier();
				setState(375);
				match(T__2);
				setState(376);
				expressionList();
				setState(377);
				match(T__3);
				}
				break;
			case 8:
				{
				setState(379);
				match(T__19);
				setState(380);
				match(T__0);
				setState(381);
				typeId();
				setState(382);
				match(T__1);
				setState(383);
				match(T__2);
				setState(384);
				expression(0);
				setState(385);
				match(T__3);
				}
				break;
			case 9:
				{
				setState(387);
				match(T__20);
				setState(388);
				match(T__0);
				setState(389);
				typeId();
				setState(390);
				match(T__1);
				setState(391);
				match(T__2);
				setState(392);
				expression(0);
				setState(393);
				match(T__3);
				}
				break;
			case 10:
				{
				setState(395);
				match(T__21);
				setState(396);
				match(T__0);
				setState(397);
				typeId();
				setState(398);
				match(T__1);
				setState(399);
				match(T__2);
				setState(400);
				expression(0);
				setState(401);
				match(T__3);
				}
				break;
			case 11:
				{
				setState(403);
				match(T__22);
				setState(404);
				match(T__0);
				setState(405);
				typeId();
				setState(406);
				match(T__1);
				setState(407);
				match(T__2);
				setState(408);
				expression(0);
				setState(409);
				match(T__3);
				}
				break;
			case 12:
				{
				setState(411);
				match(T__23);
				setState(412);
				match(T__2);
				setState(413);
				expression(0);
				setState(414);
				match(T__3);
				}
				break;
			case 13:
				{
				setState(416);
				match(T__23);
				setState(417);
				match(T__2);
				setState(418);
				typeId();
				setState(419);
				match(T__3);
				}
				break;
			case 14:
				{
				setState(421);
				match(T__2);
				setState(422);
				typeId();
				setState(423);
				match(T__3);
				setState(424);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(428);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(429);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(430);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(431);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(432);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(433);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(434);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(439);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__26:
							{
							setState(435);
							match(T__26);
							}
							break;
						case T__27:
							{
							setState(436);
							match(T__27);
							}
							break;
						case T__28:
							{
							setState(437);
							match(T__28);
							setState(438);
							match(T__1);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(441);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(442);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(443);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(444);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(445);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(446);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(447);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(448);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(449);
						((ExpressionContext)_localctx).bop = match(T__13);
						setState(450);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(451);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(452);
						((ExpressionContext)_localctx).bop = match(T__33);
						setState(453);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(455);
						((ExpressionContext)_localctx).bop = match(T__34);
						setState(456);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(457);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(458);
						((ExpressionContext)_localctx).bop = match(T__35);
						setState(459);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(460);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(461);
						((ExpressionContext)_localctx).bop = match(T__36);
						setState(462);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(463);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(464);
						((ExpressionContext)_localctx).bop = match(T__37);
						setState(465);
						expression(0);
						setState(466);
						match(T__38);
						setState(467);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(469);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(470);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(471);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(472);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(473);
						((ExpressionContext)_localctx).bop = match(T__6);
						setState(479);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(475);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(474);
								match(Template);
								}
							}

							setState(477);
							idExpression();
							}
							break;
						case 2:
							{
							setState(478);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(482);
						((ExpressionContext)_localctx).bop = match(DotDot);
						setState(488);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(484);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(483);
								match(Template);
								}
							}

							setState(486);
							idExpression();
							}
							break;
						case 2:
							{
							setState(487);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(490);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(491);
						((ExpressionContext)_localctx).bop = match(T__7);
						setState(497);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(493);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(492);
								match(Template);
								}
							}

							setState(495);
							idExpression();
							}
							break;
						case 2:
							{
							setState(496);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(505);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(500);
							match(T__0);
							setState(502);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__83 - 73)) | (1L << (T__84 - 73)) | (1L << (T__85 - 73)) | (1L << (T__87 - 73)) | (1L << (T__88 - 73)) | (1L << (T__89 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
								{
								setState(501);
								templateArgumentList();
								}
							}

							setState(504);
							match(T__1);
							}
						}

						setState(508); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(507);
								expressionList();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(510); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(512);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(513);
						match(T__15);
						setState(514);
						expression(0);
						setState(515);
						match(T__16);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(518);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionList);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(T__2);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(526);
					expressions();
					}
				}

				setState(529);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(T__51);
				setState(531);
				expressionList();
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(532);
					match(T__52);
					setState(533);
					expressionList();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				match(T__53);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(T__2);
				setState(542);
				expressionList();
				setState(543);
				match(T__3);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			expression(0);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					match(T__52);
					setState(549);
					expression(0);
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> DotDot() { return getTokens(CElsaParser.DotDot); }
		public TerminalNode DotDot(int i) {
			return getToken(CElsaParser.DotDot, i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(555);
					match(DotDot);
					}
				}

				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(558);
					nestedNameSpecifier();
					}
					break;
				}
				setState(561);
				typeName();
				setState(562);
				match(DotDot);
				setState(563);
				match(T__4);
				setState(564);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(566);
					match(DotDot);
					}
				}

				setState(569);
				nestedNameSpecifier();
				setState(570);
				match(Template);
				setState(571);
				templateId();
				setState(572);
				match(DotDot);
				setState(573);
				match(T__4);
				setState(574);
				typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(576);
					match(DotDot);
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(579);
					nestedNameSpecifier();
					}
				}

				setState(582);
				match(T__4);
				setState(583);
				typeName();
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

	public static class NewExpressionContext extends ParserRuleContext {
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newExpression);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(586);
					match(DotDot);
					}
				}

				setState(589);
				match(T__54);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(590);
					newPlacement();
					}
				}

				setState(593);
				newTypeId();
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(594);
					newInitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(597);
					match(DotDot);
					}
				}

				setState(600);
				match(T__54);
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(601);
					newPlacement();
					}
					break;
				}
				setState(604);
				match(T__2);
				setState(605);
				typeId();
				setState(606);
				match(T__3);
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(607);
					newInitializer();
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

	public static class NewPlacementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__2);
			setState(613);
			expressionList();
			setState(614);
			match(T__3);
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

	public static class NewTypeIdContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NewTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNewTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(616);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(619); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(T__15);
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
						{
						setState(622);
						expression(0);
						}
					}

					setState(625);
					match(T__16);
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class NewInitializerContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__2);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
				{
				setState(632);
				expressionList();
				}
			}

			setState(635);
			match(T__3);
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

	public static class DeleteExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteExpression);
		int _la;
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(637);
					match(DotDot);
					}
				}

				setState(640);
				match(T__55);
				setState(641);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(642);
					match(DotDot);
					}
				}

				setState(645);
				match(T__55);
				setState(646);
				match(T__15);
				setState(647);
				match(T__16);
				setState(648);
				expression(0);
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

	public static class PmExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PmExpressionContext pmExpression() {
			return getRuleContext(PmExpressionContext.class,0);
		}
		public PmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterPmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitPmExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitPmExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmExpressionContext pmExpression() throws RecognitionException {
		return pmExpression(0);
	}

	private PmExpressionContext pmExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmExpressionContext _localctx = new PmExpressionContext(_ctx, _parentState);
		PmExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_pmExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(652);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new PmExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmExpression);
						setState(654);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(655);
						match(T__56);
						setState(656);
						expression(0);
						}
						break;
					case 2:
						{
						_localctx = new PmExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmExpression);
						setState(657);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(658);
						match(T__12);
						setState(659);
						expression(0);
						}
						break;
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(671);
				blockDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(672);
				tryBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(673);
				macroInvocation();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeledStatement);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(Identifier);
				setState(677);
				match(T__38);
				setState(678);
				statement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(T__57);
				setState(680);
				expression(0);
				setState(681);
				match(T__38);
				setState(682);
				statement();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(T__58);
				setState(685);
				match(T__38);
				setState(686);
				statement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			expressionList();
			setState(690);
			match(T__59);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__51);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__4 - 3)) | (1L << (T__5 - 3)) | (1L << (T__8 - 3)) | (1L << (T__9 - 3)) | (1L << (T__10 - 3)) | (1L << (T__11 - 3)) | (1L << (T__12 - 3)) | (1L << (T__13 - 3)) | (1L << (T__14 - 3)) | (1L << (T__15 - 3)) | (1L << (T__17 - 3)) | (1L << (T__18 - 3)) | (1L << (T__19 - 3)) | (1L << (T__20 - 3)) | (1L << (T__21 - 3)) | (1L << (T__22 - 3)) | (1L << (T__23 - 3)) | (1L << (T__51 - 3)) | (1L << (T__54 - 3)) | (1L << (T__55 - 3)) | (1L << (T__57 - 3)) | (1L << (T__58 - 3)) | (1L << (T__59 - 3)) | (1L << (T__60 - 3)) | (1L << (T__62 - 3)) | (1L << (T__63 - 3)) | (1L << (T__64 - 3)) | (1L << (T__65 - 3)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__71 - 67)) | (1L << (T__72 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__78 - 67)) | (1L << (T__79 - 67)) | (1L << (T__80 - 67)) | (1L << (T__81 - 67)) | (1L << (T__82 - 67)) | (1L << (T__83 - 67)) | (1L << (T__84 - 67)) | (1L << (T__85 - 67)) | (1L << (T__87 - 67)) | (1L << (T__88 - 67)) | (1L << (T__89 - 67)) | (1L << (T__93 - 67)) | (1L << (T__95 - 67)) | (1L << (T__96 - 67)) | (1L << (T__97 - 67)) | (1L << (Operator - 67)) | (1L << (Mutable - 67)) | (1L << (Static - 67)) | (1L << (Extern - 67)) | (1L << (Register - 67)) | (1L << (Auto - 67)) | (1L << (Virtual - 67)) | (1L << (Inline - 67)) | (1L << (Explicit - 67)) | (1L << (Namespace - 67)) | (1L << (Using - 67)) | (1L << (Asm - 67)) | (1L << (NestedName - 67)) | (1L << (Identifier - 67)) | (1L << (DotDot - 67)) | (1L << (Integerliteral - 67)) | (1L << (Floatingliteral - 67)) | (1L << (Booleanliteral - 67)) | (1L << (Characterliteral - 67)) | (1L << (Stringliteral - 67)))) != 0)) {
				{
				{
				setState(693);
				statement();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			match(T__53);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selectionStatement);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(T__60);
				setState(702);
				match(T__2);
				setState(703);
				condition();
				setState(704);
				match(T__3);
				setState(705);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(T__60);
				setState(708);
				match(T__2);
				setState(709);
				condition();
				setState(710);
				match(T__3);
				setState(711);
				statement();
				setState(712);
				match(T__61);
				setState(713);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				match(T__62);
				setState(716);
				match(T__2);
				setState(717);
				condition();
				setState(718);
				match(T__3);
				setState(719);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			expressionList();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_iterationStatement);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(T__63);
				setState(726);
				match(T__2);
				setState(727);
				condition();
				setState(728);
				match(T__3);
				setState(729);
				statement();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(T__64);
				setState(732);
				statement();
				setState(733);
				match(T__63);
				setState(734);
				match(T__2);
				setState(735);
				condition();
				setState(736);
				match(T__3);
				setState(737);
				match(T__59);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(739);
				match(T__65);
				setState(740);
				match(T__2);
				setState(741);
				forInitStatement();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(742);
					condition();
					}
				}

				setState(745);
				match(T__59);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(746);
					expressionList();
					}
				}

				setState(749);
				match(T__3);
				setState(750);
				statement();
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

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forInitStatement);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				simpleDeclaration();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_jumpStatement);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__66:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(T__66);
				setState(759);
				match(T__59);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				match(T__67);
				setState(761);
				match(T__59);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				match(T__68);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(763);
					expression(0);
					}
				}

				setState(766);
				match(T__59);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(T__69);
				setState(768);
				match(Identifier);
				setState(769);
				match(T__59);
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

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public AsmDefinitionContext asmDefinition() {
			return getRuleContext(AsmDefinitionContext.class,0);
		}
		public NamespaceAliasDefinitionContext namespaceAliasDefinition() {
			return getRuleContext(NamespaceAliasDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_blockDeclaration);
		try {
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776);
				usingDirective();
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

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simpleDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(779);
					declSpecifier();
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__15))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0)) {
				{
				setState(785);
				initDeclaratorList();
				}
			}

			setState(788);
			match(T__59);
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			initDeclarator();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(791);
				match(T__52);
				setState(792);
				initDeclarator();
				}
				}
				setState(797);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			declarator();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__39) {
				{
				setState(799);
				initializer();
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

	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public FunctionPtrContext functionPtr() {
			return getRuleContext(FunctionPtrContext.class,0);
		}
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_declSpecifier);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Mutable:
			case Static:
			case Extern:
			case Register:
			case Auto:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				storageClassSpecifier();
				}
				break;
			case T__12:
			case T__13:
			case T__15:
			case T__18:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__87:
			case T__88:
			case T__89:
			case NestedName:
			case Identifier:
			case DotDot:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				typeSpecifier();
				}
				break;
			case Virtual:
			case Inline:
			case Explicit:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				functionSpecifier();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				functionPtr();
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 5);
				{
				setState(806);
				match(T__70);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 6);
				{
				setState(807);
				match(T__71);
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

	public static class FunctionPtrContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionPtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPtr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterFunctionPtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitFunctionPtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitFunctionPtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPtrContext functionPtr() throws RecognitionException {
		FunctionPtrContext _localctx = new FunctionPtrContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionPtr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__2);
			setState(811);
			match(T__12);
			setState(812);
			idExpression();
			setState(813);
			match(T__3);
			setState(814);
			parameters();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Auto() { return getToken(CElsaParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CElsaParser.Register, 0); }
		public TerminalNode Static() { return getToken(CElsaParser.Static, 0); }
		public TerminalNode Extern() { return getToken(CElsaParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CElsaParser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Mutable - 104)) | (1L << (Static - 104)) | (1L << (Extern - 104)) | (1L << (Register - 104)) | (1L << (Auto - 104)))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CElsaParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CElsaParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CElsaParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (Virtual - 109)) | (1L << (Inline - 109)) | (1L << (Explicit - 109)))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public CvQualifierContext cvQualifier() {
			return getRuleContext(CvQualifierContext.class,0);
		}
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeSpecifier);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				simpleTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(822);
				enumSpecifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				elaboratedTypeSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(824);
				cvQualifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(825);
				ptrOperator();
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

	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode NestedName() { return getToken(CElsaParser.NestedName, 0); }
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simpleTypeSpecifier);
		int _la;
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(828);
					match(DotDot);
					}
				}

				setState(832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(831);
					nestedNameSpecifier();
					}
					break;
				}
				setState(834);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(NestedName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(836);
					match(DotDot);
					}
				}

				setState(839);
				nestedNameSpecifier();
				setState(840);
				match(Template);
				setState(841);
				templateId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				match(T__72);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(844);
				match(T__73);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(845);
				match(T__74);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(846);
				match(T__75);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(847);
				match(T__76);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(848);
				match(T__77);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(849);
				match(T__78);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(850);
				match(T__79);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(851);
				match(T__80);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(852);
				match(T__81);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(853);
				match(T__82);
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

	public static class TypeNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeName);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				typedefName();
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

	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				classKey();
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(862);
					match(DotDot);
					}
				}

				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(865);
					nestedNameSpecifier();
					}
					break;
				}
				setState(868);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(T__83);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(871);
					match(DotDot);
					}
				}

				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(874);
					nestedNameSpecifier();
					}
					break;
				}
				setState(877);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				match(T__18);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(879);
					match(DotDot);
					}
				}

				setState(882);
				nestedNameSpecifier();
				setState(883);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(T__18);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(886);
					match(DotDot);
					}
				}

				setState(889);
				nestedNameSpecifier();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(890);
					match(Template);
					}
				}

				setState(893);
				templateId();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(T__83);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(898);
				match(Identifier);
				}
			}

			setState(901);
			match(T__51);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(902);
				enumeratorList();
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(905);
				match(T__52);
				}
			}

			setState(908);
			match(T__53);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorDefinitionContext> enumeratorDefinition() {
			return getRuleContexts(EnumeratorDefinitionContext.class);
		}
		public EnumeratorDefinitionContext enumeratorDefinition(int i) {
			return getRuleContext(EnumeratorDefinitionContext.class,i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			enumeratorDefinition();
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(911);
					match(T__52);
					setState(912);
					enumeratorDefinition();
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enumeratorDefinition);
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				match(Identifier);
				setState(920);
				match(T__39);
				setState(921);
				expression(0);
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

	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CElsaParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(Namespace);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(925);
				match(Identifier);
				}
			}

			setState(928);
			match(T__51);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__59))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)) | (1L << (T__81 - 71)) | (1L << (T__82 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__85 - 71)) | (1L << (T__87 - 71)) | (1L << (T__88 - 71)) | (1L << (T__89 - 71)) | (1L << (T__95 - 71)) | (1L << (T__96 - 71)) | (1L << (T__97 - 71)) | (1L << (Operator - 71)) | (1L << (Template - 71)) | (1L << (Mutable - 71)) | (1L << (Static - 71)) | (1L << (Extern - 71)) | (1L << (Register - 71)) | (1L << (Auto - 71)) | (1L << (Virtual - 71)) | (1L << (Inline - 71)) | (1L << (Explicit - 71)) | (1L << (Namespace - 71)) | (1L << (Using - 71)) | (1L << (Asm - 71)) | (1L << (NestedName - 71)) | (1L << (Identifier - 71)) | (1L << (DotDot - 71)) | (1L << (Integerliteral - 71)) | (1L << (Floatingliteral - 71)) | (1L << (Booleanliteral - 71)) | (1L << (Characterliteral - 71)) | (1L << (Stringliteral - 71)))) != 0)) {
				{
				{
				setState(929);
				declaration();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			match(T__53);
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

	public static class NamespaceAliasDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CElsaParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public QualifiedNamespaceSpecifierContext qualifiedNamespaceSpecifier() {
			return getRuleContext(QualifiedNamespaceSpecifierContext.class,0);
		}
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitNamespaceAliasDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(Namespace);
			setState(938);
			match(Identifier);
			setState(939);
			match(T__39);
			setState(940);
			qualifiedNamespaceSpecifier();
			setState(941);
			match(T__59);
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

	public static class QualifiedNamespaceSpecifierContext extends ParserRuleContext {
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiedNamespaceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterQualifiedNamespaceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitQualifiedNamespaceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitQualifiedNamespaceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceSpecifierContext qualifiedNamespaceSpecifier() throws RecognitionException {
		QualifiedNamespaceSpecifierContext _localctx = new QualifiedNamespaceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_qualifiedNamespaceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DotDot) {
				{
				setState(943);
				match(DotDot);
				}
			}

			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(946);
				nestedNameSpecifier();
				}
				break;
			}
			setState(949);
			namespaceName();
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

	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CElsaParser.Using, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public TerminalNode NestedName() { return getToken(CElsaParser.NestedName, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_usingDeclaration);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				match(Using);
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(952);
					match(T__18);
					}
				}

				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(955);
					match(DotDot);
					}
				}

				setState(958);
				nestedNameSpecifier();
				setState(959);
				unqualifiedId();
				setState(960);
				match(T__59);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				match(Using);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(963);
					match(T__18);
					}
				}

				setState(966);
				match(NestedName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				match(Using);
				setState(968);
				match(DotDot);
				setState(969);
				unqualifiedId();
				setState(970);
				match(T__59);
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

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CElsaParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CElsaParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitUsingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(Using);
			setState(975);
			match(Namespace);
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DotDot) {
				{
				setState(976);
				match(DotDot);
				}
			}

			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(979);
				nestedNameSpecifier();
				}
				break;
			}
			setState(982);
			namespaceName();
			setState(983);
			match(T__59);
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

	public static class AsmDefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CElsaParser.Asm, 0); }
		public StringBlockContext stringBlock() {
			return getRuleContext(StringBlockContext.class,0);
		}
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitAsmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_asmDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(Asm);
			setState(986);
			match(T__2);
			setState(987);
			stringBlock();
			setState(988);
			match(T__3);
			setState(989);
			match(T__59);
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

	public static class LinkageSpecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CElsaParser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CElsaParser.Stringliteral, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public LinkageSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitLinkageSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_linkageSpecification);
		int _la;
		try {
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				match(Extern);
				setState(992);
				match(Stringliteral);
				setState(993);
				match(T__51);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55) | (1L << T__59))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)) | (1L << (T__81 - 71)) | (1L << (T__82 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__85 - 71)) | (1L << (T__87 - 71)) | (1L << (T__88 - 71)) | (1L << (T__89 - 71)) | (1L << (T__95 - 71)) | (1L << (T__96 - 71)) | (1L << (T__97 - 71)) | (1L << (Operator - 71)) | (1L << (Template - 71)) | (1L << (Mutable - 71)) | (1L << (Static - 71)) | (1L << (Extern - 71)) | (1L << (Register - 71)) | (1L << (Auto - 71)) | (1L << (Virtual - 71)) | (1L << (Inline - 71)) | (1L << (Explicit - 71)) | (1L << (Namespace - 71)) | (1L << (Using - 71)) | (1L << (Asm - 71)) | (1L << (NestedName - 71)) | (1L << (Identifier - 71)) | (1L << (DotDot - 71)) | (1L << (Integerliteral - 71)) | (1L << (Floatingliteral - 71)) | (1L << (Booleanliteral - 71)) | (1L << (Characterliteral - 71)) | (1L << (Stringliteral - 71)))) != 0)) {
					{
					{
					setState(994);
					declaration();
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1000);
				match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1001);
				match(Extern);
				setState(1002);
				match(Stringliteral);
				setState(1003);
				declaration();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public List<DeclaratorIdContext> declaratorId() {
			return getRuleContexts(DeclaratorIdContext.class);
		}
		public DeclaratorIdContext declaratorId(int i) {
			return getRuleContext(DeclaratorIdContext.class,i);
		}
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public CvQualifierSeqContext cvQualifierSeq() {
			return getRuleContext(CvQualifierSeqContext.class,0);
		}
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SimpleDeclarationContext> simpleDeclaration() {
			return getRuleContexts(SimpleDeclarationContext.class);
		}
		public SimpleDeclarationContext simpleDeclaration(int i) {
			return getRuleContext(SimpleDeclarationContext.class,i);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declarator);
		int _la;
		try {
			int _alt;
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				declaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				ptrOperator();
				setState(1008);
				declaratorId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1011); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1010);
					declaratorId();
					}
					}
					setState(1013); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0) );
				setState(1015);
				parameters();
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1016);
					cvQualifierSeq();
					}
					break;
				}
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1019);
					exceptionSpecification();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1023); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1022);
					declaratorId();
					}
					}
					setState(1025); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0) );
				setState(1027);
				match(T__15);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
					{
					setState(1028);
					expression(0);
					}
				}

				setState(1031);
				match(T__16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1033);
					declaratorId();
					}
					}
					setState(1036); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0) );
				setState(1038);
				parameters();
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1039);
						simpleDeclaration();
						}
						} 
					}
					setState(1044);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1045);
				match(T__2);
				setState(1046);
				declarator();
				setState(1047);
				match(T__3);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameters);
		int _la;
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				match(T__2);
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__18))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)) | (1L << (T__81 - 71)) | (1L << (T__82 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__85 - 71)) | (1L << (T__87 - 71)) | (1L << (T__88 - 71)) | (1L << (T__89 - 71)) | (1L << (Mutable - 71)) | (1L << (Static - 71)) | (1L << (Extern - 71)) | (1L << (Register - 71)) | (1L << (Auto - 71)) | (1L << (Virtual - 71)) | (1L << (Inline - 71)) | (1L << (Explicit - 71)) | (1L << (NestedName - 71)) | (1L << (Identifier - 71)) | (1L << (DotDot - 71)))) != 0)) {
					{
					setState(1052);
					parameterDeclarationClause();
					}
				}

				setState(1055);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(T__2);
				setState(1057);
				parameters();
				setState(1058);
				match(T__3);
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

	public static class PtrOperatorContext extends ParserRuleContext {
		public CvQualifierSeqContext cvQualifierSeq() {
			return getRuleContext(CvQualifierSeqContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public PtrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterPtrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitPtrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitPtrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrOperatorContext ptrOperator() throws RecognitionException {
		PtrOperatorContext _localctx = new PtrOperatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ptrOperator);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(T__12);
				setState(1064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1063);
					cvQualifierSeq();
					}
					break;
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(T__13);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				match(T__15);
				setState(1068);
				match(T__16);
				}
				break;
			case Identifier:
			case DotDot:
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1069);
					match(DotDot);
					}
				}

				setState(1072);
				nestedNameSpecifier();
				setState(1073);
				match(T__12);
				setState(1075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1074);
					cvQualifierSeq();
					}
					break;
				}
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

	public static class CvQualifierSeqContext extends ParserRuleContext {
		public List<CvQualifierContext> cvQualifier() {
			return getRuleContexts(CvQualifierContext.class);
		}
		public CvQualifierContext cvQualifier(int i) {
			return getRuleContext(CvQualifierContext.class,i);
		}
		public CvQualifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterCvQualifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitCvQualifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitCvQualifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierSeqContext cvQualifierSeq() throws RecognitionException {
		CvQualifierSeqContext _localctx = new CvQualifierSeqContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cvQualifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			cvQualifier();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1080);
					cvQualifier();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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

	public static class CvQualifierContext extends ParserRuleContext {
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitCvQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_la = _input.LA(1);
			if ( !(_la==T__84 || _la==T__85) ) {
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

	public static class DeclaratorIdContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public DeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorIdContext declaratorId() throws RecognitionException {
		DeclaratorIdContext _localctx = new DeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declaratorId);
		int _la;
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				idExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1089);
					match(DotDot);
					}
				}

				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1092);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1095);
				typeName();
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

	public static class TypeIdContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1098);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1103);
				declarator();
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

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_parameterDeclarationClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			parameterDeclaration();
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1107);
					match(T__52);
					setState(1108);
					parameterDeclaration();
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(1114);
				match(T__52);
				setState(1115);
				match(T__86);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parameterDeclaration);
		int _la;
		try {
			int _alt;
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1118);
						declSpecifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__15))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0)) {
					{
					setState(1123);
					declarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1126);
						declSpecifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__15))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0)) {
					{
					setState(1131);
					declarator();
					}
				}

				setState(1134);
				match(T__39);
				setState(1135);
				expression(0);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public CtorInitializerContext ctorInitializer() {
			return getRuleContext(CtorInitializerContext.class,0);
		}
		public FunctionTryBlockContext functionTryBlock() {
			return getRuleContext(FunctionTryBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1139);
						declSpecifier();
						}
						} 
					}
					setState(1144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1145);
				declarator();
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1146);
					ctorInitializer();
					}
				}

				setState(1149);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1151);
						declSpecifier();
						}
						} 
					}
					setState(1156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1157);
				declarator();
				setState(1158);
				functionTryBlock();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			compoundStatement();
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

	public static class InitializerContext extends ParserRuleContext {
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_initializer);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(T__39);
				setState(1165);
				initializerClause();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				match(T__2);
				setState(1167);
				expressionList();
				setState(1168);
				match(T__3);
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

	public static class InitializerClauseContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_initializerClause);
		int _la;
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				match(T__51);
				setState(1173);
				expressionList();
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(1174);
					match(T__52);
					}
				}

				setState(1177);
				match(T__53);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(T__51);
				setState(1180);
				match(T__53);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1181);
				expressionList();
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

	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public List<MemberSpecificationContext> memberSpecification() {
			return getRuleContexts(MemberSpecificationContext.class);
		}
		public MemberSpecificationContext memberSpecification(int i) {
			return getRuleContext(MemberSpecificationContext.class,i);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			classHead();
			setState(1185);
			match(T__51);
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__38) | (1L << T__59))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)) | (1L << (T__75 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)) | (1L << (T__81 - 71)) | (1L << (T__82 - 71)) | (1L << (T__83 - 71)) | (1L << (T__84 - 71)) | (1L << (T__85 - 71)) | (1L << (T__87 - 71)) | (1L << (T__88 - 71)) | (1L << (T__89 - 71)) | (1L << (T__90 - 71)) | (1L << (T__91 - 71)) | (1L << (T__92 - 71)) | (1L << (Operator - 71)) | (1L << (Template - 71)) | (1L << (Mutable - 71)) | (1L << (Static - 71)) | (1L << (Extern - 71)) | (1L << (Register - 71)) | (1L << (Auto - 71)) | (1L << (Virtual - 71)) | (1L << (Inline - 71)) | (1L << (Explicit - 71)) | (1L << (Using - 71)) | (1L << (NestedName - 71)) | (1L << (Identifier - 71)) | (1L << (DotDot - 71)))) != 0)) {
				{
				{
				setState(1186);
				memberSpecification();
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1192);
			match(T__53);
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

	public static class ClassHeadContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public BaseClauseContext baseClause() {
			return getRuleContext(BaseClauseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_classHead);
		int _la;
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				classKey();
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1195);
					match(Identifier);
					}
				}

				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1198);
					baseClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				classKey();
				setState(1202);
				nestedNameSpecifier();
				setState(1203);
				match(Identifier);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1204);
					baseClause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1207);
				classKey();
				setState(1209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1208);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1211);
				templateId();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1212);
					baseClause();
					}
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

	public static class ClassKeyContext extends ParserRuleContext {
		public ClassKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterClassKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitClassKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitClassKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeyContext classKey() throws RecognitionException {
		ClassKeyContext _localctx = new ClassKeyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__88 - 88)) | (1L << (T__89 - 88)))) != 0)) ) {
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

	public static class MemberSpecificationContext extends ParserRuleContext {
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_memberSpecification);
		try {
			int _alt;
			setState(1231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__12:
			case T__13:
			case T__15:
			case T__18:
			case T__38:
			case T__59:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__87:
			case T__88:
			case T__89:
			case Operator:
			case Template:
			case Mutable:
			case Static:
			case Extern:
			case Register:
			case Auto:
			case Virtual:
			case Inline:
			case Explicit:
			case Using:
			case NestedName:
			case Identifier:
			case DotDot:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				memberDeclaration();
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1220);
						memberDeclaration();
						}
						} 
					}
					setState(1225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				break;
			case T__90:
			case T__91:
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				accessSpecifier();
				setState(1227);
				match(T__38);
				setState(1229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1228);
					memberSpecification();
					}
					break;
				}
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	 
		public MemberDeclarationContext() { }
		public void copyFrom(MemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberDeclarationDontKnow2Context extends MemberDeclarationContext {
		public TerminalNode NestedName() { return getToken(CElsaParser.NestedName, 0); }
		public MemberDeclarationDontKnow2Context(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationDontKnow2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationDontKnow2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationDontKnow2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationFunctionDefineContext extends MemberDeclarationContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MemberDeclarationFunctionDefineContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationFunctionDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationDontKnow1Context extends MemberDeclarationContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public MemberDeclarationDontKnow1Context(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationDontKnow1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationDontKnow1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationDontKnow1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationMacroContext extends MemberDeclarationContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public MemberDeclarationMacroContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationMacro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationGeneralContext extends MemberDeclarationContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public MemberDeclarationGeneralContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationGeneral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationGeneral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationGeneral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationUsingContext extends MemberDeclarationContext {
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public MemberDeclarationUsingContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberDeclarationTemplateContext extends MemberDeclarationContext {
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public MemberDeclarationTemplateContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclarationTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclarationTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclarationTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_memberDeclaration);
		int _la;
		try {
			int _alt;
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new MemberDeclarationFunctionDefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				functionDefinition();
				setState(1235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1234);
					match(T__59);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new MemberDeclarationGeneralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1237);
						declSpecifier();
						}
						} 
					}
					setState(1242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__38))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Operator - 102)) | (1L << (NestedName - 102)) | (1L << (Identifier - 102)) | (1L << (DotDot - 102)))) != 0)) {
					{
					setState(1243);
					memberDeclaratorList();
					}
				}

				setState(1246);
				match(T__59);
				}
				break;
			case 3:
				_localctx = new MemberDeclarationDontKnow1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1247);
					match(DotDot);
					}
				}

				setState(1250);
				nestedNameSpecifier();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1251);
					match(Template);
					}
				}

				setState(1254);
				unqualifiedId();
				setState(1255);
				match(T__59);
				}
				break;
			case 4:
				_localctx = new MemberDeclarationDontKnow2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1257);
				match(NestedName);
				setState(1258);
				match(T__59);
				}
				break;
			case 5:
				_localctx = new MemberDeclarationUsingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1259);
				usingDeclaration();
				}
				break;
			case 6:
				_localctx = new MemberDeclarationTemplateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1260);
				templateDeclaration();
				}
				break;
			case 7:
				_localctx = new MemberDeclarationMacroContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1261);
				macroInvocation();
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

	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			memberDeclarator();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(1265);
				match(T__52);
				setState(1266);
				memberDeclarator();
				}
				}
				setState(1271);
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

	public static class MemberDeclaratorContext extends ParserRuleContext {
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
	 
		public MemberDeclaratorContext() { }
		public void copyFrom(MemberDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberOtherContext extends MemberDeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public MemberOtherContext(MemberDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberOther(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberWithBitFieldContext extends MemberDeclaratorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public MemberWithBitFieldContext(MemberDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberWithBitField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberWithBitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberWithBitField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberFunctionContext extends MemberDeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public PureSpecifierContext pureSpecifier() {
			return getRuleContext(PureSpecifierContext.class,0);
		}
		public MemberFunctionContext(MemberDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemberFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemberFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemberFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_memberDeclarator);
		int _la;
		try {
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new MemberFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1272);
				declarator();
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(1273);
					pureSpecifier();
					}
				}

				}
				break;
			case 2:
				_localctx = new MemberOtherContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				declarator();
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(1277);
					constantInitializer();
					}
				}

				}
				break;
			case 3:
				_localctx = new MemberWithBitFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1280);
					match(Identifier);
					}
				}

				setState(1283);
				match(T__38);
				setState(1284);
				expression(0);
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

	public static class PureSpecifierContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CElsaParser.Integerliteral, 0); }
		public PureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterPureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitPureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitPureSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureSpecifierContext pureSpecifier() throws RecognitionException {
		PureSpecifierContext _localctx = new PureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(T__39);
			setState(1288);
			match(Integerliteral);
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

	public static class ConstantInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterConstantInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitConstantInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitConstantInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantInitializerContext constantInitializer() throws RecognitionException {
		ConstantInitializerContext _localctx = new ConstantInitializerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constantInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			match(T__39);
			setState(1291);
			expression(0);
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

	public static class BaseClauseContext extends ParserRuleContext {
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitBaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitBaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(T__38);
			setState(1294);
			baseSpecifierList();
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

	public static class BaseSpecifierListContext extends ParserRuleContext {
		public List<BaseSpecifierContext> baseSpecifier() {
			return getRuleContexts(BaseSpecifierContext.class);
		}
		public BaseSpecifierContext baseSpecifier(int i) {
			return getRuleContext(BaseSpecifierContext.class,i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitBaseSpecifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitBaseSpecifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			baseSpecifier();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(1297);
				match(T__52);
				setState(1298);
				baseSpecifier();
				}
				}
				setState(1303);
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

	public static class BaseSpecifierContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode NestedName() { return getToken(CElsaParser.NestedName, 0); }
		public TerminalNode Virtual() { return getToken(CElsaParser.Virtual, 0); }
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public BaseSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterBaseSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitBaseSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitBaseSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierContext baseSpecifier() throws RecognitionException {
		BaseSpecifierContext _localctx = new BaseSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_baseSpecifier);
		int _la;
		try {
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1304);
					match(DotDot);
					}
				}

				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1307);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1310);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(NestedName);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(Virtual);
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__91 - 91)) | (1L << (T__92 - 91)))) != 0)) {
					{
					setState(1313);
					accessSpecifier();
					}
				}

				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1316);
					match(DotDot);
					}
				}

				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1319);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1322);
				className();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1323);
				match(Virtual);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__91 - 91)) | (1L << (T__92 - 91)))) != 0)) {
					{
					setState(1324);
					accessSpecifier();
					}
				}

				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1327);
					match(DotDot);
					}
				}

				setState(1330);
				match(NestedName);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1331);
				accessSpecifier();
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1332);
					match(Virtual);
					}
				}

				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1335);
					match(DotDot);
					}
				}

				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1338);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1341);
				className();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1343);
				accessSpecifier();
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1344);
					match(Virtual);
					}
				}

				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1347);
					match(DotDot);
					}
				}

				setState(1350);
				match(NestedName);
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

	public static class AccessSpecifierContext extends ParserRuleContext {
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__91 - 91)) | (1L << (T__92 - 91)))) != 0)) ) {
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

	public static class ConversionFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CElsaParser.Operator, 0); }
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public ConversionFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterConversionFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitConversionFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitConversionFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionFunctionIdContext conversionFunctionId() throws RecognitionException {
		ConversionFunctionIdContext _localctx = new ConversionFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_conversionFunctionId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(Operator);
			setState(1358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1357);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CtorInitializerContext extends ParserRuleContext {
		public List<MemInitializerContext> memInitializer() {
			return getRuleContexts(MemInitializerContext.class);
		}
		public MemInitializerContext memInitializer(int i) {
			return getRuleContext(MemInitializerContext.class,i);
		}
		public CtorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterCtorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitCtorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitCtorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtorInitializerContext ctorInitializer() throws RecognitionException {
		CtorInitializerContext _localctx = new CtorInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ctorInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(T__38);
			setState(1363);
			memInitializer();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(1364);
				match(T__52);
				setState(1365);
				memInitializer();
				}
				}
				setState(1370);
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

	public static class MemInitializerContext extends ParserRuleContext {
		public MemInitializerIdContext memInitializerId() {
			return getRuleContext(MemInitializerIdContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			memInitializerId();
			setState(1372);
			match(T__2);
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__51) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
				{
				setState(1373);
				expressionList();
				}
			}

			setState(1376);
			match(T__3);
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

	public static class MemInitializerIdContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode DotDot() { return getToken(CElsaParser.DotDot, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public MemInitializerIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterMemInitializerId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitMemInitializerId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitMemInitializerId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerIdContext memInitializerId() throws RecognitionException {
		MemInitializerIdContext _localctx = new MemInitializerIdContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_memInitializerId);
		int _la;
		try {
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DotDot) {
					{
					setState(1378);
					match(DotDot);
					}
				}

				setState(1382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1381);
					nestedNameSpecifier();
					}
					break;
				}
				setState(1384);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				match(Identifier);
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

	public static class OperatorFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CElsaParser.Operator, 0); }
		public OperatorFuncContext operatorFunc() {
			return getRuleContext(OperatorFuncContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitOperatorFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(Operator);
			setState(1389);
			operatorFunc();
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

	public static class OperatorFuncContext extends ParserRuleContext {
		public OperatorFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterOperatorFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitOperatorFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitOperatorFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFuncContext operatorFunc() throws RecognitionException {
		OperatorFuncContext _localctx = new OperatorFuncContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_operatorFunc);
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				match(T__55);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1393);
				match(T__54);
				setState(1394);
				match(T__15);
				setState(1395);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				match(T__55);
				setState(1397);
				match(T__15);
				setState(1398);
				match(T__16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1399);
				match(T__8);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1400);
				match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1401);
				match(T__12);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1402);
				match(T__24);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1403);
				match(T__25);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1404);
				match(T__33);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1405);
				match(T__13);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1406);
				match(T__34);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1407);
				match(T__4);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1408);
				match(T__14);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1409);
				match(T__39);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1410);
				match(T__0);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1411);
				match(T__1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1412);
				match(T__40);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1413);
				match(T__41);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1414);
				match(T__42);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1415);
				match(T__43);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1416);
				match(T__50);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1417);
				match(T__46);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1418);
				match(T__44);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1419);
				match(T__45);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1420);
				match(T__26);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1421);
				match(T__27);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1422);
				match(T__47);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1423);
				match(T__49);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1424);
				match(T__31);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1425);
				match(T__32);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1426);
				match(T__29);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1427);
				match(T__30);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1428);
				match(T__35);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1429);
				match(T__36);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1430);
				match(T__10);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1431);
				match(T__11);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1432);
				match(T__52);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1433);
				match(T__12);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1434);
				match(T__7);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1435);
				match(T__2);
				setState(1436);
				match(T__3);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1437);
				match(T__15);
				setState(1438);
				match(T__16);
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

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public TemplateParameterListContext templateParameterList() {
			return getRuleContext(TemplateParameterListContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(Template);
			setState(1442);
			match(T__0);
			setState(1443);
			templateParameterList();
			setState(1444);
			match(T__1);
			setState(1445);
			declaration();
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

	public static class TemplateParameterListContext extends ParserRuleContext {
		public List<TemplateParameterContext> templateParameter() {
			return getRuleContexts(TemplateParameterContext.class);
		}
		public TemplateParameterContext templateParameter(int i) {
			return getRuleContext(TemplateParameterContext.class,i);
		}
		public TemplateParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterListContext templateParameterList() throws RecognitionException {
		TemplateParameterListContext _localctx = new TemplateParameterListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_templateParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			templateParameter();
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(1448);
				match(T__52);
				setState(1449);
				templateParameter();
				}
				}
				setState(1454);
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

	public static class TemplateParameterContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TemplateParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterContext templateParameter() throws RecognitionException {
		TemplateParameterContext _localctx = new TemplateParameterContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_templateParameter);
		try {
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				parameterDeclaration();
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CElsaParser.Identifier, 0); }
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public TemplateParameterListContext templateParameterList() {
			return getRuleContext(TemplateParameterListContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_typeParameter);
		int _la;
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				match(T__87);
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1460);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				match(T__87);
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1464);
					match(Identifier);
					}
				}

				setState(1467);
				match(T__39);
				setState(1468);
				typeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469);
				match(T__18);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1470);
					match(Identifier);
					}
				}

				setState(1473);
				match(T__39);
				setState(1474);
				typeId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1475);
				match(T__18);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1476);
					match(Identifier);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1479);
				match(Template);
				setState(1480);
				match(T__0);
				setState(1481);
				templateParameterList();
				setState(1482);
				match(T__1);
				setState(1483);
				match(T__87);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1484);
					match(Identifier);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1487);
				match(Template);
				setState(1488);
				match(T__0);
				setState(1489);
				templateParameterList();
				setState(1490);
				match(T__1);
				setState(1491);
				match(T__87);
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1492);
					match(Identifier);
					}
				}

				setState(1495);
				match(T__39);
				setState(1496);
				idExpression();
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

	public static class TemplateIdContext extends ParserRuleContext {
		public TemplateNameContext templateName() {
			return getRuleContext(TemplateNameContext.class,0);
		}
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public TemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateIdContext templateId() throws RecognitionException {
		TemplateIdContext _localctx = new TemplateIdContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_templateId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			templateName();
			setState(1501);
			match(T__0);
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__83 - 73)) | (1L << (T__84 - 73)) | (1L << (T__85 - 73)) | (1L << (T__87 - 73)) | (1L << (T__88 - 73)) | (1L << (T__89 - 73)) | (1L << (T__95 - 73)) | (1L << (T__96 - 73)) | (1L << (T__97 - 73)) | (1L << (Operator - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)) | (1L << (Integerliteral - 73)) | (1L << (Floatingliteral - 73)) | (1L << (Booleanliteral - 73)) | (1L << (Characterliteral - 73)) | (1L << (Stringliteral - 73)))) != 0)) {
				{
				setState(1502);
				templateArgumentList();
				}
			}

			setState(1505);
			match(T__1);
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

	public static class TemplateArgumentListContext extends ParserRuleContext {
		public List<TemplateArgumentContext> templateArgument() {
			return getRuleContexts(TemplateArgumentContext.class);
		}
		public TemplateArgumentContext templateArgument(int i) {
			return getRuleContext(TemplateArgumentContext.class,i);
		}
		public TemplateArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentListContext templateArgumentList() throws RecognitionException {
		TemplateArgumentListContext _localctx = new TemplateArgumentListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			templateArgument();
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(1508);
				match(T__52);
				setState(1509);
				templateArgument();
				}
				}
				setState(1514);
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

	public static class TemplateArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TemplateArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentContext templateArgument() throws RecognitionException {
		TemplateArgumentContext _localctx = new TemplateArgumentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_templateArgument);
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1516);
				typeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1517);
				idExpression();
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

	public static class ExplicitInstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExplicitInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExplicitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExplicitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitInstantiationContext explicitInstantiation() throws RecognitionException {
		ExplicitInstantiationContext _localctx = new ExplicitInstantiationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_explicitInstantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(Template);
			setState(1521);
			declaration();
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

	public static class ExplicitSpecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CElsaParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExplicitSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExplicitSpecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExplicitSpecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitSpecializationContext explicitSpecialization() throws RecognitionException {
		ExplicitSpecializationContext _localctx = new ExplicitSpecializationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(Template);
			setState(1524);
			match(T__0);
			setState(1525);
			match(T__1);
			setState(1526);
			declaration();
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

	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(T__93);
			setState(1529);
			compoundStatement();
			setState(1530);
			handlerSeq();
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

	public static class FunctionTryBlockContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public CtorInitializerContext ctorInitializer() {
			return getRuleContext(CtorInitializerContext.class,0);
		}
		public FunctionTryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterFunctionTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitFunctionTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitFunctionTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTryBlockContext functionTryBlock() throws RecognitionException {
		FunctionTryBlockContext _localctx = new FunctionTryBlockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			match(T__93);
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1533);
				ctorInitializer();
				}
			}

			setState(1536);
			functionBody();
			setState(1537);
			handlerSeq();
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

	public static class HandlerSeqContext extends ParserRuleContext {
		public List<HandlerContext> handler() {
			return getRuleContexts(HandlerContext.class);
		}
		public HandlerContext handler(int i) {
			return getRuleContext(HandlerContext.class,i);
		}
		public HandlerSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterHandlerSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitHandlerSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitHandlerSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerSeqContext handlerSeq() throws RecognitionException {
		HandlerSeqContext _localctx = new HandlerSeqContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			handler();
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__94) {
				{
				{
				setState(1540);
				handler();
				}
				}
				setState(1545);
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

	public static class HandlerContext extends ParserRuleContext {
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(T__94);
			setState(1547);
			match(T__2);
			setState(1548);
			exceptionDeclaration();
			setState(1549);
			match(T__3);
			setState(1550);
			compoundStatement();
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

	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_exceptionDeclaration);
		int _la;
		try {
			int _alt;
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1552);
						typeSpecifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1555); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1557);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1560); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1559);
					typeSpecifier();
					}
					}
					setState(1562); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__18))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__83 - 73)) | (1L << (T__84 - 73)) | (1L << (T__85 - 73)) | (1L << (T__87 - 73)) | (1L << (T__88 - 73)) | (1L << (T__89 - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564);
				match(T__86);
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

	public static class ThrowExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(T__95);
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1568);
				expression(0);
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

	public static class ExceptionSpecificationContext extends ParserRuleContext {
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public ExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSpecificationContext exceptionSpecification() throws RecognitionException {
		ExceptionSpecificationContext _localctx = new ExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_exceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(T__95);
			setState(1572);
			match(T__2);
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__18))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)) | (1L << (T__76 - 73)) | (1L << (T__77 - 73)) | (1L << (T__78 - 73)) | (1L << (T__79 - 73)) | (1L << (T__80 - 73)) | (1L << (T__81 - 73)) | (1L << (T__82 - 73)) | (1L << (T__83 - 73)) | (1L << (T__84 - 73)) | (1L << (T__85 - 73)) | (1L << (T__87 - 73)) | (1L << (T__88 - 73)) | (1L << (T__89 - 73)) | (1L << (NestedName - 73)) | (1L << (Identifier - 73)) | (1L << (DotDot - 73)))) != 0)) {
				{
				setState(1573);
				typeIdList(0);
				}
			}

			setState(1576);
			match(T__3);
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

	public static class TypeIdListContext extends ParserRuleContext {
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public TypeIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterTypeIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitTypeIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitTypeIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdListContext typeIdList() throws RecognitionException {
		return typeIdList(0);
	}

	private TypeIdListContext typeIdList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeIdListContext _localctx = new TypeIdListContext(_ctx, _parentState);
		TypeIdListContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_typeIdList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1579);
			typeId();
			}
			_ctx.stop = _input.LT(-1);
			setState(1586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeIdListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeIdList);
					setState(1581);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1582);
					match(T__52);
					setState(1583);
					typeId();
					}
					} 
				}
				setState(1588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public StringBlockContext stringBlock() {
			return getRuleContext(StringBlockContext.class,0);
		}
		public TerminalNode Integerliteral() { return getToken(CElsaParser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CElsaParser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CElsaParser.Floatingliteral, 0); }
		public TerminalNode Booleanliteral() { return getToken(CElsaParser.Booleanliteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CElsaListener ) ((CElsaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CElsaVisitor ) return ((CElsaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_literal);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stringliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				stringBlock();
				}
				break;
			case Integerliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1592);
				match(Floatingliteral);
				}
				break;
			case Booleanliteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1593);
				match(Booleanliteral);
				}
				break;
			case T__96:
				enterOuterAlt(_localctx, 6);
				{
				setState(1594);
				match(T__96);
				}
				break;
			case T__97:
				enterOuterAlt(_localctx, 7);
				{
				setState(1595);
				match(T__97);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 26:
			return pmExpression_sempred((PmExpressionContext)_localctx, predIndex);
		case 106:
			return typeIdList_sempred((TypeIdListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 31);
		case 13:
			return precpred(_ctx, 30);
		case 14:
			return precpred(_ctx, 29);
		case 15:
			return precpred(_ctx, 27);
		case 16:
			return precpred(_ctx, 26);
		case 17:
			return precpred(_ctx, 20);
		}
		return true;
	}
	private boolean pmExpression_sempred(PmExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeIdList_sempred(TypeIdListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0085\u0641\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\7\2\u00dc\n\2\f\2\16\2\u00df\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ec\n\3\3\4\3\4\3\4\5\4\u00f1\n\4\3\4"+
		"\5\4\u00f4\n\4\3\4\3\4\5\4\u00f8\n\4\3\4\6\4\u00fb\n\4\r\4\16\4\u00fc"+
		"\3\5\3\5\3\6\3\6\5\6\u0103\n\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u010b\n\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116\13\f\3\r\3\r\5\r"+
		"\u011a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0122\n\16\3\17\5\17\u0125"+
		"\n\17\3\17\3\17\5\17\u0129\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0139\n\17\3\20\3\20\3\20\5\20\u013e"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u0145\n\20\3\21\3\21\5\21\u0149\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0155\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0164\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016e\n\23\3"+
		"\23\3\23\5\23\u0172\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01ad\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01ba\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u01de\n\23\3\23\3\23\5\23\u01e2\n\23\3\23\3\23\3\23\5\23\u01e7"+
		"\n\23\3\23\3\23\5\23\u01eb\n\23\3\23\3\23\3\23\5\23\u01f0\n\23\3\23\3"+
		"\23\5\23\u01f4\n\23\3\23\3\23\3\23\5\23\u01f9\n\23\3\23\5\23\u01fc\n\23"+
		"\3\23\6\23\u01ff\n\23\r\23\16\23\u0200\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u020a\n\23\f\23\16\23\u020d\13\23\3\24\3\24\3\24\5\24\u0212\n"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u0219\n\24\f\24\16\24\u021c\13\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0224\n\24\3\25\3\25\3\25\7\25\u0229"+
		"\n\25\f\25\16\25\u022c\13\25\3\26\5\26\u022f\n\26\3\26\5\26\u0232\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u023a\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0244\n\26\3\26\5\26\u0247\n\26\3\26\3\26\5\26\u024b"+
		"\n\26\3\27\5\27\u024e\n\27\3\27\3\27\5\27\u0252\n\27\3\27\3\27\5\27\u0256"+
		"\n\27\3\27\5\27\u0259\n\27\3\27\3\27\5\27\u025d\n\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0263\n\27\5\27\u0265\n\27\3\30\3\30\3\30\3\30\3\31\6\31\u026c"+
		"\n\31\r\31\16\31\u026d\3\31\3\31\5\31\u0272\n\31\3\31\7\31\u0275\n\31"+
		"\f\31\16\31\u0278\13\31\3\32\3\32\5\32\u027c\n\32\3\32\3\32\3\33\5\33"+
		"\u0281\n\33\3\33\3\33\3\33\5\33\u0286\n\33\3\33\3\33\3\33\3\33\5\33\u028c"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0297\n\34\f\34"+
		"\16\34\u029a\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02a5"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02b2"+
		"\n\36\3\37\3\37\3\37\3 \3 \7 \u02b9\n \f \16 \u02bc\13 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02d4\n!\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02ea\n#\3"+
		"#\3#\5#\u02ee\n#\3#\3#\3#\5#\u02f3\n#\3$\3$\5$\u02f7\n$\3%\3%\3%\3%\3"+
		"%\3%\5%\u02ff\n%\3%\3%\3%\3%\5%\u0305\n%\3&\3&\3&\3&\3&\5&\u030c\n&\3"+
		"\'\7\'\u030f\n\'\f\'\16\'\u0312\13\'\3\'\5\'\u0315\n\'\3\'\3\'\3(\3(\3"+
		"(\7(\u031c\n(\f(\16(\u031f\13(\3)\3)\5)\u0323\n)\3*\3*\3*\3*\3*\3*\5*"+
		"\u032b\n*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\5.\u033d\n."+
		"\3/\5/\u0340\n/\3/\5/\u0343\n/\3/\3/\3/\5/\u0348\n/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0359\n/\3\60\3\60\3\60\5\60\u035e\n\60"+
		"\3\61\3\61\5\61\u0362\n\61\3\61\5\61\u0365\n\61\3\61\3\61\3\61\3\61\5"+
		"\61\u036b\n\61\3\61\5\61\u036e\n\61\3\61\3\61\3\61\5\61\u0373\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u037a\n\61\3\61\3\61\5\61\u037e\n\61\3\61\3"+
		"\61\5\61\u0382\n\61\3\62\3\62\5\62\u0386\n\62\3\62\3\62\5\62\u038a\n\62"+
		"\3\62\5\62\u038d\n\62\3\62\3\62\3\63\3\63\3\63\7\63\u0394\n\63\f\63\16"+
		"\63\u0397\13\63\3\64\3\64\3\64\3\64\5\64\u039d\n\64\3\65\3\65\5\65\u03a1"+
		"\n\65\3\65\3\65\7\65\u03a5\n\65\f\65\16\65\u03a8\13\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\5\67\u03b3\n\67\3\67\5\67\u03b6\n\67\3"+
		"\67\3\67\38\38\58\u03bc\n8\38\58\u03bf\n8\38\38\38\38\38\38\58\u03c7\n"+
		"8\38\38\38\38\38\38\58\u03cf\n8\39\39\39\59\u03d4\n9\39\59\u03d7\n9\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u03e6\n;\f;\16;\u03e9\13;\3;"+
		"\3;\3;\3;\5;\u03ef\n;\3<\3<\3<\3<\3<\6<\u03f6\n<\r<\16<\u03f7\3<\3<\5"+
		"<\u03fc\n<\3<\5<\u03ff\n<\3<\6<\u0402\n<\r<\16<\u0403\3<\3<\5<\u0408\n"+
		"<\3<\3<\3<\6<\u040d\n<\r<\16<\u040e\3<\3<\7<\u0413\n<\f<\16<\u0416\13"+
		"<\3<\3<\3<\3<\5<\u041c\n<\3=\3=\5=\u0420\n=\3=\3=\3=\3=\3=\5=\u0427\n"+
		"=\3>\3>\5>\u042b\n>\3>\3>\3>\3>\5>\u0431\n>\3>\3>\3>\5>\u0436\n>\5>\u0438"+
		"\n>\3?\3?\7?\u043c\n?\f?\16?\u043f\13?\3@\3@\3A\3A\5A\u0445\nA\3A\5A\u0448"+
		"\nA\3A\5A\u044b\nA\3B\6B\u044e\nB\rB\16B\u044f\3B\5B\u0453\nB\3C\3C\3"+
		"C\7C\u0458\nC\fC\16C\u045b\13C\3C\3C\5C\u045f\nC\3D\6D\u0462\nD\rD\16"+
		"D\u0463\3D\5D\u0467\nD\3D\6D\u046a\nD\rD\16D\u046b\3D\5D\u046f\nD\3D\3"+
		"D\3D\5D\u0474\nD\3E\7E\u0477\nE\fE\16E\u047a\13E\3E\3E\5E\u047e\nE\3E"+
		"\3E\3E\7E\u0483\nE\fE\16E\u0486\13E\3E\3E\3E\5E\u048b\nE\3F\3F\3G\3G\3"+
		"G\3G\3G\3G\5G\u0495\nG\3H\3H\3H\5H\u049a\nH\3H\3H\3H\3H\3H\5H\u04a1\n"+
		"H\3I\3I\3I\7I\u04a6\nI\fI\16I\u04a9\13I\3I\3I\3J\3J\5J\u04af\nJ\3J\5J"+
		"\u04b2\nJ\3J\3J\3J\3J\5J\u04b8\nJ\3J\3J\5J\u04bc\nJ\3J\3J\5J\u04c0\nJ"+
		"\5J\u04c2\nJ\3K\3K\3L\3L\7L\u04c8\nL\fL\16L\u04cb\13L\3L\3L\3L\5L\u04d0"+
		"\nL\5L\u04d2\nL\3M\3M\5M\u04d6\nM\3M\7M\u04d9\nM\fM\16M\u04dc\13M\3M\5"+
		"M\u04df\nM\3M\3M\5M\u04e3\nM\3M\3M\5M\u04e7\nM\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\5M\u04f1\nM\3N\3N\3N\7N\u04f6\nN\fN\16N\u04f9\13N\3O\3O\5O\u04fd\nO"+
		"\3O\3O\5O\u0501\nO\3O\5O\u0504\nO\3O\3O\5O\u0508\nO\3P\3P\3P\3Q\3Q\3Q"+
		"\3R\3R\3R\3S\3S\3S\7S\u0516\nS\fS\16S\u0519\13S\3T\5T\u051c\nT\3T\5T\u051f"+
		"\nT\3T\3T\3T\3T\5T\u0525\nT\3T\5T\u0528\nT\3T\5T\u052b\nT\3T\3T\3T\5T"+
		"\u0530\nT\3T\5T\u0533\nT\3T\3T\3T\5T\u0538\nT\3T\5T\u053b\nT\3T\5T\u053e"+
		"\nT\3T\3T\3T\3T\5T\u0544\nT\3T\5T\u0547\nT\3T\3T\5T\u054b\nT\3U\3U\3V"+
		"\3V\6V\u0551\nV\rV\16V\u0552\3W\3W\3W\3W\7W\u0559\nW\fW\16W\u055c\13W"+
		"\3X\3X\3X\5X\u0561\nX\3X\3X\3Y\5Y\u0566\nY\3Y\5Y\u0569\nY\3Y\3Y\5Y\u056d"+
		"\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3[\3[\5[\u05a2\n[\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\7]\u05ad"+
		"\n]\f]\16]\u05b0\13]\3^\3^\5^\u05b4\n^\3_\3_\5_\u05b8\n_\3_\3_\5_\u05bc"+
		"\n_\3_\3_\3_\3_\5_\u05c2\n_\3_\3_\3_\3_\5_\u05c8\n_\3_\3_\3_\3_\3_\3_"+
		"\5_\u05d0\n_\3_\3_\3_\3_\3_\3_\5_\u05d8\n_\3_\3_\3_\5_\u05dd\n_\3`\3`"+
		"\3`\5`\u05e2\n`\3`\3`\3a\3a\3a\7a\u05e9\na\fa\16a\u05ec\13a\3b\3b\3b\5"+
		"b\u05f1\nb\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\5f\u0601\nf\3f\3"+
		"f\3f\3g\3g\7g\u0608\ng\fg\16g\u060b\13g\3h\3h\3h\3h\3h\3h\3i\6i\u0614"+
		"\ni\ri\16i\u0615\3i\3i\3i\6i\u061b\ni\ri\16i\u061c\3i\5i\u0620\ni\3j\3"+
		"j\5j\u0624\nj\3k\3k\3k\5k\u0629\nk\3k\3k\3l\3l\3l\3l\3l\3l\7l\u0633\n"+
		"l\fl\16l\u0636\13l\3m\3m\3m\3m\3m\3m\3m\5m\u063f\nm\3m\2\5$\66\u00d6n"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\2\16\4\2\7\7\13\21\4\2\17\17\33\34\3\2\13\f\4\2\3\4 !\3\2"+
		"\"#\3\2*\65\3\2\r\16\3\2jn\3\2oq\3\2WX\3\2Z\\\3\2]_\2\u0740\2\u00dd\3"+
		"\2\2\2\4\u00eb\3\2\2\2\6\u00ed\3\2\2\2\b\u00fe\3\2\2\2\n\u0102\3\2\2\2"+
		"\f\u0104\3\2\2\2\16\u0106\3\2\2\2\20\u010a\3\2\2\2\22\u010c\3\2\2\2\24"+
		"\u010e\3\2\2\2\26\u0110\3\2\2\2\30\u0119\3\2\2\2\32\u0121\3\2\2\2\34\u0138"+
		"\3\2\2\2\36\u0144\3\2\2\2 \u0148\3\2\2\2\"\u0154\3\2\2\2$\u01ac\3\2\2"+
		"\2&\u0223\3\2\2\2(\u0225\3\2\2\2*\u024a\3\2\2\2,\u0264\3\2\2\2.\u0266"+
		"\3\2\2\2\60\u026b\3\2\2\2\62\u0279\3\2\2\2\64\u028b\3\2\2\2\66\u028d\3"+
		"\2\2\28\u02a4\3\2\2\2:\u02b1\3\2\2\2<\u02b3\3\2\2\2>\u02b6\3\2\2\2@\u02d3"+
		"\3\2\2\2B\u02d5\3\2\2\2D\u02f2\3\2\2\2F\u02f6\3\2\2\2H\u0304\3\2\2\2J"+
		"\u030b\3\2\2\2L\u0310\3\2\2\2N\u0318\3\2\2\2P\u0320\3\2\2\2R\u032a\3\2"+
		"\2\2T\u032c\3\2\2\2V\u0332\3\2\2\2X\u0334\3\2\2\2Z\u033c\3\2\2\2\\\u0358"+
		"\3\2\2\2^\u035d\3\2\2\2`\u0381\3\2\2\2b\u0383\3\2\2\2d\u0390\3\2\2\2f"+
		"\u039c\3\2\2\2h\u039e\3\2\2\2j\u03ab\3\2\2\2l\u03b2\3\2\2\2n\u03ce\3\2"+
		"\2\2p\u03d0\3\2\2\2r\u03db\3\2\2\2t\u03ee\3\2\2\2v\u041b\3\2\2\2x\u0426"+
		"\3\2\2\2z\u0437\3\2\2\2|\u0439\3\2\2\2~\u0440\3\2\2\2\u0080\u044a\3\2"+
		"\2\2\u0082\u044d\3\2\2\2\u0084\u0454\3\2\2\2\u0086\u0473\3\2\2\2\u0088"+
		"\u048a\3\2\2\2\u008a\u048c\3\2\2\2\u008c\u0494\3\2\2\2\u008e\u04a0\3\2"+
		"\2\2\u0090\u04a2\3\2\2\2\u0092\u04c1\3\2\2\2\u0094\u04c3\3\2\2\2\u0096"+
		"\u04d1\3\2\2\2\u0098\u04f0\3\2\2\2\u009a\u04f2\3\2\2\2\u009c\u0507\3\2"+
		"\2\2\u009e\u0509\3\2\2\2\u00a0\u050c\3\2\2\2\u00a2\u050f\3\2\2\2\u00a4"+
		"\u0512\3\2\2\2\u00a6\u054a\3\2\2\2\u00a8\u054c\3\2\2\2\u00aa\u054e\3\2"+
		"\2\2\u00ac\u0554\3\2\2\2\u00ae\u055d\3\2\2\2\u00b0\u056c\3\2\2\2\u00b2"+
		"\u056e\3\2\2\2\u00b4\u05a1\3\2\2\2\u00b6\u05a3\3\2\2\2\u00b8\u05a9\3\2"+
		"\2\2\u00ba\u05b3\3\2\2\2\u00bc\u05dc\3\2\2\2\u00be\u05de\3\2\2\2\u00c0"+
		"\u05e5\3\2\2\2\u00c2\u05f0\3\2\2\2\u00c4\u05f2\3\2\2\2\u00c6\u05f5\3\2"+
		"\2\2\u00c8\u05fa\3\2\2\2\u00ca\u05fe\3\2\2\2\u00cc\u0605\3\2\2\2\u00ce"+
		"\u060c\3\2\2\2\u00d0\u061f\3\2\2\2\u00d2\u0621\3\2\2\2\u00d4\u0625\3\2"+
		"\2\2\u00d6\u062c\3\2\2\2\u00d8\u063e\3\2\2\2\u00da\u00dc\5\4\3\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\2\2\3\u00e1"+
		"\3\3\2\2\2\u00e2\u00ec\5J&\2\u00e3\u00ec\5\u0088E\2\u00e4\u00ec\5\6\4"+
		"\2\u00e5\u00ec\5\u00b6\\\2\u00e6\u00ec\5\u00c4c\2\u00e7\u00ec\5\u00c6"+
		"d\2\u00e8\u00ec\5t;\2\u00e9\u00ec\5h\65\2\u00ea\u00ec\5&\24\2\u00eb\u00e2"+
		"\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00ec\5\3\2\2\2\u00ed\u00f3\7z\2\2\u00ee\u00f0"+
		"\7\3\2\2\u00ef\u00f1\5\u00c0a\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\7\4\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00fa\3\2\2\2\u00f5\u00f7\7\5\2\2\u00f6\u00f8\5&\24\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\6"+
		"\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\7\3\2\2\2\u00fe\u00ff\7z\2\2\u00ff\t\3\2\2\2\u0100"+
		"\u0103\5\f\7\2\u0101\u0103\5\16\b\2\u0102\u0100\3\2\2\2\u0102\u0101\3"+
		"\2\2\2\u0103\13\3\2\2\2\u0104\u0105\7z\2\2\u0105\r\3\2\2\2\u0106\u0107"+
		"\7z\2\2\u0107\17\3\2\2\2\u0108\u010b\7z\2\2\u0109\u010b\5\u00be`\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\21\3\2\2\2\u010c\u010d\7z\2\2"+
		"\u010d\23\3\2\2\2\u010e\u010f\7z\2\2\u010f\25\3\2\2\2\u0110\u0114\7\u0084"+
		"\2\2\u0111\u0113\7\u0084\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\27\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0117\u011a\5\32\16\2\u0118\u011a\5\34\17\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\31\3\2\2\2\u011b\u0122\7z\2\2\u011c\u011d\7\7\2\2"+
		"\u011d\u0122\5\20\t\2\u011e\u0122\5\u00b2Z\2\u011f\u0122\5\u00aaV\2\u0120"+
		"\u0122\5\u00be`\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011e"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\33\3\2\2\2\u0123"+
		"\u0125\7{\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\5\36\20\2\u0127\u0129\7i\2\2\u0128\u0127\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5\32\16\2\u012b\u0139\3"+
		"\2\2\2\u012c\u0139\7u\2\2\u012d\u012e\7u\2\2\u012e\u0139\5\u00b4[\2\u012f"+
		"\u0130\7z\2\2\u0130\u0131\7{\2\2\u0131\u0139\5\u00b2Z\2\u0132\u0133\7"+
		"{\2\2\u0133\u0139\7z\2\2\u0134\u0135\7{\2\2\u0135\u0139\5\u00b2Z\2\u0136"+
		"\u0137\7{\2\2\u0137\u0139\5\u00be`\2\u0138\u0124\3\2\2\2\u0138\u012c\3"+
		"\2\2\2\u0138\u012d\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0134\3\2\2\2\u0138\u0136\3\2\2\2\u0139\35\3\2\2\2\u013a\u013b\5 \21"+
		"\2\u013b\u013d\7{\2\2\u013c\u013e\5\36\20\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0145\3\2\2\2\u013f\u0140\5 \21\2\u0140\u0141\7{"+
		"\2\2\u0141\u0142\7i\2\2\u0142\u0143\5\36\20\2\u0143\u0145\3\2\2\2\u0144"+
		"\u013a\3\2\2\2\u0144\u013f\3\2\2\2\u0145\37\3\2\2\2\u0146\u0149\5\20\t"+
		"\2\u0147\u0149\5\n\6\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149!"+
		"\3\2\2\2\u014a\u0155\5\u00d8m\2\u014b\u0155\7\b\2\2\u014c\u014d\7\5\2"+
		"\2\u014d\u014e\5$\23\2\u014e\u014f\7\6\2\2\u014f\u0155\3\2\2\2\u0150\u0155"+
		"\5\30\r\2\u0151\u0155\5,\27\2\u0152\u0155\5\64\33\2\u0153\u0155\5\u00d2"+
		"j\2\u0154\u014a\3\2\2\2\u0154\u014b\3\2\2\2\u0154\u014c\3\2\2\2\u0154"+
		"\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2"+
		"\2\2\u0155#\3\2\2\2\u0156\u0157\b\23\1\2\u0157\u01ad\5\"\22\2\u0158\u0159"+
		"\t\2\2\2\u0159\u01ad\5$\23\36\u015a\u015b\7\24\2\2\u015b\u01ad\5$\23\33"+
		"\u015c\u015d\7\24\2\2\u015d\u015e\7\5\2\2\u015e\u015f\5\u0082B\2\u015f"+
		"\u0160\7\6\2\2\u0160\u01ad\3\2\2\2\u0161\u0163\7\25\2\2\u0162\u0164\7"+
		"{\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\5\36\20\2\u0166\u0167\7z\2\2\u0167\u0168\7\5\2\2\u0168\u0169\5"+
		"&\24\2\u0169\u016a\7\6\2\2\u016a\u01ad\3\2\2\2\u016b\u016d\7\25\2\2\u016c"+
		"\u016e\7{\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\5\36\20\2\u0170\u0172\7i\2\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\u00be`\2\u0174\u0175"+
		"\7\5\2\2\u0175\u0176\5&\24\2\u0176\u0177\7\6\2\2\u0177\u01ad\3\2\2\2\u0178"+
		"\u0179\5\\/\2\u0179\u017a\7\5\2\2\u017a\u017b\5&\24\2\u017b\u017c\7\6"+
		"\2\2\u017c\u01ad\3\2\2\2\u017d\u017e\7\26\2\2\u017e\u017f\7\3\2\2\u017f"+
		"\u0180\5\u0082B\2\u0180\u0181\7\4\2\2\u0181\u0182\7\5\2\2\u0182\u0183"+
		"\5$\23\2\u0183\u0184\7\6\2\2\u0184\u01ad\3\2\2\2\u0185\u0186\7\27\2\2"+
		"\u0186\u0187\7\3\2\2\u0187\u0188\5\u0082B\2\u0188\u0189\7\4\2\2\u0189"+
		"\u018a\7\5\2\2\u018a\u018b\5$\23\2\u018b\u018c\7\6\2\2\u018c\u01ad\3\2"+
		"\2\2\u018d\u018e\7\30\2\2\u018e\u018f\7\3\2\2\u018f\u0190\5\u0082B\2\u0190"+
		"\u0191\7\4\2\2\u0191\u0192\7\5\2\2\u0192\u0193\5$\23\2\u0193\u0194\7\6"+
		"\2\2\u0194\u01ad\3\2\2\2\u0195\u0196\7\31\2\2\u0196\u0197\7\3\2\2\u0197"+
		"\u0198\5\u0082B\2\u0198\u0199\7\4\2\2\u0199\u019a\7\5\2\2\u019a\u019b"+
		"\5$\23\2\u019b\u019c\7\6\2\2\u019c\u01ad\3\2\2\2\u019d\u019e\7\32\2\2"+
		"\u019e\u019f\7\5\2\2\u019f\u01a0\5$\23\2\u01a0\u01a1\7\6\2\2\u01a1\u01ad"+
		"\3\2\2\2\u01a2\u01a3\7\32\2\2\u01a3\u01a4\7\5\2\2\u01a4\u01a5\5\u0082"+
		"B\2\u01a5\u01a6\7\6\2\2\u01a6\u01ad\3\2\2\2\u01a7\u01a8\7\5\2\2\u01a8"+
		"\u01a9\5\u0082B\2\u01a9\u01aa\7\6\2\2\u01aa\u01ab\5$\23\17\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u0156\3\2\2\2\u01ac\u0158\3\2\2\2\u01ac\u015a\3\2\2\2\u01ac"+
		"\u015c\3\2\2\2\u01ac\u0161\3\2\2\2\u01ac\u016b\3\2\2\2\u01ac\u0178\3\2"+
		"\2\2\u01ac\u017d\3\2\2\2\u01ac\u0185\3\2\2\2\u01ac\u018d\3\2\2\2\u01ac"+
		"\u0195\3\2\2\2\u01ac\u019d\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac\u01a7\3\2"+
		"\2\2\u01ad\u020b\3\2\2\2\u01ae\u01af\f\16\2\2\u01af\u01b0\t\3\2\2\u01b0"+
		"\u020a\5$\23\17\u01b1\u01b2\f\r\2\2\u01b2\u01b3\t\4\2\2\u01b3\u020a\5"+
		"$\23\16\u01b4\u01b9\f\f\2\2\u01b5\u01ba\7\35\2\2\u01b6\u01ba\7\36\2\2"+
		"\u01b7\u01b8\7\37\2\2\u01b8\u01ba\7\4\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u020a\5$\23\r\u01bc"+
		"\u01bd\f\13\2\2\u01bd\u01be\t\5\2\2\u01be\u020a\5$\23\f\u01bf\u01c0\f"+
		"\n\2\2\u01c0\u01c1\t\6\2\2\u01c1\u020a\5$\23\13\u01c2\u01c3\f\t\2\2\u01c3"+
		"\u01c4\7\20\2\2\u01c4\u020a\5$\23\n\u01c5\u01c6\f\b\2\2\u01c6\u01c7\7"+
		"$\2\2\u01c7\u020a\5$\23\t\u01c8\u01c9\f\7\2\2\u01c9\u01ca\7%\2\2\u01ca"+
		"\u020a\5$\23\b\u01cb\u01cc\f\6\2\2\u01cc\u01cd\7&\2\2\u01cd\u020a\5$\23"+
		"\7\u01ce\u01cf\f\5\2\2\u01cf\u01d0\7\'\2\2\u01d0\u020a\5$\23\6\u01d1\u01d2"+
		"\f\4\2\2\u01d2\u01d3\7(\2\2\u01d3\u01d4\5$\23\2\u01d4\u01d5\7)\2\2\u01d5"+
		"\u01d6\5$\23\5\u01d6\u020a\3\2\2\2\u01d7\u01d8\f\3\2\2\u01d8\u01d9\t\7"+
		"\2\2\u01d9\u020a\5$\23\3\u01da\u01db\f!\2\2\u01db\u01e1\7\t\2\2\u01dc"+
		"\u01de\7i\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e2\5\30\r\2\u01e0\u01e2\5*\26\2\u01e1\u01dd\3\2\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\u020a\3\2\2\2\u01e3\u01e4\f \2\2\u01e4\u01ea\7{\2"+
		"\2\u01e5\u01e7\7i\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01eb\5\30\r\2\u01e9\u01eb\5*\26\2\u01ea\u01e6\3\2\2\2"+
		"\u01ea\u01e9\3\2\2\2\u01eb\u020a\3\2\2\2\u01ec\u01ed\f\37\2\2\u01ed\u01f3"+
		"\7\n\2\2\u01ee\u01f0\7i\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f4\5\30\r\2\u01f2\u01f4\5*\26\2\u01f3\u01ef\3"+
		"\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u020a\3\2\2\2\u01f5\u01fb\f\35\2\2\u01f6"+
		"\u01f8\7\3\2\2\u01f7\u01f9\5\u00c0a\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\7\4\2\2\u01fb\u01f6\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5&\24\2\u01fe\u01fd\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u020a\3\2\2\2\u0202\u0203\f\34\2\2\u0203\u0204\7\22\2\2\u0204\u0205\5"+
		"$\23\2\u0205\u0206\7\23\2\2\u0206\u020a\3\2\2\2\u0207\u0208\f\26\2\2\u0208"+
		"\u020a\t\b\2\2\u0209\u01ae\3\2\2\2\u0209\u01b1\3\2\2\2\u0209\u01b4\3\2"+
		"\2\2\u0209\u01bc\3\2\2\2\u0209\u01bf\3\2\2\2\u0209\u01c2\3\2\2\2\u0209"+
		"\u01c5\3\2\2\2\u0209\u01c8\3\2\2\2\u0209\u01cb\3\2\2\2\u0209\u01ce\3\2"+
		"\2\2\u0209\u01d1\3\2\2\2\u0209\u01d7\3\2\2\2\u0209\u01da\3\2\2\2\u0209"+
		"\u01e3\3\2\2\2\u0209\u01ec\3\2\2\2\u0209\u01f5\3\2\2\2\u0209\u0202\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c%\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0224\5(\25\2"+
		"\u020f\u0211\7\5\2\2\u0210\u0212\5(\25\2\u0211\u0210\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0224\7\6\2\2\u0214\u0215\7\66\2\2"+
		"\u0215\u021a\5&\24\2\u0216\u0217\7\67\2\2\u0217\u0219\5&\24\2\u0218\u0216"+
		"\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\78\2\2\u021e\u0224\3\2"+
		"\2\2\u021f\u0220\7\5\2\2\u0220\u0221\5&\24\2\u0221\u0222\7\6\2\2\u0222"+
		"\u0224\3\2\2\2\u0223\u020e\3\2\2\2\u0223\u020f\3\2\2\2\u0223\u0214\3\2"+
		"\2\2\u0223\u021f\3\2\2\2\u0224\'\3\2\2\2\u0225\u022a\5$\23\2\u0226\u0227"+
		"\7\67\2\2\u0227\u0229\5$\23\2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2"+
		"\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b)\3\2\2\2\u022c\u022a\3"+
		"\2\2\2\u022d\u022f\7{\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0231\3\2\2\2\u0230\u0232\5\36\20\2\u0231\u0230\3\2\2\2\u0231\u0232\3"+
		"\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\5^\60\2\u0234\u0235\7{\2\2\u0235"+
		"\u0236\7\7\2\2\u0236\u0237\5^\60\2\u0237\u024b\3\2\2\2\u0238\u023a\7{"+
		"\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\5\36\20\2\u023c\u023d\7i\2\2\u023d\u023e\5\u00be`\2\u023e\u023f"+
		"\7{\2\2\u023f\u0240\7\7\2\2\u0240\u0241\5^\60\2\u0241\u024b\3\2\2\2\u0242"+
		"\u0244\7{\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0247\5\36\20\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\7\7\2\2\u0249\u024b\5^\60\2\u024a\u022e\3\2"+
		"\2\2\u024a\u0239\3\2\2\2\u024a\u0243\3\2\2\2\u024b+\3\2\2\2\u024c\u024e"+
		"\7{\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0251\79\2\2\u0250\u0252\5.\30\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0255\5\60\31\2\u0254\u0256\5\62\32\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0265\3\2\2\2\u0257\u0259\7{"+
		"\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\79\2\2\u025b\u025d\5.\30\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7\5\2\2\u025f\u0260\5\u0082B\2\u0260"+
		"\u0262\7\6\2\2\u0261\u0263\5\62\32\2\u0262\u0261\3\2\2\2\u0262\u0263\3"+
		"\2\2\2\u0263\u0265\3\2\2\2\u0264\u024d\3\2\2\2\u0264\u0258\3\2\2\2\u0265"+
		"-\3\2\2\2\u0266\u0267\7\5\2\2\u0267\u0268\5&\24\2\u0268\u0269\7\6\2\2"+
		"\u0269/\3\2\2\2\u026a\u026c\5Z.\2\u026b\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0276\3\2\2\2\u026f"+
		"\u0271\7\22\2\2\u0270\u0272\5$\23\2\u0271\u0270\3\2\2\2\u0271\u0272\3"+
		"\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\7\23\2\2\u0274\u026f\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\61\3\2\2"+
		"\2\u0278\u0276\3\2\2\2\u0279\u027b\7\5\2\2\u027a\u027c\5&\24\2\u027b\u027a"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7\6\2\2\u027e"+
		"\63\3\2\2\2\u027f\u0281\7{\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0283\7:\2\2\u0283\u028c\5$\23\2\u0284\u0286"+
		"\7{\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\7:\2\2\u0288\u0289\7\22\2\2\u0289\u028a\7\23\2\2\u028a\u028c\5"+
		"$\23\2\u028b\u0280\3\2\2\2\u028b\u0285\3\2\2\2\u028c\65\3\2\2\2\u028d"+
		"\u028e\b\34\1\2\u028e\u028f\5$\23\2\u028f\u0298\3\2\2\2\u0290\u0291\f"+
		"\4\2\2\u0291\u0292\7;\2\2\u0292\u0297\5$\23\2\u0293\u0294\f\3\2\2\u0294"+
		"\u0295\7\17\2\2\u0295\u0297\5$\23\2\u0296\u0290\3\2\2\2\u0296\u0293\3"+
		"\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\67\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u02a5\5:\36\2\u029c\u02a5\5<\37"+
		"\2\u029d\u02a5\5> \2\u029e\u02a5\5@!\2\u029f\u02a5\5D#\2\u02a0\u02a5\5"+
		"H%\2\u02a1\u02a5\5J&\2\u02a2\u02a5\5\u00c8e\2\u02a3\u02a5\5\6\4\2\u02a4"+
		"\u029b\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4\u029d\3\2\2\2\u02a4\u029e\3\2"+
		"\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a59\3\2\2\2\u02a6\u02a7\7z\2\2\u02a7"+
		"\u02a8\7)\2\2\u02a8\u02b2\58\35\2\u02a9\u02aa\7<\2\2\u02aa\u02ab\5$\23"+
		"\2\u02ab\u02ac\7)\2\2\u02ac\u02ad\58\35\2\u02ad\u02b2\3\2\2\2\u02ae\u02af"+
		"\7=\2\2\u02af\u02b0\7)\2\2\u02b0\u02b2\58\35\2\u02b1\u02a6\3\2\2\2\u02b1"+
		"\u02a9\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2;\3\2\2\2\u02b3\u02b4\5&\24\2"+
		"\u02b4\u02b5\7>\2\2\u02b5=\3\2\2\2\u02b6\u02ba\7\66\2\2\u02b7\u02b9\5"+
		"8\35\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\78"+
		"\2\2\u02be?\3\2\2\2\u02bf\u02c0\7?\2\2\u02c0\u02c1\7\5\2\2\u02c1\u02c2"+
		"\5B\"\2\u02c2\u02c3\7\6\2\2\u02c3\u02c4\58\35\2\u02c4\u02d4\3\2\2\2\u02c5"+
		"\u02c6\7?\2\2\u02c6\u02c7\7\5\2\2\u02c7\u02c8\5B\"\2\u02c8\u02c9\7\6\2"+
		"\2\u02c9\u02ca\58\35\2\u02ca\u02cb\7@\2\2\u02cb\u02cc\58\35\2\u02cc\u02d4"+
		"\3\2\2\2\u02cd\u02ce\7A\2\2\u02ce\u02cf\7\5\2\2\u02cf\u02d0\5B\"\2\u02d0"+
		"\u02d1\7\6\2\2\u02d1\u02d2\58\35\2\u02d2\u02d4\3\2\2\2\u02d3\u02bf\3\2"+
		"\2\2\u02d3\u02c5\3\2\2\2\u02d3\u02cd\3\2\2\2\u02d4A\3\2\2\2\u02d5\u02d6"+
		"\5&\24\2\u02d6C\3\2\2\2\u02d7\u02d8\7B\2\2\u02d8\u02d9\7\5\2\2\u02d9\u02da"+
		"\5B\"\2\u02da\u02db\7\6\2\2\u02db\u02dc\58\35\2\u02dc\u02f3\3\2\2\2\u02dd"+
		"\u02de\7C\2\2\u02de\u02df\58\35\2\u02df\u02e0\7B\2\2\u02e0\u02e1\7\5\2"+
		"\2\u02e1\u02e2\5B\"\2\u02e2\u02e3\7\6\2\2\u02e3\u02e4\7>\2\2\u02e4\u02f3"+
		"\3\2\2\2\u02e5\u02e6\7D\2\2\u02e6\u02e7\7\5\2\2\u02e7\u02e9\5F$\2\u02e8"+
		"\u02ea\5B\"\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ed\7>\2\2\u02ec\u02ee\5&\24\2\u02ed\u02ec\3\2\2\2\u02ed"+
		"\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\6\2\2\u02f0\u02f1\58"+
		"\35\2\u02f1\u02f3\3\2\2\2\u02f2\u02d7\3\2\2\2\u02f2\u02dd\3\2\2\2\u02f2"+
		"\u02e5\3\2\2\2\u02f3E\3\2\2\2\u02f4\u02f7\5<\37\2\u02f5\u02f7\5L\'\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7G\3\2\2\2\u02f8\u02f9\7E\2\2\u02f9"+
		"\u0305\7>\2\2\u02fa\u02fb\7F\2\2\u02fb\u0305\7>\2\2\u02fc\u02fe\7G\2\2"+
		"\u02fd\u02ff\5$\23\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0305\7>\2\2\u0301\u0302\7H\2\2\u0302\u0303\7z\2\2\u0303"+
		"\u0305\7>\2\2\u0304\u02f8\3\2\2\2\u0304\u02fa\3\2\2\2\u0304\u02fc\3\2"+
		"\2\2\u0304\u0301\3\2\2\2\u0305I\3\2\2\2\u0306\u030c\5L\'\2\u0307\u030c"+
		"\5r:\2\u0308\u030c\5j\66\2\u0309\u030c\5n8\2\u030a\u030c\5p9\2\u030b\u0306"+
		"\3\2\2\2\u030b\u0307\3\2\2\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030b"+
		"\u030a\3\2\2\2\u030cK\3\2\2\2\u030d\u030f\5R*\2\u030e\u030d\3\2\2\2\u030f"+
		"\u0312\3\2\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0313\u0315\5N(\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7>\2\2\u0317M\3\2\2\2\u0318\u031d"+
		"\5P)\2\u0319\u031a\7\67\2\2\u031a\u031c\5P)\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031eO\3\2\2\2"+
		"\u031f\u031d\3\2\2\2\u0320\u0322\5v<\2\u0321\u0323\5\u008cG\2\u0322\u0321"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323Q\3\2\2\2\u0324\u032b\5V,\2\u0325\u032b"+
		"\5Z.\2\u0326\u032b\5X-\2\u0327\u032b\5T+\2\u0328\u032b\7I\2\2\u0329\u032b"+
		"\7J\2\2\u032a\u0324\3\2\2\2\u032a\u0325\3\2\2\2\u032a\u0326\3\2\2\2\u032a"+
		"\u0327\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032bS\3\2\2\2"+
		"\u032c\u032d\7\5\2\2\u032d\u032e\7\17\2\2\u032e\u032f\5\30\r\2\u032f\u0330"+
		"\7\6\2\2\u0330\u0331\5x=\2\u0331U\3\2\2\2\u0332\u0333\t\t\2\2\u0333W\3"+
		"\2\2\2\u0334\u0335\t\n\2\2\u0335Y\3\2\2\2\u0336\u033d\5\\/\2\u0337\u033d"+
		"\5\u0090I\2\u0338\u033d\5b\62\2\u0339\u033d\5`\61\2\u033a\u033d\5~@\2"+
		"\u033b\u033d\5z>\2\u033c\u0336\3\2\2\2\u033c\u0337\3\2\2\2\u033c\u0338"+
		"\3\2\2\2\u033c\u0339\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033b\3\2\2\2\u033d"+
		"[\3\2\2\2\u033e\u0340\7{\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u0343\5\36\20\2\u0342\u0341\3\2\2\2\u0342\u0343\3"+
		"\2\2\2\u0343\u0344\3\2\2\2\u0344\u0359\5^\60\2\u0345\u0359\7u\2\2\u0346"+
		"\u0348\7{\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034a\5\36\20\2\u034a\u034b\7i\2\2\u034b\u034c\5\u00be`\2\u034c"+
		"\u0359\3\2\2\2\u034d\u0359\7K\2\2\u034e\u0359\7L\2\2\u034f\u0359\7M\2"+
		"\2\u0350\u0359\7N\2\2\u0351\u0359\7O\2\2\u0352\u0359\7P\2\2\u0353\u0359"+
		"\7Q\2\2\u0354\u0359\7R\2\2\u0355\u0359\7S\2\2\u0356\u0359\7T\2\2\u0357"+
		"\u0359\7U\2\2\u0358\u033f\3\2\2\2\u0358\u0345\3\2\2\2\u0358\u0347\3\2"+
		"\2\2\u0358\u034d\3\2\2\2\u0358\u034e\3\2\2\2\u0358\u034f\3\2\2\2\u0358"+
		"\u0350\3\2\2\2\u0358\u0351\3\2\2\2\u0358\u0352\3\2\2\2\u0358\u0353\3\2"+
		"\2\2\u0358\u0354\3\2\2\2\u0358\u0355\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0357\3\2\2\2\u0359]\3\2\2\2\u035a\u035e\5\20\t\2\u035b\u035e\5\22\n"+
		"\2\u035c\u035e\5\b\5\2\u035d\u035a\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035c"+
		"\3\2\2\2\u035e_\3\2\2\2\u035f\u0361\5\u0094K\2\u0360\u0362\7{\2\2\u0361"+
		"\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0365\5\36"+
		"\20\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\7z\2\2\u0367\u0382\3\2\2\2\u0368\u036a\7V\2\2\u0369\u036b\7{\2"+
		"\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\3\2\2\2\u036c\u036e"+
		"\5\36\20\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2"+
		"\u036f\u0382\7z\2\2\u0370\u0372\7\25\2\2\u0371\u0373\7{\2\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5\36\20\2"+
		"\u0375\u0376\7z\2\2\u0376\u0382\3\2\2\2\u0377\u0379\7\25\2\2\u0378\u037a"+
		"\7{\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037d\5\36\20\2\u037c\u037e\7i\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3"+
		"\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\5\u00be`\2\u0380\u0382\3\2\2\2"+
		"\u0381\u035f\3\2\2\2\u0381\u0368\3\2\2\2\u0381\u0370\3\2\2\2\u0381\u0377"+
		"\3\2\2\2\u0382a\3\2\2\2\u0383\u0385\7V\2\2\u0384\u0386\7z\2\2\u0385\u0384"+
		"\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\7\66\2\2"+
		"\u0388\u038a\5d\63\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c"+
		"\3\2\2\2\u038b\u038d\7\67\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2"+
		"\u038d\u038e\3\2\2\2\u038e\u038f\78\2\2\u038fc\3\2\2\2\u0390\u0395\5f"+
		"\64\2\u0391\u0392\7\67\2\2\u0392\u0394\5f\64\2\u0393\u0391\3\2\2\2\u0394"+
		"\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396e\3\2\2\2"+
		"\u0397\u0395\3\2\2\2\u0398\u039d\7z\2\2\u0399\u039a\7z\2\2\u039a\u039b"+
		"\7*\2\2\u039b\u039d\5$\23\2\u039c\u0398\3\2\2\2\u039c\u0399\3\2\2\2\u039d"+
		"g\3\2\2\2\u039e\u03a0\7r\2\2\u039f\u03a1\7z\2\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a6\7\66\2\2\u03a3\u03a5\5"+
		"\4\3\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\78"+
		"\2\2\u03aai\3\2\2\2\u03ab\u03ac\7r\2\2\u03ac\u03ad\7z\2\2\u03ad\u03ae"+
		"\7*\2\2\u03ae\u03af\5l\67\2\u03af\u03b0\7>\2\2\u03b0k\3\2\2\2\u03b1\u03b3"+
		"\7{\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4"+
		"\u03b6\5\36\20\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3"+
		"\2\2\2\u03b7\u03b8\5\n\6\2\u03b8m\3\2\2\2\u03b9\u03bb\7s\2\2\u03ba\u03bc"+
		"\7\25\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2"+
		"\u03bd\u03bf\7{\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0"+
		"\3\2\2\2\u03c0\u03c1\5\36\20\2\u03c1\u03c2\5\32\16\2\u03c2\u03c3\7>\2"+
		"\2\u03c3\u03cf\3\2\2\2\u03c4\u03c6\7s\2\2\u03c5\u03c7\7\25\2\2\u03c6\u03c5"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cf\7u\2\2\u03c9"+
		"\u03ca\7s\2\2\u03ca\u03cb\7{\2\2\u03cb\u03cc\5\32\16\2\u03cc\u03cd\7>"+
		"\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03b9\3\2\2\2\u03ce\u03c4\3\2\2\2\u03ce"+
		"\u03c9\3\2\2\2\u03cfo\3\2\2\2\u03d0\u03d1\7s\2\2\u03d1\u03d3\7r\2\2\u03d2"+
		"\u03d4\7{\2\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2"+
		"\2\2\u03d5\u03d7\5\36\20\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u03d9\5\n\6\2\u03d9\u03da\7>\2\2\u03daq\3\2\2\2\u03db"+
		"\u03dc\7t\2\2\u03dc\u03dd\7\5\2\2\u03dd\u03de\5\26\f\2\u03de\u03df\7\6"+
		"\2\2\u03df\u03e0\7>\2\2\u03e0s\3\2\2\2\u03e1\u03e2\7l\2\2\u03e2\u03e3"+
		"\7\u0084\2\2\u03e3\u03e7\7\66\2\2\u03e4\u03e6\5\4\3\2\u03e5\u03e4\3\2"+
		"\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ef\78\2\2\u03eb\u03ec\7l\2"+
		"\2\u03ec\u03ed\7\u0084\2\2\u03ed\u03ef\5\4\3\2\u03ee\u03e1\3\2\2\2\u03ee"+
		"\u03eb\3\2\2\2\u03efu\3\2\2\2\u03f0\u041c\5\u0080A\2\u03f1\u03f2\5z>\2"+
		"\u03f2\u03f3\5\u0080A\2\u03f3\u041c\3\2\2\2\u03f4\u03f6\5\u0080A\2\u03f5"+
		"\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\5x=\2\u03fa\u03fc\5|?\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03ff\5\u00d4k"+
		"\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u041c\3\2\2\2\u0400\u0402"+
		"\5\u0080A\2\u0401\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401\3\2\2"+
		"\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\7\22\2\2\u0406"+
		"\u0408\5$\23\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u040a\7\23\2\2\u040a\u041c\3\2\2\2\u040b\u040d\5\u0080A\2\u040c"+
		"\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2"+
		"\2\2\u040f\u0410\3\2\2\2\u0410\u0414\5x=\2\u0411\u0413\5L\'\2\u0412\u0411"+
		"\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u041c\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\7\5\2\2\u0418\u0419\5v"+
		"<\2\u0419\u041a\7\6\2\2\u041a\u041c\3\2\2\2\u041b\u03f0\3\2\2\2\u041b"+
		"\u03f1\3\2\2\2\u041b\u03f5\3\2\2\2\u041b\u0401\3\2\2\2\u041b\u040c\3\2"+
		"\2\2\u041b\u0417\3\2\2\2\u041cw\3\2\2\2\u041d\u041f\7\5\2\2\u041e\u0420"+
		"\5\u0084C\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2"+
		"\2\u0421\u0427\7\6\2\2\u0422\u0423\7\5\2\2\u0423\u0424\5x=\2\u0424\u0425"+
		"\7\6\2\2\u0425\u0427\3\2\2\2\u0426\u041d\3\2\2\2\u0426\u0422\3\2\2\2\u0427"+
		"y\3\2\2\2\u0428\u042a\7\17\2\2\u0429\u042b\5|?\2\u042a\u0429\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u0438\3\2\2\2\u042c\u0438\7\20\2\2\u042d\u042e\7"+
		"\22\2\2\u042e\u0438\7\23\2\2\u042f\u0431\7{\2\2\u0430\u042f\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\5\36\20\2\u0433\u0435\7"+
		"\17\2\2\u0434\u0436\5|?\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u0438\3\2\2\2\u0437\u0428\3\2\2\2\u0437\u042c\3\2\2\2\u0437\u042d\3\2"+
		"\2\2\u0437\u0430\3\2\2\2\u0438{\3\2\2\2\u0439\u043d\5~@\2\u043a\u043c"+
		"\5~@\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e}\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0441\t\13\2\2"+
		"\u0441\177\3\2\2\2\u0442\u044b\5\30\r\2\u0443\u0445\7{\2\2\u0444\u0443"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0448\5\36\20\2"+
		"\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b"+
		"\5^\60\2\u044a\u0442\3\2\2\2\u044a\u0444\3\2\2\2\u044b\u0081\3\2\2\2\u044c"+
		"\u044e\5Z.\2\u044d\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u044d\3\2\2"+
		"\2\u044f\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u0453\5v<\2\u0452\u0451"+
		"\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0083\3\2\2\2\u0454\u0459\5\u0086D"+
		"\2\u0455\u0456\7\67\2\2\u0456\u0458\5\u0086D\2\u0457\u0455\3\2\2\2\u0458"+
		"\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045e\3\2"+
		"\2\2\u045b\u0459\3\2\2\2\u045c\u045d\7\67\2\2\u045d\u045f\7Y\2\2\u045e"+
		"\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0085\3\2\2\2\u0460\u0462\5R"+
		"*\2\u0461\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0461\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0467\5v<\2\u0466\u0465\3\2\2"+
		"\2\u0466\u0467\3\2\2\2\u0467\u0474\3\2\2\2\u0468\u046a\5R*\2\u0469\u0468"+
		"\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c"+
		"\u046e\3\2\2\2\u046d\u046f\5v<\2\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2"+
		"\2\u046f\u0470\3\2\2\2\u0470\u0471\7*\2\2\u0471\u0472\5$\23\2\u0472\u0474"+
		"\3\2\2\2\u0473\u0461\3\2\2\2\u0473\u0469\3\2\2\2\u0474\u0087\3\2\2\2\u0475"+
		"\u0477\5R*\2\u0476\u0475\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2"+
		"\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u047d"+
		"\5v<\2\u047c\u047e\5\u00acW\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2"+
		"\u047e\u047f\3\2\2\2\u047f\u0480\5\u008aF\2\u0480\u048b\3\2\2\2\u0481"+
		"\u0483\5R*\2\u0482\u0481\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2"+
		"\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0488"+
		"\5v<\2\u0488\u0489\5\u00caf\2\u0489\u048b\3\2\2\2\u048a\u0478\3\2\2\2"+
		"\u048a\u0484\3\2\2\2\u048b\u0089\3\2\2\2\u048c\u048d\5> \2\u048d\u008b"+
		"\3\2\2\2\u048e\u048f\7*\2\2\u048f\u0495\5\u008eH\2\u0490\u0491\7\5\2\2"+
		"\u0491\u0492\5&\24\2\u0492\u0493\7\6\2\2\u0493\u0495\3\2\2\2\u0494\u048e"+
		"\3\2\2\2\u0494\u0490\3\2\2\2\u0495\u008d\3\2\2\2\u0496\u0497\7\66\2\2"+
		"\u0497\u0499\5&\24\2\u0498\u049a\7\67\2\2\u0499\u0498\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\78\2\2\u049c\u04a1\3\2\2\2\u049d"+
		"\u049e\7\66\2\2\u049e\u04a1\78\2\2\u049f\u04a1\5&\24\2\u04a0\u0496\3\2"+
		"\2\2\u04a0\u049d\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u008f\3\2\2\2\u04a2"+
		"\u04a3\5\u0092J\2\u04a3\u04a7\7\66\2\2\u04a4\u04a6\5\u0096L\2\u04a5\u04a4"+
		"\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ab\78\2\2\u04ab\u0091\3\2"+
		"\2\2\u04ac\u04ae\5\u0094K\2\u04ad\u04af\7z\2\2\u04ae\u04ad\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04b2\5\u00a2R\2\u04b1\u04b0"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04c2\3\2\2\2\u04b3\u04b4\5\u0094K"+
		"\2\u04b4\u04b5\5\36\20\2\u04b5\u04b7\7z\2\2\u04b6\u04b8\5\u00a2R\2\u04b7"+
		"\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04c2\3\2\2\2\u04b9\u04bb\5\u0094"+
		"K\2\u04ba\u04bc\5\36\20\2\u04bb\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc"+
		"\u04bd\3\2\2\2\u04bd\u04bf\5\u00be`\2\u04be\u04c0\5\u00a2R\2\u04bf\u04be"+
		"\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04ac\3\2\2\2\u04c1"+
		"\u04b3\3\2\2\2\u04c1\u04b9\3\2\2\2\u04c2\u0093\3\2\2\2\u04c3\u04c4\t\f"+
		"\2\2\u04c4\u0095\3\2\2\2\u04c5\u04c9\5\u0098M\2\u04c6\u04c8\5\u0098M\2"+
		"\u04c7\u04c6\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04d2\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04cd\5\u00a8U"+
		"\2\u04cd\u04cf\7)\2\2\u04ce\u04d0\5\u0096L\2\u04cf\u04ce\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04c5\3\2\2\2\u04d1\u04cc\3\2"+
		"\2\2\u04d2\u0097\3\2\2\2\u04d3\u04d5\5\u0088E\2\u04d4\u04d6\7>\2\2\u04d5"+
		"\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04f1\3\2\2\2\u04d7\u04d9\5R"+
		"*\2\u04d8\u04d7\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da"+
		"\u04db\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04df\5\u009a"+
		"N\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04f1\7>\2\2\u04e1\u04e3\7{\2\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2"+
		"\2\u04e3\u04e4\3\2\2\2\u04e4\u04e6\5\36\20\2\u04e5\u04e7\7i\2\2\u04e6"+
		"\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\5\32"+
		"\16\2\u04e9\u04ea\7>\2\2\u04ea\u04f1\3\2\2\2\u04eb\u04ec\7u\2\2\u04ec"+
		"\u04f1\7>\2\2\u04ed\u04f1\5n8\2\u04ee\u04f1\5\u00b6\\\2\u04ef\u04f1\5"+
		"\6\4\2\u04f0\u04d3\3\2\2\2\u04f0\u04da\3\2\2\2\u04f0\u04e2\3\2\2\2\u04f0"+
		"\u04eb\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef\3\2"+
		"\2\2\u04f1\u0099\3\2\2\2\u04f2\u04f7\5\u009cO\2\u04f3\u04f4\7\67\2\2\u04f4"+
		"\u04f6\5\u009cO\2\u04f5\u04f3\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u009b\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa"+
		"\u04fc\5v<\2\u04fb\u04fd\5\u009eP\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd\3"+
		"\2\2\2\u04fd\u0508\3\2\2\2\u04fe\u0500\5v<\2\u04ff\u0501\5\u00a0Q\2\u0500"+
		"\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0508\3\2\2\2\u0502\u0504\7z"+
		"\2\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\7)\2\2\u0506\u0508\5$\23\2\u0507\u04fa\3\2\2\2\u0507\u04fe\3\2"+
		"\2\2\u0507\u0503\3\2\2\2\u0508\u009d\3\2\2\2\u0509\u050a\7*\2\2\u050a"+
		"\u050b\7|\2\2\u050b\u009f\3\2\2\2\u050c\u050d\7*\2\2\u050d\u050e\5$\23"+
		"\2\u050e\u00a1\3\2\2\2\u050f\u0510\7)\2\2\u0510\u0511\5\u00a4S\2\u0511"+
		"\u00a3\3\2\2\2\u0512\u0517\5\u00a6T\2\u0513\u0514\7\67\2\2\u0514\u0516"+
		"\5\u00a6T\2\u0515\u0513\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2"+
		"\2\u0517\u0518\3\2\2\2\u0518\u00a5\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051c"+
		"\7{\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d"+
		"\u051f\5\36\20\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3"+
		"\2\2\2\u0520\u054b\5\20\t\2\u0521\u054b\7u\2\2\u0522\u0524\7o\2\2\u0523"+
		"\u0525\5\u00a8U\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527"+
		"\3\2\2\2\u0526\u0528\7{\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u052a\3\2\2\2\u0529\u052b\5\36\20\2\u052a\u0529\3\2\2\2\u052a\u052b\3"+
		"\2\2\2\u052b\u052c\3\2\2\2\u052c\u054b\5\20\t\2\u052d\u052f\7o\2\2\u052e"+
		"\u0530\5\u00a8U\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532"+
		"\3\2\2\2\u0531\u0533\7{\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u054b\7u\2\2\u0535\u0537\5\u00a8U\2\u0536\u0538\7"+
		"o\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2\u0539"+
		"\u053b\7{\2\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2"+
		"\2\2\u053c\u053e\5\36\20\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e"+
		"\u053f\3\2\2\2\u053f\u0540\5\20\t\2\u0540\u054b\3\2\2\2\u0541\u0543\5"+
		"\u00a8U\2\u0542\u0544\7o\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0546\3\2\2\2\u0545\u0547\7{\2\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2"+
		"\2\2\u0547\u0548\3\2\2\2\u0548\u0549\7u\2\2\u0549\u054b\3\2\2\2\u054a"+
		"\u051b\3\2\2\2\u054a\u0521\3\2\2\2\u054a\u0522\3\2\2\2\u054a\u052d\3\2"+
		"\2\2\u054a\u0535\3\2\2\2\u054a\u0541\3\2\2\2\u054b\u00a7\3\2\2\2\u054c"+
		"\u054d\t\r\2\2\u054d\u00a9\3\2\2\2\u054e\u0550\7h\2\2\u054f\u0551\5Z."+
		"\2\u0550\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553"+
		"\3\2\2\2\u0553\u00ab\3\2\2\2\u0554\u0555\7)\2\2\u0555\u055a\5\u00aeX\2"+
		"\u0556\u0557\7\67\2\2\u0557\u0559\5\u00aeX\2\u0558\u0556\3\2\2\2\u0559"+
		"\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u00ad\3\2"+
		"\2\2\u055c\u055a\3\2\2\2\u055d\u055e\5\u00b0Y\2\u055e\u0560\7\5\2\2\u055f"+
		"\u0561\5&\24\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\3\2"+
		"\2\2\u0562\u0563\7\6\2\2\u0563\u00af\3\2\2\2\u0564\u0566\7{\2\2\u0565"+
		"\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2\2\2\u0567\u0569\5\36"+
		"\20\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056d\5\20\t\2\u056b\u056d\7z\2\2\u056c\u0565\3\2\2\2\u056c\u056b\3\2"+
		"\2\2\u056d\u00b1\3\2\2\2\u056e\u056f\7h\2\2\u056f\u0570\5\u00b4[\2\u0570"+
		"\u00b3\3\2\2\2\u0571\u05a2\79\2\2\u0572\u05a2\7:\2\2\u0573\u0574\79\2"+
		"\2\u0574\u0575\7\22\2\2\u0575\u05a2\7\23\2\2\u0576\u0577\7:\2\2\u0577"+
		"\u0578\7\22\2\2\u0578\u05a2\7\23\2\2\u0579\u05a2\7\13\2\2\u057a\u05a2"+
		"\7\f\2\2\u057b\u05a2\7\17\2\2\u057c\u05a2\7\33\2\2\u057d\u05a2\7\34\2"+
		"\2\u057e\u05a2\7$\2\2\u057f\u05a2\7\20\2\2\u0580\u05a2\7%\2\2\u0581\u05a2"+
		"\7\7\2\2\u0582\u05a2\7\21\2\2\u0583\u05a2\7*\2\2\u0584\u05a2\7\3\2\2\u0585"+
		"\u05a2\7\4\2\2\u0586\u05a2\7+\2\2\u0587\u05a2\7,\2\2\u0588\u05a2\7-\2"+
		"\2\u0589\u05a2\7.\2\2\u058a\u05a2\7\65\2\2\u058b\u05a2\7\61\2\2\u058c"+
		"\u05a2\7/\2\2\u058d\u05a2\7\60\2\2\u058e\u05a2\7\35\2\2\u058f\u05a2\7"+
		"\36\2\2\u0590\u05a2\7\62\2\2\u0591\u05a2\7\64\2\2\u0592\u05a2\7\"\2\2"+
		"\u0593\u05a2\7#\2\2\u0594\u05a2\7 \2\2\u0595\u05a2\7!\2\2\u0596\u05a2"+
		"\7&\2\2\u0597\u05a2\7\'\2\2\u0598\u05a2\7\r\2\2\u0599\u05a2\7\16\2\2\u059a"+
		"\u05a2\7\67\2\2\u059b\u05a2\7\17\2\2\u059c\u05a2\7\n\2\2\u059d\u059e\7"+
		"\5\2\2\u059e\u05a2\7\6\2\2\u059f\u05a0\7\22\2\2\u05a0\u05a2\7\23\2\2\u05a1"+
		"\u0571\3\2\2\2\u05a1\u0572\3\2\2\2\u05a1\u0573\3\2\2\2\u05a1\u0576\3\2"+
		"\2\2\u05a1\u0579\3\2\2\2\u05a1\u057a\3\2\2\2\u05a1\u057b\3\2\2\2\u05a1"+
		"\u057c\3\2\2\2\u05a1\u057d\3\2\2\2\u05a1\u057e\3\2\2\2\u05a1\u057f\3\2"+
		"\2\2\u05a1\u0580\3\2\2\2\u05a1\u0581\3\2\2\2\u05a1\u0582\3\2\2\2\u05a1"+
		"\u0583\3\2\2\2\u05a1\u0584\3\2\2\2\u05a1\u0585\3\2\2\2\u05a1\u0586\3\2"+
		"\2\2\u05a1\u0587\3\2\2\2\u05a1\u0588\3\2\2\2\u05a1\u0589\3\2\2\2\u05a1"+
		"\u058a\3\2\2\2\u05a1\u058b\3\2\2\2\u05a1\u058c\3\2\2\2\u05a1\u058d\3\2"+
		"\2\2\u05a1\u058e\3\2\2\2\u05a1\u058f\3\2\2\2\u05a1\u0590\3\2\2\2\u05a1"+
		"\u0591\3\2\2\2\u05a1\u0592\3\2\2\2\u05a1\u0593\3\2\2\2\u05a1\u0594\3\2"+
		"\2\2\u05a1\u0595\3\2\2\2\u05a1\u0596\3\2\2\2\u05a1\u0597\3\2\2\2\u05a1"+
		"\u0598\3\2\2\2\u05a1\u0599\3\2\2\2\u05a1\u059a\3\2\2\2\u05a1\u059b\3\2"+
		"\2\2\u05a1\u059c\3\2\2\2\u05a1\u059d\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2"+
		"\u00b5\3\2\2\2\u05a3\u05a4\7i\2\2\u05a4\u05a5\7\3\2\2\u05a5\u05a6\5\u00b8"+
		"]\2\u05a6\u05a7\7\4\2\2\u05a7\u05a8\5\4\3\2\u05a8\u00b7\3\2\2\2\u05a9"+
		"\u05ae\5\u00ba^\2\u05aa\u05ab\7\67\2\2\u05ab\u05ad\5\u00ba^\2\u05ac\u05aa"+
		"\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"\u00b9\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\5\u00bc_\2\u05b2\u05b4"+
		"\5\u0086D\2\u05b3\u05b1\3\2\2\2\u05b3\u05b2\3\2\2\2\u05b4\u00bb\3\2\2"+
		"\2\u05b5\u05b7\7Z\2\2\u05b6\u05b8\7z\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8"+
		"\3\2\2\2\u05b8\u05dd\3\2\2\2\u05b9\u05bb\7Z\2\2\u05ba\u05bc\7z\2\2\u05bb"+
		"\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\7*"+
		"\2\2\u05be\u05dd\5\u0082B\2\u05bf\u05c1\7\25\2\2\u05c0\u05c2\7z\2\2\u05c1"+
		"\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7*"+
		"\2\2\u05c4\u05dd\5\u0082B\2\u05c5\u05c7\7\25\2\2\u05c6\u05c8\7z\2\2\u05c7"+
		"\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05dd\3\2\2\2\u05c9\u05ca\7i"+
		"\2\2\u05ca\u05cb\7\3\2\2\u05cb\u05cc\5\u00b8]\2\u05cc\u05cd\7\4\2\2\u05cd"+
		"\u05cf\7Z\2\2\u05ce\u05d0\7z\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2"+
		"\2\u05d0\u05dd\3\2\2\2\u05d1\u05d2\7i\2\2\u05d2\u05d3\7\3\2\2\u05d3\u05d4"+
		"\5\u00b8]\2\u05d4\u05d5\7\4\2\2\u05d5\u05d7\7Z\2\2\u05d6\u05d8\7z\2\2"+
		"\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da"+
		"\7*\2\2\u05da\u05db\5\30\r\2\u05db\u05dd\3\2\2\2\u05dc\u05b5\3\2\2\2\u05dc"+
		"\u05b9\3\2\2\2\u05dc\u05bf\3\2\2\2\u05dc\u05c5\3\2\2\2\u05dc\u05c9\3\2"+
		"\2\2\u05dc\u05d1\3\2\2\2\u05dd\u00bd\3\2\2\2\u05de\u05df\5\24\13\2\u05df"+
		"\u05e1\7\3\2\2\u05e0\u05e2\5\u00c0a\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2"+
		"\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7\4\2\2\u05e4\u00bf\3\2\2\2\u05e5"+
		"\u05ea\5\u00c2b\2\u05e6\u05e7\7\67\2\2\u05e7\u05e9\5\u00c2b\2\u05e8\u05e6"+
		"\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb"+
		"\u00c1\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f1\5$\23\2\u05ee\u05f1\5\u0082"+
		"B\2\u05ef\u05f1\5\30\r\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0"+
		"\u05ef\3\2\2\2\u05f1\u00c3\3\2\2\2\u05f2\u05f3\7i\2\2\u05f3\u05f4\5\4"+
		"\3\2\u05f4\u00c5\3\2\2\2\u05f5\u05f6\7i\2\2\u05f6\u05f7\7\3\2\2\u05f7"+
		"\u05f8\7\4\2\2\u05f8\u05f9\5\4\3\2\u05f9\u00c7\3\2\2\2\u05fa\u05fb\7`"+
		"\2\2\u05fb\u05fc\5> \2\u05fc\u05fd\5\u00ccg\2\u05fd\u00c9\3\2\2\2\u05fe"+
		"\u0600\7`\2\2\u05ff\u0601\5\u00acW\2\u0600\u05ff\3\2\2\2\u0600\u0601\3"+
		"\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\5\u008aF\2\u0603\u0604\5\u00cc"+
		"g\2\u0604\u00cb\3\2\2\2\u0605\u0609\5\u00ceh\2\u0606\u0608\5\u00ceh\2"+
		"\u0607\u0606\3\2\2\2\u0608\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a"+
		"\3\2\2\2\u060a\u00cd\3\2\2\2\u060b\u0609\3\2\2\2\u060c\u060d\7a\2\2\u060d"+
		"\u060e\7\5\2\2\u060e\u060f\5\u00d0i\2\u060f\u0610\7\6\2\2\u0610\u0611"+
		"\5> \2\u0611\u00cf\3\2\2\2\u0612\u0614\5Z.\2\u0613\u0612\3\2\2\2\u0614"+
		"\u0615\3\2\2\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0617\3\2"+
		"\2\2\u0617\u0618\5v<\2\u0618\u0620\3\2\2\2\u0619\u061b\5Z.\2\u061a\u0619"+
		"\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d"+
		"\u0620\3\2\2\2\u061e\u0620\7Y\2\2\u061f\u0613\3\2\2\2\u061f\u061a\3\2"+
		"\2\2\u061f\u061e\3\2\2\2\u0620\u00d1\3\2\2\2\u0621\u0623\7b\2\2\u0622"+
		"\u0624\5$\23\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u00d3\3\2"+
		"\2\2\u0625\u0626\7b\2\2\u0626\u0628\7\5\2\2\u0627\u0629\5\u00d6l\2\u0628"+
		"\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\7\6"+
		"\2\2\u062b\u00d5\3\2\2\2\u062c\u062d\bl\1\2\u062d\u062e\5\u0082B\2\u062e"+
		"\u0634\3\2\2\2\u062f\u0630\f\3\2\2\u0630\u0631\7\67\2\2\u0631\u0633\5"+
		"\u0082B\2\u0632\u062f\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2"+
		"\u0634\u0635\3\2\2\2\u0635\u00d7\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u063f"+
		"\5\26\f\2\u0638\u063f\7|\2\2\u0639\u063f\7\u0083\2\2\u063a\u063f\7\u0081"+
		"\2\2\u063b\u063f\7\u0082\2\2\u063c\u063f\7c\2\2\u063d\u063f\7d\2\2\u063e"+
		"\u0637\3\2\2\2\u063e\u0638\3\2\2\2\u063e\u0639\3\2\2\2\u063e\u063a\3\2"+
		"\2\2\u063e\u063b\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063d\3\2\2\2\u063f"+
		"\u00d9\3\2\2\2\u00ce\u00dd\u00eb\u00f0\u00f3\u00f7\u00fc\u0102\u010a\u0114"+
		"\u0119\u0121\u0124\u0128\u0138\u013d\u0144\u0148\u0154\u0163\u016d\u0171"+
		"\u01ac\u01b9\u01dd\u01e1\u01e6\u01ea\u01ef\u01f3\u01f8\u01fb\u0200\u0209"+
		"\u020b\u0211\u021a\u0223\u022a\u022e\u0231\u0239\u0243\u0246\u024a\u024d"+
		"\u0251\u0255\u0258\u025c\u0262\u0264\u026d\u0271\u0276\u027b\u0280\u0285"+
		"\u028b\u0296\u0298\u02a4\u02b1\u02ba\u02d3\u02e9\u02ed\u02f2\u02f6\u02fe"+
		"\u0304\u030b\u0310\u0314\u031d\u0322\u032a\u033c\u033f\u0342\u0347\u0358"+
		"\u035d\u0361\u0364\u036a\u036d\u0372\u0379\u037d\u0381\u0385\u0389\u038c"+
		"\u0395\u039c\u03a0\u03a6\u03b2\u03b5\u03bb\u03be\u03c6\u03ce\u03d3\u03d6"+
		"\u03e7\u03ee\u03f7\u03fb\u03fe\u0403\u0407\u040e\u0414\u041b\u041f\u0426"+
		"\u042a\u0430\u0435\u0437\u043d\u0444\u0447\u044a\u044f\u0452\u0459\u045e"+
		"\u0463\u0466\u046b\u046e\u0473\u0478\u047d\u0484\u048a\u0494\u0499\u04a0"+
		"\u04a7\u04ae\u04b1\u04b7\u04bb\u04bf\u04c1\u04c9\u04cf\u04d1\u04d5\u04da"+
		"\u04de\u04e2\u04e6\u04f0\u04f7\u04fc\u0500\u0503\u0507\u0517\u051b\u051e"+
		"\u0524\u0527\u052a\u052f\u0532\u0537\u053a\u053d\u0543\u0546\u054a\u0552"+
		"\u055a\u0560\u0565\u0568\u056c\u05a1\u05ae\u05b3\u05b7\u05bb\u05c1\u05c7"+
		"\u05cf\u05d7\u05dc\u05e1\u05ea\u05f0\u0600\u0609\u0615\u061c\u061f\u0623"+
		"\u0628\u0634\u063e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}