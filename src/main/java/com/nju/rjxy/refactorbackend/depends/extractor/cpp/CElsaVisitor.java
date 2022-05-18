// Generated from D:/Development/idea_projects/RefactorBackend/src/main/antlr4/depends/extractor/cpp\CElsa.g4 by ANTLR 4.9.2
package com.nju.rjxy.refactorbackend.depends.extractor.cpp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CElsaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CElsaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CElsaParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(CElsaParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CElsaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#macroInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroInvocation(CElsaParser.MacroInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CElsaParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(CElsaParser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(CElsaParser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(CElsaParser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CElsaParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(CElsaParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(CElsaParser.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#stringBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringBlock(CElsaParser.StringBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(CElsaParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(CElsaParser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(CElsaParser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(CElsaParser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#classOrNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrNamespaceName(CElsaParser.ClassOrNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CElsaParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CElsaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CElsaParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(CElsaParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(CElsaParser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(CElsaParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(CElsaParser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(CElsaParser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(CElsaParser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(CElsaParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#pmExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPmExpression(CElsaParser.PmExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CElsaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CElsaParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CElsaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CElsaParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CElsaParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CElsaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CElsaParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(CElsaParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CElsaParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(CElsaParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(CElsaParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(CElsaParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(CElsaParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(CElsaParser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#functionPtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPtr(CElsaParser.FunctionPtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CElsaParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CElsaParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CElsaParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(CElsaParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CElsaParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(CElsaParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CElsaParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(CElsaParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(CElsaParser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(CElsaParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(CElsaParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#qualifiedNamespaceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNamespaceSpecifier(CElsaParser.QualifiedNamespaceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(CElsaParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(CElsaParser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(CElsaParser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(CElsaParser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CElsaParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CElsaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#ptrOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrOperator(CElsaParser.PtrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#cvQualifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifierSeq(CElsaParser.CvQualifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(CElsaParser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#declaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorId(CElsaParser.DeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(CElsaParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(CElsaParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(CElsaParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CElsaParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CElsaParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CElsaParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(CElsaParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(CElsaParser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(CElsaParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(CElsaParser.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(CElsaParser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationFunctionDefine}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationFunctionDefine(CElsaParser.MemberDeclarationFunctionDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationGeneral}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationGeneral(CElsaParser.MemberDeclarationGeneralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationDontKnow1}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationDontKnow1(CElsaParser.MemberDeclarationDontKnow1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationDontKnow2}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationDontKnow2(CElsaParser.MemberDeclarationDontKnow2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationUsing}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationUsing(CElsaParser.MemberDeclarationUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationTemplate}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationTemplate(CElsaParser.MemberDeclarationTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberDeclarationMacro}
	 * labeled alternative in {@link CElsaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarationMacro(CElsaParser.MemberDeclarationMacroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(CElsaParser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberFunction}
	 * labeled alternative in {@link CElsaParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFunction(CElsaParser.MemberFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberOther}
	 * labeled alternative in {@link CElsaParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberOther(CElsaParser.MemberOtherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberWithBitField}
	 * labeled alternative in {@link CElsaParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberWithBitField(CElsaParser.MemberWithBitFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(CElsaParser.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#constantInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantInitializer(CElsaParser.ConstantInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(CElsaParser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(CElsaParser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(CElsaParser.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(CElsaParser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(CElsaParser.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#ctorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorInitializer(CElsaParser.CtorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(CElsaParser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#memInitializerId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerId(CElsaParser.MemInitializerIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(CElsaParser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#operatorFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunc(CElsaParser.OperatorFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(CElsaParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameterList(CElsaParser.TemplateParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(CElsaParser.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(CElsaParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(CElsaParser.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(CElsaParser.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(CElsaParser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(CElsaParser.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(CElsaParser.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(CElsaParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(CElsaParser.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(CElsaParser.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(CElsaParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(CElsaParser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(CElsaParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(CElsaParser.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(CElsaParser.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CElsaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CElsaParser.LiteralContext ctx);
}