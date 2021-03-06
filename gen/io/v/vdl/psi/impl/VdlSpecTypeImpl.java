// This is a generated file. Not intended for manual editing.
package io.v.vdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.v.vdl.psi.VdlTypes.*;
import io.v.vdl.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class VdlSpecTypeImpl extends VdlTypeImpl implements VdlSpecType {

  public VdlSpecTypeImpl(ASTNode node) {
    super(node);
  }

  public VdlSpecTypeImpl(VdlTypeStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull VdlVisitor visitor) {
    visitor.visitSpecType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VdlVisitor) accept((VdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VdlType getType() {
    return findNotNullChildByClass(VdlType.class, VdlTypeStub.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
