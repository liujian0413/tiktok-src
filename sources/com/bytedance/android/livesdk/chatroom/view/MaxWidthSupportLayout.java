package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;

public class MaxWidthSupportLayout extends FrameLayout {

    /* renamed from: a */
    private static int f15648a = 49;

    /* renamed from: b */
    private int f15649b;

    public void setMaxWidth(int i) {
        this.f15649b = i;
    }

    public MaxWidthSupportLayout(Context context) {
        super(context);
        this.f15649b = C9738o.m28691a(getContext()) - ((int) C9738o.m28708b(context, (float) f15648a));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f15649b > 0) {
            int mode = MeasureSpec.getMode(i);
            if (MeasureSpec.getSize(i) > this.f15649b) {
                i = MeasureSpec.makeMeasureSpec(this.f15649b, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15649b = C9738o.m28691a(getContext()) - ((int) C9738o.m28708b(context, (float) f15648a));
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15649b = C9738o.m28691a(getContext()) - ((int) C9738o.m28708b(context, (float) f15648a));
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f15649b = C9738o.m28691a(getContext()) - ((int) C9738o.m28708b(context, (float) f15648a));
    }
}
