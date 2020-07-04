package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.util.C6292i;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39174d;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39174d.C39176b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39194h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39195i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39195i.C39198b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39209j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39164b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39169g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39170h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39171i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av */
public final class C38982av implements C39053bm {

    /* renamed from: q */
    public static final C38983a f101215q = new C38983a(null);

    /* renamed from: a */
    public C39055bo f101216a;

    /* renamed from: b */
    public C39054bn f101217b;

    /* renamed from: c */
    public final C39195i f101218c = new C39195i();

    /* renamed from: d */
    public AVMusic f101219d;

    /* renamed from: e */
    public C39171i f101220e;

    /* renamed from: f */
    public final C39174d f101221f = new C39174d();

    /* renamed from: g */
    public VideoSegment f101222g;

    /* renamed from: h */
    public boolean f101223h;

    /* renamed from: i */
    public boolean f101224i;

    /* renamed from: j */
    public long f101225j;

    /* renamed from: k */
    public C39209j f101226k;

    /* renamed from: l */
    public C39252c f101227l;

    /* renamed from: m */
    public int f101228m;

    /* renamed from: n */
    public CutVideoStickerPointMusicViewModel f101229n;

    /* renamed from: o */
    public boolean f101230o;

    /* renamed from: p */
    public boolean f101231p;

    /* renamed from: r */
    private AVMusic f101232r;

    /* renamed from: s */
    private List<AVMusic> f101233s;

    /* renamed from: t */
    private C39169g f101234t;

    /* renamed from: u */
    private CutVideoMultiModeViewModel f101235u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$a */
    public static final class C38983a {
        private C38983a() {
        }

        public /* synthetic */ C38983a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$b */
    public static final class C38984b implements C39176b {

        /* renamed from: a */
        final /* synthetic */ C38982av f101236a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f101237b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$b$a */
        public static final class C38985a implements C39164b {
            C38985a() {
            }

            /* renamed from: a */
            public final void mo97287a(String str) {
                C39182e.m125094a(str);
                C7276d.m22816c(new File(C39182e.m125096b()).getPath());
            }

            /* renamed from: a */
            public final void mo97288a(Throwable th) {
                C7276d.m22816c(new File(C39182e.m125096b()).getPath());
            }
        }

        /* renamed from: a */
        public final void mo97285a() {
            if (this.f101236a.f101218c.mo97500a()) {
                this.f101236a.f101230o = true;
            }
            this.f101236a.f101218c.mo97502b();
            this.f101236a.f101225j = System.currentTimeMillis();
        }

        C38984b(C38982av avVar, FragmentActivity fragmentActivity) {
            this.f101236a = avVar;
            this.f101237b = fragmentActivity;
        }

