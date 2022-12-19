package com.enderzombi102.css.lang.squirrel.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes.*;

%%

%{
  public _SquirrelLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SquirrelLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

T_BLOCK_COMMENT=("/"\*(.|\n)*?\*"/")
T_LINE_COMMENT=("//".*)
T_WHITE_SPACE=[ \t\n\x0B\f\r]+
T_NEWLINE=\R+
T_IDENT=([a-zA-Z_][a-zA-Z_0-9]*)
T_INTEGER=((0x[0-9A-Fa-f]+)|[1-9][0-9]*|(0[0-7]+)|0|'.')
T_FLOAT=([0-9]+\.([e|E][+|\-]?)?[0-9]+)
T_STRING=\"([^\"\\]|\\.)*\"
T_STRING_BLOCK=@\"(.|\n)*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "break"                { return T_BREAK; }
  "case"                 { return T_CASE; }
  "catch"                { return T_CATCH; }
  "class"                { return T_CLASS; }
  "clone"                { return T_CLONE; }
  "continue"             { return T_CONTINUE; }
  "const"                { return T_CONST; }
  "default"              { return T_DEFAULT; }
  "delegate"             { return T_DELEGATE; }
  "delete"               { return T_DELETE; }
  "else"                 { return T_ELSE; }
  "enum"                 { return T_ENUM; }
  "extends"              { return T_EXTENDS; }
  "for"                  { return T_FOR; }
  "foreach"              { return T_FOREACH; }
  "function"             { return T_FUNCTION; }
  "if"                   { return T_IF; }
  "in"                   { return T_IN; }
  "do"                   { return T_DO; }
  "local"                { return T_LOCAL; }
  "null"                 { return T_NULL; }
  "resume"               { return T_RESUME; }
  "return"               { return T_RETURN; }
  "switch"               { return T_SWITCH; }
  "this"                 { return T_THIS; }
  "throw"                { return T_THROW; }
  "try"                  { return T_TRY; }
  "typeof"               { return T_TYPEOF; }
  "while"                { return T_WHILE; }
  "parent"               { return T_PARENT; }
  "yield"                { return T_YIELD; }
  "instanceof"           { return T_CONSTRUCTOR; }
  "vargc"                { return T_VARGC; }
  "!"                    { return T_NOT; }
  "!="                   { return T_NOT_EQ; }
  "||"                   { return T_COND_OR; }
  "=="                   { return T_EQ; }
  "&&"                   { return T_COND_AND; }
  "<"                    { return T_LESS; }
  "<="                   { return T_LESS_OR_EQUAL; }
  ">"                    { return T_GREATER; }
  ">="                   { return T_GREATER_OR_EQUAL; }
  "+"                    { return T_PLUS; }
  "+="                   { return T_PLUS_ASSIGN; }
  "-"                    { return T_MINUS; }
  "-="                   { return T_MINUS_ASSIGN; }
  "/"                    { return T_QUOTIENT; }
  "/="                   { return T_QUOTIENT_ASSIGN; }
  "*"                    { return T_MUL; }
  "*="                   { return T_MUL_ASSIGN; }
  "%"                    { return T_REMAINDER; }
  "%="                   { return T_REMAINDER_ASSIGN; }
  "++"                   { return T_PLUS_PLUS; }
  "--"                   { return T_MINUS_MINUS; }
  "<-"                   { return T_SEND_CHANNEL; }
  "="                    { return T_ASSIGN; }
  "&"                    { return T_BIT_AND; }
  "^"                    { return T_BIT_XOR; }
  "|"                    { return T_BIT_OR; }
  "~"                    { return T_TILDE; }
  ">>"                   { return T_SHIFT_RIGHT; }
  "<<"                   { return T_SHIFT_LEFT; }
  ">>>"                  { return T_SHIFT_SHIFT_RIGHT; }
  "{"                    { return T_LBRACE; }
  "}"                    { return T_RBRACE; }
  "["                    { return T_LBRACK; }
  "]"                    { return T_RBRACK; }
  "("                    { return T_LPAREN; }
  ")"                    { return T_RPAREN; }
  ","                    { return T_COMMA; }
  "."                    { return T_DOT; }
  "..."                  { return T_DOTDOTDOT; }
  ":"                    { return T_COLON; }
  "::"                   { return T_COLONCOLON; }
  ";"                    { return T_SEMICOLON; }
  "?"                    { return T_QUESTION; }
  "\""                   { return T_DQUOTE; }
  "@\""                  { return T_AT_DQUOTE; }

  {T_BLOCK_COMMENT}      { return T_BLOCK_COMMENT; }
  {T_LINE_COMMENT}       { return T_LINE_COMMENT; }
  {T_WHITE_SPACE}        { return T_WHITE_SPACE; }
  {T_NEWLINE}            { return T_NEWLINE; }
  {T_IDENT}              { return T_IDENT; }
  {T_INTEGER}            { return T_INTEGER; }
  {T_FLOAT}              { return T_FLOAT; }
  {T_STRING}             { return T_STRING; }
  {T_STRING_BLOCK}       { return T_STRING_BLOCK; }

}

[^] { return BAD_CHARACTER; }
