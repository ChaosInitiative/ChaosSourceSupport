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

public class SquirrelIfelseImpl extends ASTWrapperPsiElement implements SquirrelIfelse {

  public SquirrelIfelseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SquirrelVisitor visitor) {
    visitor.visitIfelse(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SquirrelVisitor) accept((SquirrelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SquirrelExprGrouped getExprGrouped() {
    return findNotNullChildByClass(SquirrelExprGrouped.class);
  }

  @Override
  @NotNull
  public List<SquirrelStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SquirrelStatement.class);
  }

}
