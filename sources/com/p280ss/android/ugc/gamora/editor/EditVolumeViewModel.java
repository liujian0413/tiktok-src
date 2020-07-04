package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel */
public final class EditVolumeViewModel extends JediViewModel<EditVolumeState> {

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$a */
    static final class C43960a extends Lambda implements C7562b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f113808a;

        C43960a(String str) {
            this.f113808a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditVolumeState invoke(EditVolumeState editVolumeState) {
            C7573i.m23587b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, this.f113808a, null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$b */
    static final class C43961b extends Lambda implements C7562b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ int f113809a;

        C43961b(int i) {
            this.f113809a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditVolumeState invoke(EditVolumeState editVolumeState) {
            C7573i.m23587b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, null, null, Integer.valueOf(this.f113809a), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeViewModel$c */
    static final class C43962c extends Lambda implements C7562b<EditVolumeState, EditVolumeState> {

        /* renamed from: a */
        final /* synthetic */ String f113810a;

        C43962c(String str) {
            this.f113810a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditVolumeState invoke(EditVolumeState editVolumeState) {
            C7573i.m23587b(editVolumeState, "$receiver");
            return EditVolumeState.copy$default(editVolumeState, null, this.f113810a, null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139220f();
    }

    /* renamed from: f */
    private static EditVolumeState m139220f() {
        EditVolumeState editVolumeState = new EditVolumeState(null, null, null, 7, null);
        return editVolumeState;
    }

    /* renamed from: a */
    public final void mo106475a(int i) {
        mo29038c(new C43961b(i));
    }

    /* renamed from: b */
    public final void mo106477b(String str) {
        C7573i.m23587b(str, "value");
        mo29038c(new C43962c(str));
    }

    /* renamed from: a */
    public final void mo106476a(String str) {
        C7573i.m23587b(str, "value");
        mo29038c(new C43960a(str));
    }
}
