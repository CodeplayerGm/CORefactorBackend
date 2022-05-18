// Generated from D:/Development/idea_projects/depends-0.9.6/src/main/antlr4/depends/extractor/cpp\CPreprocessor.g4 by ANTLR 4.9.1
package com.nju.rjxy.refactorbackend.depends.extractor.cpp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPreprocessorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CPreprocessorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(CPreprocessorParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#non_preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_preprocessor(CPreprocessorParser.Non_preprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#preprocessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor(CPreprocessorParser.PreprocessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#pp_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPp_include(CPreprocessorParser.Pp_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#pp_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPp_define(CPreprocessorParser.Pp_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#pp_ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPp_ignore(CPreprocessorParser.Pp_ignoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#token_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_sequence(CPreprocessorParser.Token_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPreprocessorParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(CPreprocessorParser.IgnoreContext ctx);
}