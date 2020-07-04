package com.bytedance.ies.uikit.viewpager;

import android.view.View;
import android.view.View.MeasureSpec;

public class WrapContentViewPager extends SSViewPager {
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
