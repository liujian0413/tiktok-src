package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.ktx.C12636a;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39162c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39168f;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39170h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay */
public final class C38998ay extends C12629j implements C44396a {

    /* renamed from: s */
    public static final C38999a f101256s = new C38999a(null);

    /* renamed from: i */
    public C38982av f101257i;

    /* renamed from: j */
    public StickPointMusicView f101258j;

    /* renamed from: k */
    public C39055bo f101259k;

    /* renamed from: l */
    public final C39162c f101260l = new C39162c();

    /* renamed from: m */
    public AVMusic f101261m;

    /* renamed from: n */
    public CutVideoStickerPointMusicViewModel f101262n;

    /* renamed from: o */
    public CutVideoListViewModel f101263o;

    /* renamed from: p */
    public CutVideoMultiModeViewModel f101264p;

    /* renamed from: q */
    public C38997ax f101265q;

    /* renamed from: r */
    public CutVideoTitleBarViewModel f101266r;

    /* renamed from: t */
    private CutVideoMultiBottomViewModel f101267t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$a */
    public static final class C38999a {
        private C38999a() {
        }

        public /* synthetic */ C38999a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$b */
    public static final class C39000b implements C38997ax {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101268a;

        /* renamed from: b */
        public final void mo97316b(View view) {
            C7573i.m23587b(view, "retryView");
        }

        /* renamed from: b */
        public final void mo97315b() {
            C38998ay.m124580a(this.f101268a).mo97537a();
        }

        /* renamed from: c */
        public final void mo97318c() {
            C38998ay.m124580a(this.f101268a).mo97540c();
        }

        /* renamed from: d */
        public final void mo97319d() {
            C38998ay.m124580a(this.f101268a).mo97539b();
        }

        /* renamed from: e */
        public final List<VideoSegment> mo97320e() {
            return this.f101268a.mo30920G().mo97273d();
        }

        /* renamed from: a */
        public final void mo97310a() {
            C10761a.m31383a(this.f101268a.mo31011s(), (int) R.string.ci7).mo25750a();
        }

        /* renamed from: f */
        public final void mo97321f() {
            this.f101268a.mo30920G().f101231p = true;
            if (this.f101268a.mo30920G().f101218c.mo97500a()) {
                this.f101268a.mo30920G().f101230o = true;
            }
            this.f101268a.mo30920G().f101218c.mo97502b();
        }

        C39000b(C38998ay ayVar) {
            this.f101268a = ayVar;
        }

        /* renamed from: a */
        public final void mo97311a(int i) {
            C38998ay.m124580a(this.f101268a).mo97538a(i);
        }

        /* renamed from: b */
        public final void mo97317b(AVMusic aVMusic) {
            this.f101268a.f101260l.mo97443a();
        }

        /* renamed from: a */
        public final void mo97313a(AVMusic aVMusic) {
            this.f101268a.mo30920G().f101218c.mo97502b();
        }

