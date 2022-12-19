// This is a generated file. Not intended for manual editing.
package com.enderzombi102.css.lang.squirrel.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.enderzombi102.css.lang.squirrel.psi.impl.*;

public interface SquirrelElementTypes {

  IElementType ARGS = new SquirrelElementType("ARGS");
  IElementType ARRAY = new SquirrelElementType("ARRAY");
  IElementType BLOCK = new SquirrelElementType("BLOCK");
  IElementType CASE = new SquirrelElementType("CASE");
  IElementType CLASS_DECL = new SquirrelElementType("CLASS_DECL");
  IElementType CLASS_EXPR = new SquirrelElementType("CLASS_EXPR");
  IElementType CLONE = new SquirrelElementType("CLONE");
  IElementType CONST = new SquirrelElementType("CONST");
  IElementType DELEGATE = new SquirrelElementType("DELEGATE");
  IElementType DELETE = new SquirrelElementType("DELETE");
  IElementType DEREF_EXPR = new SquirrelElementType("DEREF_EXPR");
  IElementType DOWHILE = new SquirrelElementType("DOWHILE");
  IElementType ENUM = new SquirrelElementType("ENUM");
  IElementType ENUM_VALUE = new SquirrelElementType("ENUM_VALUE");
  IElementType EXPR = new SquirrelElementType("EXPR");
  IElementType EXPR_ACCESS = new SquirrelElementType("EXPR_ACCESS");
  IElementType EXPR_AND_IN = new SquirrelElementType("EXPR_AND_IN");
  IElementType EXPR_ASSIGN = new SquirrelElementType("EXPR_ASSIGN");
  IElementType EXPR_BIN_AND = new SquirrelElementType("EXPR_BIN_AND");
  IElementType EXPR_BIN_OR = new SquirrelElementType("EXPR_BIN_OR");
  IElementType EXPR_BIN_XOR = new SquirrelElementType("EXPR_BIN_XOR");
  IElementType EXPR_CALL = new SquirrelElementType("EXPR_CALL");
  IElementType EXPR_COMMA = new SquirrelElementType("EXPR_COMMA");
  IElementType EXPR_COMPAR = new SquirrelElementType("EXPR_COMPAR");
  IElementType EXPR_EQ_NEQ = new SquirrelElementType("EXPR_EQ_NEQ");
  IElementType EXPR_FACTOR = new SquirrelElementType("EXPR_FACTOR");
  IElementType EXPR_GROUPED = new SquirrelElementType("EXPR_GROUPED");
  IElementType EXPR_LIST = new SquirrelElementType("EXPR_LIST");
  IElementType EXPR_OR = new SquirrelElementType("EXPR_OR");
  IElementType EXPR_PRIMARY = new SquirrelElementType("EXPR_PRIMARY");
  IElementType EXPR_SHIFT = new SquirrelElementType("EXPR_SHIFT");
  IElementType EXPR_TERM = new SquirrelElementType("EXPR_TERM");
  IElementType EXPR_TERNARY = new SquirrelElementType("EXPR_TERNARY");
  IElementType EXPR_UNARY = new SquirrelElementType("EXPR_UNARY");
  IElementType FOR = new SquirrelElementType("FOR");
  IElementType FOREACH = new SquirrelElementType("FOREACH");
  IElementType FUNC_BODY = new SquirrelElementType("FUNC_BODY");
  IElementType FUNC_DECL = new SquirrelElementType("FUNC_DECL");
  IElementType FUNC_EXPR = new SquirrelElementType("FUNC_EXPR");
  IElementType FUNC_NAME = new SquirrelElementType("FUNC_NAME");
  IElementType IDENTIFIER = new SquirrelElementType("IDENTIFIER");
  IElementType IFELSE = new SquirrelElementType("IFELSE");
  IElementType INITZ = new SquirrelElementType("INITZ");
  IElementType LOCAL_DECL = new SquirrelElementType("LOCAL_DECL");
  IElementType MEMBER_DECL = new SquirrelElementType("MEMBER_DECL");
  IElementType PRIMITIVE = new SquirrelElementType("PRIMITIVE");
  IElementType RETURN = new SquirrelElementType("RETURN");
  IElementType STATEMENT = new SquirrelElementType("STATEMENT");
  IElementType SWITCH = new SquirrelElementType("SWITCH");
  IElementType TABLE_DECL = new SquirrelElementType("TABLE_DECL");
  IElementType THROW = new SquirrelElementType("THROW");
  IElementType TRYCATCH = new SquirrelElementType("TRYCATCH");
  IElementType TSLOTS = new SquirrelElementType("TSLOTS");
  IElementType WHILE = new SquirrelElementType("WHILE");
  IElementType YIELD = new SquirrelElementType("YIELD");

