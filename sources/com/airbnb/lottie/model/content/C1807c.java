package com.airbnb.lottie.model.content;

import com.airbnb.lottie.p056d.C1747b;
import com.airbnb.lottie.p056d.C1750e;

/* renamed from: com.airbnb.lottie.model.content.c */
public final class C1807c {

    /* renamed from: a */
    public final float[] f6503a;

    /* renamed from: b */
    public final int[] f6504b;

    /* renamed from: a */
    public final int mo7298a() {
        return this.f6504b.length;
    }

    public C1807c(float[] fArr, int[] iArr) {
        this.f6503a = fArr;
        this.f6504b = iArr;
    }

    /* renamed from: a */
    public final void mo7299a(C1807c cVar, C1807c cVar2, float f) {
        if (cVar.f6504b.length == cVar2.f6504b.length) {
            for (int i = 0; i < cVar.f6504b.length; i++) {
                this.f6503a[i] = C1750e.m8356a(cVar.f6503a[i], cVar2.f6503a[i], f);
                this.f6504b[i] = C1747b.m8332a(f, cVar.f6504b[i], cVar2.f6504b[i]);
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(cVar.f6504b.length);
        sb.append(" vs ");
        sb.append(cVar2.f6504b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
