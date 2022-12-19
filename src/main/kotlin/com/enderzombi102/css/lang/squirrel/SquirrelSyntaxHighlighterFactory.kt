package com.enderzombi102.css.lang.squirrel

import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class SquirrelSyntaxHighlighterFactory : SyntaxHighlighterFactory() {
	override fun getSyntaxHighlighter( project: Project?, virtualFile: VirtualFile? ): SyntaxHighlighter =
		SquirrelSyntaxHighlighter()
}
