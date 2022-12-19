package com.enderzombi102.css.lang.squirrel.psi

import com.intellij.psi.tree.IElementType
import com.enderzombi102.css.lang.angelscript.AngelScriptLanguage
import com.enderzombi102.css.lang.squirrel.SquirrelLanguage
import org.jetbrains.annotations.NonNls

class SquirrelTokenType(debugName: @NonNls String ) : IElementType( debugName, SquirrelLanguage ) {
	override fun toString() = "SquirrelTokenType.${super.toString()}"
}
