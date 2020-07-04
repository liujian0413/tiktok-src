package android.support.design.p015a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: android.support.design.a.g */
public final class C0240g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f882a = new float[9];

    /* renamed from: b */
    private final float[] f883b = new float[9];

    /* renamed from: c */
    private final Matrix f884c = new Matrix();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f882a);
        matrix2.getValues(this.f883b);
        for (int i = 0; i < 9; i++) {
            this.f883b[i] = this.f882a[i] + ((this.f883b[i] - this.f882a[i]) * f);
        }
        this.f884c.setValues(this.f883b);
        return this.f884c;
    }
}
