package com.enderzombi102.css.lang.angelscript

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext

class AngelScriptReferenceContributor : PsiReferenceContributor() {
	override fun registerReferenceProviders( registrar: PsiReferenceRegistrar ) {
		registrar.registerReferenceProvider(
			PlatformPatterns.psiElement( PsiLiteralExpression::class.java ),
			object : PsiReferenceProvider() {
				override fun getReferencesByElement( element: PsiElement, context: ProcessingContext ) =
					if ( ( element as PsiLiteralExpression ).value is String )
						arrayOf( AngelScriptReference(element) )
					else
						PsiReference.EMPTY_ARRAY
			}
		)
	}
}