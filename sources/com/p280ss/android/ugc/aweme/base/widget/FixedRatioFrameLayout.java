package com.p280ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout */
public class FixedRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    int f62007a;

    /* renamed from: b */
    float f62008b;

    public int getMode() {
        return this.f62007a;
    }

    public float getWhRatio() {
        return this.f62008b;
    }

    public FixedRatioFrameLayout(Context context) {
        this(context, null);
    }

    public void setMode(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        } else if (this.f62007a != i) {
            this.f62007a = i;
            requestLayout();
        }
    }

    public void setWhRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("whRatio must be positive.");
        } else if (this.f62008b != f) {
            this.f62008b = f;
            requestLayout();
        }
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop();
        if (this.f62007a == 0) {
            i = MeasureSpec.makeMeasureSpec((int) ((((float) size2) * this.f62008b) + 0.5f), 1073741824);
        } else {
            i2 = MeasureSpec.makeMeasureSpec((int) ((((float) size) / this.f62008b) + 0.5f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77182a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m77182a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FixedRatioFrameLayout, i, i2);
        this.f62007a = obtainStyledAttributes.getInteger(0, 1);
        this.f62008b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m77182a(context, attributeSet, i, i2);
    }
}
