package com.airbnb.lottie.p057e;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C1757f;

/* renamed from: com.airbnb.lottie.e.a */
public class C1753a<T> {

    /* renamed from: a */
    private final C1757f f6310a;

    /* renamed from: b */
    public final T f6311b;

    /* renamed from: c */
    public final T f6312c;

    /* renamed from: d */
    public final Interpolator f6313d;

    /* renamed from: e */
    public final float f6314e;

    /* renamed from: f */
    public Float f6315f;

    /* renamed from: g */
    public PointF f6316g;

    /* renamed from: h */
    public PointF f6317h;

    /* renamed from: i */
    private float f6318i = Float.MIN_VALUE;

    /* renamed from: j */
    private float f6319j = Float.MIN_VALUE;

    /* renamed from: c */
    public final boolean mo7203c() {
        if (this.f6313d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo7200a() {
        if (this.f6310a == null) {
            return 0.0f;
        }
        if (this.f6318i == Float.MIN_VALUE) {
            this.f6318i = (this.f6314e - this.f6310a.f6338g) / this.f6310a.mo7213b();
        }
        return this.f6318i;
    }

    /* renamed from: b */
    public final float mo7202b() {
        if (this.f6310a == null) {
            return 1.0f;
        }
        if (this.f6319j == Float.MIN_VALUE) {
            if (this.f6315f == null) {
                this.f6319j = 1.0f;
            } else {
                this.f6319j = mo7200a() + ((this.f6315f.floatValue() - this.f6314e) / this.f6310a.mo7213b());
            }
        }
        return this.f6319j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.f6311b);
        sb.append(", endValue=");
        sb.append(this.f6312c);
        sb.append(", startFrame=");
        sb.append(this.f6314e);
        sb.append(", endFrame=");
        sb.append(this.f6315f);
        sb.append(", interpolator=");
        sb.append(this.f6313d);
        sb.append('}');
        return sb.toString();
    }

    public C1753a(T t) {
        this.f6311b = t;
        this.f6312c = t;
        this.f6314e = Float.MIN_VALUE;
        this.f6315f = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public final boolean mo7201a(float f) {
        if (f < mo7200a() || f >= mo7202b()) {
            return false;
        }
        return true;
    }

    public C1753a(C1757f fVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f6310a = fVar;
        this.f6311b = t;
        this.f6312c = t2;
        this.f6313d = interpolator;
        this.f6314e = f;
        this.f6315f = f2;
    }
}
