package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.p280ss.android.ugc.aweme.feed.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar */
public class NewVideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    private Paint f107084a;

    /* renamed from: b */
    private float f107085b;

    /* renamed from: c */
    private int f107086c;

    /* renamed from: d */
    private int f107087d;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo101637a() {
        setProgress(0);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setReachedBarColor(int i) {
        this.f107087d = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f107085b = f;
    }

    public NewVideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private int m131352b(int i) {
        return (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m131350a(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f107085b, Math.abs(this.f107084a.descent() - this.f107084a.ascent())));
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    /* renamed from: a */
    private void m131351a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerProgressbar);
        this.f107087d = obtainStyledAttributes.getColor(0, -261935);
        this.f107085b = obtainStyledAttributes.getDimension(1, this.f107085b);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f107086c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f107084a.setColor(this.f107087d);
            this.f107084a.setStrokeWidth(this.f107085b);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f107084a);
        }
        canvas.restore();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(MeasureSpec.getSize(i), m131350a(i2));
        this.f107086c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107084a = new Paint();
        this.f107085b = (float) m131352b(6);
        m131351a(attributeSet);
    }
}
