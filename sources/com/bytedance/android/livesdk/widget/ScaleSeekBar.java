package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatSeekBar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.R$styleable;

public class ScaleSeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    private final Paint f25186a;

    /* renamed from: b */
    private final float f25187b;

    /* renamed from: c */
    private String f25188c;

    /* renamed from: d */
    private String f25189d;

    /* renamed from: e */
    private int f25190e;

    /* renamed from: f */
    private float f25191f;

    /* renamed from: g */
    private float f25192g;

    public ScaleSeekBar(Context context) {
        this(context, null);
    }

    public synchronized void onDraw(Canvas canvas) {
        int bottom = getBottom();
        int top = getTop();
        setBottom((int) (((float) bottom) - ((this.f25187b + ((float) getPaddingTop())) + this.f25192g)));
        setTop((int) (((float) top) + this.f25187b + ((float) getPaddingTop()) + this.f25192g));
        canvas.save();
        canvas.translate(0.0f, this.f25187b + ((float) getPaddingTop()) + this.f25192g);
        super.onDraw(canvas);
        canvas.restore();
        setBottom(bottom);
        setTop(top);
        int progress = getProgress();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25189d);
        sb.append(String.valueOf(progress));
        sb.append(this.f25188c);
        String sb2 = sb.toString();
        if (!C3519c.m12965a(getContext()) || VERSION.SDK_INT < 17) {
            canvas.drawText(sb2, ((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) + getPaddingLeft())) - (this.f25186a.measureText(sb2) / 2.0f), this.f25187b + ((float) getPaddingTop()), this.f25186a);
        } else {
            canvas.drawText(sb2, ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) - (((float) (((((getWidth() - getPaddingLeft()) - getPaddingRight()) * progress) / 100) - getPaddingStart())) + (this.f25186a.measureText(sb2) / 2.0f)), this.f25187b + ((float) getPaddingTop()), this.f25186a);
        }
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            measuredHeight = ((int) (((this.f25186a.descent() - this.f25186a.ascent()) + this.f25192g) * 2.0f)) + getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public ScaleSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25190e = -1;
        this.f25191f = 30.0f;
        this.f25192g = 10.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_ScaleSeekBar);
        if (obtainStyledAttributes != null) {
            this.f25190e = obtainStyledAttributes.getColor(0, -1);
            this.f25191f = obtainStyledAttributes.getDimension(3, 30.0f);
            this.f25192g = obtainStyledAttributes.getDimension(2, 10.0f);
            this.f25189d = obtainStyledAttributes.getString(4);
            if (TextUtils.isEmpty(this.f25189d)) {
                this.f25189d = "";
            }
            this.f25188c = obtainStyledAttributes.getString(1);
            if (TextUtils.isEmpty(this.f25188c)) {
                this.f25188c = "";
            }
            obtainStyledAttributes.recycle();
        }
        this.f25186a = new Paint();
        this.f25186a.setColor(this.f25190e);
        this.f25186a.setTextSize(this.f25191f);
        this.f25186a.setAntiAlias(true);
        this.f25187b = this.f25186a.descent() - this.f25186a.ascent();
    }
}
