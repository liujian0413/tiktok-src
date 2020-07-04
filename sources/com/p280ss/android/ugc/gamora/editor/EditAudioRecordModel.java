package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioRecordModel */
public final class EditAudioRecordModel extends JediViewModel<EditAudioRecordState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioRecordModel$a */
    static final class C43874a extends Lambda implements C7562b<EditAudioRecordState, EditAudioRecordState> {

        /* renamed from: a */
        final /* synthetic */ Boolean f113667a;

        C43874a(Boolean bool) {
            this.f113667a = bool;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditAudioRecordState invoke(EditAudioRecordState editAudioRecordState) {
            C7573i.m23587b(editAudioRecordState, "$receiver");
            return editAudioRecordState.copy(this.f113667a);
        }
    }

    /* renamed from: f */
    private static EditAudioRecordState m138975f() {
        return new EditAudioRecordState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138975f();
    }

    /* renamed from: a */
    public final void mo106171a(Boolean bool) {
        mo29038c(new C43874a(bool));
    }
}
