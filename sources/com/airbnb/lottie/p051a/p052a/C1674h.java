package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.p022v4.util.C0893e;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.content.C1807c;
import com.airbnb.lottie.model.content.C1809e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;

/* renamed from: com.airbnb.lottie.a.a.h */
public final class C1674h extends C1665a {

    /* renamed from: b */
    private final String f6168b;

    /* renamed from: c */
    private final C0893e<LinearGradient> f6169c = new C0893e<>();

    /* renamed from: d */
    private final C0893e<RadialGradient> f6170d = new C0893e<>();

    /* renamed from: e */
    private final RectF f6171e = new RectF();

    /* renamed from: f */
    private final GradientType f6172f;

    /* renamed from: g */
    private final int f6173g;

    /* renamed from: h */
    private final C1687a<C1807c, C1807c> f6174h;

    /* renamed from: i */
    private final C1687a<PointF, PointF> f6175i;

    /* renamed from: j */
    private final C1687a<PointF, PointF> f6176j;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6168b;
    }

    /* renamed from: e */
    private int m8145e() {
        int i;
        int round = Math.round(this.f6175i.f6233b * ((float) this.f6173g));
        int round2 = Math.round(this.f6176j.f6233b * ((float) this.f6173g));
        int round3 = Math.round(this.f6174h.f6233b * ((float) this.f6173g));
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
    private LinearGradient m8143c() {
        long e = (long) m8145e();
        LinearGradient linearGradient = (LinearGradient) this.f6169c.mo3327a(e);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f6175i.mo7151e();
        PointF pointF2 = (PointF) this.f6176j.mo7151e();
        C1807c cVar = (C1807c) this.f6174h.mo7151e();
        LinearGradient linearGradient2 = new LinearGradient((float) ((int) (this.f6171e.left + (this.f6171e.width() / 2.0f) + pointF.x)), (float) ((int) (this.f6171e.top + (this.f6171e.height() / 2.0f) + pointF.y)), (float) ((int) (this.f6171e.left + (this.f6171e.width() / 2.0f) + pointF2.x)), (float) ((int) (this.f6171e.top + (this.f6171e.height() / 2.0f) + pointF2.y)), cVar.f6504b, cVar.f6503a, TileMode.CLAMP);
        this.f6169c.mo3333b(e, linearGradient2);
        return linearGradient2;
    }

    /* renamed from: d */
    private RadialGradient m8144d() {
        long e = (long) m8145e();
        RadialGradient radialGradient = (RadialGradient) this.f6170d.mo3327a(e);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f6175i.mo7151e();
        PointF pointF2 = (PointF) this.f6176j.mo7151e();
        C1807c cVar = (C1807c) this.f6174h.mo7151e();
        int[] iArr = cVar.f6504b;
        float[] fArr = cVar.f6503a;
        int width = (int) (this.f6171e.left + (this.f6171e.width() / 2.0f) + pointF.x);
        int height = (int) (this.f6171e.top + (this.f6171e.height() / 2.0f) + pointF.y);
        float f = (float) width;
        float f2 = (float) height;
        RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (((int) ((this.f6171e.left + (this.f6171e.width() / 2.0f)) + pointF2.x)) - width), (double) (((int) ((this.f6171e.top + (this.f6171e.height() / 2.0f)) + pointF2.y)) - height)), iArr, fArr, TileMode.CLAMP);
        this.f6170d.mo3333b(e, radialGradient2);
        return radialGradient2;
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        mo7133a(this.f6171e, matrix);
        if (this.f6172f == GradientType.Linear) {
            this.f6110a.setShader(m8143c());
        } else {
            this.f6110a.setShader(m8144d());
        }
        super.mo7132a(canvas, matrix, i);
    }

    public C1674h(C1767h hVar, C1821a aVar, C1809e eVar) {
        super(hVar, aVar, eVar.f6521h.toPaintCap(), eVar.f6522i.toPaintJoin(), eVar.f6523j, eVar.f6517d, eVar.f6520g, eVar.f6524k, eVar.f6525l);
        this.f6168b = eVar.f6514a;
        this.f6172f = eVar.f6515b;
        this.f6173g = (int) (hVar.f6356a.mo7208a() / 32.0f);
        this.f6174h = eVar.f6516c.mo7288a();
        this.f6174h.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6174h);
        this.f6175i = eVar.f6518e.mo7288a();
        this.f6175i.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6175i);
        this.f6176j = eVar.f6519f.mo7288a();
        this.f6176j.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6176j);
    }
}
