package com.enderzombi102.css.lang.angelscript.psi

import com.intellij.psi.tree.IElementType
import com.enderzombi102.css.lang.angelscript.AngelScriptLanguage
import org.jetbrains.annotations.NonNls

class AngelScriptTokenType( debugName: @NonNls String ) : IElementType( debugName, AngelScriptLanguage ) {
	override fun toString() = "AngelScriptTokenType.${super.toString()}"
}