package com.enderzombi102.css.lang.squirrel

import com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class SquirrelSyntaxHighlighter : SyntaxHighlighterBase() {
	override fun getHighlightingLexer(): Lexer = SquirrelLexerAdapter()

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
			T_LINE_COMMENT -> LINE_COMMENT_KEYS
			T_BLOCK_COMMENT -> BLOCK_COMMENT_KEYS
			T_STRING_BLOCK, T_STRING -> STRING_KEYS
			T_COLON, T_COLONCOLON, T_DOT -> DOT_KEYS
			T_INTEGER, T_FLOAT -> NUMBER_KEYS
			else -> EMPTY_KEYS
		}
	}

	companion object {
		private val KEYWORDS = listOf( T_BREAK, T_CASE, T_CATCH, T_CLASS, T_CLONE, T_CONTINUE, T_CONST, T_DEFAULT, T_DELEGATE, T_DELETE, T_ELSE, T_ENUM, T_EXTENDS, T_FOR, T_FOREACH, T_FUNCTION, T_IF, T_IN, T_DO, T_LOCAL, T_NULL, T_RESUME, T_RETURN, T_SWITCH, T_THIS, T_THROW, T_TRY, T_TYPEOF, T_WHILE, T_PARENT, T_YIELD, T_CONSTRUCTOR, T_CONSTRUCTOR, T_VARGC )
		private val OPERATORS = listOf( T_NOT, T_NOT_EQ, T_COND_AND, T_COND_OR, T_EQ, T_LESS, T_LESS_OR_EQUAL, T_GREATER, T_GREATER_OR_EQUAL, T_PLUS, T_PLUS_ASSIGN, T_MINUS, T_MINUS_ASSIGN, T_QUOTIENT, T_QUOTIENT_ASSIGN, T_MUL, T_MUL_ASSIGN, T_REMAINDER, T_REMAINDER_ASSIGN, T_PLUS_PLUS, T_MINUS_MINUS, T_SEND_CHANNEL, T_ASSIGN, T_BIT_AND, T_BIT_XOR, T_BIT_OR, T_TILDE, T_SHIFT_RIGHT, T_SHIFT_LEFT, T_SHIFT_SHIFT_RIGHT )

		private val BLOCK_COMMENT = createTextAttributesKey( "SQUIRREL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT )
		private val LINE_COMMENT = createTextAttributesKey( "SQUIRREL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT )
		private val OPERATION_SIGN = createTextAttributesKey( "SQUIRREL_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN )
		private val BRACES = createTextAttributesKey( "SQUIRREL_BRACES", DefaultLanguageHighlighterColors.BRACES )
		private val SEMICOLON = createTextAttributesKey( "SQUIRREL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON )
		private val COMMA = createTextAttributesKey( "SQUIRREL_COMMA", DefaultLanguageHighlighterColors.COMMA )
		private val PARENTHESES = createTextAttributesKey( "SQUIRREL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES )
		private val BRACKETS = createTextAttributesKey( "SQUIRREL_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS )
		private val IDENTIFIER = createTextAttributesKey( "SQUIRREL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER )
		private val STRING = createTextAttributesKey( "SQUIRREL_STRING", DefaultLanguageHighlighterColors.STRING )
		private val NUMBER = createTextAttributesKey( "SQUIRREL_NUMBER", DefaultLanguageHighlighterColors.NUMBER )
		private val KEYWORD = createTextAttributesKey( "SQUIRREL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD )
		private val DOT = createTextAttributesKey( "SQUIRREL_DOT", DefaultLanguageHighlighterColors.DOT )
		private val BAD_CHARACTER = createTextAttributesKey( "SQUIRREL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER )

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
