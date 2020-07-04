package com.bytedance.ies.uikit.progressview;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.bytedance.ugc.uikit.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CircleProgress extends View {
    private int[] COLORS;
    private final double DEGREE = 0.017453292519943295d;
    private C11057a[] mArcPoint;
    private Point mCenter = new Point();
    private long mDuration = 3600;
    private TimeInterpolator mInterpolator = new C11058b();
    private Paint mPaint;
    private long mPlayTime;
    private int mPointRadius;
    private boolean mStartAnim = false;
    private long mStartTime;
    private int mViewSize;

    /* renamed from: com.bytedance.ies.uikit.progressview.CircleProgress$a */
    static class C11057a {

        /* renamed from: a */
        float f30042a;

        /* renamed from: b */
        float f30043b;

        /* renamed from: c */
        int f30044c;

        C11057a(float f, float f2, int i) {
            this.f30042a = f;
            this.f30043b = f2;
            this.f30044c = i;
        }
    }

    /* renamed from: com.bytedance.ies.uikit.progressview.CircleProgress$b */
    static class C11058b implements TimeInterpolator {
        C11058b() {
        }

        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2 * f2;
            }
            float f3 = f2 - 2.0f;
            return (0.5f * f3 * f3 * f3) + 1.0f;
        }
    }

    public void stopAnim() {
        this.mStartAnim = false;
    }

    public void reset() {
        stopAnim();
        this.mPlayTime = 0;
        postInvalidate();
    }

    private float getFactor() {
        if (this.mStartAnim) {
            this.mPlayTime = AnimationUtils.currentAnimationTimeMillis() - this.mStartTime;
        }
        return (((float) this.mPlayTime) / ((float) this.mDuration)) % 5.0f;
    }

    public void startAnim() {
        this.mPlayTime %= this.mDuration;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartAnim = true;
        postInvalidate();
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void setRadius(float f) {
        stopAnim();
        calPoints(f);
        startAnim();
    }

    public CircleProgress(Context context) {
        super(context);
        init(null, 0);
    }

    private void calPoints(float f) {
        int i = (int) (((float) (this.mViewSize / 3)) * f);
        this.mPointRadius = i / 6;
        for (int i2 = 0; i2 < 8; i2++) {
            float f2 = (float) i;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = d * 0.7853981633974483d;
            this.mArcPoint[i2] = new C11057a((-((float) Math.sin(d2))) * f2, f2 * (-((float) Math.cos(d2))), this.COLORS[i2 % 3]);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) this.mCenter.x, (float) this.mCenter.y);
        float factor = getFactor();
        canvas.rotate(36.0f * factor);
        for (int i = 0; i < 8; i++) {
            this.mPaint.setColor(this.mArcPoint[i].f30044c);
            float itemFactor = getItemFactor(i, factor);
            canvas.drawCircle(this.mArcPoint[i].f30042a - ((this.mArcPoint[i].f30042a * 2.0f) * itemFactor), this.mArcPoint[i].f30043b - ((this.mArcPoint[i].f30043b * 2.0f) * itemFactor), (float) this.mPointRadius, this.mPaint);
        }
        canvas.restore();
        if (this.mStartAnim) {
            postInvalidate();
        }
    }

    private float getItemFactor(int i, float f) {
        float f2 = (f - (((float) i) * 0.0825f)) * 3.0f;
        float f3 = 1.0f;
        if (f2 < 0.0f) {
            f3 = 0.0f;
        } else if (f2 <= 1.0f) {
            f3 = f2;
        }
        return this.mInterpolator.getInterpolation(f3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.eh);
        this.mViewSize = Math.min(getDefaultSize(dimensionPixelSize, i), getDefaultSize(dimensionPixelSize, i2));
        setMeasuredDimension(this.mViewSize, this.mViewSize);
        this.mCenter.set(this.mViewSize / 2, this.mViewSize / 2);
        calPoints(1.0f);
    }

    public CircleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    private void init(AttributeSet attributeSet, int i) {
        this.mArcPoint = new C11057a[8];
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Style.FILL);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircleProgress, i, 0);
        int color = obtainStyledAttributes.getColor(0, -1759188);
        int color2 = obtainStyledAttributes.getColor(1, -14708582);
        int color3 = obtainStyledAttributes.getColor(2, -221678);
        obtainStyledAttributes.recycle();
        this.COLORS = new int[]{color, color2, color3};
    }

    public CircleProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
