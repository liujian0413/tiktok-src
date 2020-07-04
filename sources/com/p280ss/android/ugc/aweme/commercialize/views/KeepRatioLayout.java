package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.KeepRatioLayout */
public class KeepRatioLayout extends FrameLayout {

    /* renamed from: a */
    private int f67104a;

    /* renamed from: b */
    private int f67105b;

    /* renamed from: c */
    private int f67106c = 1;

    /* renamed from: a */
    public final void mo66180a() {
        m83809b(0, 0, this.f67106c);
    }

    public KeepRatioLayout(Context context) {
        super(context);
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f67104a > 0 || this.f67105b > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f67106c) {
                case 1:
                    if (measuredWidth > 0) {
                        measuredHeight = (this.f67105b * measuredWidth) / this.f67104a;
                        break;
                    } else {
                        return;
                    }
                case 2:
                    if (measuredHeight > 0) {
                        measuredWidth = (this.f67104a * measuredHeight) / this.f67105b;
                        break;
                    } else {
                        return;
                    }
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    /* renamed from: a */
    public final void mo66181a(int i, int i2, int i3) {
        m83809b(i, i2, 1);
    }

    public KeepRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    private void m83809b(int i, int i2, int i3) {
        if (this.f67104a != i || this.f67105b != i2 || this.f67106c != i3) {
            this.f67104a = i;
            this.f67105b = i2;
            this.f67106c = i3;
            requestLayout();
        }
    }
}
