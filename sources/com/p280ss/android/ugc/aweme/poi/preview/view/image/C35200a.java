package com.p280ss.android.ugc.aweme.poi.preview.view.image;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView.ScaleType;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.a */
public final class C35200a {

    /* renamed from: a */
    RectF f92159a = new RectF();

    /* renamed from: b */
    RectF f92160b = new RectF();

    /* renamed from: c */
    RectF f92161c = new RectF();

    /* renamed from: d */
    RectF f92162d = new RectF();

    /* renamed from: e */
    PointF f92163e = new PointF();

    /* renamed from: f */
    float f92164f;

    /* renamed from: g */
    float f92165g;

    /* renamed from: h */
    ScaleType f92166h;

    public C35200a(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f, float f2, ScaleType scaleType) {
        this.f92159a.set(rectF);
        this.f92160b.set(rectF2);
        this.f92161c.set(rectF3);
        this.f92164f = f;
        this.f92166h = scaleType;
        this.f92165g = f2;
        this.f92162d.set(rectF4);
        this.f92163e.set(pointF);
    }
}
