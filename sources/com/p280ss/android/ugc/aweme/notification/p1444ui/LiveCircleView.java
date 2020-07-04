package com.p280ss.android.ugc.aweme.notification.p1444ui;

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
import com.p280ss.android.ugc.aweme.awemenotice.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.notification.ui.LiveCircleView */
public class LiveCircleView extends View {

    /* renamed from: a */
    private Paint f90329a;

    /* renamed from: b */
    private float f90330b;

    /* renamed from: c */
    private Context f90331c;

    /* renamed from: d */
    private int f90332d;

    /* renamed from: e */
    private int f90333e;

    /* renamed from: f */
    private float f90334f;

    /* renamed from: g */
    private float f90335g;

    /* renamed from: h */
    private int f90336h;

    /* renamed from: i */
    private Paint f90337i;

    public void setStrokeWidth(int i) {
        this.f90330b = (float) i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle((float) this.f90332d, (float) this.f90333e, this.f90334f, this.f90329a);
        canvas.drawCircle((float) this.f90332d, (float) this.f90333e, this.f90335g, this.f90337i);
    }

    public void setFraction(float f) {
        this.f90335g = this.f90334f + (((float) this.f90336h) * f);
        this.f90337i.setStrokeWidth(this.f90330b * (1.0f - f));
        postInvalidate();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f90332d = getMeasuredWidth() / 2;
        this.f90333e = getMeasuredHeight() / 2;
        this.f90334f = (float) ((getMeasuredHeight() / 2) - getPaddingBottom());
        this.f90335g = this.f90334f;
        this.f90336h = getPaddingBottom();
    }

    /* renamed from: a */
    private void m111842a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleView);
        this.f90330b = (float) ((int) obtainStyledAttributes.getDimension(0, C9738o.m28708b(context, 1.5f)));
        obtainStyledAttributes.recycle();
        this.f90331c = context;
        this.f90329a = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, Color.parseColor("#FF1764"), Color.parseColor("#ED3495"), TileMode.MIRROR);
        this.f90329a.setShader(linearGradient);
        this.f90329a.setAntiAlias(true);
        this.f90329a.setDither(true);
        this.f90329a.setStyle(Style.STROKE);
        this.f90329a.setStrokeWidth(C9738o.m28708b(context, 1.0f));
        this.f90337i = new Paint(this.f90329a);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m111842a(context, attributeSet);
    }
}
