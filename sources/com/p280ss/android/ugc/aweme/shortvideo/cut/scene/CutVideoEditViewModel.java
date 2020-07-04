package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0052o;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel */
public final class CutVideoEditViewModel extends BaseJediViewModel<CutVideoEditState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f100833c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoEditViewModel.class), "slideHintAlpha", "getSlideHintAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    public int f100834d;

    /* renamed from: e */
    private final C7541d f100835e = C7546e.m23569a(C38811e.f100840a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$a */
    static final class C38807a extends Lambda implements C7562b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100836a;

        C38807a(boolean z) {
            this.f100836a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            C7573i.m23587b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, new C44404c(this.f100836a), null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$b */
    static final class C38808b extends Lambda implements C7562b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        public static final C38808b f100837a = new C38808b();

        C38808b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m123950a((CutVideoEditState) obj);
        }

        /* renamed from: a */
        private static CutVideoEditState m123950a(CutVideoEditState cutVideoEditState) {
            C7573i.m23587b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, null, new C44412h(), null, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$c */
    static final class C38809c extends Lambda implements C7562b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100838a;

        C38809c(boolean z) {
            this.f100838a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            C7573i.m23587b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, null, null, null, Boolean.valueOf(this.f100838a), 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$d */
    static final class C38810d extends Lambda implements C7562b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100839a;

        C38810d(boolean z) {
            this.f100839a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoEditState invoke(CutVideoEditState cutVideoEditState) {
            C7573i.m23587b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, null, Boolean.valueOf(this.f100839a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$e */
    static final class C38811e extends Lambda implements C7561a<C0052o<Float>> {

        /* renamed from: a */
        public static final C38811e f100840a = new C38811e();

        C38811e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Float> m123953a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m123953a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel$f */
    static final class C38812f extends Lambda implements C7562b<CutVideoEditState, CutVideoEditState> {

        /* renamed from: a */
        public static final C38812f f100841a = new C38812f();

        C38812f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m123954a((CutVideoEditState) obj);
        }

        /* renamed from: a */
        private static CutVideoEditState m123954a(CutVideoEditState cutVideoEditState) {
            C7573i.m23587b(cutVideoEditState, "$receiver");
            return CutVideoEditState.copy$default(cutVideoEditState, new C44412h(), null, null, null, null, 30, null);
        }
    }

    /* renamed from: j */
    private final C0052o<Float> m123940j() {
        return (C0052o) this.f100835e.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m123939i();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C38812f.f100841a);
    }

    /* renamed from: g */
    public final void mo96984g() {
        mo29038c(C38808b.f100837a);
    }

    /* renamed from: h */
    public final C0052o<Float> mo96985h() {
        return m123940j();
    }

    /* renamed from: i */
    private static CutVideoEditState m123939i() {
        CutVideoEditState cutVideoEditState = new CutVideoEditState(null, null, null, null, null, 31, null);
        return cutVideoEditState;
    }

    /* renamed from: a */
    public final void mo96980a(float f) {
        m123940j().setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo96982b(boolean z) {
        mo29038c(new C38807a(z));
    }

    /* renamed from: c */
    public final void mo96983c(boolean z) {
        mo29038c(new C38809c(z));
    }

    /* renamed from: a */
    public final void mo96981a(boolean z) {
        mo29038c(new C38810d(z));
    }
}
