package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel */
public final class EditTextStickerViewModel extends JediViewModel<EditTextStickerState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113753c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditTextStickerViewModel.class), "alphaVisible", "getAlphaVisible()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113754d = C7546e.m23569a(C43926a.f113755a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel$a */
    static final class C43926a extends Lambda implements C7561a<C0052o<Pair<? extends Float, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C43926a f113755a = new C43926a();

        C43926a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Pair<Float, Boolean>> m139113a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139113a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditTextStickerViewModel$b */
    static final class C43927b extends Lambda implements C7562b<EditTextStickerState, EditTextStickerState> {

        /* renamed from: a */
        public static final C43927b f113756a = new C43927b();

        C43927b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139114a((EditTextStickerState) obj);
        }

        /* renamed from: a */
        private static EditTextStickerState m139114a(EditTextStickerState editTextStickerState) {
            C7573i.m23587b(editTextStickerState, "$receiver");
            return editTextStickerState.copy(new C44412h());
        }
    }

    /* renamed from: g */
    public final C0052o<Pair<Float, Boolean>> mo106373g() {
        return (C0052o) this.f113754d.getValue();
    }

    /* renamed from: h */
    private static EditTextStickerState m139108h() {
        return new EditTextStickerState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139108h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43927b.f113756a);
    }

    /* renamed from: a */
    public final void mo106372a(float f, boolean z) {
        mo106373g().setValue(new Pair(Float.valueOf(f), Boolean.valueOf(false)));
    }
}
