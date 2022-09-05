package org.intellij.sdk.language;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;


public class AngelScriptReferenceContributor extends PsiReferenceContributor {
	@Override
	public void registerReferenceProviders( @NotNull PsiReferenceRegistrar registrar ) {
		registrar.registerReferenceProvider(
			PlatformPatterns.psiElement( PsiLiteralExpression.class ),
			new PsiReferenceProvider() {
				@Override
				public PsiReference @NotNull [] getReferencesByElement( @NotNull PsiElement element, @NotNull ProcessingContext context ) {
					PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
					if ( literalExpression.getValue() instanceof String ) {
						return new PsiReference[] { new AngelScriptReference( element ) };
					}
					return PsiReference.EMPTY_ARRAY;
				}
			}
		);
	}

}