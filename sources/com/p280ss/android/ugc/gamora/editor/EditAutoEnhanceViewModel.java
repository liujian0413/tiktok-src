package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel */
public final class EditAutoEnhanceViewModel extends JediViewModel<EditAutoEnhanceState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel$a */
    static final class C43875a extends Lambda implements C7562b<EditAutoEnhanceState, EditAutoEnhanceState> {

        /* renamed from: a */
        public static final C43875a f113668a = new C43875a();

        C43875a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m138983a((EditAutoEnhanceState) obj);
        }

        /* renamed from: a */
        private static EditAutoEnhanceState m138983a(EditAutoEnhanceState editAutoEnhanceState) {
            C7573i.m23587b(editAutoEnhanceState, "$receiver");
            return EditAutoEnhanceState.copy$default(editAutoEnhanceState, null, new C44412h(), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditAutoEnhanceViewModel$b */
    static final class C43876b extends Lambda implements C7562b<EditAutoEnhanceState, EditAutoEnhanceState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113669a;

        C43876b(boolean z) {
            this.f113669a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditAutoEnhanceState invoke(EditAutoEnhanceState editAutoEnhanceState) {
            C7573i.m23587b(editAutoEnhanceState, "$receiver");
            return EditAutoEnhanceState.copy$default(editAutoEnhanceState, Boolean.valueOf(this.f113669a), null, 2, null);
        }
    }

    /* renamed from: g */
    private static EditAutoEnhanceState m138979g() {
        return new EditAutoEnhanceState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m138979g();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43875a.f113668a);
    }

    /* renamed from: a */
    public final void mo106186a(boolean z) {
        mo29038c(new C43876b(z));
    }
}
