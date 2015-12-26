package io.v.vdl.psi;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import io.v.vdl.VdlFileElementType;
import org.jetbrains.annotations.NotNull;

public class VdlAllPrivateNamesIndex extends StringStubIndexExtension<VdlNamedElement> {
    public static final StubIndexKey<String, VdlNamedElement> ALL_PRIVATE_NAMES = StubIndexKey.createIndexKey("vdl.all.private.name");

    @Override
    public int getVersion() {
        return VdlFileElementType.VERSION;
    }

    @NotNull
    @Override
    public StubIndexKey<String, VdlNamedElement> getKey() {
        return ALL_PRIVATE_NAMES;
    }

}
