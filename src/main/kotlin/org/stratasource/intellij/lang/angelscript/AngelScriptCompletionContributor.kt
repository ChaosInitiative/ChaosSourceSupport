package com.enderzombi102.css.lang.angelscript

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptElementTypes

class AngelScriptCompletionContributor : CompletionContributor() {
	init {
		extend(
			CompletionType.SMART,
			PlatformPatterns.psiElement(AngelScriptElementTypes.T_IDENT),
			AngelScriptContributionProvider()
		)
	}

	override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
		super.fillCompletionVariants(parameters, result)
	}
}

internal class AngelScriptContributionProvider : CompletionProvider<CompletionParameters>() {
	public override fun addCompletions( params: CompletionParameters, ctx: ProcessingContext, res: CompletionResultSet ) {
		for ( s in AngelScriptUtil.findVars(params.originalFile)) {
			res.addElement( LookupElementBuilder.create( s ) )
		}
	}
}