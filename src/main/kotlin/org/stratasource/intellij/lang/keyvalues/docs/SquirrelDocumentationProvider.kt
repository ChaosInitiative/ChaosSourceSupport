package com.enderzombi102.css.lang.squirrel.docs

import com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes.T_YIELD
import com.enderzombi102.css.lang.squirrel.psi.SquirrelTokenType
import com.intellij.lang.documentation.AbstractDocumentationProvider
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiDocCommentBase
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.util.elementType
import java.util.function.Consumer

class SquirrelDocumentationProvider : AbstractDocumentationProvider() {
	override fun generateDoc(element: PsiElement, originalElement: PsiElement?): String? {
		return element.text
	}

	override fun getQuickNavigateInfo(element: PsiElement?, originalElement: PsiElement?): String? {
		return "hello"
	}

	override fun collectDocComments(file: PsiFile, sink: Consumer<in PsiDocCommentBase>) {
		super.collectDocComments(file, sink)
	}

	override fun getDocumentationElementForLink( psiManager: PsiManager?, link: String?, context: PsiElement? ): PsiElement? {
		return super.getDocumentationElementForLink(psiManager, link, context)
	}

	override fun getUrlFor(element: PsiElement?, originalElement: PsiElement?): MutableList<String>? {
		return super.getUrlFor(element, originalElement)
	}

	override fun getCustomDocumentationElement( editor: Editor, file: PsiFile, contextElement: PsiElement?, targetOffset: Int ): PsiElement? {
		return contextElement
	}


}
