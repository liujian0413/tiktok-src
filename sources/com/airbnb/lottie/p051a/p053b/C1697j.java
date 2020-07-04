package com.airbnb.lottie.p051a.p053b;

import android.graphics.PointF;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.j */
public final class C1697j extends C1693f<PointF> {

    /* renamed from: d */
    private final PointF f6247d = new PointF();

    public C1697j(List<C1753a<PointF>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PointF mo7143a(C1753a<PointF> aVar, float f) {
        if (aVar.f6311b == null || aVar.f6312c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) aVar.f6311b;
        PointF pointF2 = (PointF) aVar.f6312c;
        if (this.f6234c != null) {
            return (PointF) this.f6234c.mo7206a(aVar.f6314e, aVar.f6315f.floatValue(), pointF, pointF2, f, mo7149c(), this.f6233b);
        }
        this.f6247d.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.f6247d;
    }
}
