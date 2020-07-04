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

/* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel */
public final class EditPoiStickerViewModel extends JediViewModel<EditPoiStickerState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113718c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditPoiStickerViewModel.class), "viewAlpha", "getViewAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f113719d = C7546e.m23569a(C43909b.f113721a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel$a */
    static final class C43908a extends Lambda implements C7562b<EditPoiStickerState, EditPoiStickerState> {

        /* renamed from: a */
        public static final C43908a f113720a = new C43908a();

        C43908a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139068a((EditPoiStickerState) obj);
        }

        /* renamed from: a */
        private static EditPoiStickerState m139068a(EditPoiStickerState editPoiStickerState) {
            C7573i.m23587b(editPoiStickerState, "$receiver");
            return editPoiStickerState.copy(new C44412h());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditPoiStickerViewModel$b */
    static final class C43909b extends Lambda implements C7561a<C0052o<Float>> {

        /* renamed from: a */
        public static final C43909b f113721a = new C43909b();

        C43909b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Float> m139069a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139069a();
        }
    }

    /* renamed from: g */
    public final C0052o<Float> mo106309g() {
        return (C0052o) this.f113719d.getValue();
    }

    /* renamed from: h */
    private static EditPoiStickerState m139063h() {
        return new EditPoiStickerState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139063h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C43908a.f113720a);
    }

    /* renamed from: a */
    public final void mo106308a(float f) {
        mo106309g().setValue(Float.valueOf(f));
    }
}
