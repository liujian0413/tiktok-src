package com.facebook.keyframes.p733b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: com.facebook.keyframes.b.d */
public final class C14012d implements Interpolator {

    /* renamed from: a */
    private final float[] f37010a;

    /* renamed from: b */
    private final float[] f37011b;

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f37010a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f37010a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f37010a[length] - this.f37010a[i];
        if (f2 == 0.0f) {
            return this.f37011b[i];
        }
        float f3 = (f - this.f37010a[i]) / f2;
        float f4 = this.f37011b[i];
        return f4 + (f3 * (this.f37011b[length] - f4));
    }

    public C14012d(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.03f)) + 1;
        this.f37010a = new float[i];
        this.f37011b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f37010a[i2] = fArr[0];
            this.f37011b[i2] = fArr[1];
        }
    }
}
