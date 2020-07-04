package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.p022v4.util.C0893e;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1807c;
import com.airbnb.lottie.model.content.C1808d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1755c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
public final class C1673g implements C1670d, C1676j, C1688a {

    /* renamed from: a */
    private final String f6151a;

    /* renamed from: b */
    private final C1821a f6152b;

    /* renamed from: c */
    private final C0893e<LinearGradient> f6153c = new C0893e<>();

    /* renamed from: d */
    private final C0893e<RadialGradient> f6154d = new C0893e<>();

    /* renamed from: e */
    private final Matrix f6155e = new Matrix();

    /* renamed from: f */
    private final Path f6156f = new Path();

    /* renamed from: g */
    private final Paint f6157g = new Paint(1);

    /* renamed from: h */
    private final RectF f6158h = new RectF();

    /* renamed from: i */
    private final List<C1679l> f6159i = new ArrayList();

    /* renamed from: j */
    private final GradientType f6160j;

    /* renamed from: k */
    private final C1687a<C1807c, C1807c> f6161k;

    /* renamed from: l */
    private final C1687a<Integer, Integer> f6162l;

    /* renamed from: m */
    private final C1687a<PointF, PointF> f6163m;

    /* renamed from: n */
    private final C1687a<PointF, PointF> f6164n;

    /* renamed from: o */
    private C1687a<ColorFilter, ColorFilter> f6165o;

    /* renamed from: p */
    private final C1767h f6166p;

    /* renamed from: q */
    private final int f6167q;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6151a;
    }

    /* renamed from: a */
    public final void mo7131a() {
        this.f6166p.invalidateSelf();
    }

    /* renamed from: e */
    private int m8135e() {
        int i;
        int round = Math.round(this.f6163m.f6233b * ((float) this.f6167q));
        int round2 = Math.round(this.f6164n.f6233b * ((float) this.f6167q));
        int round3 = Math.round(this.f6161k.f6233b * ((float) this.f6167q));
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: c */
    private LinearGradient m8133c() {
        long e = (long) m8135e();
        LinearGradient linearGradient = (LinearGradient) this.f6153c.mo3327a(e);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f6163m.mo7151e();
        PointF pointF2 = (PointF) this.f6164n.mo7151e();
        C1807c cVar = (C1807c) this.f6161k.mo7151e();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, cVar.f6504b, cVar.f6503a, TileMode.CLAMP);
        this.f6153c.mo3333b(e, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m8134d() {
        long e = (long) m8135e();
        RadialGradient radialGradient = (RadialGradient) this.f6154d.mo3327a(e);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f6163m.mo7151e();
        PointF pointF2 = (PointF) this.f6164n.mo7151e();
        C1807c cVar = (C1807c) this.f6161k.mo7151e();
        int[] iArr = cVar.f6504b;
        float[] fArr = cVar.f6503a;
        float f = pointF.x;
        float f2 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2)), iArr, fArr, TileMode.CLAMP);
        this.f6154d.mo3333b(e, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6423x) {
            if (cVar == null) {
                this.f6165o = null;
                return;
            }
            this.f6165o = new C1703p(cVar);
            this.f6165o.mo7146a((C1688a) this);
            this.f6152b.mo7326a(this.f6165o);
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        this.f6156f.reset();
        for (int i = 0; i < this.f6159i.size(); i++) {
            this.f6156f.addPath(((C1679l) this.f6159i.get(i)).mo7140e(), matrix);
        }
        this.f6156f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1668b bVar = (C1668b) list2.get(i);
            if (bVar instanceof C1679l) {
                this.f6159i.add((C1679l) bVar);
            }
        }
    }

    public C1673g(C1767h hVar, C1821a aVar, C1808d dVar) {
        this.f6152b = aVar;
        this.f6151a = dVar.f6511g;
        this.f6166p = hVar;
        this.f6160j = dVar.f6505a;
        this.f6156f.setFillType(dVar.f6506b);
        this.f6167q = (int) (hVar.f6356a.mo7208a() / 32.0f);
        this.f6161k = dVar.f6507c.mo7288a();
        this.f6161k.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6161k);
        this.f6162l = dVar.f6508d.mo7288a();
        this.f6162l.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6162l);
        this.f6163m = dVar.f6509e.mo7288a();
        this.f6163m.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6163m);
        this.f6164n = dVar.f6510f.mo7288a();
        this.f6164n.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6164n);
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        C1745d.m8324b("GradientFillContent#draw");
        this.f6156f.reset();
        for (int i2 = 0; i2 < this.f6159i.size(); i2++) {
            this.f6156f.addPath(((C1679l) this.f6159i.get(i2)).mo7140e(), matrix);
        }
        this.f6156f.computeBounds(this.f6158h, false);
        if (this.f6160j == GradientType.Linear) {
            shader = m8133c();
        } else {
            shader = m8134d();
        }
        this.f6155e.set(matrix);
        shader.setLocalMatrix(this.f6155e);
        this.f6157g.setShader(shader);
        if (this.f6165o != null) {
            this.f6157g.setColorFilter((ColorFilter) this.f6165o.mo7151e());
        }
        this.f6157g.setAlpha(C1750e.m8360a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f6162l.mo7151e()).intValue())) / 100.0f) * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
        canvas.drawPath(this.f6156f, this.f6157g);
        C1745d.m8325c("GradientFillContent#draw");
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
