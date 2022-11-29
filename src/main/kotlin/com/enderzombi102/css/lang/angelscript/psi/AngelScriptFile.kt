package com.enderzombi102.css.lang.angelscript.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import com.enderzombi102.css.lang.angelscript.AngelScriptFileType
import com.enderzombi102.css.lang.angelscript.AngelScriptLanguage

class AngelScriptFile( viewProvider: FileViewProvider ) : PsiFileBase( viewProvider, AngelScriptLanguage ) {
	override fun getFileType() =  AngelScriptFileType

	override fun toString() = "AngelScript File"
}