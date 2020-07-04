package android.support.p022v4.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.animation.b */
final class C0956b implements Interpolator {

    /* renamed from: a */
    private final float[] f3345a;

    /* renamed from: b */
    private final float[] f3346b;

    private C0956b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f3345a = new float[i];
        this.f3346b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f3345a[i2] = fArr[0];
            this.f3346b[i2] = fArr[1];
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f3345a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f3345a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f3345a[length] - this.f3345a[i];
        if (f2 == 0.0f) {
            return this.f3346b[i];
        }
        float f3 = (f - this.f3345a[i]) / f2;
        float f4 = this.f3346b[i];
        return f4 + (f3 * (this.f3346b[length] - f4));
    }

    C0956b(float f, float f2, float f3, float f4) {
        this(m4072a(f, f2, f3, f4));
    }

    /* renamed from: a */
    private static Path m4072a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