  IElementType T_ASSIGN = new SquirrelTokenType("=");
  IElementType T_AT_DQUOTE = new SquirrelTokenType("@\"");
  IElementType T_BIT_AND = new SquirrelTokenType("&");
  IElementType T_BIT_OR = new SquirrelTokenType("|");
  IElementType T_BIT_XOR = new SquirrelTokenType("^");
  IElementType T_BLOCK_COMMENT = new SquirrelTokenType("t_block_comment");
  IElementType T_BREAK = new SquirrelTokenType("break");
  IElementType T_CASE = new SquirrelTokenType("case");
  IElementType T_CATCH = new SquirrelTokenType("catch");
  IElementType T_CLASS = new SquirrelTokenType("class");
  IElementType T_CLONE = new SquirrelTokenType("clone");
  IElementType T_COLON = new SquirrelTokenType(":");
  IElementType T_COLONCOLON = new SquirrelTokenType("::");
  IElementType T_COMMA = new SquirrelTokenType(",");
  IElementType T_COND_AND = new SquirrelTokenType("&&");
  IElementType T_COND_OR = new SquirrelTokenType("||");
  IElementType T_CONST = new SquirrelTokenType("const");
  IElementType T_CONSTRUCTOR = new SquirrelTokenType("instanceof");
  IElementType T_CONTINUE = new SquirrelTokenType("continue");
  IElementType T_DEFAULT = new SquirrelTokenType("default");
  IElementType T_DELEGATE = new SquirrelTokenType("delegate");
  IElementType T_DELETE = new SquirrelTokenType("delete");
  IElementType T_DO = new SquirrelTokenType("do");
  IElementType T_DOT = new SquirrelTokenType(".");
  IElementType T_DOTDOTDOT = new SquirrelTokenType("...");
  IElementType T_DQUOTE = new SquirrelTokenType("\"");
  IElementType T_ELSE = new SquirrelTokenType("else");
  IElementType T_ENUM = new SquirrelTokenType("enum");
  IElementType T_EQ = new SquirrelTokenType("==");
  IElementType T_EXTENDS = new SquirrelTokenType("extends");
  IElementType T_FLOAT = new SquirrelTokenType("t_float");
  IElementType T_FOR = new SquirrelTokenType("for");
  IElementType T_FOREACH = new SquirrelTokenType("foreach");
  IElementType T_FUNCTION = new SquirrelTokenType("function");
  IElementType T_GREATER = new SquirrelTokenType(">");
  IElementType T_GREATER_OR_EQUAL = new SquirrelTokenType(">=");
  IElementType T_IDENT = new SquirrelTokenType("t_ident");
  IElementType T_IF = new SquirrelTokenType("if");
  IElementType T_IN = new SquirrelTokenType("in");
  IElementType T_INTEGER = new SquirrelTokenType("t_integer");
  IElementType T_LBRACE = new SquirrelTokenType("{");
  IElementType T_LBRACK = new SquirrelTokenType("[");
  IElementType T_LESS = new SquirrelTokenType("<");
  IElementType T_LESS_OR_EQUAL = new SquirrelTokenType("<=");
  IElementType T_LINE_COMMENT = new SquirrelTokenType("t_line_comment");
  IElementType T_LOCAL = new SquirrelTokenType("local");
  IElementType T_LPAREN = new SquirrelTokenType("(");
  IElementType T_MINUS = new SquirrelTokenType("-");
  IElementType T_MINUS_ASSIGN = new SquirrelTokenType("-=");
  IElementType T_MINUS_MINUS = new SquirrelTokenType("--");
  IElementType T_MUL = new SquirrelTokenType("*");
  IElementType T_MUL_ASSIGN = new SquirrelTokenType("*=");
  IElementType T_NEWLINE = new SquirrelTokenType("t_NEWLINE");
  IElementType T_NOT = new SquirrelTokenType("!");
  IElementType T_NOT_EQ = new SquirrelTokenType("!=");
  IElementType T_NULL = new SquirrelTokenType("null");
  IElementType T_PARENT = new SquirrelTokenType("parent");
  IElementType T_PLUS = new SquirrelTokenType("+");
  IElementType T_PLUS_ASSIGN = new SquirrelTokenType("+=");
  IElementType T_PLUS_PLUS = new SquirrelTokenType("++");
  IElementType T_QUESTION = new SquirrelTokenType("?");
  IElementType T_QUOTIENT = new SquirrelTokenType("/");
  IElementType T_QUOTIENT_ASSIGN = new SquirrelTokenType("/=");
  IElementType T_RBRACE = new SquirrelTokenType("}");
  IElementType T_RBRACK = new SquirrelTokenType("]");
  IElementType T_REMAINDER = new SquirrelTokenType("%");
  IElementType T_REMAINDER_ASSIGN = new SquirrelTokenType("%=");
  IElementType T_RESUME = new SquirrelTokenType("resume");
  IElementType T_RETURN = new SquirrelTokenType("return");
  IElementType T_RPAREN = new SquirrelTokenType(")");
  IElementType T_SEMICOLON = new SquirrelTokenType(";");
  IElementType T_SEND_CHANNEL = new SquirrelTokenType("<-");
  IElementType T_SHIFT_LEFT = new SquirrelTokenType("<<");
  IElementType T_SHIFT_RIGHT = new SquirrelTokenType(">>");
  IElementType T_SHIFT_SHIFT_RIGHT = new SquirrelTokenType(">>>");
  IElementType T_STRING = new SquirrelTokenType("t_string");
  IElementType T_STRING_BLOCK = new SquirrelTokenType("t_string_block");
  IElementType T_SWITCH = new SquirrelTokenType("switch");
  IElementType T_THIS = new SquirrelTokenType("this");
  IElementType T_THROW = new SquirrelTokenType("throw");
  IElementType T_TILDE = new SquirrelTokenType("~");
  IElementType T_TRY = new SquirrelTokenType("try");
  IElementType T_TYPEOF = new SquirrelTokenType("typeof");
  IElementType T_VARGC = new SquirrelTokenType("vargc");
  IElementType T_WHILE = new SquirrelTokenType("while");
  IElementType T_YIELD = new SquirrelTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGS) {
        return new SquirrelArgsImpl(node);
      }
      else if (type == ARRAY) {
        return new SquirrelArrayImpl(node);
      }
      else if (type == BLOCK) {
        return new SquirrelBlockImpl(node);
      }
      else if (type == CASE) {
        return new SquirrelCaseImpl(node);
      }
      else if (type == CLASS_DECL) {
        return new SquirrelClassDeclImpl(node);
      }
      else if (type == CLASS_EXPR) {
        return new SquirrelClassExprImpl(node);
      }
      else if (type == CLONE) {
        return new SquirrelCloneImpl(node);
      }
      else if (type == CONST) {
        return new SquirrelConstImpl(node);
      }
      else if (type == DELEGATE) {
        return new SquirrelDelegateImpl(node);
      }
      else if (type == DELETE) {
        return new SquirrelDeleteImpl(node);
      }
      else if (type == DEREF_EXPR) {
        return new SquirrelDerefExprImpl(node);
      }
      else if (type == DOWHILE) {
        return new SquirrelDowhileImpl(node);
      }
      else if (type == ENUM) {
        return new SquirrelEnumImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new SquirrelEnumValueImpl(node);
      }
      else if (type == EXPR) {
        return new SquirrelExprImpl(node);
      }
      else if (type == EXPR_ACCESS) {
        return new SquirrelExprAccessImpl(node);
      }
      else if (type == EXPR_AND_IN) {
        return new SquirrelExprAndInImpl(node);
      }
      else if (type == EXPR_ASSIGN) {
        return new SquirrelExprAssignImpl(node);
      }
      else if (type == EXPR_BIN_AND) {
        return new SquirrelExprBinAndImpl(node);
      }
      else if (type == EXPR_BIN_OR) {
        return new SquirrelExprBinOrImpl(node);
      }
      else if (type == EXPR_BIN_XOR) {
        return new SquirrelExprBinXorImpl(node);
      }
      else if (type == EXPR_CALL) {
        return new SquirrelExprCallImpl(node);
      }
      else if (type == EXPR_COMMA) {
        return new SquirrelExprCommaImpl(node);
      }
      else if (type == EXPR_COMPAR) {
        return new SquirrelExprComparImpl(node);
      }
      else if (type == EXPR_EQ_NEQ) {
        return new SquirrelExprEqNeqImpl(node);
      }
      else if (type == EXPR_FACTOR) {
        return new SquirrelExprFactorImpl(node);
      }
      else if (type == EXPR_GROUPED) {
        return new SquirrelExprGroupedImpl(node);
      }
      else if (type == EXPR_LIST) {
        return new SquirrelExprListImpl(node);
      }
      else if (type == EXPR_OR) {
        return new SquirrelExprOrImpl(node);
      }
      else if (type == EXPR_PRIMARY) {
        return new SquirrelExprPrimaryImpl(node);
      }
      else if (type == EXPR_SHIFT) {
        return new SquirrelExprShiftImpl(node);
      }
      else if (type == EXPR_TERM) {
        return new SquirrelExprTermImpl(node);
      }
      else if (type == EXPR_TERNARY) {
        return new SquirrelExprTernaryImpl(node);
      }
      else if (type == EXPR_UNARY) {
        return new SquirrelExprUnaryImpl(node);
      }
      else if (type == FOR) {
        return new SquirrelForImpl(node);
      }
      else if (type == FOREACH) {
        return new SquirrelForeachImpl(node);
      }
      else if (type == FUNC_BODY) {
        return new SquirrelFuncBodyImpl(node);
      }
      else if (type == FUNC_DECL) {
        return new SquirrelFuncDeclImpl(node);
      }
      else if (type == FUNC_EXPR) {
        return new SquirrelFuncExprImpl(node);
      }
      else if (type == FUNC_NAME) {
        return new SquirrelFuncNameImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new SquirrelIdentifierImpl(node);
      }
      else if (type == IFELSE) {
        return new SquirrelIfelseImpl(node);
      }
      else if (type == INITZ) {
        return new SquirrelInitzImpl(node);
      }
      else if (type == LOCAL_DECL) {
        return new SquirrelLocalDeclImpl(node);
      }
      else if (type == MEMBER_DECL) {
        return new SquirrelMemberDeclImpl(node);
      }
      else if (type == PRIMITIVE) {
        return new SquirrelPrimitiveImpl(node);
      }
      else if (type == RETURN) {
        return new SquirrelReturnImpl(node);
      }
      else if (type == STATEMENT) {
        return new SquirrelStatementImpl(node);
      }
      else if (type == SWITCH) {
        return new SquirrelSwitchImpl(node);
      }
      else if (type == TABLE_DECL) {
        return new SquirrelTableDeclImpl(node);
      }
      else if (type == THROW) {
        return new SquirrelThrowImpl(node);
      }
      else if (type == TRYCATCH) {
        return new SquirrelTrycatchImpl(node);
      }
      else if (type == TSLOTS) {
        return new SquirrelTslotsImpl(node);
      }
      else if (type == WHILE) {
        return new SquirrelWhileImpl(node);
      }
      else if (type == YIELD) {
        return new SquirrelYieldImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
