package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class MaxWidthSupportRecyclerView extends RecyclerView {

    /* renamed from: M */
    private float f15650M = 3.0f;

    /* renamed from: N */
    private boolean f15651N;

    public void setEnable(boolean z) {
        this.f15651N = z;
    }

    public void setMaxItem(float f) {
        this.f15650M = f;
    }

    public MaxWidthSupportRecyclerView(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Boolean.valueOf(true);
                    break;
                case 1:
                    break;
            }
        }
        Boolean.valueOf(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    public MaxWidthSupportRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) this.f15650M;
        float f = this.f15650M % ((float) i3);
        if (this.f15651N && getAdapter() != null && getAdapter().getItemCount() >= i3 && getChildCount() >= i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    i4 += childAt.getMeasuredWidth();
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i4 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                }
            }
            if (getAdapter().getItemCount() > i3 && f > 0.0f) {
                View childAt2 = getChildAt(i3);
                i4 += childAt2.getMeasuredWidth() / 2;
                LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                    i4 += (marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) / 2;
                }
            }
            setMeasuredDimension(i4, MeasureSpec.getSize(i2));
        }
    }

    public MaxWidthSupportRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
