package org.intellij.sdk.language;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import org.intellij.sdk.language.psi.AngelScriptVar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AngelScriptReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
	private final String key;

	public AngelScriptReference( @NotNull PsiElement element ) {
		super( element );
		key = element.getText();
	}

	@Override
	public ResolveResult @NotNull [] multiResolve( boolean incompleteCode ) {
		Project project = myElement.getProject();
		final List<AngelScriptVar> vars = AngelScriptUtil.findVars( project, key );
		List<ResolveResult> results = new ArrayList<>();
		for ( AngelScriptVar var : vars ) {
			results.add( new PsiElementResolveResult( var ) );
		}
		return results.toArray( new ResolveResult[0] );
	}

	@Override
	public @Nullable PsiElement resolve() {
		ResolveResult[] resolveResults = multiResolve( false );
		return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
	}

	@Override
	public Object @NotNull [] getVariants() {
		Project project = myElement.getProject();
		List<AngelScriptVar> vars = AngelScriptUtil.findVars( project );
		List<LookupElement> variants = new ArrayList<>();
		for ( final AngelScriptVar var : vars ) {
			if ( var.getIdent() != null && var.getIdent().length() > 0 ) {
				variants.add(
                    LookupElementBuilder
                        .create( var )
                        .withIcon( AngelScriptIcons.FILE )
                        .withTypeText( var.getIdent() )
				);
			}
		}
		return variants.toArray();
	}

}