package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.AVCircleProgressView */
public final class AVCircleProgressView extends View {

    /* renamed from: a */
    private Paint f104748a;

    /* renamed from: b */
    private Paint f104749b;

    /* renamed from: c */
    private int f104750c;

    /* renamed from: d */
    private int f104751d;

    /* renamed from: e */
    private int f104752e;

    /* renamed from: f */
    private int f104753f;

    /* renamed from: g */
    private int f104754g;

    /* renamed from: h */
    private int f104755h;

    public AVCircleProgressView(Context context) {
        this(context, null, 2, null);
    }

    public final int getHeight$tools_avdmtview_musicallyI18nRelease() {
        return this.f104751d;
    }

    public final int getWidth$tools_avdmtview_musicallyI18nRelease() {
        return this.f104750c;
    }

    /* renamed from: a */
    private final void m128813a() {
        this.f104748a = new Paint();
        Paint paint = this.f104748a;
        if (paint == null) {
            C7573i.m23583a("bgPaint");
        }
        paint.setAntiAlias(true);
        Paint paint2 = this.f104748a;
        if (paint2 == null) {
            C7573i.m23583a("bgPaint");
        }
        paint2.setStyle(Style.STROKE);
        Paint paint3 = this.f104748a;
        if (paint3 == null) {
            C7573i.m23583a("bgPaint");
        }
        this.f104749b = new Paint(paint3);
        Paint paint4 = this.f104749b;
        if (paint4 == null) {
            C7573i.m23583a("progressPaint");
        }
        paint4.setStrokeCap(Cap.ROUND);
    }

    public final void setHeight$tools_avdmtview_musicallyI18nRelease(int i) {
        this.f104751d = i;
    }

    public final void setMaxProgress(int i) {
        this.f104753f = i;
    }

    public final void setStartAngle(int i) {
        this.f104754g = i;
    }

    public final void setWidth$tools_avdmtview_musicallyI18nRelease(int i) {
        this.f104750c = i;
    }

    public final void setProgress(int i) {
        this.f104752e = i;
        invalidate();
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.f104748a;
        if (paint == null) {
            C7573i.m23583a("bgPaint");
        }
        paint.setColor(i);
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.f104749b;
        if (paint == null) {
            C7573i.m23583a("progressPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    public final void setProgressColor(int i) {
        Paint paint = this.f104749b;
        if (paint == null) {
            C7573i.m23583a("progressPaint");
        }
        paint.setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.f104755h = i / 2;
        Paint paint = this.f104748a;
        if (paint == null) {
            C7573i.m23583a("bgPaint");
        }
        paint.setStrokeWidth((float) i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        super.onDraw(canvas);
        float f = ((float) this.f104750c) / 2.0f;
        float f2 = ((float) this.f104751d) / 2.0f;
        float f3 = (((float) this.f104750c) / 2.0f) - ((float) this.f104755h);
        Paint paint = this.f104748a;
        if (paint == null) {
            C7573i.m23583a("bgPaint");
        }
        canvas.drawCircle(f, f2, f3, paint);
        RectF rectF = new RectF((float) this.f104755h, (float) this.f104755h, (float) (this.f104750c - this.f104755h), (float) (this.f104751d - this.f104755h));
        float f4 = (float) (this.f104754g - 90);
        float f5 = ((((float) this.f104752e) * 1.0f) / ((float) this.f104753f)) * 360.0f;
        Paint paint2 = this.f104749b;
        if (paint2 == null) {
            C7573i.m23583a("progressPaint");
        }
        canvas.drawArc(rectF, f4, f5, false, paint2);
    }

    public AVCircleProgressView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        this.f104753f = 100;
        m128813a();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f104750c = MeasureSpec.getSize(i);
        this.f104751d = MeasureSpec.getSize(i2);
    }

    public /* synthetic */ AVCircleProgressView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
