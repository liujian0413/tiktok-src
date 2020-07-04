package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28249j;
import com.p280ss.android.ugc.aweme.longvideo.C32715a;
import com.p280ss.android.ugc.aweme.longvideo.C32717b;
import com.p280ss.android.ugc.aweme.longvideo.C32732c;
import com.p280ss.android.ugc.aweme.longvideo.C32733d;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
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
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView */
public final class LoftVideoPlayView implements C0042h, C32717b, C34976f, C43270a {

    /* renamed from: a */
    public final C28228a f65451a = new C28228a();

    /* renamed from: b */
    public C32732c f65452b;

    /* renamed from: c */
    public String f65453c = "";

    /* renamed from: d */
    public int f65454d;

    /* renamed from: e */
    public boolean f65455e;

    /* renamed from: f */
    public boolean f65456f;

    /* renamed from: g */
    public final C44963i f65457g;

    /* renamed from: h */
    public final OnClickListener f65458h;

    /* renamed from: i */
    public final FragmentActivity f65459i;

    /* renamed from: j */
    public final VideoViewComponent f65460j;

    /* renamed from: k */
    public final AnimatedImageView f65461k;

    /* renamed from: l */
    public final ImageView f65462l;

    /* renamed from: m */
    public final C43316v f65463m;

    /* renamed from: n */
    private final String f65464n = "LongVideoPlayView";

    /* renamed from: o */
    private C34199d f65465o;

    /* renamed from: p */
    private C24840a f65466p;

    /* renamed from: q */
    private final ArrayList<C34976f> f65467q = new ArrayList<>();

    /* renamed from: r */
    private final ArrayList<C32733d> f65468r = new ArrayList<>();

    /* renamed from: s */
    private Aweme f65469s;

    /* renamed from: t */
    private LongVideoMobViewModel f65470t;

    /* renamed from: u */
    private C32715a f65471u;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$a */
    public interface C24840a {
        /* renamed from: a */
        View mo64958a();

        /* renamed from: b */
        void mo64959b();

        /* renamed from: c */
        void mo64960c();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$b */
    static final class C24841b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoftVideoPlayView f65473a;

