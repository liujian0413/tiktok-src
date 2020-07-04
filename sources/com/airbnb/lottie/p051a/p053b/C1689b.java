package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.p056d.C1747b;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.b */
public final class C1689b extends C1693f<Integer> {
    public C1689b(List<C1753a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer mo7143a(C1753a<Integer> aVar, float f) {
        if (aVar.f6311b == null || aVar.f6312c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) aVar.f6311b).intValue();
        int intValue2 = ((Integer) aVar.f6312c).intValue();
        if (this.f6234c == null) {
            return Integer.valueOf(C1747b.m8332a(f, intValue, intValue2));
        }
        return (Integer) this.f6234c.mo7206a(aVar.f6314e, aVar.f6315f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo7149c(), this.f6233b);
    }
}
