package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.e */
public final class C1692e extends C1693f<Integer> {
    public C1692e(List<C1753a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer mo7143a(C1753a<Integer> aVar, float f) {
        if (aVar.f6311b == null || aVar.f6312c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f6234c == null) {
            return Integer.valueOf(C1750e.m8359a(((Integer) aVar.f6311b).intValue(), ((Integer) aVar.f6312c).intValue(), f));
        } else {
            return (Integer) this.f6234c.mo7206a(aVar.f6314e, aVar.f6315f.floatValue(), aVar.f6311b, aVar.f6312c, f, mo7149c(), this.f6233b);
        }
    }
}
