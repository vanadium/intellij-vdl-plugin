// This is a generated file. Not intended for manual editing.
package io.v.vdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.v.vdl.psi.VdlTypes.*;
import io.v.vdl.psi.VdlCompositeElementImpl;
import io.v.vdl.psi.*;
import com.intellij.psi.PsiReference;

public class VdlTypeReferenceExpressionImpl extends VdlCompositeElementImpl implements VdlTypeReferenceExpression {

  public VdlTypeReferenceExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VdlVisitor) ((VdlVisitor)visitor).visitTypeReferenceExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getOptionalArg() {
    return findChildByType(OPTIONAL_ARG);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @NotNull
  public PsiReference getReference() {
    return VdlPsiImplUtil.getReference(this);
  }

  @Nullable
  public VdlTypeReferenceExpression getQualifier() {
    return VdlPsiImplUtil.getQualifier(this);
  }

}