        C24841b(LoftVideoPlayView loftVideoPlayView) {
            this.f65473a = loftVideoPlayView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42961az.m136380a(new C32716a());
            this.f65473a.mo64952e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$c */
    public static final class C24842c implements C44963i {

        /* renamed from: a */
        final /* synthetic */ LoftVideoPlayView f65474a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C24842c(LoftVideoPlayView loftVideoPlayView) {
            this.f65474a = loftVideoPlayView;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f65474a.f65455e) {
                this.f65474a.f65455e = false;
                this.f65474a.mo64943b();
            }
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        m81502f();
    }

    /* renamed from: a */
    public final void mo64942a(String str, long j, long j2) {
        int i = j == 0 ? 0 : (int) (((float) j2) / ((float) j));
        C32732c cVar = this.f65452b;
        if (cVar != null) {
            cVar.mo84207a(i);
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        m81503g();
        for (C34976f a : this.f65467q) {
            a.mo63046a(str);
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        m81503g();
        this.f65462l.setVisibility(8);
        for (C34976f a : this.f65467q) {
            a.mo63045a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo64936a() {
        m81506j();
        m81502f();
    }

    /* renamed from: f */
    private final void m81502f() {
        AnimatedImageView animatedImageView = this.f65461k;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
    }

    /* renamed from: g */
    private final void m81503g() {
        AnimatedImageView animatedImageView = this.f65461k;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    /* renamed from: i */
    private final boolean m81505i() {
        Iterator it = this.f65468r.iterator();
        while (it.hasNext()) {
            ((C32733d) it.next()).mo84208a();
        }
        return true;
    }

    /* renamed from: h */
    private final void m81504h() {
        if (m81505i()) {
            C24840a aVar = this.f65466p;
            if (aVar != null) {
                aVar.mo64960c();
            }
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.mo86940f();
            }
            C34199d dVar2 = this.f65465o;
            if (dVar2 != null) {
                dVar2.mo86942i();
            }
            this.f65451a.f74354a = 2;
        }
    }

    /* renamed from: j */
    private final void m81506j() {
        C24840a aVar = this.f65466p;
        if (aVar != null) {
            aVar.mo64959b();
        }
        C34199d dVar = this.f65465o;
        if (dVar != null) {
            dVar.mo86939e();
        }
        this.f65451a.f74354a = 3;
        if (!C43316v.m137250H()) {
            this.f65463m.mo104924D();
            return;
        }
        C34199d dVar2 = this.f65465o;
        if (dVar2 != null) {
            dVar2.mo86943j();
        }
    }

    /* renamed from: d */
    public final void mo64950d() {
        if (m81505i()) {
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.mo86942i();
            }
            C24840a aVar = this.f65466p;
            if (aVar != null) {
                aVar.mo64960c();
            }
            C34199d dVar2 = this.f65465o;
            if (dVar2 != null) {
                dVar2.mo86941g();
            }
            this.f65451a.f74354a = 4;
        }
    }

    /* renamed from: e */
    public final void mo64952e() {
        if (this.f65451a.f74354a == 3) {
            this.f65462l.setVisibility(8);
            mo64950d();
            return;
        }
        new C33252aw().mo85159c(this.f65469s, this.f65454d).mo85158a(this.f65453c).mo85157a(1).mo85252e();
        m81506j();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f65460j.mo107436b(this.f65457g);
        if (this.f65463m.mo104942b((C34976f) this)) {
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.mo86931a();
            }
        }
        this.f65468r.clear();
        this.f65467q.clear();
        C43305j.m137386g().mo105029b((C43270a) this);
        try {
            this.f65463m.mo104922B();
            this.f65463m.mo104949y();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64943b() {
        /*
            r4 = this;
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r4.f65460j
            com.ss.android.ugc.playerkit.videoview.h r0 = r0.f115582b
            java.lang.String r1 = "mVideoView.surfaceHolder"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.mo107459c()
            if (r0 != 0) goto L_0x0013
            r0 = 1
            r4.f65455e = r0
            return
        L_0x0013:
            com.ss.android.ugc.aweme.feed.b.a r0 = r4.f65451a
            int r0 = r0.f74354a
            if (r0 != 0) goto L_0x006a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f65469s
            com.ss.android.ugc.aweme.feed.model.LongVideo r0 = com.p280ss.android.ugc.aweme.longvideo.C32747i.m106010a(r0)
            if (r0 == 0) goto L_0x0026
            int r0 = r0.getTrailerStartTime()
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 != 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f65469s
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.getAid()
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            com.ss.android.ugc.aweme.video.a r0 = com.p280ss.android.ugc.aweme.video.C43316v.m137466c(r0)
            int r1 = r0.f111811b
            long r2 = r0.f111810a
            int r0 = (int) r2
            r2 = 1950(0x79e, float:2.733E-42)
            if (r1 <= 0) goto L_0x005b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f65469s
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x004f
            int r0 = r0.getDuration()
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 <= r2) goto L_0x0057
            int r0 = r0 - r2
            r4.m81500a(r0)
            return
        L_0x0057:
            r4.m81504h()
            return
        L_0x005b:
            if (r0 <= r2) goto L_0x0062
            int r0 = r0 - r2
            r4.m81500a(r0)
            return
        L_0x0062:
            r4.m81504h()
            return
        L_0x0066:
            r4.m81504h()
            return
        L_0x006a:
            r4.mo64950d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.mo64943b():void");
    }

    /* renamed from: c */
    public final void mo64948c() {
        this.f65455e = false;
        int i = this.f65451a.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        this.f65460j.mo107436b(this.f65457g);
        this.f65460j.mo71673ae();
        this.f65460j.mo107435b();
        this.f65451a.f74354a = 0;
        if (!C43316v.m137250H()) {
            this.f65463m.mo104924D();
        } else {
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.mo86943j();
            }
        }
        try {
            this.f65463m.mo104947w();
            this.f65463m.mo104922B();
        } catch (Throwable unused) {
        }
        m81502f();
    }

    /* renamed from: a */
    public final void mo64940a(C32733d dVar) {
        C7573i.m23587b(dVar, "interceptor");
        this.f65468r.add(dVar);
    }

    /* renamed from: a */
    public final void mo64938a(C24840a aVar) {
        C7573i.m23587b(aVar, "view");
        this.f65466p = aVar;
        C24840a aVar2 = this.f65466p;
        if (aVar2 != null) {
            View a = aVar2.mo64958a();
            if (a != null) {
                a.setOnClickListener(this.f65458h);
            }
        }
    }

    /* renamed from: b */
    public final void mo64945b(C34976f fVar) {
        if (fVar != null && this.f65467q.contains(fVar)) {
            this.f65467q.remove(fVar);
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        for (C34976f d : this.f65467q) {
            d.mo64951d(str);
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        for (C34976f e_ : this.f65467q) {
            e_.mo64954e_(z);
        }
    }

    /* renamed from: a */
    private final void m81500a(int i) {
        if (m81505i()) {
            C24840a aVar = this.f65466p;
            if (aVar != null) {
                aVar.mo64960c();
            }
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.mo86933a(i);
            }
            C34199d dVar2 = this.f65465o;
            if (dVar2 != null) {
                dVar2.mo86942i();
            }
            this.f65451a.f74354a = 2;
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        C43305j.m137386g().mo105022a((C43270a) this);
        for (C34976f c : this.f65467q) {
            c.mo64949c(str);
        }
    }

    /* renamed from: a */
    public final void mo64937a(float f) {
        String str;
        m81503g();
        if (f > 0.0f) {
            this.f65462l.setVisibility(8);
        }
        if (f == 100.0f) {
            String str2 = null;
            if (!this.f65456f) {
                Aweme aweme = this.f65469s;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                mo64953e(str);
            }
            Aweme aweme2 = this.f65469s;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            mo63047b(str2);
        }
        if (!C43316v.m137250H()) {
            this.f65463m.mo104928a(f);
            return;
        }
        C34199d dVar = this.f65465o;
        if (dVar != null) {
            dVar.mo86932a(f);
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        if (!this.f65456f) {
            this.f65456f = true;
            for (C34976f e : this.f65467q) {
                e.mo64953e(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        if (f > 0.0f && this.f65462l.getVisibility() == 0) {
            this.f65462l.setVisibility(8);
        }
        C32732c cVar = this.f65452b;
        if (cVar != null) {
            cVar.mo84206a(f);
        }
        for (C34976f b : this.f65467q) {
            b.mo64944b(f);
        }
    }

    /* renamed from: a */
    public final void mo64941a(C34976f fVar) {
        if (fVar != null && !this.f65467q.contains(fVar)) {
            this.f65467q.add(fVar);
        }
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        for (C34976f b : this.f65467q) {
            b.mo64946b(cVar);
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        for (C34976f a : this.f65467q) {
            a.mo63043a(cVar);
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        m81506j();
        C32732c cVar = this.f65452b;
        if (cVar != null) {
            cVar.mo84206a(0.0f);
        }
        mo64937a(0.0f);
        m81502f();
        this.f65462l.setVisibility(0);
        for (C34976f b : this.f65467q) {
            b.mo63047b(str);
        }
        if (this.f65459i instanceof C32715a) {
            ((C32715a) this.f65459i).mo64983p();
            return;
        }
        C32715a aVar = this.f65471u;
        if (aVar != null) {
            aVar.mo64983p();
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        for (C34976f a : this.f65467q) {
            a.mo63044a(dVar);
        }
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
        for (C34976f b : this.f65467q) {
            b.mo64947b(z);
        }
    }

    /* renamed from: b */
    private final void m81501b(Aweme aweme, C32752l lVar) {
        this.f65469s = aweme;
        this.f65465o = new C34199d(this.f65460j, (C34976f) this, (C28249j) null, lVar);
        if (!C43316v.m137250H()) {
            C34199d dVar = this.f65465o;
            if (dVar != null) {
                dVar.f89179a = this.f65463m;
            }
        }
        C34199d dVar2 = this.f65465o;
        if (dVar2 != null) {
            dVar2.mo86934a(this.f65469s);
        }
        this.f65460j.mo107434a(this.f65457g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64939a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4, com.p280ss.android.ugc.aweme.longvideo.C32752l r5) {
        /*
            r3 = this;
            r3.m81501b(r4, r5)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r3.f65461k
            r1 = 0
            if (r0 == 0) goto L_0x0019
            if (r5 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.feed.model.Video r2 = r5.mo84248a(r4)
            if (r2 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r0.mo60860a(r2)
        L_0x0019:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = r3.f65461k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            if (r5 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.Video r4 = r5.mo84248a(r4)
            if (r4 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getOriginCover()
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r5 = r3.f65461k
            if (r5 == 0) goto L_0x0033
            com.facebook.drawee.controller.d r1 = r5.getControllerListener()
        L_0x0033:
            com.p280ss.android.ugc.aweme.base.C23323e.m76509a(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.mo64939a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.longvideo.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005e, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LoftVideoPlayView(android.support.p022v4.app.FragmentActivity r2, com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent r3, com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView r4, android.widget.ImageView r5, com.p280ss.android.ugc.aweme.video.C43316v r6, com.p280ss.android.ugc.aweme.longvideo.C32715a r7) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "mIvReplay"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "mPlayerManager"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            r1.<init>()
            r1.f65459i = r2
            r1.f65460j = r3
            r1.f65461k = r4
            r1.f65462l = r5
            r1.f65463m = r6
            r1.f65471u = r7
            java.lang.String r2 = "LongVideoPlayView"
            r1.f65464n = r2
            com.ss.android.ugc.aweme.feed.b.a r2 = new com.ss.android.ugc.aweme.feed.b.a
            r2.<init>()
            r1.f65451a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f65467q = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f65468r = r2
            java.lang.String r2 = ""
            r1.f65453c = r2
            android.support.v4.app.FragmentActivity r2 = r1.f65459i
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.h r3 = (android.arch.lifecycle.C0042h) r3
            r2.mo55a(r3)
            android.support.v4.app.FragmentActivity r2 = r1.f65459i
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a.m105912a(r2)
            r1.f65470t = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f65470t
            if (r2 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = r2.f85375a
            if (r2 != 0) goto L_0x0062
        L_0x0060:
            java.lang.String r2 = ""
        L_0x0062:
            r1.f65453c = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f65470t
            if (r2 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.longvideo.g r2 = r2.f85426a
            if (r2 == 0) goto L_0x006f
            int r2 = r2.f85376b
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            r1.f65454d = r2
            android.widget.ImageView r2 = r1.f65462l
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$1 r3 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$1
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.ImageView r2 = r1.f65462l
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$c r2 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$c
            r2.<init>(r1)
            com.ss.android.ugc.playerkit.videoview.i r2 = (com.p280ss.android.ugc.playerkit.videoview.C44963i) r2
            r1.f65457g = r2
            com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$b r2 = new com.ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView$b
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f65458h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.<init>(android.support.v4.app.FragmentActivity, com.ss.android.ugc.playerkit.videoview.VideoViewComponent, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, android.widget.ImageView, com.ss.android.ugc.aweme.video.v, com.ss.android.ugc.aweme.longvideo.a):void");
    }
}
