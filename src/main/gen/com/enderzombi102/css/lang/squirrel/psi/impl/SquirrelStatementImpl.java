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

public class SquirrelStatementImpl extends ASTWrapperPsiElement implements SquirrelStatement {

  public SquirrelStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SquirrelVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SquirrelVisitor) accept((SquirrelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SquirrelBlock getBlock() {
    return findChildByClass(SquirrelBlock.class);
  }

  @Override
  @Nullable
  public SquirrelClassDecl getClassDecl() {
    return findChildByClass(SquirrelClassDecl.class);
  }

  @Override
  @Nullable
  public SquirrelConst getConst() {
    return findChildByClass(SquirrelConst.class);
  }

  @Override
  @Nullable
  public SquirrelDowhile getDowhile() {
    return findChildByClass(SquirrelDowhile.class);
  }

  @Override
  @Nullable
  public SquirrelEnum getEnum() {
    return findChildByClass(SquirrelEnum.class);
  }

  @Override
  @Nullable
  public SquirrelExpr getExpr() {
    return findChildByClass(SquirrelExpr.class);
  }

  @Override
  @Nullable
  public SquirrelFor getFor() {
    return findChildByClass(SquirrelFor.class);
  }

  @Override
  @Nullable
  public SquirrelForeach getForeach() {
    return findChildByClass(SquirrelForeach.class);
  }

  @Override
  @Nullable
  public SquirrelFuncDecl getFuncDecl() {
    return findChildByClass(SquirrelFuncDecl.class);
  }

  @Override
  @Nullable
  public SquirrelIfelse getIfelse() {
    return findChildByClass(SquirrelIfelse.class);
  }

  @Override
  @Nullable
  public SquirrelLocalDecl getLocalDecl() {
    return findChildByClass(SquirrelLocalDecl.class);
  }

  @Override
  @Nullable
  public SquirrelReturn getReturn() {
    return findChildByClass(SquirrelReturn.class);
  }

  @Override
  @Nullable
  public SquirrelSwitch getSwitch() {
    return findChildByClass(SquirrelSwitch.class);
  }

  @Override
  @Nullable
  public SquirrelThrow getThrow() {
    return findChildByClass(SquirrelThrow.class);
  }

  @Override
  @Nullable
  public SquirrelTrycatch getTrycatch() {
    return findChildByClass(SquirrelTrycatch.class);
  }

  @Override
  @Nullable
  public SquirrelWhile getWhile() {
    return findChildByClass(SquirrelWhile.class);
  }

  @Override
  @Nullable
  public SquirrelYield getYield() {
    return findChildByClass(SquirrelYield.class);
  }

}
