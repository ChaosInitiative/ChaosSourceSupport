package com.enderzombi102.css.lang.angelscript

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class AngelScriptSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
	override fun getSyntaxHighlighter( project: Project?, virtualFile: VirtualFile? ) =
		AngelScriptSyntaxHighlighter()
}