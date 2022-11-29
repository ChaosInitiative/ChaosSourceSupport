package com.enderzombi102.css.lang.angelscript

import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptVar

class AngelScriptRefactoringSupportProvider : RefactoringSupportProvider() {
	override fun isMemberInplaceRenameAvailable( elementToRename: PsiElement, context: PsiElement? ) =
		elementToRename is AngelScriptVar
}