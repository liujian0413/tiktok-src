package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    private Paint f75767a;

    /* renamed from: b */
    private float f75768b;

    /* renamed from: c */
    private Context f75769c;

    /* renamed from: d */
    private int f75770d;

    /* renamed from: e */
    private int f75771e;

    /* renamed from: f */
    private float f75772f;

    /* renamed from: g */
    private float f75773g;

    /* renamed from: h */
    private int f75774h;

    /* renamed from: i */
    private Paint f75775i;

    public void setStrokeWidth(int i) {
        this.f75768b = (float) i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f75770d, (float) this.f75771e, this.f75772f, this.f75767a);
        canvas.drawCircle((float) this.f75770d, (float) this.f75771e, this.f75773g, this.f75775i);
    }

    public void setFraction(float f) {
        this.f75773g = this.f75772f + (((float) this.f75774h) * f);
        this.f75775i.setStrokeWidth(this.f75768b * (1.0f - f));
        postInvalidate();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo73895a(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, TileMode.MIRROR);
        this.f75767a.setShader(linearGradient);
        this.f75775i.setShader(linearGradient);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f75770d = getMeasuredWidth() / 2;
        this.f75771e = getMeasuredHeight() / 2;
        this.f75772f = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f75773g = this.f75772f;
        this.f75774h = getPaddingBottom();
    }

    /* renamed from: a */
    private void m94645a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleView);
        this.f75768b = (float) ((int) obtainStyledAttributes.getDimension(0, C9738o.m28708b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f75769c = context;
        this.f75767a = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), TileMode.MIRROR);
        this.f75767a.setShader(linearGradient);
        this.f75767a.setAntiAlias(true);
        this.f75767a.setDither(true);
        this.f75767a.setStyle(Style.STROKE);
        this.f75767a.setStrokeWidth(C9738o.m28708b(context, 1.0f));
        this.f75775i = new Paint(this.f75767a);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m94645a(context, attributeSet);
    }
}
