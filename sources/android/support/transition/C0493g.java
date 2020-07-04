package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.g */
final class C0493g<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f1989a;

    /* renamed from: b */
    private final PathMeasure f1990b;

    /* renamed from: c */
    private final float f1991c;

    /* renamed from: d */
    private final float[] f1992d = new float[2];

    /* renamed from: e */
    private final PointF f1993e = new PointF();

    /* renamed from: f */
    private float f1994f;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f1994f);
    }

    C0493g(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f1989a = property;
        this.f1990b = new PathMeasure(path, false);
        this.f1991c = this.f1990b.getLength();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void set(T t, Float f) {
        this.f1994f = f.floatValue();
        this.f1990b.getPosTan(this.f1991c * f.floatValue(), this.f1992d, null);
        this.f1993e.x = this.f1992d[0];
        this.f1993e.y = this.f1992d[1];
        this.f1989a.set(t, this.f1993e);
    }
}
