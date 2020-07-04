package com.p280ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.p280ss.android.medialib.C19721f;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.p756d.C15452f;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowShape;
import com.p280ss.android.ugc.asve.recorder.reaction.p926a.C20786c;
import com.p280ss.android.vesdk.C45381y;
import com.p280ss.android.vesdk.C45382z;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C7542d;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.c */
public final class C20789c implements C20779a {

    /* renamed from: a */
    private final String f56119a = "ReactionController";

    /* renamed from: b */
    private final int f56120b = 360;

    /* renamed from: c */
    private C20786c f56121c;

    /* renamed from: d */
    private ReactionWindowShape f56122d;

    /* renamed from: e */
    private int f56123e;

    /* renamed from: f */
    private int f56124f;

    /* renamed from: g */
    private int f56125g;

    /* renamed from: h */
    private int f56126h;

    /* renamed from: i */
    private float f56127i;

    /* renamed from: j */
    private int f56128j;

    /* renamed from: k */
    private int f56129k;

    /* renamed from: l */
    private int f56130l;

    /* renamed from: m */
    private int f56131m;

    /* renamed from: n */
    private int f56132n;

    /* renamed from: o */
    private final C20790a f56133o = new C20790a(this);

    /* renamed from: p */
    private final C45382z f56134p;

    /* renamed from: q */
    private final Context f56135q;

    /* renamed from: r */
    private final C20689c f56136r;

    /* renamed from: s */
    private final Pair<Integer, Integer> f56137s;

    /* renamed from: t */
    private final C15430g f56138t;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.c$a */
    public static final class C20790a implements C19622b {

        /* renamed from: a */
        final /* synthetic */ C20789c f56139a;

        /* renamed from: a */
        public final void mo52205a(int i, int i2) {
        }

        C20790a(C20789c cVar) {
            this.f56139a = cVar;
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
            this.f56139a.mo56179h();
        }
    }

    /* renamed from: a */
    public final C15430g mo56154a() {
        return this.f56138t;
    }

    /* renamed from: b */
    public final float mo56157b() {
        return this.f56134p.mo108711d();
    }

    /* renamed from: c */
    public final int[] mo56159c() {
        return this.f56134p.mo108701b();
    }

    /* renamed from: d */
    public final int[] mo56160d() {
        return this.f56134p.mo108710c();
    }

    /* renamed from: g */
    public final void mo56163g() {
        this.f56136r.mo55847b((C19622b) this.f56133o);
    }

