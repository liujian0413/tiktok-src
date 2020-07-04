package com.p280ss.android.ugc.asve.p754b;

import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditorModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.i */
public final class C15394i extends C15390e {

    /* renamed from: a */
    private final VEEditorModel f39701a;

    /* renamed from: b */
    private final C45255af f39702b;

    public C15394i(VEEditorModel vEEditorModel, C45255af afVar) {
        C7573i.m23587b(vEEditorModel, "model");
        this.f39701a = vEEditorModel;
        this.f39702b = afVar;
    }

    /* renamed from: a */
    public final int mo38886a(VEEditor vEEditor, boolean z) {
        C7573i.m23587b(vEEditor, "editor");
        return vEEditor.mo107881a(this.f39701a, this.f39702b);
    }
}
