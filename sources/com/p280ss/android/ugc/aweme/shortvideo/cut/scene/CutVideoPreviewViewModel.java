package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44410f;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel */
public final class CutVideoPreviewViewModel extends BaseJediViewModel<CutVideoPreviewState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f100962c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoPreviewViewModel.class), "animationStart", "getAnimationStart()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoPreviewViewModel.class), "animationEnd", "getAnimationEnd()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f100963d = C7546e.m23569a(C38867b.f100966a);

    /* renamed from: e */
    private final C7541d f100964e = C7546e.m23569a(C38866a.f100965a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$a */
    static final class C38866a extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C38866a f100965a = new C38866a();

        C38866a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m124101a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124101a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$b */
    static final class C38867b extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C38867b f100966a = new C38867b();

        C38867b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m124102a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124102a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$c */
    static final class C38868c extends Lambda implements C7562b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f100967a;

        /* renamed from: b */
        final /* synthetic */ int f100968b;

        C38868c(int i, int i2) {
            this.f100967a = i;
            this.f100968b = i2;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            C7573i.m23587b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, new C44410f(new Pair(Integer.valueOf(this.f100967a), Integer.valueOf(this.f100968b))), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$d */
    static final class C38869d extends Lambda implements C7562b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        public static final C38869d f100969a = new C38869d();

        C38869d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m124104a((CutVideoPreviewState) obj);
        }

        /* renamed from: a */
        private static CutVideoPreviewState m124104a(CutVideoPreviewState cutVideoPreviewState) {
            C7573i.m23587b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, new C44412h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$e */
    static final class C38870e extends Lambda implements C7562b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100970a;

        C38870e(boolean z) {
            this.f100970a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            C7573i.m23587b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, Boolean.valueOf(this.f100970a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$f */
    static final class C38871f extends Lambda implements C7562b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        final /* synthetic */ int f100971a;

        C38871f(int i) {
            this.f100971a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoPreviewState invoke(CutVideoPreviewState cutVideoPreviewState) {
            C7573i.m23587b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, null, new C44409e(this.f100971a), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel$g */
    static final class C38872g extends Lambda implements C7562b<CutVideoPreviewState, CutVideoPreviewState> {

        /* renamed from: a */
        public static final C38872g f100972a = new C38872g();

        C38872g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m124107a((CutVideoPreviewState) obj);
        }

        /* renamed from: a */
        private static CutVideoPreviewState m124107a(CutVideoPreviewState cutVideoPreviewState) {
            C7573i.m23587b(cutVideoPreviewState, "$receiver");
            return CutVideoPreviewState.copy$default(cutVideoPreviewState, null, null, null, null, new C44412h(), 15, null);
        }
    }

    /* renamed from: h */
    public final C0052o<Boolean> mo97093h() {
        return (C0052o) this.f100963d.getValue();
    }

    /* renamed from: i */
    public final C0052o<Boolean> mo97094i() {
        return (C0052o) this.f100964e.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124092j();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C38869d.f100969a);
    }

    /* renamed from: g */
    public final void mo97092g() {
        mo29038c(C38872g.f100972a);
    }

    /* renamed from: j */
    private static CutVideoPreviewState m124092j() {
        CutVideoPreviewState cutVideoPreviewState = new CutVideoPreviewState(null, null, null, null, null, 31, null);
        return cutVideoPreviewState;
    }

    /* renamed from: a */
    public final void mo97089a(int i) {
        mo29038c(new C38871f(i));
    }

    /* renamed from: a */
    public final void mo97091a(boolean z) {
        mo29038c(new C38870e(z));
    }

    /* renamed from: a */
    public final void mo97090a(int i, int i2) {
        mo29038c(new C38868c(i, i2));
    }
}
