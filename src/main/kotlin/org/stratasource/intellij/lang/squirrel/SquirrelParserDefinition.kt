package com.enderzombi102.css.lang.squirrel

import com.enderzombi102.css.lang.squirrel.parser.SquirrelParser
import com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes
import com.enderzombi102.css.lang.squirrel.psi.SquirrelFile
import com.enderzombi102.css.lang.squirrel.psi.SquirrelTokenSets
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class SquirrelParserDefinition : ParserDefinition {
	override fun createLexer(project: Project?): Lexer = SquirrelLexerAdapter()

	override fun createParser(project: Project?): PsiParser = SquirrelParser()

	override fun getFileNodeType(): IFileElementType = FILE

	override fun getCommentTokens(): TokenSet = SquirrelTokenSets.COMMENTS

	override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

	override fun createElement(node: ASTNode?): PsiElement = SquirrelElementTypes.Factory.createElement( node )

	override fun createFile(viewProvider: FileViewProvider): PsiFile = SquirrelFile( viewProvider )

	companion object {
		private val FILE = IFileElementType( SquirrelLanguage )
	}
}
