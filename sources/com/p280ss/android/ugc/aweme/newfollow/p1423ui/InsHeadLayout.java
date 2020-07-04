package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsHeadLayout */
public class InsHeadLayout extends LinearLayout {
    public InsHeadLayout(Context context) {
        this(context, null);
    }

    public InsHeadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth != 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    measureChild(childAt, i, i2);
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                    i3 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (i3 > measuredWidth) {
                    View childAt2 = getChildAt(0);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                    childAt2.setLayoutParams(layoutParams);
                }
                super.onMeasure(i, i2);
            }
        }
    }

    public InsHeadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
