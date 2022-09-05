package org.intellij.sdk.language.angelscript.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.angelscript.AngelScriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AngelScriptElementType extends IElementType {
	public AngelScriptElementType( @NotNull @NonNls String debugName ) {
		super( debugName, AngelScriptLanguage.INSTANCE );
	}
}
