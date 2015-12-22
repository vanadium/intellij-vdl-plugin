package io.v.vdl;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.psi.PsiFile;
import io.v.vdl.psi.VdlFile;

public class VdlStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {
    public VdlStructureViewModel(PsiFile psiFile) {
        super(psiFile, new VdlStructureViewElement(psiFile));
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement structureViewTreeElement) {
        return structureViewTreeElement instanceof VdlFile;
    }
}
