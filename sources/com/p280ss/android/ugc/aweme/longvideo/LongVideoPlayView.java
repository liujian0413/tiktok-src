package com.p280ss.android.ugc.aweme.longvideo;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28249j;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p280ss.android.ugc.aweme.metrics.C33252aw;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.preload.C43270a;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView */
public final class LongVideoPlayView implements C0042h, C32717b, C34976f, C43270a {

    /* renamed from: n */
    public static final C32711a f85268n = new C32711a(null);

    /* renamed from: a */
    public final C28228a f85269a = new C28228a();

    /* renamed from: b */
    public C32732c f85270b;

    /* renamed from: c */
    public Aweme f85271c;

    /* renamed from: d */
    public String f85272d = "";

    /* renamed from: e */
    public int f85273e;

    /* renamed from: f */
    public final C44963i f85274f;

    /* renamed from: g */
    public final OnClickListener f85275g;

    /* renamed from: h */
    public final LongVideoPlayActivity f85276h;

    /* renamed from: i */
    public final C32752l f85277i;

    /* renamed from: j */
    public final VideoViewComponent f85278j;

    /* renamed from: k */
    public final AnimatedImageView f85279k;

    /* renamed from: l */
    public final ImageView f85280l;

    /* renamed from: m */
    public final C43316v f85281m;

    /* renamed from: o */
    private final String f85282o = "LongVideoPlayView";

    /* renamed from: p */
    private C34199d f85283p;

    /* renamed from: q */
    private C32712b f85284q;

    /* renamed from: r */
    private final ArrayList<C34976f> f85285r = new ArrayList<>();

    /* renamed from: s */
    private final ArrayList<C32733d> f85286s = new ArrayList<>();

    /* renamed from: t */
    private LongVideoMobViewModel f85287t;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$a */
    public static final class C32711a {
        private C32711a() {
        }

        public /* synthetic */ C32711a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b */
    public interface C32712b {
        /* renamed from: a */
        View mo84176a();

        /* renamed from: b */
        void mo84177b();

        /* renamed from: c */
        void mo84178c();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c */
    static final class C32713c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayView f85289a;

