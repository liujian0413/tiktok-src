package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.LabelLayout */
public class LabelLayout extends LinearLayout {
    public LabelLayout(Context context) {
        this(context, null);
    }

    public LabelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                for (int i3 = 1; i3 < childCount; i3++) {
                    View childAt2 = getChildAt(i3);
                    if (childAt2.getVisibility() != 8) {
                        measureChild(childAt2, i, i2);
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) childAt2.getLayoutParams();
                        measuredWidth2 += childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                        if (measuredWidth2 > measuredWidth) {
                            childAt2.setVisibility(8);
                            for (int i4 = i3 + 1; i4 < childCount; i4++) {
                                getChildAt(i4).setVisibility(8);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public LabelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
