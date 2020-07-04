package com.p280ss.android.ugc.aweme.longvideonew.p1376a;

import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24574n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28249j;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.preload.C43270a;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a */
public final class C32773a implements C34976f, C43270a {

    /* renamed from: i */
    public static final C32774a f85478i = new C32774a(null);

    /* renamed from: a */
    public final C28228a f85479a = new C28228a();

    /* renamed from: b */
    public final C43316v f85480b = new C43316v(true);

    /* renamed from: c */
    public final C44963i f85481c = new C32777d(this);

    /* renamed from: d */
    public final ViewGroup f85482d;

    /* renamed from: e */
    public final Aweme f85483e;

    /* renamed from: f */
    public final boolean f85484f;

    /* renamed from: g */
    public final boolean f85485g;

    /* renamed from: h */
    public final int f85486h;

    /* renamed from: j */
    private final ArrayList<C32775b> f85487j = new ArrayList<>();

    /* renamed from: k */
    private final ArrayList<C34976f> f85488k = new ArrayList<>();

    /* renamed from: l */
    private final VideoViewComponent f85489l = new VideoViewComponent();

    /* renamed from: m */
    private final C34199d f85490m;

    /* renamed from: n */
    private C32776c f85491n;

    /* renamed from: o */
    private View f85492o;

    /* renamed from: p */
    private C24574n f85493p;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$a */
    public static final class C32774a {
        private C32774a() {
        }

        public /* synthetic */ C32774a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$b */
    public interface C32775b {
        /* renamed from: a */
        boolean mo84296a();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$c */
    public interface C32776c {
        /* renamed from: a */
        void mo84297a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$d */
    public static final class C32777d implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C32773a f85494a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m106105b() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                boolean r0 = r0.f85484f
                if (r0 == 0) goto L_0x006d
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                boolean r0 = r0.f85485g
                if (r0 == 0) goto L_0x006d
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f85483e
                com.ss.android.ugc.aweme.feed.model.LongVideo r0 = com.p280ss.android.ugc.aweme.longvideo.C32747i.m106010a(r0)
                if (r0 == 0) goto L_0x001b
                int r0 = r0.getTrailerStartTime()
                goto L_0x001c
            L_0x001b:
                r0 = -1
            L_0x001c:
                if (r0 != 0) goto L_0x0067
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f85483e
                if (r0 == 0) goto L_0x0029
                java.lang.String r0 = r0.getAid()
                goto L_0x002a
            L_0x0029:
                r0 = 0
            L_0x002a:
                com.ss.android.ugc.aweme.video.a r0 = com.p280ss.android.ugc.aweme.video.C43316v.m137466c(r0)
                int r1 = r0.f111811b
                long r2 = r0.f111810a
                int r0 = (int) r2
                r2 = 1950(0x79e, float:2.733E-42)
                if (r1 <= 0) goto L_0x0058
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f85483e
                if (r0 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
                if (r0 == 0) goto L_0x0048
                int r0 = r0.getDuration()
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                if (r0 <= r2) goto L_0x0052
                int r0 = r0 - r2
                com.ss.android.ugc.aweme.longvideonew.a.a r1 = r4.f85494a
                r1.mo84284a(r0)
                return
            L_0x0052:
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                r0.mo84282a()
                return
            L_0x0058:
                if (r0 <= r2) goto L_0x0061
                int r0 = r0 - r2
                com.ss.android.ugc.aweme.longvideonew.a.a r1 = r4.f85494a
                r1.mo84284a(r0)
                return
            L_0x0061:
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                r0.mo84282a()
                return
            L_0x0067:
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                r0.mo84282a()
                return
            L_0x006d:
                com.ss.android.ugc.aweme.longvideonew.a.a r0 = r4.f85494a
                r0.mo84282a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideonew.p1376a.C32773a.C32777d.m106105b():void");
        }

        C32777d(C32773a aVar) {
            this.f85494a = aVar;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f85494a.f85479a.f74354a != 0) {
                this.f85494a.mo84289b();
            } else if (this.f85494a.f85486h > 0) {
                this.f85494a.mo84284a(this.f85494a.f85486h);
            } else {
                m106105b();
            }
        }
    }

