// This is a generated file. Not intended for manual editing.
package com.enderzombi102.css.lang.squirrel.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes.*;
import static com.enderzombi102.css.lang.squirrel.parser.SquirrelParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SquirrelParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return STATEMENTS(b, l + 1);
  }

  /* ********************************************************** */
  // ( IDENTIFIER ( ',' IDENTIFIER )* )?
  public static boolean ARGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARGS, "<args>");
    ARGS_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // IDENTIFIER ( ',' IDENTIFIER )*
  private static boolean ARGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && ARGS_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' IDENTIFIER )*
  private static boolean ARGS_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ARGS_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ARGS_0_1", c)) break;
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean ARGS_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGS_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && IDENTIFIER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' EXPR_LIST? ']'
  public static boolean ARRAY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY")) return false;
    if (!nextTokenIs(b, T_LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACK);
    r = r && ARRAY_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACK);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // EXPR_LIST?
  private static boolean ARRAY_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_1")) return false;
    EXPR_LIST(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' ( STATEMENT ( ';' | t_NEWLINE ) )* STATEMENT? '}'
  public static boolean BLOCK(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLOCK")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    r = consumeToken(b, T_LBRACE);
    r = r && BLOCK_1(b, l + 1);
    r = r && BLOCK_2(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, l, m, r, false, SquirrelParser::statements_recover);
    return r;
  }

  // ( STATEMENT ( ';' | t_NEWLINE ) )*
  private static boolean BLOCK_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLOCK_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BLOCK_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BLOCK_1", c)) break;
    }
    return true;
  }

  // STATEMENT ( ';' | t_NEWLINE )
  private static boolean BLOCK_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLOCK_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = STATEMENT(b, l + 1);
    r = r && BLOCK_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | t_NEWLINE
  private static boolean BLOCK_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLOCK_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, T_SEMICOLON);
    if (!r) r = consumeToken(b, T_NEWLINE);
    return r;
  }

  // STATEMENT?
  private static boolean BLOCK_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BLOCK_2")) return false;
    STATEMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( ( 'case' EXPR ) | 'default' ) ':' STATEMENT*
  public static boolean CASE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CASE")) return false;
    if (!nextTokenIs(b, "<case>", T_CASE, T_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE, "<case>");
    r = CASE_0(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && CASE_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( 'case' EXPR ) | 'default'
  private static boolean CASE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CASE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CASE_0_0(b, l + 1);
    if (!r) r = consumeToken(b, T_DEFAULT);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'case' EXPR
  private static boolean CASE_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CASE_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CASE);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STATEMENT*
  private static boolean CASE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CASE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!STATEMENT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CASE_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'class' DEREF_EXPR ( 'extends' DEREF_EXPR )? '{' MEMBER_DECL* '}'
  public static boolean CLASS_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECL")) return false;
    if (!nextTokenIs(b, T_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLASS);
    r = r && DEREF_EXPR(b, l + 1);
    r = r && CLASS_DECL_2(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && CLASS_DECL_4(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, CLASS_DECL, r);
    return r;
  }

  // ( 'extends' DEREF_EXPR )?
  private static boolean CLASS_DECL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECL_2")) return false;
    CLASS_DECL_2_0(b, l + 1);
    return true;
  }

  // 'extends' DEREF_EXPR
  private static boolean CLASS_DECL_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECL_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXTENDS);
    r = r && DEREF_EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MEMBER_DECL*
  private static boolean CLASS_DECL_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_DECL_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MEMBER_DECL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CLASS_DECL_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'class' ( 'extends' DEREF_EXPR )? '{' MEMBER_DECL* '}'
  public static boolean CLASS_EXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_EXPR")) return false;
    if (!nextTokenIs(b, T_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLASS);
    r = r && CLASS_EXPR_1(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && CLASS_EXPR_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, CLASS_EXPR, r);
    return r;
  }

  // ( 'extends' DEREF_EXPR )?
  private static boolean CLASS_EXPR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_EXPR_1")) return false;
    CLASS_EXPR_1_0(b, l + 1);
    return true;
  }

  // 'extends' DEREF_EXPR
  private static boolean CLASS_EXPR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_EXPR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_EXTENDS);
    r = r && DEREF_EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MEMBER_DECL*
  private static boolean CLASS_EXPR_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_EXPR_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MEMBER_DECL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CLASS_EXPR_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'clone' EXPR
  public static boolean CLONE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLONE")) return false;
    if (!nextTokenIs(b, T_CLONE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CLONE);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, CLONE, r);
    return r;
  }

  /* ********************************************************** */
  // 'const' IDENTIFIER '=' PRIMITIVE
  public static boolean CONST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONST")) return false;
    if (!nextTokenIs(b, T_CONST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONST);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_ASSIGN);
    r = r && PRIMITIVE(b, l + 1);
    exit_section_(b, m, CONST, r);
    return r;
  }

  /* ********************************************************** */
  // 'delegate' EXPR ':' EXPR
  public static boolean DELEGATE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DELEGATE")) return false;
    if (!nextTokenIs(b, T_DELEGATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DELEGATE);
    r = r && EXPR(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, DELEGATE, r);
    return r;
  }

  /* ********************************************************** */
  // 'delete' DEREF_EXPR
  public static boolean DELETE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DELETE")) return false;
    if (!nextTokenIs(b, T_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DELETE);
    r = r && DEREF_EXPR(b, l + 1);
    exit_section_(b, m, DELETE, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ( '.' IDENTIFIER )* | '::' IDENTIFIER
  public static boolean DEREF_EXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEREF_EXPR")) return false;
    if (!nextTokenIs(b, "<deref expr>", T_COLONCOLON, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEREF_EXPR, "<deref expr>");
    r = DEREF_EXPR_0(b, l + 1);
    if (!r) r = DEREF_EXPR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER ( '.' IDENTIFIER )*
  private static boolean DEREF_EXPR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEREF_EXPR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && DEREF_EXPR_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '.' IDENTIFIER )*
  private static boolean DEREF_EXPR_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEREF_EXPR_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DEREF_EXPR_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DEREF_EXPR_0_1", c)) break;
    }
    return true;
  }

  // '.' IDENTIFIER
  private static boolean DEREF_EXPR_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEREF_EXPR_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOT);
    r = r && IDENTIFIER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::' IDENTIFIER
  private static boolean DEREF_EXPR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEREF_EXPR_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLONCOLON);
    r = r && IDENTIFIER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'do' STATEMENT 'while' EXPR_GROUPED
  public static boolean DOWHILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOWHILE")) return false;
    if (!nextTokenIs(b, T_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DO);
    r = r && STATEMENT(b, l + 1);
    r = r && consumeToken(b, T_WHILE);
    r = r && EXPR_GROUPED(b, l + 1);
    exit_section_(b, m, DOWHILE, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' IDENTIFIER '{' ENUM_VALUE* '}'
  public static boolean ENUM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM")) return false;
    if (!nextTokenIs(b, T_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ENUM);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && ENUM_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, ENUM, r);
    return r;
  }

  // ENUM_VALUE*
  private static boolean ENUM_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ENUM_VALUE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ENUM_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( IDENTIFIER '=' PRIMITIVE ) ','?
  public static boolean ENUM_VALUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_VALUE")) return false;
    if (!nextTokenIs(b, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ENUM_VALUE_0(b, l + 1);
    r = r && ENUM_VALUE_1(b, l + 1);
    exit_section_(b, m, ENUM_VALUE, r);
    return r;
  }

  // IDENTIFIER '=' PRIMITIVE
  private static boolean ENUM_VALUE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_VALUE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_ASSIGN);
    r = r && PRIMITIVE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ENUM_VALUE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ENUM_VALUE_1")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // EXPR_COMMA | DELETE | CLONE | DELEGATE
  public static boolean EXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = EXPR_COMMA(b, l + 1);
    if (!r) r = DELETE(b, l + 1);
    if (!r) r = CLONE(b, l + 1);
    if (!r) r = DELEGATE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXPR_PRIMARY ( '.' EXPR_ACCESS )?
  public static boolean EXPR_ACCESS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ACCESS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_ACCESS, "<expr access>");
    r = EXPR_PRIMARY(b, l + 1);
    r = r && EXPR_ACCESS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '.' EXPR_ACCESS )?
  private static boolean EXPR_ACCESS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ACCESS_1")) return false;
    EXPR_ACCESS_1_0(b, l + 1);
    return true;
  }

  // '.' EXPR_ACCESS
  private static boolean EXPR_ACCESS_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ACCESS_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_DOT);
    r = r && EXPR_ACCESS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_BIN_OR ( ( '&&' | 'in' ) EXPR )?
  public static boolean EXPR_AND_IN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_AND_IN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_AND_IN, "<expr and in>");
    r = EXPR_BIN_OR(b, l + 1);
    r = r && EXPR_AND_IN_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '&&' | 'in' ) EXPR )?
  private static boolean EXPR_AND_IN_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_AND_IN_1")) return false;
    EXPR_AND_IN_1_0(b, l + 1);
    return true;
  }

  // ( '&&' | 'in' ) EXPR
  private static boolean EXPR_AND_IN_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_AND_IN_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_AND_IN_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&&' | 'in'
  private static boolean EXPR_AND_IN_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_AND_IN_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_COND_AND);
    if (!r) r = consumeToken(b, T_IN);
    return r;
  }

  /* ********************************************************** */
  // ( DEREF_EXPR ( '=' | '<-' ) )? EXPR_TERNARY
  public static boolean EXPR_ASSIGN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ASSIGN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_ASSIGN, "<expr assign>");
    r = EXPR_ASSIGN_0(b, l + 1);
    r = r && EXPR_TERNARY(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( DEREF_EXPR ( '=' | '<-' ) )?
  private static boolean EXPR_ASSIGN_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ASSIGN_0")) return false;
    EXPR_ASSIGN_0_0(b, l + 1);
    return true;
  }

  // DEREF_EXPR ( '=' | '<-' )
  private static boolean EXPR_ASSIGN_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ASSIGN_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DEREF_EXPR(b, l + 1);
    r = r && EXPR_ASSIGN_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' | '<-'
  private static boolean EXPR_ASSIGN_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_ASSIGN_0_0_1")) return false;
    boolean r;
    r = consumeToken(b, T_ASSIGN);
    if (!r) r = consumeToken(b, T_SEND_CHANNEL);
    return r;
  }

  /* ********************************************************** */
  // EXPR_EQ_NEQ ( '&' EXPR )?
  public static boolean EXPR_BIN_AND(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_AND")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_BIN_AND, "<expr bin and>");
    r = EXPR_EQ_NEQ(b, l + 1);
    r = r && EXPR_BIN_AND_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '&' EXPR )?
  private static boolean EXPR_BIN_AND_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_AND_1")) return false;
    EXPR_BIN_AND_1_0(b, l + 1);
    return true;
  }

  // '&' EXPR
  private static boolean EXPR_BIN_AND_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_AND_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BIT_AND);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_BIN_XOR ( '|' EXPR )?
  public static boolean EXPR_BIN_OR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_OR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_BIN_OR, "<expr bin or>");
    r = EXPR_BIN_XOR(b, l + 1);
    r = r && EXPR_BIN_OR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '|' EXPR )?
  private static boolean EXPR_BIN_OR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_OR_1")) return false;
    EXPR_BIN_OR_1_0(b, l + 1);
    return true;
  }

  // '|' EXPR
  private static boolean EXPR_BIN_OR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_OR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BIT_OR);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_BIN_AND ( '^' EXPR )?
  public static boolean EXPR_BIN_XOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_XOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_BIN_XOR, "<expr bin xor>");
    r = EXPR_BIN_AND(b, l + 1);
    r = r && EXPR_BIN_XOR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '^' EXPR )?
  private static boolean EXPR_BIN_XOR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_XOR_1")) return false;
    EXPR_BIN_XOR_1_0(b, l + 1);
    return true;
  }

  // '^' EXPR
  private static boolean EXPR_BIN_XOR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_BIN_XOR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_BIT_XOR);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEREF_EXPR '(' EXPR_LIST? ')'
  public static boolean EXPR_CALL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_CALL")) return false;
    if (!nextTokenIs(b, "<expr call>", T_COLONCOLON, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_CALL, "<expr call>");
    r = DEREF_EXPR(b, l + 1);
    r = r && consumeToken(b, T_LPAREN);
    r = r && EXPR_CALL_2(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // EXPR_LIST?
  private static boolean EXPR_CALL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_CALL_2")) return false;
    EXPR_LIST(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EXPR_ASSIGN ( ',' EXPR )?
  public static boolean EXPR_COMMA(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMMA")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COMMA, "<expr comma>");
    r = EXPR_ASSIGN(b, l + 1);
    r = r && EXPR_COMMA_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' EXPR )?
  private static boolean EXPR_COMMA_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMMA_1")) return false;
    EXPR_COMMA_1_0(b, l + 1);
    return true;
  }

  // ',' EXPR
  private static boolean EXPR_COMMA_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMMA_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_SHIFT ( ( '<' | '<=' | '>' | '>=' ) EXPR )?
  public static boolean EXPR_COMPAR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMPAR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_COMPAR, "<expr compar>");
    r = EXPR_SHIFT(b, l + 1);
    r = r && EXPR_COMPAR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '<' | '<=' | '>' | '>=' ) EXPR )?
  private static boolean EXPR_COMPAR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMPAR_1")) return false;
    EXPR_COMPAR_1_0(b, l + 1);
    return true;
  }

  // ( '<' | '<=' | '>' | '>=' ) EXPR
  private static boolean EXPR_COMPAR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMPAR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_COMPAR_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '<=' | '>' | '>='
  private static boolean EXPR_COMPAR_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_COMPAR_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_LESS);
    if (!r) r = consumeToken(b, T_LESS_OR_EQUAL);
    if (!r) r = consumeToken(b, T_GREATER);
    if (!r) r = consumeToken(b, T_GREATER_OR_EQUAL);
    return r;
  }

  /* ********************************************************** */
  // EXPR_COMPAR ( ( '==' | '!=' | 'instanceof' ) EXPR )?
  public static boolean EXPR_EQ_NEQ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_EQ_NEQ")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_EQ_NEQ, "<expr eq neq>");
    r = EXPR_COMPAR(b, l + 1);
    r = r && EXPR_EQ_NEQ_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '==' | '!=' | 'instanceof' ) EXPR )?
  private static boolean EXPR_EQ_NEQ_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_EQ_NEQ_1")) return false;
    EXPR_EQ_NEQ_1_0(b, l + 1);
    return true;
  }

  // ( '==' | '!=' | 'instanceof' ) EXPR
  private static boolean EXPR_EQ_NEQ_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_EQ_NEQ_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_EQ_NEQ_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '==' | '!=' | 'instanceof'
  private static boolean EXPR_EQ_NEQ_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_EQ_NEQ_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_EQ);
    if (!r) r = consumeToken(b, T_NOT_EQ);
    if (!r) r = consumeToken(b, T_CONSTRUCTOR);
    return r;
  }

  /* ********************************************************** */
  // EXPR_UNARY ( ( '/' | '*' | '%' ) EXPR )?
  public static boolean EXPR_FACTOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_FACTOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_FACTOR, "<expr factor>");
    r = EXPR_UNARY(b, l + 1);
    r = r && EXPR_FACTOR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '/' | '*' | '%' ) EXPR )?
  private static boolean EXPR_FACTOR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_FACTOR_1")) return false;
    EXPR_FACTOR_1_0(b, l + 1);
    return true;
  }

  // ( '/' | '*' | '%' ) EXPR
  private static boolean EXPR_FACTOR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_FACTOR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_FACTOR_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '/' | '*' | '%'
  private static boolean EXPR_FACTOR_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_FACTOR_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_QUOTIENT);
    if (!r) r = consumeToken(b, T_MUL);
    if (!r) r = consumeToken(b, T_REMAINDER);
    return r;
  }

  /* ********************************************************** */
  // '(' EXPR ')'
  public static boolean EXPR_GROUPED(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_GROUPED")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && EXPR(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, EXPR_GROUPED, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR ( ',' EXPR )*
  public static boolean EXPR_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_LIST, "<expr list>");
    r = EXPR(b, l + 1);
    r = r && EXPR_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ',' EXPR )*
  private static boolean EXPR_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_LIST_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EXPR_LIST_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EXPR_LIST_1", c)) break;
    }
    return true;
  }

  // ',' EXPR
  private static boolean EXPR_LIST_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_LIST_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_AND_IN ( '||' EXPR )?
  public static boolean EXPR_OR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_OR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_OR, "<expr or>");
    r = EXPR_AND_IN(b, l + 1);
    r = r && EXPR_OR_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '||' EXPR )?
  private static boolean EXPR_OR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_OR_1")) return false;
    EXPR_OR_1_0(b, l + 1);
    return true;
  }

  // '||' EXPR
  private static boolean EXPR_OR_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_OR_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COND_OR);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXPR_GROUPED | EXPR_CALL | PRIMITIVE | TABLE_DECL | ARRAY | FUNC_EXPR | CLASS_EXPR | DEREF_EXPR
  public static boolean EXPR_PRIMARY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_PRIMARY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_PRIMARY, "<expr primary>");
    r = EXPR_GROUPED(b, l + 1);
    if (!r) r = EXPR_CALL(b, l + 1);
    if (!r) r = PRIMITIVE(b, l + 1);
    if (!r) r = TABLE_DECL(b, l + 1);
    if (!r) r = ARRAY(b, l + 1);
    if (!r) r = FUNC_EXPR(b, l + 1);
    if (!r) r = CLASS_EXPR(b, l + 1);
    if (!r) r = DEREF_EXPR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EXPR_TERM ( ( '<<' | '>>' | '>>>' ) EXPR )?
  public static boolean EXPR_SHIFT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_SHIFT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_SHIFT, "<expr shift>");
    r = EXPR_TERM(b, l + 1);
    r = r && EXPR_SHIFT_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '<<' | '>>' | '>>>' ) EXPR )?
  private static boolean EXPR_SHIFT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_SHIFT_1")) return false;
    EXPR_SHIFT_1_0(b, l + 1);
    return true;
  }

  // ( '<<' | '>>' | '>>>' ) EXPR
  private static boolean EXPR_SHIFT_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_SHIFT_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_SHIFT_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' | '>>' | '>>>'
  private static boolean EXPR_SHIFT_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_SHIFT_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_SHIFT_LEFT);
    if (!r) r = consumeToken(b, T_SHIFT_RIGHT);
    if (!r) r = consumeToken(b, T_SHIFT_SHIFT_RIGHT);
    return r;
  }

  /* ********************************************************** */
  // EXPR_FACTOR ( ( '+' | '-' ) EXPR )?
  public static boolean EXPR_TERM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_TERM, "<expr term>");
    r = EXPR_FACTOR(b, l + 1);
    r = r && EXPR_TERM_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( '+' | '-' ) EXPR )?
  private static boolean EXPR_TERM_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERM_1")) return false;
    EXPR_TERM_1_0(b, l + 1);
    return true;
  }

  // ( '+' | '-' ) EXPR
  private static boolean EXPR_TERM_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERM_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXPR_TERM_1_0_0(b, l + 1);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean EXPR_TERM_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERM_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_PLUS);
    if (!r) r = consumeToken(b, T_MINUS);
    return r;
  }

  /* ********************************************************** */
  // EXPR_OR ( '?' EXPR ':' EXPR )
  public static boolean EXPR_TERNARY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERNARY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_TERNARY, "<expr ternary>");
    r = EXPR_OR(b, l + 1);
    r = r && EXPR_TERNARY_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '?' EXPR ':' EXPR
  private static boolean EXPR_TERNARY_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_TERNARY_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_QUESTION);
    r = r && EXPR(b, l + 1);
    r = r && consumeToken(b, T_COLON);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( '-' | '~' | '!' | 'typeof' | '++' | '--' )? EXPR_ACCESS
  public static boolean EXPR_UNARY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_UNARY")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_UNARY, "<expr unary>");
    r = EXPR_UNARY_0(b, l + 1);
    r = r && EXPR_ACCESS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '-' | '~' | '!' | 'typeof' | '++' | '--' )?
  private static boolean EXPR_UNARY_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_UNARY_0")) return false;
    EXPR_UNARY_0_0(b, l + 1);
    return true;
  }

  // '-' | '~' | '!' | 'typeof' | '++' | '--'
  private static boolean EXPR_UNARY_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXPR_UNARY_0_0")) return false;
    boolean r;
    r = consumeToken(b, T_MINUS);
    if (!r) r = consumeToken(b, T_TILDE);
    if (!r) r = consumeToken(b, T_NOT);
    if (!r) r = consumeToken(b, T_TYPEOF);
    if (!r) r = consumeToken(b, T_PLUS_PLUS);
    if (!r) r = consumeToken(b, T_MINUS_MINUS);
    return r;
  }

  /* ********************************************************** */
  // 'for' '(' EXPR? ';' EXPR? ';' EXPR? ')' STATEMENT
  public static boolean FOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR")) return false;
    if (!nextTokenIs(b, T_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FOR, T_LPAREN);
    r = r && FOR_2(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    r = r && FOR_4(b, l + 1);
    r = r && consumeToken(b, T_SEMICOLON);
    r = r && FOR_6(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, FOR, r);
    return r;
  }

  // EXPR?
  private static boolean FOR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_2")) return false;
    EXPR(b, l + 1);
    return true;
  }

  // EXPR?
  private static boolean FOR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_4")) return false;
    EXPR(b, l + 1);
    return true;
  }

  // EXPR?
  private static boolean FOR_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_6")) return false;
    EXPR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'foreach' '(' ( IDENTIFIER ',' )? IDENTIFIER 'in' EXPR ')' STATEMENT
  public static boolean FOREACH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOREACH")) return false;
    if (!nextTokenIs(b, T_FOREACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_FOREACH, T_LPAREN);
    r = r && FOREACH_2(b, l + 1);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_IN);
    r = r && EXPR(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, FOREACH, r);
    return r;
  }

  // ( IDENTIFIER ',' )?
  private static boolean FOREACH_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOREACH_2")) return false;
    FOREACH_2_0(b, l + 1);
    return true;
  }

  // IDENTIFIER ','
  private static boolean FOREACH_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOREACH_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' ARGS (',' '...')? ')' ( ':' '(' ARGS ')' )? STATEMENT
  public static boolean FUNC_BODY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_BODY")) return false;
    if (!nextTokenIs(b, T_LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LPAREN);
    r = r && ARGS(b, l + 1);
    r = r && FUNC_BODY_2(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && FUNC_BODY_4(b, l + 1);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, FUNC_BODY, r);
    return r;
  }

  // (',' '...')?
  private static boolean FUNC_BODY_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_BODY_2")) return false;
    FUNC_BODY_2_0(b, l + 1);
    return true;
  }

  // ',' '...'
  private static boolean FUNC_BODY_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_BODY_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_COMMA, T_DOTDOTDOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ':' '(' ARGS ')' )?
  private static boolean FUNC_BODY_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_BODY_4")) return false;
    FUNC_BODY_4_0(b, l + 1);
    return true;
  }

  // ':' '(' ARGS ')'
  private static boolean FUNC_BODY_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_BODY_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, T_COLON, T_LPAREN);
    r = r && ARGS(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'function' FUNC_NAME FUNC_BODY
  public static boolean FUNC_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_DECL")) return false;
    if (!nextTokenIs(b, T_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FUNCTION);
    r = r && FUNC_NAME(b, l + 1);
    r = r && FUNC_BODY(b, l + 1);
    exit_section_(b, m, FUNC_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // 'function' FUNC_BODY
  public static boolean FUNC_EXPR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_EXPR")) return false;
    if (!nextTokenIs(b, T_FUNCTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_FUNCTION);
    r = r && FUNC_BODY(b, l + 1);
    exit_section_(b, m, FUNC_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ( '::' IDENTIFIER )*
  public static boolean FUNC_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_NAME")) return false;
    if (!nextTokenIs(b, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && FUNC_NAME_1(b, l + 1);
    exit_section_(b, m, FUNC_NAME, r);
    return r;
  }

  // ( '::' IDENTIFIER )*
  private static boolean FUNC_NAME_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_NAME_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FUNC_NAME_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FUNC_NAME_1", c)) break;
    }
    return true;
  }

  // '::' IDENTIFIER
  private static boolean FUNC_NAME_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNC_NAME_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COLONCOLON);
    r = r && IDENTIFIER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // t_ident
  public static boolean IDENTIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IDENTIFIER")) return false;
    if (!nextTokenIs(b, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IDENT);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' EXPR_GROUPED STATEMENT ( 'else' STATEMENT )?
  public static boolean IFELSE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IFELSE")) return false;
    if (!nextTokenIs(b, T_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_IF);
    r = r && EXPR_GROUPED(b, l + 1);
    r = r && STATEMENT(b, l + 1);
    r = r && IFELSE_3(b, l + 1);
    exit_section_(b, m, IFELSE, r);
    return r;
  }

  // ( 'else' STATEMENT )?
  private static boolean IFELSE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IFELSE_3")) return false;
    IFELSE_3_0(b, l + 1);
    return true;
  }

  // 'else' STATEMENT
  private static boolean IFELSE_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IFELSE_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ELSE);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER ( '=' EXPR )? ( ',' INITZ )?
  public static boolean INITZ(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INITZ")) return false;
    if (!nextTokenIs(b, T_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && INITZ_1(b, l + 1);
    r = r && INITZ_2(b, l + 1);
    exit_section_(b, m, INITZ, r);
    return r;
  }

  // ( '=' EXPR )?
  private static boolean INITZ_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INITZ_1")) return false;
    INITZ_1_0(b, l + 1);
    return true;
  }

  // '=' EXPR
  private static boolean INITZ_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INITZ_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_ASSIGN);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' INITZ )?
  private static boolean INITZ_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INITZ_2")) return false;
    INITZ_2_0(b, l + 1);
    return true;
  }

  // ',' INITZ
  private static boolean INITZ_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INITZ_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_COMMA);
    r = r && INITZ(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'local' INITZ
  public static boolean LOCAL_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LOCAL_DECL")) return false;
    if (!nextTokenIs(b, T_LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LOCAL);
    r = r && INITZ(b, l + 1);
    exit_section_(b, m, LOCAL_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' EXPR ';'? | '[' EXPR ']' '=' EXPR ';'? | FUNC_DECL | 'constructor' FUNC_EXPR
  public static boolean MEMBER_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECL, "<member decl>");
    r = MEMBER_DECL_0(b, l + 1);
    if (!r) r = MEMBER_DECL_1(b, l + 1);
    if (!r) r = FUNC_DECL(b, l + 1);
    if (!r) r = MEMBER_DECL_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER '=' EXPR ';'?
  private static boolean MEMBER_DECL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_ASSIGN);
    r = r && EXPR(b, l + 1);
    r = r && MEMBER_DECL_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean MEMBER_DECL_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL_0_3")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  // '[' EXPR ']' '=' EXPR ';'?
  private static boolean MEMBER_DECL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACK);
    r = r && EXPR(b, l + 1);
    r = r && consumeTokens(b, 0, T_RBRACK, T_ASSIGN);
    r = r && EXPR(b, l + 1);
    r = r && MEMBER_DECL_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean MEMBER_DECL_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL_1_5")) return false;
    consumeToken(b, T_SEMICOLON);
    return true;
  }

  // 'constructor' FUNC_EXPR
  private static boolean MEMBER_DECL_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMBER_DECL_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_CONSTRUCTOR);
    r = r && FUNC_EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // t_integer | t_float | t_string | t_string_block
  public static boolean PRIMITIVE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PRIMITIVE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE, "<primitive>");
    r = consumeToken(b, T_INTEGER);
    if (!r) r = consumeToken(b, T_FLOAT);
    if (!r) r = consumeToken(b, T_STRING);
    if (!r) r = consumeToken(b, T_STRING_BLOCK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return' EXPR?
  public static boolean RETURN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN")) return false;
    if (!nextTokenIs(b, T_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_RETURN);
    r = r && RETURN_1(b, l + 1);
    exit_section_(b, m, RETURN, r);
    return r;
  }

  // EXPR?
  private static boolean RETURN_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_1")) return false;
    EXPR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BLOCK | IFELSE | WHILE | DOWHILE | SWITCH | FOR | FOREACH | 'break' | 'continue' | RETURN | YIELD | LOCAL_DECL | FUNC_DECL | CLASS_DECL | TRYCATCH | THROW | CONST | ENUM | EXPR
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = BLOCK(b, l + 1);
    if (!r) r = IFELSE(b, l + 1);
    if (!r) r = WHILE(b, l + 1);
    if (!r) r = DOWHILE(b, l + 1);
    if (!r) r = SWITCH(b, l + 1);
    if (!r) r = FOR(b, l + 1);
    if (!r) r = FOREACH(b, l + 1);
    if (!r) r = consumeToken(b, T_BREAK);
    if (!r) r = consumeToken(b, T_CONTINUE);
    if (!r) r = RETURN(b, l + 1);
    if (!r) r = YIELD(b, l + 1);
    if (!r) r = LOCAL_DECL(b, l + 1);
    if (!r) r = FUNC_DECL(b, l + 1);
    if (!r) r = CLASS_DECL(b, l + 1);
    if (!r) r = TRYCATCH(b, l + 1);
    if (!r) r = THROW(b, l + 1);
    if (!r) r = CONST(b, l + 1);
    if (!r) r = ENUM(b, l + 1);
    if (!r) r = EXPR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( STATEMENT ( ';' | t_NEWLINE ) )* STATEMENT?
  static boolean STATEMENTS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENTS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = STATEMENTS_0(b, l + 1);
    r = r && STATEMENTS_1(b, l + 1);
    exit_section_(b, l, m, r, false, SquirrelParser::statements_recover);
    return r;
  }

  // ( STATEMENT ( ';' | t_NEWLINE ) )*
  private static boolean STATEMENTS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENTS_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!STATEMENTS_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "STATEMENTS_0", c)) break;
    }
    return true;
  }

  // STATEMENT ( ';' | t_NEWLINE )
  private static boolean STATEMENTS_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENTS_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = STATEMENT(b, l + 1);
    r = r && STATEMENTS_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' | t_NEWLINE
  private static boolean STATEMENTS_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENTS_0_0_1")) return false;
    boolean r;
    r = consumeToken(b, T_SEMICOLON);
    if (!r) r = consumeToken(b, T_NEWLINE);
    return r;
  }

  // STATEMENT?
  private static boolean STATEMENTS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENTS_1")) return false;
    STATEMENT(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'switch' EXPR_GROUPED '{' CASE* '}'
  public static boolean SWITCH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SWITCH")) return false;
    if (!nextTokenIs(b, T_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_SWITCH);
    r = r && EXPR_GROUPED(b, l + 1);
    r = r && consumeToken(b, T_LBRACE);
    r = r && SWITCH_3(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, SWITCH, r);
    return r;
  }

  // CASE*
  private static boolean SWITCH_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SWITCH_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CASE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SWITCH_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '{' TSLOTS* '}'
  public static boolean TABLE_DECL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TABLE_DECL")) return false;
    if (!nextTokenIs(b, T_LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACE);
    r = r && TABLE_DECL_1(b, l + 1);
    r = r && consumeToken(b, T_RBRACE);
    exit_section_(b, m, TABLE_DECL, r);
    return r;
  }

  // TSLOTS*
  private static boolean TABLE_DECL_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TABLE_DECL_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TSLOTS(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TABLE_DECL_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'throw' EXPR
  public static boolean THROW(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THROW")) return false;
    if (!nextTokenIs(b, T_THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_THROW);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, THROW, r);
    return r;
  }

  /* ********************************************************** */
  // 'try' STATEMENT 'catch' '(' IDENTIFIER ')' STATEMENT
  public static boolean TRYCATCH(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TRYCATCH")) return false;
    if (!nextTokenIs(b, T_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_TRY);
    r = r && STATEMENT(b, l + 1);
    r = r && consumeTokens(b, 0, T_CATCH, T_LPAREN);
    r = r && IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_RPAREN);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, TRYCATCH, r);
    return r;
  }

  /* ********************************************************** */
  // ( IDENTIFIER '=' EXPR | '[' EXPR ']' '=' EXPR ) ','?
  public static boolean TSLOTS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TSLOTS")) return false;
    if (!nextTokenIs(b, "<tslots>", T_IDENT, T_LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TSLOTS, "<tslots>");
    r = TSLOTS_0(b, l + 1);
    r = r && TSLOTS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER '=' EXPR | '[' EXPR ']' '=' EXPR
  private static boolean TSLOTS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TSLOTS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TSLOTS_0_0(b, l + 1);
    if (!r) r = TSLOTS_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER '=' EXPR
  private static boolean TSLOTS_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TSLOTS_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IDENTIFIER(b, l + 1);
    r = r && consumeToken(b, T_ASSIGN);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' EXPR ']' '=' EXPR
  private static boolean TSLOTS_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TSLOTS_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_LBRACK);
    r = r && EXPR(b, l + 1);
    r = r && consumeTokens(b, 0, T_RBRACK, T_ASSIGN);
    r = r && EXPR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean TSLOTS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TSLOTS_1")) return false;
    consumeToken(b, T_COMMA);
    return true;
  }

  /* ********************************************************** */
  // 'while' EXPR_GROUPED STATEMENT
  public static boolean WHILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHILE")) return false;
    if (!nextTokenIs(b, T_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_WHILE);
    r = r && EXPR_GROUPED(b, l + 1);
    r = r && STATEMENT(b, l + 1);
    exit_section_(b, m, WHILE, r);
    return r;
  }

  /* ********************************************************** */
  // 'yield' EXPR?
  public static boolean YIELD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YIELD")) return false;
    if (!nextTokenIs(b, T_YIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, T_YIELD);
    r = r && YIELD_1(b, l + 1);
    exit_section_(b, m, YIELD, r);
    return r;
  }

  // EXPR?
  private static boolean YIELD_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "YIELD_1")) return false;
    EXPR(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !( ';' | t_NEWLINE | '}' )
  static boolean statements_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !statements_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ';' | t_NEWLINE | '}'
  private static boolean statements_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_recover_0")) return false;
    boolean r;
    r = consumeToken(b, T_SEMICOLON);
    if (!r) r = consumeToken(b, T_NEWLINE);
    if (!r) r = consumeToken(b, T_RBRACE);
    return r;
  }

}
