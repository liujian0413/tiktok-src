package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiLabelsLayout */
public class PoiLabelsLayout extends LinearLayout {

    /* renamed from: a */
    private int[] f93041a;

    /* renamed from: b */
    private SparseIntArray f93042b = new SparseIntArray();

    public void setChildsToHideInSequence(int... iArr) {
        this.f93041a = iArr;
    }

    public PoiLabelsLayout(Context context) {
        super(context);
    }

    public PoiLabelsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f93041a != null && this.f93041a.length != 0) {
            int childCount = getChildCount();
            if (childCount > 1) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth != 0) {
                    this.f93042b.clear();
                    int i3 = 0;
                    int i4 = childCount;
                    int i5 = 0;
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 8) {
                            i4--;
                        } else {
                            measureChild(childAt, i, i2);
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                            int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                            i6 = Math.max(i6, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                            i5 += measuredWidth2;
                            this.f93042b.put(i7, measuredWidth2);
                        }
                    }
                    if (i5 > measuredWidth) {
                        for (int i8 : this.f93041a) {
                            View childAt2 = getChildAt(i8);
                            if (childAt2.getVisibility() != 8) {
                                i5 -= this.f93042b.get(i8);
                                childAt2.setVisibility(8);
                                i4--;
                                if (i5 <= measuredWidth) {
                                    break;
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        while (true) {
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt3 = getChildAt(i3);
                            if (childAt3.getVisibility() == 8) {
                                i3++;
                            } else if (childAt3 instanceof TextView) {
                                TextView textView = (TextView) childAt3;
                                textView.setMaxLines(1);
                                textView.setEllipsize(TruncateAt.END);
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public PoiLabelsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
