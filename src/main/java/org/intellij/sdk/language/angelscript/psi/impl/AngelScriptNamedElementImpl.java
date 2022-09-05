package org.intellij.sdk.language.angelscript.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.angelscript.psi.AngelScriptNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class AngelScriptNamedElementImpl extends ASTWrapperPsiElement implements AngelScriptNamedElement {
	public AngelScriptNamedElementImpl( @NotNull ASTNode node ) {
		super( node );
	}
}
