package com.enderzombi102.css.lang.angelscript

import com.intellij.lexer.FlexAdapter
import com.enderzombi102.css.lang.angelscript.grammar._AngelScriptLexer

class AngelScriptLexerAdapter : FlexAdapter( _AngelScriptLexer(null) )