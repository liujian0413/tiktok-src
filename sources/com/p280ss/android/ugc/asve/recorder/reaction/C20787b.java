package com.p280ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.p280ss.android.medialib.C19721f;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.p756d.C15452f;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowShape;
import com.p280ss.android.ugc.asve.recorder.reaction.p926a.C20786c;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C7542d;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.b */
public final class C20787b implements C20779a {

    /* renamed from: a */
    private final String f56098a = "ReactionController";

    /* renamed from: b */
    private final int f56099b = 360;

    /* renamed from: c */
    private C20786c f56100c;

    /* renamed from: d */
    private ReactionWindowShape f56101d;

    /* renamed from: e */
    private int f56102e;

    /* renamed from: f */
    private int f56103f;

    /* renamed from: g */
    private int f56104g;

    /* renamed from: h */
    private int f56105h;

    /* renamed from: i */
    private float f56106i;

    /* renamed from: j */
    private int f56107j;

    /* renamed from: k */
    private int f56108k;

    /* renamed from: l */
    private int f56109l;

    /* renamed from: m */
    private int f56110m;

    /* renamed from: n */
    private int f56111n;

    /* renamed from: o */
    private final C20788a f56112o = new C20788a(this);

    /* renamed from: p */
    private final C19764d f56113p;

    /* renamed from: q */
    private final Context f56114q;

    /* renamed from: r */
    private final C20689c f56115r;

    /* renamed from: s */
    private final Pair<Integer, Integer> f56116s;

    /* renamed from: t */
    private final C15430g f56117t;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.b$a */
    public static final class C20788a implements C19622b {

        /* renamed from: a */
        final /* synthetic */ C20787b f56118a;

        /* renamed from: a */
        public final void mo52205a(int i, int i2) {
        }

        C20788a(C20787b bVar) {
            this.f56118a = bVar;
        }

        /* renamed from: a */
        public final void mo52204a(int i) {
            if (i < 0) {
                C15382b bVar = C15382b.f39669a;
                StringBuilder sb = new StringBuilder("onNativeInitCallBack error: ");
                sb.append(i);
                bVar.mo38741b(sb.toString());
                return;
            }
            this.f56118a.mo56178h();
        }
    }

    /* renamed from: a */
    public final C15430g mo56154a() {
        return this.f56117t;
    }

    /* renamed from: b */
    public final float mo56157b() {
        return this.f56113p.mo52963b();
    }

    /* renamed from: d */
    public final int[] mo56160d() {
        return this.f56113p.mo52995c();
    }

    /* renamed from: c */
    public final int[] mo56159c() {
        return this.f56113p.mo53003d();
    }

    /* renamed from: g */
    public final void mo56163g() {
        this.f56115r.mo55847b((C19622b) this.f56112o);
    }

