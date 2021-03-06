// This is a generated file. Not intended for manual editing.
package io.v.vdl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.v.vdl.psi.VdlTypes.*;
import io.v.vdl.psi.VdlStubbedElementImpl;
import io.v.vdl.psi.VdlVarSpecStub;
import io.v.vdl.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class VdlVarSpecImpl extends VdlStubbedElementImpl<VdlVarSpecStub> implements VdlVarSpec {

  public VdlVarSpecImpl(ASTNode node) {
    super(node);
  }

  public VdlVarSpecImpl(VdlVarSpecStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull VdlVisitor visitor) {
    visitor.visitVarSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VdlVisitor) accept((VdlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<VdlExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VdlExpression.class);
  }

  @Override
  @Nullable
  public VdlType getType() {
    return findChildByClass(VdlType.class, VdlTypeStub.class);
  }

  @Override
  @NotNull
  public List<VdlVarDefinition> getVarDefinitionList() {
    return findChildrenByClass(VdlVarDefinition.class, VdlVarDefinitionStub.class);
  }

  @Override
  @Nullable
  public PsiElement getAssign() {
    return findChildByType(ASSIGN);
  }

}
