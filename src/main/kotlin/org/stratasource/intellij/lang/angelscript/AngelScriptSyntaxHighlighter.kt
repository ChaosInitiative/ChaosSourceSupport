package com.enderzombi102.css.lang.angelscript

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptElementTypes.*

class AngelScriptSyntaxHighlighter : SyntaxHighlighterBase() {
	override fun getHighlightingLexer(): Lexer = AngelScriptLexerAdapter()

	override fun getTokenHighlights( tokenType: IElementType ): Array<TextAttributesKey> {
		return when ( tokenType ) {
			in KEYWORDS -> KEYWORD_KEYS
			T_IDENT -> IDENTIFIER_KEYS
			T_RPAREN, T_LPAREN -> PARENTHESES_KEYS
			T_COMMA -> COMMA_KEYS
			T_SEMICOLON -> SEMICOLON_KEYS
			T_LBRACE, T_RBRACE -> BRACES_KEYS
			T_LBRACK, T_RBRACK -> BRACKETS_KEYS
			in OPERATORS -> OPERATION_SIGN_KEYS
			T_LINE_COMMENT, T_PRE_COMMENT -> LINE_COMMENT_KEYS
			T_ELIF_COMMENT, T_BLOCK_COMMENT -> BLOCK_COMMENT_KEYS
			T_STRING_BLOCK, T_STRING_SINGLE, T_STRING_DOUBLE -> STRING_KEYS
			T_COLON, T_COLONCOLON, T_DOT -> DOT_KEYS
			T_NUMB, T_BITS, T_NUMB_2 -> NUMBER_KEYS
			else -> EMPTY_KEYS
		}
	}

	companion object {
		private val KEYWORDS = listOf( T_FUNCTION, T_FALSE, T_TRUE, T_ABSTRACT, T_AND_TEXT, T_AUTO, T_BOOL, T_BREAK, T_CASE, T_CAST, T_CLASS, T_CONST, T_CONTINUE, T_DEFAULT, T_DO, T_DOUBLE, T_ELSE, T_ENUM, T_EXPLICIT, T_EXTERNAL, T_FALSE, T_FINAL, T_FLOAT, T_FOR, T_FROM, T_FUNCDEF, T_FUNCTION, T_IF, T_IMPORT, T_IN, T_INOUT, T_INT, T_INT8, T_INT16, T_INT32, T_INT64, T_INTERFACE, T_IS, T_MIXIN, T_NAMESPACE, T_NULL, T_OR_TEXT, T_OUT, T_OVERRIDE, T_PRIVATE, T_PROPERTY, T_PROTECTED, T_RETURN, T_SHARED, T_STRUCT, T_SWITCH, T_TRUE, T_TRY, T_TYPEDEF, T_UINT, T_UINT8, T_UINT16, T_UINT32, T_UINT64, T_VOID, T_WHILE, T_XOR_TEST )
		private val OPERATORS = listOf( T_ASSIGN, T_AT, T_BIT_AND, T_BIT_AND_ASSIGN, T_BIT_CLEAR, T_BIT_CLEAR_ASSIGN, T_BIT_OR, T_BIT_OR_ASSIGN, T_BIT_XOR, T_BIT_XOR_ASSIGN, T_COND_AND, T_COND_OR, T_EQ, T_EXPONENT, T_EXP_ASSIGN, T_GREATER, T_GREATER_OR_EQUAL, T_LESS, T_LESS_OR_EQUAL, T_LOGIC_XOR, T_MINUS, T_MINUS_ASSIGN, T_MINUS_MINUS, T_MUL, T_MUL_ASSIGN, T_NOT, T_NOT_EQ, T_PLUS, T_PLUS_ASSIGN, T_PLUS_PLUS, T_QUEST, T_QUOTIENT, T_QUOTIENT_ASSIGN, T_REMAINDER, T_REMAINDER_ASSIGN, T_SEND_CHANNEL, T_SHIFT_LEFT_ASSIGN, T_SHIFT_RIGHT_ASSIGN, T_SHIFT_SHIFT_RIGHT_ASSIN, T_TILDE, T_TRIPLE_DOT, T_VAR_ASSIGN )

		@JvmField val BLOCK_COMMENT = createTextAttributesKey( "ANGELSCRIPT_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT )
		@JvmField val LINE_COMMENT = createTextAttributesKey( "ANGELSCRIPT_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT )
		@JvmField val OPERATION_SIGN = createTextAttributesKey( "ANGELSCRIPT_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN )
		@JvmField val BRACES = createTextAttributesKey( "ANGELSCRIPT_BRACES", DefaultLanguageHighlighterColors.BRACES )
		@JvmField val SEMICOLON = createTextAttributesKey( "ANGELSCRIPT_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON )
		@JvmField val COMMA = createTextAttributesKey( "ANGELSCRIPT_COMMA", DefaultLanguageHighlighterColors.COMMA )
		@JvmField val PARENTHESES = createTextAttributesKey( "ANGELSCRIPT_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES )
		@JvmField val BRACKETS = createTextAttributesKey( "ANGELSCRIPT_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS )
		@JvmField val IDENTIFIER = createTextAttributesKey( "ANGELSCRIPT_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER )
		@JvmField val STRING = createTextAttributesKey( "ANGELSCRIPT_STRING", DefaultLanguageHighlighterColors.STRING )
		@JvmField val NUMBER = createTextAttributesKey( "ANGELSCRIPT_NUMBER", DefaultLanguageHighlighterColors.NUMBER )
		@JvmField val KEYWORD = createTextAttributesKey( "ANGELSCRIPT_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD )
		@JvmField val DOT = createTextAttributesKey( "ANGELSCRIPT_DOT", DefaultLanguageHighlighterColors.DOT )
		@JvmField val BAD_CHARACTER = createTextAttributesKey( "ANGELSCRIPT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER )

		private val DOT_KEYS = arrayOf( DOT )
		private val IDENTIFIER_KEYS = arrayOf( IDENTIFIER )
		private val PARENTHESES_KEYS = arrayOf( PARENTHESES )
		private val COMMA_KEYS = arrayOf( COMMA )
		private val SEMICOLON_KEYS = arrayOf( SEMICOLON )
		private val BRACES_KEYS = arrayOf( BRACES )
		private val BRACKETS_KEYS = arrayOf( BRACKETS )
		private val OPERATION_SIGN_KEYS = arrayOf( OPERATION_SIGN )
		private val LINE_COMMENT_KEYS = arrayOf( LINE_COMMENT )
		private val BLOCK_COMMENT_KEYS = arrayOf( BLOCK_COMMENT )
		private val STRING_KEYS = arrayOf( STRING )
		private val NUMBER_KEYS = arrayOf( NUMBER )
		private val BAD_CHAR_KEYS = arrayOf( BAD_CHARACTER )
		private val KEYWORD_KEYS = arrayOf( KEYWORD )
		private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
	}
}
