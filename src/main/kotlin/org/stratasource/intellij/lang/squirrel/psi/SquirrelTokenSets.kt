package com.enderzombi102.css.lang.squirrel.psi

import com.enderzombi102.css.lang.squirrel.SquirrelSyntaxHighlighter
import com.intellij.psi.tree.TokenSet

object SquirrelTokenSets {
	val KEYWORDS  = TokenSet.create( *SquirrelSyntaxHighlighter.KEYWORDS.toTypedArray() )
	val OPERATORS = TokenSet.create( *SquirrelSyntaxHighlighter.OPERATORS.toTypedArray() )
	val COMMENTS  = TokenSet.create( SquirrelElementTypes.T_LINE_COMMENT, SquirrelElementTypes.T_BLOCK_COMMENT )
}