    /* renamed from: h */
    public final void mo56179h() {
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56119a);
        sb.append(" onSurfaceViewInitDone");
        bVar.mo38742c(sb.toString());
        m69400i();
    }

    /* renamed from: e */
    public final void mo56161e() {
        this.f56134p.mo108665a(new C45381y(mo56154a().mo38976b(), mo56154a().mo38975a(), new float[]{0.096f, 0.1f, 0.09f, 0.09f}));
        this.f56134p.mo108714d(true);
        this.f56134p.mo108648a(this.f56129k, this.f56130l, this.f56128j, this.f56128j);
        this.f56134p.mo108647a((int) (((Number) this.f56137s.getFirst()).floatValue() * 0.0053333333f), -1);
        C19721f.m65022a().mo52425a(mo56154a().mo38977c());
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo56162f() {
        this.f56127i = mo56157b();
        double degrees = Math.toDegrees((double) this.f56127i);
        double d = (double) this.f56120b;
        Double.isNaN(d);
        float f = (float) (degrees % d);
        ReactionWindowShape reactionWindowShape = this.f56122d;
        if (reactionWindowShape == null) {
            C7573i.m23583a("curWindowShape");
        }
        int convertWidthToDp = reactionWindowShape.convertWidthToDp(this.f56131m);
        ReactionWindowShape reactionWindowShape2 = this.f56122d;
        if (reactionWindowShape2 == null) {
            C7573i.m23583a("curWindowShape");
        }
        int convertHeightToDp = reactionWindowShape2.convertHeightToDp(this.f56132n);
        ReactionWindowShape reactionWindowShape3 = this.f56122d;
        if (reactionWindowShape3 == null) {
            C7573i.m23583a("curWindowShape");
        }
        return new ReactionWindowInfo(convertWidthToDp, convertHeightToDp, f, reactionWindowShape3.getMIsCircle() ? 1 : 0);
    }

    /* renamed from: i */
    private final void m69400i() {
        int[] iArr;
        int i;
        if (this.f56123e > 0 || this.f56124f > 0) {
            iArr = m69398a(this.f56123e, this.f56124f, this.f56131m, this.f56132n, this.f56127i);
        } else if (C15452f.m45254a(this.f56135q)) {
            int[] c = mo56159c();
            if (c == null) {
                i = 0;
            } else {
                i = c[0];
            }
            iArr = m69398a(C15452f.m45255b(this.f56135q) - i, this.f56129k, this.f56131m, this.f56132n, this.f56127i);
        } else {
            iArr = m69398a(this.f56128j, this.f56129k, this.f56131m, this.f56132n, this.f56127i);
        }
        if (iArr != null) {
            C15382b bVar = C15382b.f39669a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f56119a);
            sb.append(" => update pos: ");
            sb.append(this.f56123e);
            sb.append(' ');
            sb.append(this.f56124f);
            sb.append(" curWindowSurfaceWidth and curWindowSurfaceHeight :");
            sb.append(this.f56131m);
            sb.append(' ');
            sb.append(this.f56132n);
            bVar.mo38742c(sb.toString());
            this.f56123e = iArr[0];
            this.f56124f = iArr[1];
        }
    }

    /* renamed from: a */
    public final void mo56155a(float f) {
        C19721f.m65022a().mo52425a(f);
    }

    /* renamed from: c */
    private final int[] m69399c(int i, int i2) {
        return this.f56134p.mo108682a(i, i2, -1, -1, 0.0f);
    }

    /* renamed from: b */
    public final boolean mo56158b(int i, int i2) {
        return this.f56134p.mo108700b(i, i2);
    }

    /* renamed from: a */
    public final void mo56156a(int i, int i2) {
        this.f56123e += i;
        this.f56124f += i2;
        int[] c = m69399c(this.f56123e, this.f56124f);
        if (c != null) {
            this.f56123e = c[0];
            this.f56124f = c[1];
            this.f56125g = c[2];
            this.f56126h = c[3];
        }
    }

    /* renamed from: a */
    private final void m69397a(Context context, C15430g gVar, Pair<Integer, Integer> pair) {
        C20786c cVar = new C20786c(context, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), gVar.mo38979e(), gVar.mo38980f());
        this.f56121c = cVar;
        C20786c cVar2 = this.f56121c;
        if (cVar2 == null) {
            C7573i.m23583a("windowShapeFactory");
        }
        this.f56122d = cVar2.mo56177a();
        ReactionWindowShape reactionWindowShape = this.f56122d;
        if (reactionWindowShape == null) {
            C7573i.m23583a("curWindowShape");
        }
        this.f56131m = reactionWindowShape.getDefaultWidth();
        ReactionWindowShape reactionWindowShape2 = this.f56122d;
        if (reactionWindowShape2 == null) {
            C7573i.m23583a("curWindowShape");
        }
        this.f56132n = reactionWindowShape2.getDefaultHeight();
    }

    /* renamed from: a */
    private final void m69396a(Context context, int i, int i2, boolean z) {
        double d = (double) i;
        Double.isNaN(d);
        this.f56128j = (int) (0.09d * d);
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.f56129k = (int) (0.096d * d2);
        Double.isNaN(d2);
        this.f56130l = (int) (0.1d * d2);
        Double.isNaN(d);
        int i3 = (int) (d * 0.82d);
        Double.isNaN(d2);
        int i4 = (int) (d2 * 0.804d);
        if (z) {
            double c = (C7542d.f20874c.mo19428c() * 1.0d) / 4.0d;
            double d3 = (double) i3;
            Double.isNaN(d3);
            this.f56123e = (((int) (c * d3)) * C15452f.m45255b(context)) / i;
            double c2 = (C7542d.f20874c.mo19428c() * 1.0d) / 4.0d;
            double d4 = (double) i4;
            Double.isNaN(d4);
            this.f56124f = (((int) (c2 * d4)) * C15452f.m45256c(context)) / i2;
        }
    }

    /* renamed from: a */
    private final int[] m69398a(int i, int i2, int i3, int i4, float f) {
        return this.f56134p.mo108682a(i, i2, i3, i4, f);
    }

    public C20789c(C45382z zVar, Context context, C20689c cVar, Pair<Integer, Integer> pair, C15430g gVar) {
        C7573i.m23587b(zVar, "recoder");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(cVar, "recorder");
        C7573i.m23587b(pair, "outputSize");
        C7573i.m23587b(gVar, "reactionContext");
        this.f56134p = zVar;
        this.f56135q = context;
        this.f56136r = cVar;
        this.f56137s = pair;
        this.f56138t = gVar;
        m69396a(this.f56135q, ((Number) this.f56137s.getFirst()).intValue(), ((Number) this.f56137s.getSecond()).intValue(), mo56154a().mo38978d());
        m69397a(this.f56135q, mo56154a(), this.f56137s);
        this.f56136r.mo55842a((C19622b) this.f56133o);
    }
}
