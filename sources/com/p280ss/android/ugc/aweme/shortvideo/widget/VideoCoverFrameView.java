package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.p029v7.widget.AppCompatImageView;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VideoCoverFrameView */
public class VideoCoverFrameView extends AppCompatImageView {

    /* renamed from: a */
    private int f108420a;

    /* renamed from: b */
    private int f108421b;

    /* renamed from: c */
    private Paint f108422c;

    /* renamed from: d */
    private float f108423d;

    /* renamed from: e */
    private RectF f108424e;

    public VideoCoverFrameView(Context context) {
        this(context, 0, 0);
    }

    public void setColor(int i) {
        this.f108422c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f108422c.setStrokeWidth((float) i);
    }

    /* renamed from: a */
    private float m132697a(int i) {
        return C9738o.m28708b(getContext(), 1.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f108424e, this.f108423d, this.f108423d, this.f108422c);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f108420a, this.f108421b);
    }

    /* renamed from: a */
    public final void mo102421a(int i, int i2) {
        this.f108420a = i;
        this.f108421b = i2;
        this.f108424e = new RectF(this.f108423d / 2.0f, this.f108423d / 2.0f, ((float) i) - (this.f108423d / 2.0f), ((float) i2) - (this.f108423d / 2.0f));
        invalidate();
    }

    private VideoCoverFrameView(Context context, int i, int i2) {
        super(context);
        this.f108420a = 0;
        this.f108421b = 0;
        this.f108422c = new Paint();
        this.f108422c.setStyle(Style.STROKE);
        this.f108422c.setColor(-1);
        float a = m132697a(1);
        this.f108423d = a;
        this.f108422c.setStrokeWidth(a);
    }
}
