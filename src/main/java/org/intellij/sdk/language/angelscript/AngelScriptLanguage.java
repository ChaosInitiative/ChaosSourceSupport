package org.intellij.sdk.language.angelscript;

import com.intellij.lang.Language;

public class AngelScriptLanguage extends Language {
  public static final AngelScriptLanguage INSTANCE = new AngelScriptLanguage();

  private AngelScriptLanguage() {
    super("AngelScript");
  }

}