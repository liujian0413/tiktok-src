package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagGroup */
public class FollowFeedTagGroup extends LinearLayout {
    public FollowFeedTagGroup(Context context) {
        this(context, null);
    }

    public FollowFeedTagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount > 1) {
            int measuredWidth = getMeasuredWidth();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 1; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i4 = childAt.getMeasuredHeight();
                    i3 += measuredWidth2;
                }
            }
            View childAt2 = getChildAt(0);
            if (childAt2.getVisibility() != 8) {
                measureChild(childAt2, i, i2);
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) childAt2.getLayoutParams();
                if (childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + i3 >= measuredWidth) {
                    int i6 = ((measuredWidth - i3) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                    if (i4 == 0) {
                        i4 = childAt2.getMeasuredHeight();
                    }
                    measureChild(childAt2, MeasureSpec.makeMeasureSpec(i6, 1073741824), MeasureSpec.makeMeasureSpec(i4, 1073741824));
                }
            }
        }
    }

    public FollowFeedTagGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
