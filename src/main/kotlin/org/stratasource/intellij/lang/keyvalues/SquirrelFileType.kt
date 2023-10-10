package com.enderzombi102.css.lang.squirrel

import com.enderzombi102.css.CssIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.NlsContexts.Label
import com.intellij.openapi.util.NlsSafe
import org.jetbrains.annotations.NonNls
import javax.swing.Icon

@Suppress("UnstableApiUsage")
object SquirrelFileType : LanguageFileType(SquirrelLanguage) {
	override fun getName(): @NonNls String = "Squirrel File"

	override fun getDescription(): @Label String = "Squirrel scripting language file"

	override fun getDefaultExtension(): @NlsSafe String = "nut"

	override fun getIcon(): Icon = CssIcons.SQUIRREL_FILE
}
