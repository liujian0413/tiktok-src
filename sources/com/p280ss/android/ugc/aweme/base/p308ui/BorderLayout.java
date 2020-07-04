package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.base.ui.BorderLayout */
public class BorderLayout extends LinearLayout {

    /* renamed from: a */
    protected float f61663a;

    /* renamed from: b */
    protected float f61664b;

    /* renamed from: c */
    protected int f61665c;

    /* renamed from: d */
    protected int f61666d;

    /* renamed from: e */
    private boolean f61667e;

    /* renamed from: f */
    private Paint f61668f;

    public boolean isSelected() {
        return this.f61667e;
    }

    /* renamed from: a */
    private void m76803a() {
        setWillNotDraw(false);
        if (this.f61668f == null) {
            this.f61668f = new Paint(1);
            this.f61668f.setColor(this.f61666d);
        }
        this.f61668f.setStyle(Style.STROKE);
        this.f61668f.setStrokeWidth(this.f61663a);
    }

    public BorderLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m76804a(canvas);
    }

    public void setSelected(boolean z) {
        if (this.f61667e != z) {
            this.f61667e = z;
            if (this.f61667e) {
                this.f61668f.setColor(this.f61665c);
            } else {
                this.f61668f.setColor(this.f61666d);
            }
            postInvalidate();
        }
    }

    /* renamed from: a */
    private void m76804a(Canvas canvas) {
        Rect rect = new Rect();
        getDrawingRect(rect);
        RectF rectF = new RectF();
        rectF.left = ((float) rect.left) + this.f61663a;
        rectF.right = ((float) rect.right) - this.f61663a;
        rectF.top = ((float) rect.top) + this.f61663a;
        rectF.bottom = ((float) rect.bottom) - this.f61663a;
        canvas.drawRoundRect(rectF, this.f61664b, this.f61664b, this.f61668f);
    }

    public BorderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo60910a(int i, int i2) {
        this.f61665c = i;
        this.f61666d = i2;
        this.f61668f.setColor(this.f61666d);
    }

    public BorderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61663a = 3.0f;
        this.f61664b = 6.0f;
        this.f61665c = -256;
        this.f61666d = -1;
        m76803a();
    }
}
