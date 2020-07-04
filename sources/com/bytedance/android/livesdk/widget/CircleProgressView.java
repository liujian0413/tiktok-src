package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CircleProgressView extends View {

    /* renamed from: a */
    private Paint f24988a;

    /* renamed from: b */
    private RectF f24989b = new RectF();

    /* renamed from: c */
    private float f24990c;

    /* renamed from: d */
    private int f24991d;

    /* renamed from: e */
    private boolean f24992e = true;

    /* renamed from: f */
    private float f24993f = 0.0f;

    public float getProgress() {
        return this.f24993f;
    }

    /* renamed from: a */
    private void m27342a() {
        this.f24990c = getResources().getDimension(R.dimen.sv);
        this.f24991d = getResources().getColor(R.color.ad5);
        this.f24988a = new Paint();
        this.f24988a.setAntiAlias(true);
        this.f24988a.setStyle(Style.STROKE);
        this.f24988a.setStrokeCap(Cap.ROUND);
        this.f24988a.setStrokeWidth(this.f24990c);
        this.f24988a.setColor(this.f24991d);
    }

    public void setClockWise(boolean z) {
        this.f24992e = z;
    }

    public void setBorderColor(int i) {
        this.f24991d = i;
        this.f24988a.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f24990c = f;
        this.f24988a.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.f24993f = f;
        invalidate();
    }

    public CircleProgressView(Context context) {
        super(context);
        m27342a();
    }

    public void draw(Canvas canvas) {
        float f;
        super.draw(canvas);
        RectF rectF = this.f24989b;
        if (this.f24992e) {
            f = -this.f24993f;
        } else {
            f = this.f24993f;
        }
        float f2 = f;
        canvas.drawArc(rectF, -90.0f, f2, false, this.f24988a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27342a();
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m27342a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = (float) i;
        this.f24989b.set(this.f24990c / 2.0f, this.f24990c / 2.0f, f - (this.f24990c / 2.0f), f - (this.f24990c / 2.0f));
    }
}
