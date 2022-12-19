package com.enderzombi102.css.lang.angelscript

import com.enderzombi102.css.CssIcons
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReference
import com.intellij.psi.PsiReferenceBase

class AngelScriptReference(element: PsiElement) : PsiReferenceBase<PsiElement>(element), PsiPolyVariantReference {
	private val key: String = element.text

	override fun multiResolve( incompleteCode: Boolean ) = buildList {
		for ( variable in AngelScriptUtil.findVars(myElement!!.project, key))
			add( PsiElementResolveResult( variable ) )
	}.toTypedArray()

	override fun resolve() = multiResolve( false ).run {
		if ( size == 1 )
			this[0].element
		else
			null
	}

	override fun getVariants() = buildList {
		for ( scriptVar in AngelScriptUtil.findVars(myElement!!.project)) {
			if ( scriptVar.ident != null && scriptVar.ident.isNotEmpty() ) {
				add(
					LookupElementBuilder
						.create(scriptVar)
						.withIcon(CssIcons.AS_FILE)
						.withTypeText(scriptVar.ident)
				)
			}
		}
	}.toTypedArray()
}
