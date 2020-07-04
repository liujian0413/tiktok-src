package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout */
public class ScreenSizeAspectFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f108375a = true;

    public ScreenSizeAspectFrameLayout(Context context) {
        super(context);
    }

    public void setAdjustEnable(boolean z) {
        this.f108375a = z;
        if (!C39805en.m127445a()) {
            requestLayout();
        }
    }

    public ScreenSizeAspectFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!C39805en.m127445a()) {
            int a = ((C39805en.m127443a(getContext()) + C39805en.m127451d(getContext())) - getPaddingBottom()) - getPaddingTop();
            int b = C39805en.m127447b(getContext());
            if (this.f108375a) {
                double d = (double) b;
                double d2 = (double) a;
                Double.isNaN(d);
                Double.isNaN(d2);
                if (d / d2 > 0.5625d) {
                    a = (b * 16) / 9;
                } else {
                    b = (a * 9) / 16;
                }
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(b, 1073741824);
            i2 = MeasureSpec.makeMeasureSpec(a, 1073741824);
            i = makeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    public ScreenSizeAspectFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
