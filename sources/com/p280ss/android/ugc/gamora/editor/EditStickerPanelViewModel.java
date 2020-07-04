package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditStickerPanelViewModel */
public final class EditStickerPanelViewModel extends JediViewModel<EditStickerPanelState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditStickerPanelViewModel$a */
    static final class C43918a extends Lambda implements C7562b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113736a;

        C43918a(boolean z) {
            this.f113736a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            C7573i.m23587b(editStickerPanelState, "$receiver");
            return editStickerPanelState.copy(new C44404c(this.f113736a));
        }
    }

    /* renamed from: f */
    private static EditStickerPanelState m139088f() {
        return new EditStickerPanelState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139088f();
    }

    /* renamed from: a */
    public final void mo106349a(boolean z) {
        mo29038c(new C43918a(z));
    }
}
