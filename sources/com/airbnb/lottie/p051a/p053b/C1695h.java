package com.airbnb.lottie.p051a.p053b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1753a;

/* renamed from: com.airbnb.lottie.a.b.h */
public final class C1695h extends C1753a<PointF> {

    /* renamed from: a */
    public Path f6242a;

    public C1695h(C1757f fVar, C1753a<PointF> aVar) {
        boolean z;
        super(fVar, aVar.f6311b, aVar.f6312c, aVar.f6313d, aVar.f6314e, aVar.f6315f);
        if (this.f6312c == null || this.f6311b == null || !((PointF) this.f6311b).equals(((PointF) this.f6312c).x, ((PointF) this.f6312c).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f6312c != null && !z) {
            this.f6242a = C1751f.m8370a((PointF) this.f6311b, (PointF) this.f6312c, aVar.f6316g, aVar.f6317h);
        }
    }
}
