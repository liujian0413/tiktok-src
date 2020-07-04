package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.c */
public final class C1690c extends C1693f<Float> {
    public C1690c(List<C1753a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Float mo7143a(C1753a<Float> aVar, float f) {
        if (aVar.f6311b == null || aVar.f6312c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6234c == null) {
            return Float.valueOf(C1750e.m8356a(((Float) aVar.f6311b).floatValue(), ((Float) aVar.f6312c).floatValue(), f));
        } else {
            return (Float) this.f6234c.mo7206a(aVar.f6314e, aVar.f6315f.floatValue(), aVar.f6311b, aVar.f6312c, f, mo7149c(), this.f6233b);
        }
    }
}
