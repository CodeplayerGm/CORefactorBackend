// Generated from D:/Development/idea_projects/depends-0.9.6/src/main/antlr4/depends/extractor/cpp\CPreprocessor.g4 by ANTLR 4.9.1
package com.nju.rjxy.refactorbackend.depends.extractor.cpp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPreprocessorParser}.
 */
public interface CPreprocessorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CPreprocessorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CPreprocessorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(CPreprocessorParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(CPreprocessorParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#non_preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterNon_preprocessor(CPreprocessorParser.Non_preprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#non_preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitNon_preprocessor(CPreprocessorParser.Non_preprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(CPreprocessorParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(CPreprocessorParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#pp_include}.
	 * @param ctx the parse tree
	 */
	void enterPp_include(CPreprocessorParser.Pp_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#pp_include}.
	 * @param ctx the parse tree
	 */
	void exitPp_include(CPreprocessorParser.Pp_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#pp_define}.
	 * @param ctx the parse tree
	 */
	void enterPp_define(CPreprocessorParser.Pp_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#pp_define}.
	 * @param ctx the parse tree
	 */
	void exitPp_define(CPreprocessorParser.Pp_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#pp_ignore}.
	 * @param ctx the parse tree
	 */
	void enterPp_ignore(CPreprocessorParser.Pp_ignoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#pp_ignore}.
	 * @param ctx the parse tree
	 */
	void exitPp_ignore(CPreprocessorParser.Pp_ignoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#token_sequence}.
	 * @param ctx the parse tree
	 */
	void enterToken_sequence(CPreprocessorParser.Token_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#token_sequence}.
	 * @param ctx the parse tree
	 */
	void exitToken_sequence(CPreprocessorParser.Token_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPreprocessorParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(CPreprocessorParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPreprocessorParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(CPreprocessorParser.IgnoreContext ctx);
}