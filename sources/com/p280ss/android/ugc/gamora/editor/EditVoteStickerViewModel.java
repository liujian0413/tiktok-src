package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel */
public final class EditVoteStickerViewModel extends JediViewModel<EditVoteStickerState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113811c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditVoteStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113812d = C7546e.m23569a(C43965c.f113815a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$a */
    static final class C43963a extends Lambda implements C7562b<EditVoteStickerState, EditVoteStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f113813a;

        C43963a(boolean z) {
            this.f113813a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditVoteStickerState invoke(EditVoteStickerState editVoteStickerState) {
            C7573i.m23587b(editVoteStickerState, "$receiver");
            return EditVoteStickerState.copy$default(editVoteStickerState, null, Boolean.valueOf(this.f113813a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$b */
    static final class C43964b extends Lambda implements C7562b<EditVoteStickerState, EditVoteStickerState> {

        /* renamed from: a */
        public static final C43964b f113814a = new C43964b();

        C43964b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139235a((EditVoteStickerState) obj);
        }

        /* renamed from: a */
        private static EditVoteStickerState m139235a(EditVoteStickerState editVoteStickerState) {
            C7573i.m23587b(editVoteStickerState, "$receiver");
            return EditVoteStickerState.copy$default(editVoteStickerState, new C44412h(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditVoteStickerViewModel$c */
    static final class C43965c extends Lambda implements C7561a<C0052o<Float>> {

        /* renamed from: a */
        public static final C43965c f113815a = new C43965c();

        C43965c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Float> m139236a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139236a();
        }
    }

    /* renamed from: g */
    public final C0052o<Float> mo106488g() {
        return (C0052o) this.f113812d.getValue();
    }

    /* renamed from: h */
    private static EditVoteStickerState m139228h() {
        return new EditVoteStickerState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139228h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43964b.f113814a);
    }

    /* renamed from: a */
    public final void mo106486a(float f) {
        mo106488g().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo106487a(boolean z) {
        mo29038c(new C43963a(z));
    }
}
