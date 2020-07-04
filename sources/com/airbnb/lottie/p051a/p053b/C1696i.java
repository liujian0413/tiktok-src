package com.airbnb.lottie.p051a.p053b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.i */
public final class C1696i extends C1693f<PointF> {

    /* renamed from: d */
    private final PointF f6243d = new PointF();

    /* renamed from: e */
    private final float[] f6244e = new float[2];

    /* renamed from: f */
    private C1695h f6245f;

    /* renamed from: g */
    private PathMeasure f6246g;

    public C1696i(List<? extends C1753a<PointF>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PointF mo7143a(C1753a<PointF> aVar, float f) {
        C1695h hVar = (C1695h) aVar;
        Path path = hVar.f6242a;
        if (path == null) {
            return (PointF) aVar.f6311b;
        }
        if (this.f6234c != null) {
            return (PointF) this.f6234c.mo7206a(hVar.f6314e, hVar.f6315f.floatValue(), hVar.f6311b, hVar.f6312c, mo7149c(), f, this.f6233b);
        }
        if (this.f6245f != hVar) {
            this.f6246g = new PathMeasure(path, false);
            this.f6245f = hVar;
        }
        this.f6246g.getPosTan(f * this.f6246g.getLength(), this.f6244e, null);
        this.f6243d.set(this.f6244e[0], this.f6244e[1]);
        return this.f6243d;
    }
}
