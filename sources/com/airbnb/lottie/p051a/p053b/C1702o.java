package com.airbnb.lottie.p051a.p053b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1799l;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p057e.C1755c;
import com.airbnb.lottie.p057e.C1756d;

/* renamed from: com.airbnb.lottie.a.b.o */
public final class C1702o {

    /* renamed from: a */
    public final C1687a<Integer, Integer> f6253a;

    /* renamed from: b */
    public final C1687a<?, Float> f6254b;

    /* renamed from: c */
    public final C1687a<?, Float> f6255c;

    /* renamed from: d */
    private final Matrix f6256d = new Matrix();

    /* renamed from: e */
    private final C1687a<PointF, PointF> f6257e;

    /* renamed from: f */
    private final C1687a<?, PointF> f6258f;

    /* renamed from: g */
    private final C1687a<C1756d, C1756d> f6259g;

    /* renamed from: h */
    private final C1687a<Float, Float> f6260h;

    /* renamed from: a */
    public final Matrix mo7152a() {
        this.f6256d.reset();
        PointF pointF = (PointF) this.f6258f.mo7151e();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.f6256d.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.f6260h.mo7151e()).floatValue();
        if (floatValue != 0.0f) {
            this.f6256d.preRotate(floatValue);
        }
        C1756d dVar = (C1756d) this.f6259g.mo7151e();
        if (!(dVar.f6330a == 1.0f && dVar.f6331b == 1.0f)) {
            this.f6256d.preScale(dVar.f6330a, dVar.f6331b);
        }
        PointF pointF2 = (PointF) this.f6257e.mo7151e();
        if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
            this.f6256d.preTranslate(-pointF2.x, -pointF2.y);
        }
        return this.f6256d;
    }

    /* renamed from: a */
    public final void mo7153a(float f) {
        this.f6257e.mo7145a(f);
        this.f6258f.mo7145a(f);
        this.f6259g.mo7145a(f);
        this.f6260h.mo7145a(f);
        this.f6253a.mo7145a(f);
        if (this.f6254b != null) {
            this.f6254b.mo7145a(f);
        }
        if (this.f6255c != null) {
            this.f6255c.mo7145a(f);
        }
    }

    public C1702o(C1799l lVar) {
        this.f6257e = lVar.f6446a.mo7288a();
        this.f6258f = lVar.f6447b.mo7288a();
        this.f6259g = lVar.f6448c.mo7288a();
        this.f6260h = lVar.f6449d.mo7288a();
        this.f6253a = lVar.f6450e.mo7288a();
        if (lVar.f6451f != null) {
            this.f6254b = lVar.f6451f.mo7288a();
        } else {
            this.f6254b = null;
        }
        if (lVar.f6452g != null) {
            this.f6255c = lVar.f6452g.mo7288a();
        } else {
            this.f6255c = null;
        }
    }

    /* renamed from: b */
    public final Matrix mo7157b(float f) {
        PointF pointF = (PointF) this.f6258f.mo7151e();
        PointF pointF2 = (PointF) this.f6257e.mo7151e();
        C1756d dVar = (C1756d) this.f6259g.mo7151e();
        float floatValue = ((Float) this.f6260h.mo7151e()).floatValue();
        this.f6256d.reset();
        this.f6256d.preTranslate(pointF.x * f, pointF.y * f);
        double d = (double) f;
        this.f6256d.preScale((float) Math.pow((double) dVar.f6330a, d), (float) Math.pow((double) dVar.f6331b, d));
        this.f6256d.preRotate(floatValue * f, pointF2.x, pointF2.y);
        return this.f6256d;
    }

    /* renamed from: a */
    public final void mo7154a(C1688a aVar) {
        this.f6257e.mo7146a(aVar);
        this.f6258f.mo7146a(aVar);
        this.f6259g.mo7146a(aVar);
        this.f6260h.mo7146a(aVar);
        this.f6253a.mo7146a(aVar);
        if (this.f6254b != null) {
            this.f6254b.mo7146a(aVar);
        }
        if (this.f6255c != null) {
            this.f6255c.mo7146a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo7155a(C1821a aVar) {
        aVar.mo7326a(this.f6257e);
        aVar.mo7326a(this.f6258f);
        aVar.mo7326a(this.f6259g);
        aVar.mo7326a(this.f6260h);
        aVar.mo7326a(this.f6253a);
        if (this.f6254b != null) {
            aVar.mo7326a(this.f6254b);
        }
        if (this.f6255c != null) {
            aVar.mo7326a(this.f6255c);
        }
    }

    /* renamed from: a */
    public final <T> boolean mo7156a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6404e) {
            this.f6257e.mo7147a(cVar);
        } else if (t == C1782k.f6405f) {
            this.f6258f.mo7147a(cVar);
        } else if (t == C1782k.f6408i) {
            this.f6259g.mo7147a(cVar);
        } else if (t == C1782k.f6409j) {
            this.f6260h.mo7147a(cVar);
        } else if (t == C1782k.f6402c) {
            this.f6253a.mo7147a(cVar);
        } else if (t == C1782k.f6420u && this.f6254b != null) {
            this.f6254b.mo7147a(cVar);
        } else if (t != C1782k.f6421v || this.f6255c == null) {
            return false;
        } else {
            this.f6255c.mo7147a(cVar);
        }
        return true;
    }
}
