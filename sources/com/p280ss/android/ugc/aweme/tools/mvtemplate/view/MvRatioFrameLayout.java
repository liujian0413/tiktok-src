package com.p280ss.android.ugc.aweme.tools.mvtemplate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvRatioFrameLayout */
public class MvRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    private float f110642a = 0.5625f;

    public void setRatio(float f) {
        this.f110642a = f;
    }

    public MvRatioFrameLayout(Context context) {
        super(context);
    }

    public MvRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        if (this.f110642a != 0.0f) {
            i = MeasureSpec.makeMeasureSpec((int) (((float) size) * this.f110642a), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