        /* renamed from: a */
        public final void mo97286a(boolean z, boolean z2, boolean z3) {
            if (z) {
                this.f101236a.f101218c.mo97507f();
                C10761a.m31387a((Context) this.f101237b, this.f101237b.getResources().getString(R.string.e26)).mo25750a();
                this.f101236a.f101224i = true;
            } else if (this.f101236a.f101230o) {
                this.f101236a.f101218c.mo97503c();
                this.f101236a.f101230o = false;
            }
            if (z3) {
                C39182e.m125092a(this.f101236a.f101218c.f101584a, (C39164b) new C38985a());
            }
            C39194h.m125153a(z, z2, System.currentTimeMillis() - this.f101236a.f101225j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$c */
    public static final class C38986c implements C39198b {

        /* renamed from: a */
        final /* synthetic */ C38982av f101238a;

        /* renamed from: a */
        public final boolean mo97290a() {
            return this.f101238a.mo97280k();
        }

        /* renamed from: b */
        public final List<VideoSegment> mo97291b() {
            C39171i iVar = this.f101238a.f101220e;
            if (iVar == null) {
                C7573i.m23580a();
            }
            return iVar.mo96784c();
        }

        C38986c(C38982av avVar) {
            this.f101238a = avVar;
        }

        /* renamed from: a */
        public final void mo97289a(int i) {
            if (!(i == 5 || this.f101238a.f101220e == null || C39195i.m125157a(i))) {
                C39171i iVar = this.f101238a.f101220e;
                if (iVar == null) {
                    C7573i.m23580a();
                }
                iVar.mo96783b();
            }
            if (!(i == 7 || i == 6)) {
                this.f101238a.mo97269b().mo97603e();
            }
            this.f101238a.mo97255a().mo97352c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$d */
    public static final class C38987d implements C39169g {

        /* renamed from: a */
        final /* synthetic */ C38982av f101239a;

        /* renamed from: b */
        public final VESize mo97294b() {
            C15389d dVar = this.f101239a.f101218c.f101584a;
            if (dVar != null) {
                return dVar.mo38828c();
            }
            return null;
        }

        /* renamed from: a */
        public final int mo97292a() {
            if (this.f101239a.f101222g == null) {
                return 0;
            }
            VideoSegment videoSegment = this.f101239a.f101222g;
            if (videoSegment == null) {
                C7573i.m23580a();
            }
            return videoSegment.f100769k;
        }

        C38987d(C38982av avVar) {
            this.f101239a = avVar;
        }

        /* renamed from: a */
        public final void mo97293a(float f, float f2, float f3, int i, int i2) {
            C15389d dVar = this.f101239a.f101218c.f101584a;
            if (dVar != null) {
                dVar.mo38797a(f, f2, f3, 0, i2);
            }
            C38982av.m124496a(this.f101239a).f101619a = f;
            C38982av.m124496a(this.f101239a).f101620b = f2;
            C38982av.m124496a(this.f101239a).f101621c = 0;
            C38982av.m124496a(this.f101239a).f101622d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$e */
    public static final class C38988e implements C39170h {

        /* renamed from: a */
        final /* synthetic */ C38982av f101240a;

        /* renamed from: a */
        public final void mo97007a() {
        }

        C38988e(C38982av avVar) {
            this.f101240a = avVar;
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            if (!this.f101240a.mo97280k() || this.f101240a.f101219d == null) {
                this.f101240a.f101218c.mo97505d();
                if (this.f101240a.mo97280k()) {
                    this.f101240a.f101218c.mo97494a(0);
                } else {
                    this.f101240a.f101218c.mo97494a((long) this.f101240a.f101228m);
                }
            } else {
                C38982av.m124497b(this.f101240a).mo97130a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$f */
    public static final class C38989f implements C39170h {
        C38989f() {
        }

        /* renamed from: a */
        public final void mo97007a() {
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.av$g */
    public static final class C38990g implements C39170h {

        /* renamed from: a */
        final /* synthetic */ C38982av f101241a;

        /* renamed from: a */
        public final void mo97007a() {
            this.f101241a.f101218c.mo97494a(0);
            this.f101241a.mo97268a(false, false);
        }

        C38990g(C38982av avVar) {
            this.f101241a = avVar;
        }

        /* renamed from: a */
        public final void mo97008a(int i) {
            boolean z;
            C38982av avVar = this.f101241a;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            avVar.mo97268a(z, false);
        }
    }

    /* renamed from: a */
    public final void mo97263a(C39055bo boVar) {
        C7573i.m23587b(boVar, "<set-?>");
        this.f101216a = boVar;
    }

    /* renamed from: a */
    public final void mo97265a(C39252c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.f101227l = cVar;
    }

    /* renamed from: a */
    public final void mo97268a(boolean z, boolean z2) {
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        bnVar.mo97351b(true);
        if (this.f101219d != null) {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = this.f101229n;
            if (cutVideoStickerPointMusicViewModel == null) {
                C7573i.m23583a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel.mo97130a(false);
        } else {
            CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel2 = this.f101229n;
            if (cutVideoStickerPointMusicViewModel2 == null) {
                C7573i.m23583a("musicViewModel");
            }
            cutVideoStickerPointMusicViewModel2.mo97133d(false);
            this.f101218c.mo97494a(0);
        }
        C39171i iVar = this.f101220e;
        if (iVar != null) {
            iVar.mo96782a(true, z);
        }
    }

    /* renamed from: a */
    public final void mo97267a(boolean z) {
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        bnVar.mo97351b(false);
        if (C35563c.f93231M.mo93306b(Property.EnableImportAvSync) == 512) {
            this.f101218c.mo97504c(1);
        }
        this.f101218c.mo97509h();
        this.f101218c.mo97505d();
        C39171i iVar = this.f101220e;
        if (iVar != null) {
            iVar.mo96782a(false, true);
        }
    }

    /* renamed from: a */
    public final void mo97266a(List<AVMusic> list) {
        this.f101233s = list;
        if (C39182e.m125105i()) {
            C39055bo boVar = this.f101216a;
            if (boVar == null) {
                C7573i.m23583a("musicViewController");
            }
            boVar.mo97299a(list);
        }
    }

    /* renamed from: p */
    private final void m124498p() {
        this.f101232r = C39360dw.m125725a().mo97931b();
    }

    /* renamed from: h */
    public final void mo97277h() {
        C39360dw.m125725a().mo97928a(this.f101232r);
    }

    /* renamed from: j */
    public final void mo97279j() {
        this.f101218c.mo97496a((C39170h) new C38990g(this), false);
    }

    /* renamed from: k */
    public final boolean mo97280k() {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f101235u;
        if (cutVideoMultiModeViewModel == null) {
            C7573i.m23583a("multiModeViewModel");
        }
        return cutVideoMultiModeViewModel.mo29069f();
    }

    /* renamed from: l */
    public final C39209j mo97281l() {
        C39209j jVar = this.f101226k;
        if (jVar == null) {
            C7573i.m23583a("stickPointVideoRotateData");
        }
        return jVar;
    }

    /* renamed from: m */
    public final AVMusic mo97282m() {
        C39055bo boVar = this.f101216a;
        if (boVar == null) {
            C7573i.m23583a("musicViewController");
        }
        return boVar.mo97295a();
    }

    /* renamed from: n */
    public final void mo97283n() {
        this.f101228m = this.f101218c.mo97506e();
    }

    /* renamed from: o */
    public final C39054bn mo97284o() {
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        return bnVar;
    }

    /* renamed from: a */
    public final C39054bn mo97255a() {
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        return bnVar;
    }

    /* renamed from: b */
    public final C39252c mo97269b() {
        C39252c cVar = this.f101227l;
        if (cVar == null) {
            C7573i.m23583a("videoEditView");
        }
        return cVar;
    }

    /* renamed from: e */
    public final void mo97274e() {
        this.f101218c.mo97508g();
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        bnVar.mo97351b(false);
    }

    /* renamed from: f */
    public final void mo97275f() {
        if (this.f101218c.mo97500a()) {
            this.f101230o = true;
        }
        this.f101218c.mo97502b();
    }

    /* renamed from: g */
    public final void mo97276g() {
        if (this.f101230o && !this.f101231p) {
            this.f101218c.mo97503c();
        }
        this.f101230o = false;
        this.f101231p = false;
    }

    /* renamed from: i */
    public final void mo97278i() {
        C39193g.f101577a.mo97478a(mo97282m(), mo97273d(), this.f101224i, mo97280k(), this.f101223h);
        mo97283n();
    }

    /* renamed from: c */
    public final List<VideoSegment> mo97272c() {
        if (this.f101220e != null) {
            C39171i iVar = this.f101220e;
            if (iVar == null) {
                C7573i.m23580a();
            }
            if (!C6292i.m19525a(iVar.mo96784c())) {
                ArrayList arrayList = new ArrayList();
                C39171i iVar2 = this.f101220e;
                if (iVar2 == null) {
                    C7573i.m23580a();
                }
                for (VideoSegment videoSegment : iVar2.mo96784c()) {
                    if (!videoSegment.f100768j && !videoSegment.f100776r && !this.f101221f.mo97458a(videoSegment)) {
                        String a = videoSegment.mo96896a(false);
                        C7573i.m23582a((Object) a, "videoSegment.getPath(false)");
                        if (!C40173d.m128357b(a)) {
                            arrayList.add(videoSegment);
                        }
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final List<VideoSegment> mo97273d() {
        if (this.f101220e != null) {
            C39171i iVar = this.f101220e;
            if (iVar == null) {
                C7573i.m23580a();
            }
            if (!C6292i.m19525a(iVar.mo96784c())) {
                ArrayList arrayList = new ArrayList();
                C39171i iVar2 = this.f101220e;
                if (iVar2 == null) {
                    C7573i.m23580a();
                }
                for (VideoSegment videoSegment : iVar2.mo96784c()) {
                    if (!videoSegment.f100768j) {
                        arrayList.add(videoSegment);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo97264a(C39171i iVar) {
        this.f101220e = iVar;
    }

    /* renamed from: a */
    public final void mo97262a(C39054bn bnVar) {
        C7573i.m23587b(bnVar, "<set-?>");
        this.f101217b = bnVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C39209j m124496a(C38982av avVar) {
        C39209j jVar = avVar.f101226k;
        if (jVar == null) {
            C7573i.m23583a("stickPointVideoRotateData");
        }
        return jVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoStickerPointMusicViewModel m124497b(C38982av avVar) {
        CutVideoStickerPointMusicViewModel cutVideoStickerPointMusicViewModel = avVar.f101229n;
        if (cutVideoStickerPointMusicViewModel == null) {
            C7573i.m23583a("musicViewModel");
        }
        return cutVideoStickerPointMusicViewModel;
    }

    /* renamed from: b */
    public final void mo97270b(boolean z) {
        if (C35563c.f93231M.mo93306b(Property.EnableImportAvSync) == 512) {
            this.f101218c.mo97504c(0);
        }
        if (!C39182e.m125105i() && this.f101233s != null) {
            C39055bo boVar = this.f101216a;
            if (boVar == null) {
                C7573i.m23583a("musicViewController");
            }
            boVar.mo97299a(this.f101233s);
            this.f101233s = null;
        }
    }

    /* renamed from: a */
    public final void mo97260a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoStickerPointMusicViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
        this.f101229n = (CutVideoStickerPointMusicViewModel) a;
        JediViewModel a2 = C36113b.m116288a(fragmentActivity).mo91871a(CutVideoMultiModeViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…odeViewModel::class.java)");
        this.f101235u = (CutVideoMultiModeViewModel) a2;
        this.f101221f.mo97454a((Activity) fragmentActivity);
        this.f101221f.mo97455a((C39176b) new C38984b(this, fragmentActivity));
        this.f101218c.mo97497a((C39198b) new C38986c(this));
        this.f101226k = new C39209j();
        this.f101234t = new C38987d(this);
        m124498p();
    }

    /* renamed from: a */
    public final void mo97261a(C15389d dVar) {
        this.f101218c.f101584a = dVar;
        this.f101221f.f101534a = dVar;
        this.f101221f.mo97460b(mo97272c());
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        bnVar.mo97351b(mo97280k());
        C39171i iVar = this.f101220e;
        if (iVar != null) {
            iVar.mo96782a(mo97280k(), false);
        }
        this.f101218c.mo97496a((C39170h) new C38988e(this), false);
        if (C39182e.m125105i()) {
            C39193g.f101577a.mo97479a(mo97273d());
        } else {
            C39193g.f101577a.mo97483b(mo97273d());
        }
    }

    /* renamed from: b */
    public final void mo97271b(boolean z, boolean z2) {
        if (z) {
            this.f101218c.mo97491a(this.f101222g);
        }
        if (mo97280k()) {
            C39171i iVar = this.f101220e;
            if (iVar != null) {
                iVar.mo96783b();
            }
            this.f101218c.mo97499a(z, z2, (C39170h) new C38989f());
        }
        this.f101222g = null;
    }

    /* renamed from: a */
    public final void mo97259a(int i, VideoSegment videoSegment) {
        this.f101218c.f101588e = i;
        this.f101222g = videoSegment;
        if (mo97280k()) {
            this.f101218c.mo97505d();
        }
    }

    /* renamed from: a */
    public final void mo97257a(int i, int i2, Intent intent) {
        C39054bn bnVar = this.f101217b;
        if (bnVar == null) {
            C7573i.m23583a("stickPointVideoSegController");
        }
        bnVar.mo97345a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo97256a(float f, float f2, float f3) {
        Integer num;
        float[] fArr;
        C39169g gVar = this.f101234t;
        if (gVar != null) {
            VESize b = gVar.mo97294b();
            if (b != null) {
                int i = b.f116386b;
                int i2 = b.f116385a;
                C39169g gVar2 = this.f101234t;
                if (gVar2 != null) {
                    num = Integer.valueOf(gVar2.mo97292a());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                int intValue = num.intValue();
                if (i2 == 0 || i == 0) {
                    fArr = new float[]{1.0f, 1.0f};
                } else {
                    fArr = intValue % NormalGiftView.ALPHA_180 == 90 ? new float[]{f / ((float) i), f3 / ((float) i2)} : new float[]{f / ((float) i2), f3 / ((float) i)};
                }
                float min = Math.min(fArr[0], fArr[1]);
                float f4 = (f2 / 2.0f) - (f3 / 2.0f);
                C39169g gVar3 = this.f101234t;
                if (gVar3 != null) {
                    gVar3.mo97293a(min, min, (float) intValue, 0, (int) f4);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97258a(int i, int i2, C39170h hVar) {
        C7573i.m23587b(hVar, "listener");
        if (mo97280k()) {
            this.f101218c.mo97493a(i, i2, hVar);
        }
    }
}
