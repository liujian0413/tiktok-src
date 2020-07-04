package android.support.design.p015a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: android.support.design.a.f */
public final class C0239f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f881a = new Matrix();

    public C0239f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f881a.set(imageView.getImageMatrix());
        return this.f881a;
    }

    /* renamed from: a */
    private static void m840a(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        m840a((ImageView) obj, (Matrix) obj2);
    }
}
