package com.enderzombi102.css.lang.squirrel.psi

import com.enderzombi102.css.lang.squirrel.SquirrelFileType
import com.enderzombi102.css.lang.squirrel.SquirrelLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class SquirrelFile( viewProvider: FileViewProvider ) : PsiFileBase( viewProvider, SquirrelLanguage ) {
	override fun getFileType(): FileType = SquirrelFileType

	override fun toString(): String = "Squirrel file"
}
