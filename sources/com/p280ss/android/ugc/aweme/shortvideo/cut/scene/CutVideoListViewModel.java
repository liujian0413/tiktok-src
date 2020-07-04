package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39170h;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44404c;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel */
public final class CutVideoListViewModel extends BaseJediViewModel<CutVideoListState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f100938c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoListViewModel.class), "recyclerViewVisible", "getRecyclerViewVisible()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    public int f100939d;

    /* renamed from: e */
    public int f100940e;

    /* renamed from: f */
    public C39053bm f100941f;

    /* renamed from: g */
    private final C7541d f100942g = C7546e.m23569a(C38855e.f100947a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$a */
    static final class C38851a extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100943a;

        C38851a(boolean z) {
            this.f100943a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, null, null, null, null, null, new C44404c(this.f100943a), 511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$b */
    static final class C38852b extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        public static final C38852b f100944a = new C38852b();

        C38852b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m124066a((CutVideoListState) obj);
        }

        /* renamed from: a */
        private static CutVideoListState m124066a(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, new C44412h(), null, null, null, null, null, null, null, null, null, 1022, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$c */
    static final class C38853c extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100945a;

        C38853c(boolean z) {
            this.f100945a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, null, new C44404c(this.f100945a), null, null, null, null, 991, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$d */
    static final class C38854d extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100946a;

        C38854d(boolean z) {
            this.f100946a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, null, null, null, new C44404c(this.f100946a), null, null, 895, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$e */
    static final class C38855e extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C38855e f100947a = new C38855e();

        C38855e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m124069a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124069a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$f */
    static final class C38856f extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100948a;

        C38856f(boolean z) {
            this.f100948a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, Boolean.valueOf(this.f100948a), null, null, null, null, null, null, 1015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$g */
    static final class C38857g extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100949a;

        C38857g(boolean z) {
            this.f100949a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, Boolean.valueOf(this.f100949a), null, null, null, null, null, null, null, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$h */
    static final class C38858h extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100950a;

        C38858h(boolean z) {
            this.f100950a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f100950a), null, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$i */
    static final class C38859i extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100951a;

        C38859i(boolean z) {
            this.f100951a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, new C44404c(this.f100951a), null, null, null, null, null, 1007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$j */
    static final class C38860j extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100952a;

        C38860j(boolean z) {
            this.f100952a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, null, null, null, null, null, new C44404c(this.f100952a), null, null, null, 959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$k */
    public static final class C38861k implements C39170h {

        /* renamed from: a */
        final /* synthetic */ CutVideoStickerPointMusicViewModel f100953a;

        /* renamed from: a */
        public final void mo97007a() {
            this.f100953a.mo97133d(false);
        }

        C38861k(CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel) {
            this.f100953a = cutVideoStickerPointMusicViewModel;
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            this.f100953a.mo97133d(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel$l */
    static final class C38862l extends Lambda implements C7562b<CutVideoListState, CutVideoListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100954a;

        C38862l(boolean z) {
            this.f100954a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoListState invoke(CutVideoListState cutVideoListState) {
            C7573i.m23587b(cutVideoListState, "$receiver");
            return CutVideoListState.copy$default(cutVideoListState, null, new C44404c(this.f100954a), null, null, null, null, null, null, null, null, 1021, null);
        }
    }

    /* renamed from: i */
    private final C0052o<Boolean> m124047i() {
        return (C0052o) this.f100942g.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124046h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C38852b.f100944a);
    }

    /* renamed from: g */
    public final LiveData<Boolean> mo97049g() {
        return m124047i();
    }

    /* renamed from: h */
    private static CutVideoListState m124046h() {
        CutVideoListState cutVideoListState = new CutVideoListState(null, null, null, null, null, null, null, null, null, null, 1023, null);
        return cutVideoListState;
    }

    /* renamed from: a */
    public final void mo97042a(C39053bm bmVar) {
        C7573i.m23587b(bmVar, "<set-?>");
        this.f100941f = bmVar;
    }

    /* renamed from: a */
    public final void mo97043a(boolean z) {
        mo29038c(new C38862l(z));
    }

    /* renamed from: b */
    public final void mo97044b(boolean z) {
        mo29038c(new C38857g(z));
    }

    /* renamed from: c */
    public final void mo97045c(boolean z) {
        mo29038c(new C38856f(z));
    }

    /* renamed from: d */
    public final void mo97046d(boolean z) {
        mo29038c(new C38859i(true));
    }

    /* renamed from: e */
    public final void mo97047e(boolean z) {
        mo29038c(new C38853c(true));
    }

    /* renamed from: f */
    public final void mo97048f(boolean z) {
        mo29038c(new C38860j(z));
    }

    /* renamed from: g */
    public final void mo97050g(boolean z) {
        mo29038c(new C38854d(z));
    }

    /* renamed from: h */
    public final void mo97051h(boolean z) {
        mo29038c(new C38858h(z));
    }

    /* renamed from: j */
    public final void mo97053j(boolean z) {
        mo29038c(new C38851a(z));
    }

    /* renamed from: i */
    public final void mo97052i(boolean z) {
        m124047i().setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97039a(FragmentActivity fragmentActivity, int i, int i2) {
        C7573i.m23587b(fragmentActivity, "activity");
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoStickerPointMusicViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = (CutVideoStickerPointMusicViewModel) a;
        C39053bm bmVar = this.f100941f;
        if (bmVar == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar.mo97258a(i, i2, (C39170h) new C38861k(cutVideoStickerPointMusicViewModel));
    }

    /* renamed from: a */
    public final void mo97040a(FragmentActivity fragmentActivity, int i, VideoSegment videoSegment) {
        C7573i.m23587b(fragmentActivity, "activity");
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoPreviewViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…iewViewModel::class.java)");
        ((CutVideoPreviewViewModel) a).mo97092g();
        C39053bm bmVar = this.f100941f;
        if (bmVar == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar.mo97259a(i, videoSegment);
    }

    /* renamed from: a */
    public final void mo97041a(FragmentActivity fragmentActivity, boolean z, boolean z2) {
        C7573i.m23587b(fragmentActivity, "activity");
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoPreviewViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…iewViewModel::class.java)");
        ((CutVideoPreviewViewModel) a).mo97092g();
        C39053bm bmVar = this.f100941f;
        if (bmVar == null) {
            C7573i.m23583a("stickerPointController");
        }
        bmVar.mo97271b(z, z2);
    }
}
