package com.enderzombi102.css.lang.angelscript

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.ParserDefinition.SpaceRequirements
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.enderzombi102.css.lang.angelscript.parser.AngelScriptParser
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptElementTypes
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptFile

class AngelScriptParserDefinition : ParserDefinition {
	override fun createLexer( project: Project ): Lexer = AngelScriptLexerAdapter()

	override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

	override fun getCommentTokens(): TokenSet = COMMENTS

	override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

	override fun createParser( project: Project ): PsiParser = AngelScriptParser()

	override fun getFileNodeType(): IFileElementType = FILE

	override fun createFile( viewProvider: FileViewProvider ): PsiFile = AngelScriptFile(viewProvider)

	override fun spaceExistenceTypeBetweenTokens( left: ASTNode, right: ASTNode ) = SpaceRequirements.MAY

	override fun createElement( node: ASTNode ): PsiElement = AngelScriptElementTypes.Factory.createElement(node)

	companion object {
		val WHITE_SPACES = TokenSet.create( TokenType.WHITE_SPACE )
		val COMMENTS = TokenSet.create(
			AngelScriptElementTypes.T_LINE_COMMENT,
			AngelScriptElementTypes.T_BLOCK_COMMENT,
			AngelScriptElementTypes.T_PRE_COMMENT,
			AngelScriptElementTypes.T_ELIF_COMMENT
		)
		val FILE = IFileElementType( AngelScriptLanguage )
	}
}