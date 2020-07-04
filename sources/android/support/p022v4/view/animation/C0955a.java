package android.support.p022v4.view.animation;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.animation.a */
abstract class C0955a implements Interpolator {

    /* renamed from: a */
    private final float[] f3343a;

    /* renamed from: b */
    private final float f3344b = (1.0f / ((float) (this.f3343a.length - 1)));

    protected C0955a(float[] fArr) {
        this.f3343a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f3343a.length - 1)) * f), this.f3343a.length - 2);
        return this.f3343a[min] + (((f - (((float) min) * this.f3344b)) / this.f3344b) * (this.f3343a[min + 1] - this.f3343a[min]));
    }
}