    /* renamed from: h */
    public final void mo56178h() {
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56098a);
        sb.append(" onSurfaceViewInitDone");
        bVar.mo38742c(sb.toString());
        m69382i();
    }

    /* renamed from: e */
    public final void mo56161e() {
        this.f56113p.mo52929a(this.f56114q, mo56154a().mo38976b(), mo56154a().mo38975a());
        this.f56113p.mo53002d(true);
        this.f56113p.mo52980b(this.f56108k, this.f56109l, this.f56107j, this.f56107j);
        this.f56113p.mo53001d((int) (((Number) this.f56116s.getFirst()).floatValue() * 0.0053333333f), -1);
        C19721f.m65022a().mo52425a(mo56154a().mo38977c());
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo56162f() {
        this.f56106i = mo56157b();
        double degrees = Math.toDegrees((double) this.f56106i);
        double d = (double) this.f56099b;
        Double.isNaN(d);
        float f = (float) (degrees % d);
        ReactionWindowShape reactionWindowShape = this.f56101d;
        if (reactionWindowShape == null) {
            C7573i.m23583a("curWindowShape");
        }
        int convertWidthToDp = reactionWindowShape.convertWidthToDp(this.f56110m);
        ReactionWindowShape reactionWindowShape2 = this.f56101d;
        if (reactionWindowShape2 == null) {
            C7573i.m23583a("curWindowShape");
        }
        int convertHeightToDp = reactionWindowShape2.convertHeightToDp(this.f56111n);
        ReactionWindowShape reactionWindowShape3 = this.f56101d;
        if (reactionWindowShape3 == null) {
            C7573i.m23583a("curWindowShape");
        }
        return new ReactionWindowInfo(convertWidthToDp, convertHeightToDp, f, reactionWindowShape3.getMIsCircle() ? 1 : 0);
    }

    /* renamed from: i */
    private final void m69382i() {
        int[] iArr;
        int i;
        if (this.f56102e > 0 || this.f56103f > 0) {
            iArr = m69380a(this.f56102e, this.f56103f, this.f56110m, this.f56111n, this.f56106i);
        } else if (C15452f.m45254a(this.f56114q)) {
            int[] c = mo56159c();
            if (c == null) {
                i = 0;
            } else {
                i = c[0];
            }
            iArr = m69380a(C15452f.m45255b(this.f56114q) - i, this.f56108k, this.f56110m, this.f56111n, this.f56106i);
        } else {
            iArr = m69380a(this.f56107j, this.f56108k, this.f56110m, this.f56111n, this.f56106i);
        }
        if (iArr != null) {
            C15382b bVar = C15382b.f39669a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f56098a);
            sb.append(" => update pos: ");
            sb.append(this.f56102e);
            sb.append(' ');
            sb.append(this.f56103f);
            sb.append(" curWindowSurfaceWidth and curWindowSurfaceHeight :");
            sb.append(this.f56110m);
            sb.append(' ');
            sb.append(this.f56111n);
            bVar.mo38742c(sb.toString());
            this.f56102e = iArr[0];
            this.f56103f = iArr[1];
        }
    }

    /* renamed from: a */
    public final void mo56155a(float f) {
        C19721f.m65022a().mo52425a(f);
    }

    /* renamed from: c */
    private final int[] m69381c(int i, int i2) {
        return this.f56113p.mo52960a(i, i2, -1, -1);
    }

    /* renamed from: b */
    public final boolean mo56158b(int i, int i2) {
        return this.f56113p.mo53010e(i, i2);
    }

    /* renamed from: a */
    public final void mo56156a(int i, int i2) {
        this.f56102e += i;
        this.f56103f += i2;
        int[] c = m69381c(this.f56102e, this.f56103f);
        if (c != null) {
            this.f56102e = c[0];
            this.f56103f = c[1];
            this.f56104g = c[2];
            this.f56105h = c[3];
        }
    }

    /* renamed from: a */
    private final void m69379a(Context context, C15430g gVar, Pair<Integer, Integer> pair) {
        C20786c cVar = new C20786c(context, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), gVar.mo38979e(), gVar.mo38980f());
        this.f56100c = cVar;
        C20786c cVar2 = this.f56100c;
        if (cVar2 == null) {
            C7573i.m23583a("windowShapeFactory");
        }
        this.f56101d = cVar2.mo56177a();
        ReactionWindowShape reactionWindowShape = this.f56101d;
        if (reactionWindowShape == null) {
            C7573i.m23583a("curWindowShape");
        }
        this.f56110m = reactionWindowShape.getDefaultWidth();
        ReactionWindowShape reactionWindowShape2 = this.f56101d;
        if (reactionWindowShape2 == null) {
            C7573i.m23583a("curWindowShape");
        }
        this.f56111n = reactionWindowShape2.getDefaultHeight();
    }

    /* renamed from: a */
    private final void m69378a(Context context, int i, int i2, boolean z) {
        double d = (double) i;
        Double.isNaN(d);
        this.f56107j = (int) (0.09d * d);
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.f56108k = (int) (0.096d * d2);
        Double.isNaN(d2);
        this.f56109l = (int) (0.1d * d2);
        Double.isNaN(d);
        int i3 = (int) (d * 0.82d);
        Double.isNaN(d2);
        int i4 = (int) (d2 * 0.804d);
        if (z) {
            double c = (C7542d.f20874c.mo19428c() * 1.0d) / 4.0d;
            double d3 = (double) i3;
            Double.isNaN(d3);
            this.f56102e = (((int) (c * d3)) * C15452f.m45255b(context)) / i;
            double c2 = (C7542d.f20874c.mo19428c() * 1.0d) / 4.0d;
            double d4 = (double) i4;
            Double.isNaN(d4);
            this.f56103f = (((int) (c2 * d4)) * C15452f.m45256c(context)) / i2;
        }
    }

    /* renamed from: a */
    private final int[] m69380a(int i, int i2, int i3, int i4, float f) {
        return this.f56113p.mo52961a(i, i2, i3, i4, f);
    }

    public C20787b(C19764d dVar, Context context, C20689c cVar, Pair<Integer, Integer> pair, C15430g gVar) {
        C7573i.m23587b(dVar, "presenter");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(cVar, "recorder");
        C7573i.m23587b(pair, "outputSize");
        C7573i.m23587b(gVar, "reactionContext");
        this.f56113p = dVar;
        this.f56114q = context;
        this.f56115r = cVar;
        this.f56116s = pair;
        this.f56117t = gVar;
        m69378a(this.f56114q, ((Number) this.f56116s.getFirst()).intValue(), ((Number) this.f56116s.getSecond()).intValue(), mo56154a().mo38978d());
        m69379a(this.f56114q, mo56154a(), this.f56116s);
        this.f56115r.mo55842a((C19622b) this.f56112o);
    }
}
