package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget.CoordinatorLayout.Behavior;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.e */
class C35378e<V extends View> extends Behavior<V> {
    private int mTempLeftRightOffset;
    private int mTempTopBottomOffset;
    private C35379f mViewOffsetHelper;

    C35378e() {
    }

    public int getLeftAndRightOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f92817d;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.f92816c;
        }
        return 0;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.mo90099b(i);
        }
        this.mTempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (this.mViewOffsetHelper != null) {
            return this.mViewOffsetHelper.mo90098a(i);
        }
        this.mTempTopBottomOffset = i;
        return false;
    }

    C35378e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo90014a((View) v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.mViewOffsetHelper == null) {
            this.mViewOffsetHelper = new C35379f(v);
        }
        this.mViewOffsetHelper.mo90097a();
        if (this.mTempTopBottomOffset != 0) {
            this.mViewOffsetHelper.mo90098a(this.mTempTopBottomOffset);
            this.mTempTopBottomOffset = 0;
        }
        if (this.mTempLeftRightOffset != 0) {
            this.mViewOffsetHelper.mo90099b(this.mTempLeftRightOffset);
            this.mTempLeftRightOffset = 0;
        }
        return true;
    }
}
