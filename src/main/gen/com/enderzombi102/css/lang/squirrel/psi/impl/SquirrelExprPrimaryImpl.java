// This is a generated file. Not intended for manual editing.
package com.enderzombi102.css.lang.squirrel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.enderzombi102.css.lang.squirrel.psi.SquirrelElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.enderzombi102.css.lang.squirrel.psi.*;

public class SquirrelExprPrimaryImpl extends ASTWrapperPsiElement implements SquirrelExprPrimary {

  public SquirrelExprPrimaryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SquirrelVisitor visitor) {
    visitor.visitExprPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SquirrelVisitor) accept((SquirrelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SquirrelArray getArray() {
    return findChildByClass(SquirrelArray.class);
  }

  @Override
  @Nullable
  public SquirrelClassExpr getClassExpr() {
    return findChildByClass(SquirrelClassExpr.class);
  }

  @Override
  @Nullable
  public SquirrelDerefExpr getDerefExpr() {
    return findChildByClass(SquirrelDerefExpr.class);
  }

  @Override
  @Nullable
  public SquirrelExprCall getExprCall() {
    return findChildByClass(SquirrelExprCall.class);
  }

  @Override
  @Nullable
  public SquirrelExprGrouped getExprGrouped() {
    return findChildByClass(SquirrelExprGrouped.class);
  }

  @Override
  @Nullable
  public SquirrelFuncExpr getFuncExpr() {
    return findChildByClass(SquirrelFuncExpr.class);
  }

  @Override
  @Nullable
  public SquirrelPrimitive getPrimitive() {
    return findChildByClass(SquirrelPrimitive.class);
  }

  @Override
  @Nullable
  public SquirrelTableDecl getTableDecl() {
    return findChildByClass(SquirrelTableDecl.class);
  }

}
