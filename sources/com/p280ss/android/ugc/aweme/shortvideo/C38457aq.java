package com.p280ss.android.ugc.aweme.shortvideo;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aq */
public final class C38457aq implements Interpolator {

    /* renamed from: a */
    protected PointF f99976a;

    /* renamed from: b */
    protected PointF f99977b;

    /* renamed from: c */
    protected PointF f99978c;

    /* renamed from: d */
    protected PointF f99979d;

    /* renamed from: e */
    protected PointF f99980e;

    public final float getInterpolation(float f) {
        return m122939a(m122940b(f));
    }

    /* renamed from: c */
    private float m122941c(float f) {
        return this.f99980e.x + (f * ((this.f99979d.x * 2.0f) + (this.f99978c.x * 3.0f * f)));
    }

    /* renamed from: b */
    private float m122940b(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float d = m122942d(f2) - f;
            if (((double) Math.abs(d)) < 0.001d) {
                break;
            }
            f2 -= d / m122941c(f2);
        }
        return f2;
    }

    /* renamed from: a */
    private float m122939a(float f) {
        this.f99980e.y = this.f99976a.y * 3.0f;
        this.f99979d.y = ((this.f99977b.y - this.f99976a.y) * 3.0f) - this.f99980e.y;
        this.f99978c.y = (1.0f - this.f99980e.y) - this.f99979d.y;
        return f * (this.f99980e.y + ((this.f99979d.y + (this.f99978c.y * f)) * f));
    }

    /* renamed from: d */
    private float m122942d(float f) {
        this.f99980e.x = this.f99976a.x * 3.0f;
        this.f99979d.x = ((this.f99977b.x - this.f99976a.x) * 3.0f) - this.f99980e.x;
        this.f99978c.x = (1.0f - this.f99980e.x) - this.f99979d.x;
        return f * (this.f99980e.x + ((this.f99979d.x + (this.f99978c.x * f)) * f));
    }

    private C38457aq(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f99978c = new PointF();
        this.f99979d = new PointF();
        this.f99980e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f99976a = pointF;
            this.f99977b = pointF2;
        }
    }

    public C38457aq(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, 1.0f));
    }
}
