package com.enderzombi102.css.lang.angelscript

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.enderzombi102.css.ChaosSourceSupportIcons
import javax.swing.Icon

class AngelScriptColorSettingsPage : ColorSettingsPage {
	override fun getIcon(): Icon = ChaosSourceSupportIcons.AS_FILE

	override fun getHighlighter(): SyntaxHighlighter = AngelScriptSyntaxHighlighter()

	override fun getDemoText(): String = """
			// line comment
			/*
				Block comment
			*/
			[Setting foo = "abc123"]
			class MyClass {
			  void myMethod() {
				print("In MyClass::myMethod()\n");
				array<string> @args = myUtil.getCommandLineArgs();
				bool bar = (a || b) >>> c + Foo::doBaz(5.0, 3.0);
			  }
			}
			"""

	override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null

	override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

	override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

	override fun getDisplayName(): String = "AngelScript"

	companion object {
		private val DESCRIPTORS = arrayOf(
			AttributesDescriptor("Bad character", AngelScriptSyntaxHighlighter.BAD_CHARACTER),
			AttributesDescriptor("Dot", AngelScriptSyntaxHighlighter.DOT),
			AttributesDescriptor("Identifier", AngelScriptSyntaxHighlighter.IDENTIFIER),
			AttributesDescriptor("Parentheses", AngelScriptSyntaxHighlighter.PARENTHESES),
			AttributesDescriptor("Comma", AngelScriptSyntaxHighlighter.COMMA),
			AttributesDescriptor("Semicolon", AngelScriptSyntaxHighlighter.SEMICOLON),
			AttributesDescriptor("Braces", AngelScriptSyntaxHighlighter.BRACES),
			AttributesDescriptor("Brackets", AngelScriptSyntaxHighlighter.BRACKETS),
			AttributesDescriptor("Operation", AngelScriptSyntaxHighlighter.OPERATION_SIGN),
			AttributesDescriptor("Line comment", AngelScriptSyntaxHighlighter.LINE_COMMENT),
			AttributesDescriptor("Block comment", AngelScriptSyntaxHighlighter.BLOCK_COMMENT),
			AttributesDescriptor("String", AngelScriptSyntaxHighlighter.STRING),
			AttributesDescriptor("Number", AngelScriptSyntaxHighlighter.NUMBER),
			AttributesDescriptor("Keyword", AngelScriptSyntaxHighlighter.KEYWORD)
		)
	}
}