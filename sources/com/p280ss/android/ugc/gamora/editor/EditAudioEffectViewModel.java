package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel */
public final class EditAudioEffectViewModel extends JediViewModel<EditAudioEffectState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel$a */
    static final class C43872a extends Lambda implements C7562b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        final /* synthetic */ Object f113665a;

        C43872a(Object obj) {
            this.f113665a = obj;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            C7573i.m23587b(editAudioEffectState, "$receiver");
            return EditAudioEffectState.copy$default(editAudioEffectState, null, this.f113665a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel$b */
    static final class C43873b extends Lambda implements C7562b<EditAudioEffectState, EditAudioEffectState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113666a;

        C43873b(boolean z) {
            this.f113666a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditAudioEffectState invoke(EditAudioEffectState editAudioEffectState) {
            C7573i.m23587b(editAudioEffectState, "$receiver");
            return EditAudioEffectState.copy$default(editAudioEffectState, Boolean.valueOf(this.f113666a), null, 2, null);
        }
    }

    /* renamed from: f */
    private static EditAudioEffectState m138969f() {
        return new EditAudioEffectState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138969f();
    }

    /* renamed from: a */
    public final void mo106169a(Object obj) {
        mo29038c(new C43872a(obj));
    }

    /* renamed from: a */
    public final void mo106170a(boolean z) {
        mo29038c(new C43873b(z));
    }
}
