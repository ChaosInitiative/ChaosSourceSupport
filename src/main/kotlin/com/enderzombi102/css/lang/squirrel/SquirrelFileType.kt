package com.enderzombi102.css.lang.squirrel

import com.enderzombi102.css.ChaosSourceSupportIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts.Label
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

@Suppress("UnstableApiUsage")
object SquirrelFileType : LanguageFileType(SquirrelLanguage) {
	override fun getName(): @NonNls String {
		return "Squirrel File"
	}

	override fun getDescription(): @Label String {
		return "Squirrel"
	}

	override fun getDefaultExtension(): @NlsSafe String {
		return "nut"
	}

	override fun getIcon(): Icon {
		return ChaosSourceSupportIcons.SQUIRREL_FILE
	}
}
