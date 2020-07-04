package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class MaxWidthLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f15647a;

    public MaxWidthLinearLayout(Context context) {
        super(context);
    }

    public void setMaxWidth(int i) {
        this.f15647a = i;
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f15647a > 0) {
            int mode = MeasureSpec.getMode(i);
            if (MeasureSpec.getSize(i) > this.f15647a) {
                i = MeasureSpec.makeMeasureSpec(this.f15647a, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