        /* renamed from: a */
        public final void mo97312a(View view) {
            C7573i.m23587b(view, "segView");
            C39193g.f101577a.mo97485c();
            C38998ay.m124581b(this.f101268a).mo97053j(true);
            C38998ay.m124582c(this.f101268a).mo97153e(false);
            C38998ay.m124583d(this.f101268a).mo97074b(true);
            C38998ay.m124584e(this.f101268a).mo97132c(true);
            C38998ay.m124581b(this.f101268a).mo97046d(true);
            C12629j jVar = this.f101268a.f33524c;
            if (jVar != null) {
                C12636a.m36710a((C12604b) jVar, "CutVideoListScene");
                C12629j jVar2 = this.f101268a.f33524c;
                if (jVar2 != null) {
                    C12636a.m36710a((C12604b) jVar2, "CutVideoBottomBarScene");
                    C12629j jVar3 = this.f101268a.f33524c;
                    if (jVar3 != null) {
                        C12636a.m36710a((C12604b) jVar3, "CutVideoEditScene");
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
        }

        /* renamed from: a */
        public final void mo97314a(AVMusic aVMusic, boolean z) {
            if (aVMusic == null) {
                if (this.f101268a.mo30920G().f101230o) {
                    this.f101268a.mo30920G().f101218c.mo97503c();
                    this.f101268a.mo30920G().f101230o = false;
                }
                this.f101268a.f101260l.mo97445b();
                return;
            }
            if (this.f101268a.f101261m != null) {
                AVMusic aVMusic2 = this.f101268a.f101261m;
                if (aVMusic2 == null) {
                    C7573i.m23580a();
                }
                if (!TextUtils.isEmpty(aVMusic2.getMusicId())) {
                    AVMusic aVMusic3 = this.f101268a.f101261m;
                    if (aVMusic3 == null) {
                        C7573i.m23580a();
                    }
                    if (C7573i.m23585a((Object) aVMusic3.getMusicId(), (Object) aVMusic.getMusicId())) {
                        if (this.f101268a.mo30920G().f101230o) {
                            this.f101268a.mo30920G().f101218c.mo97503c();
                            this.f101268a.mo30920G().f101230o = false;
                        }
                        this.f101268a.f101260l.mo97445b();
                        return;
                    }
                }
            }
            this.f101268a.mo30920G().f101223h = z;
            this.f101268a.f101261m = aVMusic;
            this.f101268a.mo30920G().f101219d = aVMusic;
            this.f101268a.mo97323a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$c */
    public static final class C39001c implements C39168f {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101269a;

        /* renamed from: a */
        public final List<VideoSegment> mo97324a() {
            return C38998ay.m124585f(this.f101269a).mo97320e();
        }

        /* renamed from: b */
        public final void mo97328b() {
            C38998ay.m124585f(this.f101269a).mo97321f();
        }

        C39001c(C38998ay ayVar) {
            this.f101269a = ayVar;
        }

        /* renamed from: a */
        public final void mo97325a(View view) {
            C7573i.m23587b(view, "segView");
            C38998ay.m124585f(this.f101269a).mo97312a(view);
        }

        /* renamed from: b */
        public final void mo97329b(View view) {
            C7573i.m23587b(view, "retryView");
            C38998ay.m124586g(this.f101269a).mo97303c();
            C38998ay.m124585f(this.f101269a).mo97316b(view);
        }

        /* renamed from: a */
        public final void mo97326a(AVMusic aVMusic) {
            C38998ay.m124585f(this.f101269a).mo97313a(aVMusic);
        }

        /* renamed from: b */
        public final void mo97330b(AVMusic aVMusic) {
            C38998ay.m124585f(this.f101269a).mo97317b(aVMusic);
        }

        /* renamed from: a */
        public final void mo97327a(AVMusic aVMusic, boolean z) {
            C38998ay.m124585f(this.f101269a).mo97314a(aVMusic, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$d */
    static final class C39002d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101270a;

        C39002d(C38998ay ayVar) {
            this.f101270a = ayVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124626a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124626a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            StickPointMusicView a = C38998ay.m124580a(this.f101270a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$e */
    static final class C39003e<T> implements C0053p<Pair<? extends Boolean, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101271a;

        C39003e(C38998ay ayVar) {
            this.f101271a = ayVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Pair<Boolean, Float> pair) {
            if (pair != null) {
                float dimension = this.f101271a.mo31017x().getDimension(R.dimen.kg) - this.f101271a.mo31017x().getDimension(R.dimen.mm);
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    C38998ay.m124580a(this.f101271a).setAlpha(1.0f - (1.0f - (((Number) pair.getSecond()).floatValue() / dimension)));
                } else {
                    C38998ay.m124580a(this.f101271a).setAlpha(((Number) pair.getSecond()).floatValue() / dimension);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$f */
    static final class C39004f extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101272a;

        C39004f(C38998ay ayVar) {
            this.f101272a = ayVar;
            super(2);
        }

        /* renamed from: a */
        private void m124628a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101272a.mo97323a(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124628a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$g */
    static final class C39005g extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101273a;

        C39005g(C38998ay ayVar) {
            this.f101273a = ayVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124629a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124629a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C38998ay.m124580a(this.f101273a).setButtonClickable(false);
            }
            C38889a.m124163a(C38998ay.m124580a(this.f101273a), z, new C7562b<Boolean, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C39005g f101274a;

                {
                    this.f101274a = r1;
                }

                /* renamed from: a */
                private void m124630a(boolean z) {
                    C38998ay.m124580a(this.f101274a.f101273a).setButtonClickable(z);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m124630a(((Boolean) obj).booleanValue());
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$h */
    static final class C39007h extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101275a;

        C39007h(C38998ay ayVar) {
            this.f101275a = ayVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124631a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124631a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C38998ay.m124580a(this.f101275a).setButtonClickable(false);
            }
            C38889a.m124164b(C38998ay.m124580a(this.f101275a), z, new C7562b<Boolean, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C39007h f101276a;

                {
                    this.f101276a = r1;
                }

                /* renamed from: a */
                private void m124632a(boolean z) {
                    C38998ay.m124580a(this.f101276a.f101275a).setButtonClickable(z);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m124632a(((Boolean) obj).booleanValue());
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$i */
    static final class C39009i extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101277a;

        C39009i(C38998ay ayVar) {
            this.f101277a = ayVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124633a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124633a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                this.f101277a.f101260l.mo97443a();
            } else {
                this.f101277a.f101260l.mo97445b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ay$j */
    public static final class C39010j implements C39170h {

        /* renamed from: a */
        final /* synthetic */ C38998ay f101278a;

        /* renamed from: b */
        final /* synthetic */ boolean f101279b;

        /* renamed from: a */
        public final void mo97007a() {
            this.f101278a.f101260l.mo97445b();
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            this.f101278a.f101260l.mo97445b();
            if (this.f101279b) {
                this.f101278a.mo30920G().f101218c.mo97503c();
                C39171i iVar = this.f101278a.mo30920G().f101220e;
                if (iVar != null) {
                    iVar.mo96780a();
                }
            }
        }

        C39010j(C38998ay ayVar, boolean z) {
            this.f101278a = ayVar;
            this.f101279b = z;
        }
    }

    /* renamed from: a */
    public final void mo97322a(C38982av avVar) {
        C7573i.m23587b(avVar, "<set-?>");
        this.f101257i = avVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.c29);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.music_view)");
        this.f101258j = (StickPointMusicView) h_;
        Activity v = mo31015v();
        C7573i.m23582a((Object) v, "requireActivity()");
        this.f101259k = new C38991aw(v);
        StickPointMusicView stickPointMusicView = this.f101258j;
        if (stickPointMusicView == null) {
            C7573i.m23583a("musicView");
        }
        C39055bo boVar = this.f101259k;
        if (boVar == null) {
            C7573i.m23583a("musicViewController");
        }
        IStickPointMusicAdapter b = boVar.mo97300b();
        if (b == null) {
            C7573i.m23580a();
        }
        stickPointMusicView.setRecyleViewAdapter(b);
        m124578J();
        C38982av avVar = this.f101257i;
        if (avVar == null) {
            C7573i.m23583a("stickPointController");
        }
        C39055bo boVar2 = this.f101259k;
        if (boVar2 == null) {
            C7573i.m23583a("musicViewController");
        }
        avVar.mo97263a(boVar2);
        this.f101260l.mo97444a(this.f33526d_);
    }

    /* renamed from: a */
    public final void mo97323a(boolean z) {
        this.f101260l.mo97443a();
        C38982av avVar = this.f101257i;
        if (avVar == null) {
            C7573i.m23583a("stickPointController");
        }
        avVar.f101218c.mo97495a(this.f101261m, 2, (C39170h) new C39010j(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: G */
    public final C38982av mo30920G() {
        C38982av avVar = this.f101257i;
        if (avVar == null) {
            C7573i.m23583a("stickPointController");
        }
        return avVar;
    }

    /* renamed from: J */
    private final void m124578J() {
        this.f101265q = new C39000b(this);
        C39055bo boVar = this.f101259k;
        if (boVar == null) {
            C7573i.m23583a("musicViewController");
        }
        C38997ax axVar = this.f101265q;
        if (axVar == null) {
            C7573i.m23583a("listener");
        }
        boVar.mo97298a(axVar);
        StickPointMusicView stickPointMusicView = this.f101258j;
        if (stickPointMusicView == null) {
            C7573i.m23583a("musicView");
        }
        stickPointMusicView.setStickePointMusicListener(new C39001c(this));
    }

    /* renamed from: H */
    private final void m124576H() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoStickerPointMusicViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
            this.f101262n = (CutVideoStickerPointMusicViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoListViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…istViewModel::class.java)");
                this.f101263o = (CutVideoListViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoMultiModeViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…odeViewModel::class.java)");
                    this.f101264p = (CutVideoMultiModeViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoMultiBottomViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…tomViewModel::class.java)");
                        this.f101267t = (CutVideoMultiBottomViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoTitleBarViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…BarViewModel::class.java)");
                            this.f101266r = (CutVideoTitleBarViewModel) a5;
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: I */
    private final void m124577I() {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f101262n;
        if (cutVideoStickerPointMusicViewModel == null) {
            C7573i.m23583a("musicViewModel");
        }
        mo91869c(cutVideoStickerPointMusicViewModel, C39011az.f101280a, new C11672v(), new C39004f(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f101262n;
        if (cutVideoStickerPointMusicViewModel2 == null) {
            C7573i.m23583a("musicViewModel");
        }
        mo91869c(cutVideoStickerPointMusicViewModel2, C39031ba.f101325a, new C11672v(), new C39005g(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel3 = this.f101262n;
        if (cutVideoStickerPointMusicViewModel3 == null) {
            C7573i.m23583a("musicViewModel");
        }
        mo91869c(cutVideoStickerPointMusicViewModel3, C39032bb.f101326a, new C11672v(), new C39007h(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel4 = this.f101262n;
        if (cutVideoStickerPointMusicViewModel4 == null) {
            C7573i.m23583a("musicViewModel");
        }
        mo91869c(cutVideoStickerPointMusicViewModel4, C39033bc.f101327a, new C11672v(), new C39009i(this));
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel5 = this.f101262n;
        if (cutVideoStickerPointMusicViewModel5 == null) {
            C7573i.m23583a("musicViewModel");
        }
        mo91868b(cutVideoStickerPointMusicViewModel5, C39034bd.f101328a, new C11672v(), new C39002d(this));
        CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = this.f101267t;
        if (cutVideoMultiBottomViewModel == null) {
            C7573i.m23583a("multiBottomViewModel");
        }
        cutVideoMultiBottomViewModel.mo29069f().observe(this, new C39003e(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ StickPointMusicView m124580a(C38998ay ayVar) {
        StickPointMusicView stickPointMusicView = ayVar.f101258j;
        if (stickPointMusicView == null) {
            C7573i.m23583a("musicView");
        }
        return stickPointMusicView;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoListViewModel m124581b(C38998ay ayVar) {
        CutVideoListViewModel cutVideoListViewModel = ayVar.f101263o;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("videoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoTitleBarViewModel m124582c(C38998ay ayVar) {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = ayVar.f101266r;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        return cutVideoTitleBarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CutVideoMultiModeViewModel m124583d(C38998ay ayVar) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = ayVar.f101264p;
        if (cutVideoMultiModeViewModel == null) {
            C7573i.m23583a("videoMultiModeViewModel");
        }
        return cutVideoMultiModeViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m124584e(C38998ay ayVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = ayVar.f101262n;
        if (cutVideoStickerPointMusicViewModel == null) {
            C7573i.m23583a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ C38997ax m124585f(C38998ay ayVar) {
        C38997ax axVar = ayVar.f101265q;
        if (axVar == null) {
            C7573i.m23583a("listener");
        }
        return axVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ C39055bo m124586g(C38998ay ayVar) {
        C39055bo boVar = ayVar.f101259k;
        if (boVar == null) {
            C7573i.m23583a("musicViewController");
        }
        return boVar;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124576H();
        m124577I();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aib, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_music, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
