package com.enderzombi102.css.lang.squirrel

import com.enderzombi102.css.lang.squirrel.grammar._SquirrelLexer
import com.intellij.lexer.FlexAdapter

class SquirrelLexerAdapter : FlexAdapter( _SquirrelLexer() )
