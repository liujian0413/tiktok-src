package com.p280ss.android.ugc.aweme.shortvideo.widget.animation;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.a */
public final class C41684a implements Interpolator {

    /* renamed from: a */
    protected PointF f108497a;

    /* renamed from: b */
    protected PointF f108498b;

    /* renamed from: c */
    protected PointF f108499c;

    /* renamed from: d */
    protected PointF f108500d;

    /* renamed from: e */
    protected PointF f108501e;

    public final float getInterpolation(float f) {
        return m132766a(m132767b(f));
    }

    /* renamed from: c */
    private float m132768c(float f) {
        return this.f108501e.x + (f * ((this.f108500d.x * 2.0f) + (this.f108499c.x * 3.0f * f)));
    }

    /* renamed from: b */
    private float m132767b(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float d = m132769d(f2) - f;
            if (((double) Math.abs(d)) < 0.001d) {
                break;
            }
            f2 -= d / m132768c(f2);
        }
        return f2;
    }

    /* renamed from: a */
    private float m132766a(float f) {
        this.f108501e.y = this.f108497a.y * 3.0f;
        this.f108500d.y = ((this.f108498b.y - this.f108497a.y) * 3.0f) - this.f108501e.y;
        this.f108499c.y = (1.0f - this.f108501e.y) - this.f108500d.y;
        return f * (this.f108501e.y + ((this.f108500d.y + (this.f108499c.y * f)) * f));
    }

    /* renamed from: d */
    private float m132769d(float f) {
        this.f108501e.x = this.f108497a.x * 3.0f;
        this.f108500d.x = ((this.f108498b.x - this.f108497a.x) * 3.0f) - this.f108501e.x;
        this.f108499c.x = (1.0f - this.f108501e.x) - this.f108500d.x;
        return f * (this.f108501e.x + ((this.f108500d.x + (this.f108499c.x * f)) * f));
    }

    private C41684a(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f108499c = new PointF();
        this.f108500d = new PointF();
        this.f108501e = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f108497a = pointF;
            this.f108498b = pointF2;
        }
    }

    public C41684a(float f, float f2, float f3, float f4) {
        this(new PointF(0.15f, 0.12f), new PointF(1.0f, 0.0f));
    }
}
