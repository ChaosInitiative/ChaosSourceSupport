package org.intellij.sdk.language.angelscript;

import com.intellij.lexer.FlexAdapter;
import org.intellij.sdk.language.angelscript._AngelScriptLexer;

public class AngelScriptLexerAdapter extends FlexAdapter {
	public AngelScriptLexerAdapter() {
		super( new _AngelScriptLexer( null ) );
	}
}
