package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBarView */
public class LineProgressBarView extends View {

    /* renamed from: a */
    private int f76491a;

    /* renamed from: b */
    private int f76492b = 100;

    /* renamed from: c */
    private int f76493c;

    /* renamed from: d */
    private Paint f76494d;

    /* renamed from: e */
    private Rect f76495e;

    public int getProgress() {
        return this.f76491a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f76494d = new Paint(1);
        this.f76495e = new Rect();
    }

    public LineProgressBarView(Context context) {
        super(context);
    }

    public void setMaxProgress(int i) {
        this.f76492b = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.f76491a = i;
        postInvalidate();
    }

    public void setColor(int i) {
        this.f76493c = i;
        this.f76494d.setColor(i);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f76495e.set(0, 0, (getMeasuredWidth() * this.f76491a) / this.f76492b, getMeasuredHeight());
        canvas.drawRect(this.f76495e, this.f76494d);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
