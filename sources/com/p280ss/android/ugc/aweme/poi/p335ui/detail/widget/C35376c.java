package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.p023a.C0534a;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.C35370d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.c */
abstract class C35376c extends C35378e<View> {
    public int mOverlayTop;
    final Rect mTempRect1 = new Rect();
    final Rect mTempRect2 = new Rect();
    public int mVerticalLayoutGap = 0;

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public abstract View findFirstDependency(List<View> list);

    /* access modifiers changed from: 0000 */
    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    C35376c() {
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    public final int getOverlapPixelsForOffset(View view) {
        if (this.mOverlayTop == 0) {
            return 0;
        }
        return C0534a.m2233a((int) (getOverlapRatioForOffset(view) * ((float) this.mOverlayTop)), 0, this.mOverlayTop);
    }

    C35376c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.mo90017b(view));
        if (findFirstDependency != null) {
            C35370d dVar = (C35370d) view.getLayoutParams();
            Rect rect = this.mTempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, findFirstDependency.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C0954ab lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0991u.m4244w(coordinatorLayout) && !C0991u.m4244w(view)) {
                rect.left += lastWindowInsets.mo3717a();
                rect.right -= lastWindowInsets.mo3720c();
            }
            Rect rect2 = this.mTempRect2;
            C0972e.m4110a(resolveGravity(dVar.f92782c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.mVerticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.mVerticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View findFirstDependency = findFirstDependency(coordinatorLayout.mo90017b(view));
            if (findFirstDependency != null) {
                if (!C0991u.m4244w(findFirstDependency) || C0991u.m4244w(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C0991u.m4203b(view, true);
                    if (C0991u.m4244w(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int measuredHeight = (size - findFirstDependency.getMeasuredHeight()) + getScrollRange(findFirstDependency);
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.mo90015a(view, i, i2, MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}