        C32713c(LongVideoPlayView longVideoPlayView) {
            this.f85289a = longVideoPlayView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42961az.m136380a(new C32716a());
            this.f85289a.mo84188c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d */
    public static final class C32714d implements C44963i {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayView f85290a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C32714d(LongVideoPlayView longVideoPlayView) {
            this.f85290a = longVideoPlayView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo63037a(int r3, int r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                com.ss.android.ugc.aweme.feed.b.a r3 = r3.f85269a
                int r3 = r3.f74354a
                if (r3 != 0) goto L_0x0069
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f85271c
                com.ss.android.ugc.aweme.feed.model.LongVideo r3 = com.p280ss.android.ugc.aweme.longvideo.C32747i.m106010a(r3)
                if (r3 == 0) goto L_0x0017
                int r3 = r3.getTrailerStartTime()
                goto L_0x0018
            L_0x0017:
                r3 = -1
            L_0x0018:
                if (r3 != 0) goto L_0x0063
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f85271c
                if (r3 == 0) goto L_0x0025
                java.lang.String r3 = r3.getAid()
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                com.ss.android.ugc.aweme.video.a r3 = com.p280ss.android.ugc.aweme.video.C43316v.m137466c(r3)
                int r4 = r3.f111811b
                long r0 = r3.f111810a
                int r3 = (int) r0
                r0 = 1950(0x79e, float:2.733E-42)
                if (r4 <= 0) goto L_0x0054
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f85271c
                if (r3 == 0) goto L_0x0044
                com.ss.android.ugc.aweme.feed.model.Video r3 = r3.getVideo()
                if (r3 == 0) goto L_0x0044
                int r3 = r3.getDuration()
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                if (r3 <= r0) goto L_0x004e
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r2.f85290a
                r4.mo84182a(r3)
                return
            L_0x004e:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                r3.mo84181a()
                return
            L_0x0054:
                if (r3 <= r0) goto L_0x005d
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r2.f85290a
                r4.mo84182a(r3)
                return
            L_0x005d:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                r3.mo84181a()
                return
            L_0x0063:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                r3.mo84181a()
                return
            L_0x0069:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f85290a
                r3.mo84187b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.LongVideoPlayView.C32714d.mo63037a(int, int):void");
        }
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        m105878g();
    }

    /* renamed from: a */
    public final void mo64942a(String str, long j, long j2) {
        int i = j == 0 ? 0 : (int) (((float) j2) / ((float) j));
        C32732c cVar = this.f85270b;
        if (cVar != null) {
            cVar.mo84207a(i);
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        for (C34976f a : this.f85285r) {
            a.mo63044a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        m105876e();
        for (C34976f a : this.f85285r) {
            a.mo63046a(str);
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        m105876e();
        this.f85280l.setVisibility(8);
        for (C34976f a : this.f85285r) {
            a.mo63045a(eVar);
        }
    }

    /* renamed from: d */
    private final void m105875d() {
        AnimatedImageView animatedImageView = this.f85279k;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
    }

    /* renamed from: e */
    private final void m105876e() {
        AnimatedImageView animatedImageView = this.f85279k;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        if (this.f85269a.f74354a != 0) {
            mo84187b();
        }
    }

    /* renamed from: f */
    private final boolean m105877f() {
        Iterator it = this.f85286s.iterator();
        while (it.hasNext()) {
            ((C32733d) it.next()).mo84208a();
        }
        return true;
    }

    /* renamed from: g */
    private final void m105878g() {
        C32712b bVar = this.f85284q;
        if (bVar != null) {
            bVar.mo84177b();
        }
        C34199d dVar = this.f85283p;
        if (dVar != null) {
            dVar.mo86939e();
        }
        this.f85269a.f74354a = 3;
        if (!C43316v.m137250H()) {
            this.f85281m.mo104924D();
            return;
        }
        C34199d dVar2 = this.f85283p;
        if (dVar2 != null) {
            dVar2.mo86943j();
        }
    }

    /* renamed from: a */
    public final void mo84181a() {
        if (m105877f()) {
            C32712b bVar = this.f85284q;
            if (bVar != null) {
                bVar.mo84178c();
            }
            C34199d dVar = this.f85283p;
            if (dVar != null) {
                dVar.mo86940f();
            }
            C34199d dVar2 = this.f85283p;
            if (dVar2 != null) {
                dVar2.mo86942i();
            }
            this.f85269a.f74354a = 2;
        }
    }

    /* renamed from: c */
    public final void mo84188c() {
        if (this.f85269a.f74354a == 3) {
            this.f85280l.setVisibility(8);
            mo84187b();
            return;
        }
        new C33252aw().mo85159c(this.f85271c, this.f85273e).mo85158a(this.f85272d).mo85157a(1).mo85252e();
        m105878g();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f85278j.mo107436b(this.f85274f);
        if (this.f85281m.mo104942b((C34976f) this)) {
            C34199d dVar = this.f85283p;
            if (dVar != null) {
                dVar.mo86931a();
            }
        }
        this.f85286s.clear();
        this.f85285r.clear();
        C43305j.m137386g().mo105029b((C43270a) this);
        try {
            this.f85281m.mo104922B();
            this.f85281m.mo104949y();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo84187b() {
        if (m105877f()) {
            C34199d dVar = this.f85283p;
            if (dVar != null) {
                dVar.mo86942i();
            }
            C32712b bVar = this.f85284q;
            if (bVar != null) {
                bVar.mo84178c();
            }
            C34199d dVar2 = this.f85283p;
            if (dVar2 != null) {
                dVar2.mo86941g();
            }
            this.f85269a.f74354a = 4;
        }
    }

    /* renamed from: a */
    public final void mo84185a(C32733d dVar) {
        C7573i.m23587b(dVar, "interceptor");
        this.f85286s.add(dVar);
    }

    /* renamed from: a */
    public final void mo84184a(C32712b bVar) {
        C7573i.m23587b(bVar, "view");
        this.f85284q = bVar;
        C32712b bVar2 = this.f85284q;
        if (bVar2 != null) {
            View a = bVar2.mo84176a();
            if (a != null) {
                a.setOnClickListener(this.f85275g);
            }
        }
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        for (C34976f b : this.f85285r) {
            b.mo64946b(cVar);
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        for (C34976f d : this.f85285r) {
            d.mo64951d(str);
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        for (C34976f e : this.f85285r) {
            e.mo64953e(str);
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        for (C34976f e_ : this.f85285r) {
            e_.mo64954e_(z);
        }
    }

    /* renamed from: b */
    private final void m105874b(Aweme aweme) {
        this.f85271c = aweme;
        this.f85283p = new C34199d(this.f85278j, (C34976f) this, (C28249j) null, this.f85277i);
        if (!C43316v.m137250H()) {
            C34199d dVar = this.f85283p;
            if (dVar != null) {
                dVar.f89179a = this.f85281m;
            }
        }
        C34199d dVar2 = this.f85283p;
        if (dVar2 != null) {
            dVar2.mo86934a(this.f85271c);
        }
        this.f85278j.mo107434a(this.f85274f);
    }

    /* renamed from: a */
    public final void mo64937a(float f) {
        m105876e();
        if (f > 0.0f) {
            this.f85280l.setVisibility(8);
        }
        if (!C43316v.m137250H()) {
            this.f85281m.mo104928a(f);
            return;
        }
        C34199d dVar = this.f85283p;
        if (dVar != null) {
            dVar.mo86932a(f);
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        C43305j.m137386g().mo105022a((C43270a) this);
        for (C34976f c : this.f85285r) {
            c.mo64949c(str);
        }
    }

    /* renamed from: a */
    public final void mo84182a(int i) {
        if (m105877f()) {
            C32712b bVar = this.f85284q;
            if (bVar != null) {
                bVar.mo84178c();
            }
            C34199d dVar = this.f85283p;
            if (dVar != null) {
                dVar.mo86933a(i);
            }
            C34199d dVar2 = this.f85283p;
            if (dVar2 != null) {
                dVar2.mo86942i();
            }
            this.f85269a.f74354a = 2;
        }
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        if (f > 0.0f && this.f85280l.getVisibility() == 0) {
            this.f85280l.setVisibility(8);
        }
        C32732c cVar = this.f85270b;
        if (cVar != null) {
            cVar.mo84206a(f);
        }
        for (C34976f b : this.f85285r) {
            b.mo64944b(f);
        }
    }

    /* renamed from: a */
    public final void mo84183a(Aweme aweme) {
        UrlModel urlModel;
        m105874b(aweme);
        AnimatedImageView animatedImageView = this.f85279k;
        UrlModel urlModel2 = null;
        if (animatedImageView != null) {
            C32752l lVar = this.f85277i;
            if (lVar != null) {
                Video a = lVar.mo84248a(aweme);
                if (a != null) {
                    urlModel = a.getOriginCover();
                    animatedImageView.mo60860a(urlModel);
                }
            }
            urlModel = null;
            animatedImageView.mo60860a(urlModel);
        }
        RemoteImageView remoteImageView = this.f85279k;
        C32752l lVar2 = this.f85277i;
        if (lVar2 != null) {
            Video a2 = lVar2.mo84248a(aweme);
            if (a2 != null) {
                urlModel2 = a2.getOriginCover();
            }
        }
        C23323e.m76524b(remoteImageView, urlModel2);
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        m105878g();
        C32732c cVar = this.f85270b;
        if (cVar != null) {
            cVar.mo84206a(0.0f);
        }
        mo64937a(0.0f);
        m105875d();
        this.f85280l.setVisibility(0);
        for (C34976f b : this.f85285r) {
            b.mo63047b(str);
        }
        this.f85276h.mo64983p();
    }

    /* renamed from: a */
    public final void mo84186a(C34976f fVar) {
        if (fVar != null && !this.f85285r.contains(fVar)) {
            this.f85285r.add(fVar);
        }
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
        for (C34976f b : this.f85285r) {
            b.mo64947b(z);
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        for (C34976f a : this.f85285r) {
            a.mo63043a(cVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayView(com.p280ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2, com.p280ss.android.ugc.aweme.longvideo.C32752l r3, com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent r4, com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView r5, android.widget.ImageView r6, com.p280ss.android.ugc.aweme.video.C43316v r7) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = "mIvReplay"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "mPlayerManager"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            r1.<init>()
            r1.f85276h = r2
            r1.f85277i = r3
            r1.f85278j = r4
            r1.f85279k = r5
            r1.f85280l = r6
            r1.f85281m = r7
            java.lang.String r2 = "LongVideoPlayView"
            r1.f85282o = r2
            com.ss.android.ugc.aweme.feed.b.a r2 = new com.ss.android.ugc.aweme.feed.b.a
            r2.<init>()
            r1.f85269a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f85285r = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f85286s = r2
            java.lang.String r2 = ""
            r1.f85272d = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2 = r1.f85276h
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.h r3 = (android.arch.lifecycle.C0042h) r3
            r2.mo55a(r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2 = r1.f85276h
            android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a.m105912a(r2)
            r1.f85287t = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85287t
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r2.f85375a
            if (r2 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r2 = ""
        L_0x0064:
            r1.f85272d = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f85287t
            if (r2 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0071
            int r2 = r2.f85376b
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r1.f85273e = r2
            android.widget.ImageView r2 = r1.f85280l
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1 r3 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.ImageView r2 = r1.f85280l
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d
            r2.<init>(r1)
            com.ss.android.ugc.playerkit.videoview.i r2 = (com.p280ss.android.ugc.playerkit.videoview.C44963i) r2
            r1.f85274f = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f85275g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideo.LongVideoPlayView.<init>(com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity, com.ss.android.ugc.aweme.longvideo.l, com.ss.android.ugc.playerkit.videoview.VideoViewComponent, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, android.widget.ImageView, com.ss.android.ugc.aweme.video.v):void");
    }
}
