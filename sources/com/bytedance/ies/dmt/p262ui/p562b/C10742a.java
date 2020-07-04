package com.bytedance.ies.dmt.p262ui.p562b;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.bytedance.ies.dmt.ui.b.a */
public class C10742a implements Interpolator {

    /* renamed from: a */
    protected final PointF f28745a = new PointF();

    /* renamed from: b */
    protected final PointF f28746b = new PointF();

    /* renamed from: c */
    private int f28747c;

    /* renamed from: a */
    private static double m31334a(double d, double d2, double d3, double d4, double d5) {
        double d6 = 1.0d - d;
        double d7 = d * d;
        double d8 = d6 * d6;
        return (d8 * d6 * 0.0d) + (d8 * 3.0d * d * d3) + (d6 * 3.0d * d7 * d4) + (d7 * d * 1.0d);
    }

    public float getInterpolation(float f) {
        int i = this.f28747c;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (((float) i) * 1.0f) / 4096.0f;
            if (m31334a((double) f2, 0.0d, (double) this.f28745a.x, (double) this.f28746b.x, 1.0d) >= ((double) f)) {
                this.f28747c = i;
                break;
            }
            i++;
        }
        double a = m31334a((double) f2, 0.0d, (double) this.f28745a.y, (double) this.f28746b.y, 1.0d);
        if (a > 0.999d) {
            a = 1.0d;
            this.f28747c = 0;
        }
        return (float) a;
    }
}
