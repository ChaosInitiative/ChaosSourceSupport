package com.enderzombi102.css.lang.angelscript

import com.enderzombi102.css.CssIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts.Label
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

@Suppress("UnstableApiUsage")
object AngelScriptFileType : LanguageFileType(AngelScriptLanguage) {
	override fun getName(): @NonNls String {
		return "AngelScript File"
	}

	override fun getDescription(): @Label String {
		return "AngelScript"
	}

	override fun getDefaultExtension(): @NlsSafe String {
		return "as"
	}

	override fun getIcon(): Icon {
		return CssIcons.AS_FILE
	}
}
