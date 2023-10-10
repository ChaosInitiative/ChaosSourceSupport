package com.enderzombi102.css.lang.angelscript

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptFile
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptIdentifier

object AngelScriptElementFactory {
	@JvmStatic
	fun createIdentifier(project: Project, name: String ) =
		createFile(project, name).firstChild as AngelScriptIdentifier

	private fun createFile(project: Project, text: String ) =
		PsiFileFactory.getInstance(project)
			.createFileFromText( "dummy.simple", AngelScriptFileType, text ) as AngelScriptFile
}