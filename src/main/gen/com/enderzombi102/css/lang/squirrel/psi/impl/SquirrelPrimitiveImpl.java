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

public class SquirrelPrimitiveImpl extends ASTWrapperPsiElement implements SquirrelPrimitive {

  public SquirrelPrimitiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SquirrelVisitor visitor) {
    visitor.visitPrimitive(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SquirrelVisitor) accept((SquirrelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getTFloat() {
    return findChildByType(T_FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getTInteger() {
    return findChildByType(T_INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getTString() {
    return findChildByType(T_STRING);
  }

  @Override
  @Nullable
  public PsiElement getTStringBlock() {
    return findChildByType(T_STRING_BLOCK);
  }

}
