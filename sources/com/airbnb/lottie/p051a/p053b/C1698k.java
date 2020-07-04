package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1753a;
import com.airbnb.lottie.p057e.C1756d;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.k */
public final class C1698k extends C1693f<C1756d> {
    public C1698k(List<C1753a<C1756d>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C1756d mo7143a(C1753a<C1756d> aVar, float f) {
        if (aVar.f6311b == null || aVar.f6312c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C1756d dVar = (C1756d) aVar.f6311b;
        C1756d dVar2 = (C1756d) aVar.f6312c;
        if (this.f6234c == null) {
            return new C1756d(C1750e.m8356a(dVar.f6330a, dVar2.f6330a, f), C1750e.m8356a(dVar.f6331b, dVar2.f6331b, f));
        }
        return (C1756d) this.f6234c.mo7206a(aVar.f6314e, aVar.f6315f.floatValue(), dVar, dVar2, f, mo7149c(), this.f6233b);
    }
}
