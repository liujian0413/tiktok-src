package com.airbnb.lottie.p051a.p053b;

import android.graphics.PointF;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p057e.C1753a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.m */
public final class C1700m extends C1687a<PointF, PointF> {

    /* renamed from: d */
    private final PointF f6250d = new PointF();

    /* renamed from: e */
    private final C1687a<Float, Float> f6251e;

    /* renamed from: f */
    private final C1687a<Float, Float> f6252f;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public PointF mo7151e() {
        return mo7143a(null, 0.0f);
    }

    /* renamed from: a */
    public final void mo7145a(float f) {
        this.f6251e.mo7145a(f);
        this.f6252f.mo7145a(f);
        this.f6250d.set(((Float) this.f6251e.mo7151e()).floatValue(), ((Float) this.f6252f.mo7151e()).floatValue());
        for (int i = 0; i < this.f6232a.size(); i++) {
            ((C1688a) this.f6232a.get(i)).mo7131a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PointF mo7143a(C1753a<PointF> aVar, float f) {
        return this.f6250d;
    }

    public C1700m(C1687a<Float, Float> aVar, C1687a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f6251e = aVar;
        this.f6252f = aVar2;
        mo7145a(this.f6233b);
    }
}