    /* renamed from: e */
    public final void mo84292e() {
        m106073i();
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        for (C34976f a : this.f85488k) {
            a.mo63046a(str);
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        for (C34976f a : this.f85488k) {
            a.mo63045a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo64942a(String str, long j, long j2) {
        int i = j == 0 ? 0 : (int) (((float) j2) / ((float) j));
        C32776c cVar = this.f85491n;
        if (cVar != null) {
            cVar.mo84297a(i);
        }
    }

    /* renamed from: g */
    public final void mo84294g() {
        this.f85490m.mo86944k();
    }

    /* renamed from: h */
    public final void mo84295h() {
        this.f85490m.mo86945l();
    }

    /* renamed from: c */
    public final void mo84290c() {
        if (this.f85479a.f74354a == 3) {
            mo84289b();
        } else {
            m106073i();
        }
    }

    /* renamed from: d */
    public final void mo84291d() {
        if (this.f85479a.f74354a != 0) {
            mo84289b();
        }
    }

    /* renamed from: i */
    private void m106073i() {
        this.f85490m.mo86939e();
        this.f85479a.f74354a = 3;
        if (!C43316v.m137250H()) {
            this.f85480b.mo104924D();
        } else {
            this.f85490m.mo86943j();
        }
    }

    /* renamed from: k */
    private final boolean m106075k() {
        Iterator it = this.f85487j.iterator();
        while (it.hasNext()) {
            if (!((C32775b) it.next()).mo84296a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo84282a() {
        if (m106075k()) {
            this.f85490m.mo86940f();
            this.f85490m.mo86942i();
            this.f85479a.f74354a = 2;
        }
    }

    /* renamed from: b */
    public final void mo84289b() {
        if (m106075k()) {
            this.f85490m.mo86942i();
            this.f85490m.mo86941g();
            this.f85479a.f74354a = 4;
        }
    }

    /* renamed from: f */
    public final void mo84293f() {
        this.f85493p = null;
        C43305j.m137386g().mo105029b((C43270a) this);
        if (this.f85480b.mo104942b((C34976f) this)) {
            this.f85490m.mo86931a();
        }
        this.f85489l.mo107436b(this.f85481c);
        this.f85488k.clear();
        try {
            this.f85480b.mo104922B();
            this.f85480b.mo104949y();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private final void m106074j() {
        long j;
        long j2;
        C24574n nVar = this.f85493p;
        if (nVar != null && nVar.f64820a) {
            C24574n nVar2 = this.f85493p;
            if (nVar2 != null) {
                j = nVar2.f64821b;
            } else {
                j = 0;
            }
            C24574n nVar3 = this.f85493p;
            if (nVar3 != null) {
                j2 = nVar3.f64822c;
            } else {
                j2 = 0;
            }
            long d = this.f85490m.mo86938d();
            long c = this.f85490m.mo86937c();
            if (d >= 0 && c > 0 && (j > d || j2 < d)) {
                mo84283a((((float) j) / ((float) c)) * 100.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo84287a(C32776c cVar) {
        C7573i.m23587b(cVar, "videoPlayerViewCallBack");
        this.f85491n = cVar;
    }

    /* renamed from: a */
    public final void mo84286a(C32775b bVar) {
        C7573i.m23587b(bVar, "interceptor");
        this.f85487j.add(bVar);
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        for (C34976f d : this.f85488k) {
            d.mo64951d(str);
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        for (C34976f e : this.f85488k) {
            e.mo64953e(str);
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        for (C34976f e_ : this.f85488k) {
            e_.mo64954e_(z);
        }
    }

    /* renamed from: a */
    public final void mo84283a(float f) {
        if (!C43316v.m137250H()) {
            this.f85480b.mo104928a(f);
        } else {
            this.f85490m.mo86932a(f);
        }
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        for (C34976f b : this.f85488k) {
            b.mo64944b(f);
        }
        m106074j();
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        C43305j.m137386g().mo105022a((C43270a) this);
        for (C34976f c : this.f85488k) {
            c.mo64949c(str);
        }
    }

    /* renamed from: a */
    public final void mo84284a(int i) {
        if (m106075k()) {
            this.f85490m.mo86933a(i);
            this.f85490m.mo86942i();
            this.f85479a.f74354a = 2;
        }
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        for (C34976f b : this.f85488k) {
            b.mo64946b(cVar);
        }
    }

    /* renamed from: a */
    public final void mo84285a(C24574n nVar) {
        if (nVar != null) {
            C24574n nVar2 = this.f85493p;
            if (nVar2 == null || !nVar2.equals(nVar)) {
                this.f85493p = nVar;
                C24574n nVar3 = this.f85493p;
                if (nVar3 != null && nVar3.f64820a && this.f85479a.f74354a == 3) {
                    mo84289b();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        m106073i();
        mo84283a(0.0f);
        for (C34976f b : this.f85488k) {
            b.mo63047b(str);
        }
    }

    /* renamed from: a */
    public final void mo84288a(C34976f fVar) {
        if (fVar != null && !this.f85488k.contains(fVar)) {
            this.f85488k.add(fVar);
        }
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
        for (C34976f b : this.f85488k) {
            b.mo64947b(z);
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        for (C34976f a : this.f85488k) {
            a.mo63043a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        for (C34976f a : this.f85488k) {
            a.mo63044a(dVar);
        }
    }

    public C32773a(ViewGroup viewGroup, Aweme aweme, boolean z, boolean z2, int i) {
        C7573i.m23587b(viewGroup, "mRootView");
        this.f85482d = viewGroup;
        this.f85483e = aweme;
        this.f85484f = z;
        this.f85485g = z2;
        this.f85486h = i;
        this.f85489l.mo107432a(this.f85482d);
        C44962h hVar = this.f85489l.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoViewComponent.surfaceHolder");
        View a = hVar.mo107454a();
        C7573i.m23582a((Object) a, "mVideoViewComponent.surfaceHolder.view");
        this.f85492o = a;
        C32752l lVar = C32752l.f85394b;
        if (lVar.mo84248a(this.f85483e) == null) {
            lVar = C32752l.f85393a;
        }
        this.f85490m = new C34199d(this.f85489l, (C34976f) this, (C28249j) null, lVar);
        if (!C43316v.m137250H()) {
            this.f85490m.f89179a = this.f85480b;
        }
        this.f85490m.mo86934a(this.f85483e);
        this.f85489l.mo107434a(this.f85481c);
    }
}
