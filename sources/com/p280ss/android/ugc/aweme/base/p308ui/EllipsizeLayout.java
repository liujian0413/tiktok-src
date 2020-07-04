package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.base.ui.EllipsizeLayout */
public class EllipsizeLayout extends LinearLayout {
    public EllipsizeLayout(Context context) {
        this(context, null);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        if (getOrientation() == 0 && MeasureSpec.getMode(i) == 1073741824) {
            int childCount = getChildCount();
            TextView textView = null;
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            while (true) {
                z = true;
                if (i3 < childCount && !z2) {
                    View childAt = getChildAt(i3);
                    if (!(childAt == null || childAt.getVisibility() == 8)) {
                        if (childAt instanceof TextView) {
                            TextView textView2 = (TextView) childAt;
                            if (textView2.getEllipsize() != null) {
                                if (textView == null) {
                                    textView2.setMaxWidth(Integer.MAX_VALUE);
                                    textView = textView2;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                        if (layoutParams.weight <= 0.0f) {
                            z = false;
                        }
                        z2 |= z;
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                        i4 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    }
                    i3++;
                }
            }
            if (!(textView == null || i4 == 0)) {
                z = false;
            }
            boolean z3 = z2 | z;
            int size = MeasureSpec.getSize(i);
            if (!z3 && i4 > size) {
                int measuredWidth = textView.getMeasuredWidth() - (i4 - size);
                if (measuredWidth < 0) {
                    measuredWidth = 0;
                }
                textView.setMaxWidth(measuredWidth);
            }
        }
        super.onMeasure(i, i2);
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
