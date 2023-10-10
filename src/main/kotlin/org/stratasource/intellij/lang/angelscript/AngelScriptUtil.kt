package com.enderzombi102.css.lang.angelscript

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptFile
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptVar

object AngelScriptUtil {
	@JvmStatic
	fun findVars( project: Project, key: String ): List<AngelScriptVar> {
		val result = ArrayList<AngelScriptVar>()
		for ( virtualFile in FileTypeIndex.getFiles( AngelScriptFileType, GlobalSearchScope.allScope( project ) ) ) {
			val simpleFile = PsiManager.getInstance( project ).findFile( virtualFile ) as AngelScriptFile?
			if ( simpleFile != null ) {
				for ( element in PsiTreeUtil.getChildrenOfTypeAsList( simpleFile, PsiElement::class.java ) ) {
					if ( element is AngelScriptVar) {
//                      if (key.equals(elementVar.getIdent())) {
						result.add( element )
//                      }
					}
				}
			}
		}
		return result
	}

	@JvmStatic
	fun findVars( project: Project ): List<AngelScriptVar> {
		val result = ArrayList<AngelScriptVar>()
		for ( virtualFile in FileTypeIndex.getFiles( AngelScriptFileType, GlobalSearchScope.allScope( project ) ) ) {
			val simpleFile = PsiManager.getInstance( project ).findFile( virtualFile ) as AngelScriptFile?
			if ( simpleFile != null ) {
				for ( element in PsiTreeUtil.getChildrenOfTypeAsList( simpleFile, PsiElement::class.java ) ) {
					if ( element is AngelScriptVar) {
						result.add( element )
					}
				}
			}
		}
		return result
	}

	@JvmStatic
	fun findVars( file: PsiFile): List<String> {
		val result = ArrayList<String>()

		if ( file is AngelScriptFile) {
			for ( element in PsiTreeUtil.getChildrenOfTypeAsList( file, PsiElement::class.java ) ) {
				if ( element is AngelScriptVar) {
					try {
						result.add( element.firstChild.nextSibling.nextSibling.text )
					} catch ( ignored: Exception  ) { }
				}
			}
		}
		return result
	}
}
