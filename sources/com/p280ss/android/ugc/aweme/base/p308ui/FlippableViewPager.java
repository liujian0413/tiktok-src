package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.p931a.C21085a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.FlippableViewPager */
public class FlippableViewPager extends RtlCompatViewPager {

    /* renamed from: a */
    public boolean f61696a = true;

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    public FlippableViewPager(Context context) {
        super(context);
    }

    public void setOffscreenPageLimit(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean canScrollHorizontally(int i) {
        if (!this.f61696a || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f61696a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!C21085a.m71126a(motionEvent, getContext()) && this.f61696a && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public FlippableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
