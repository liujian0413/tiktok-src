package com.bytedance.ies.uikit.viewpager;

import android.view.MotionEvent;

public class SwipeViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f30131a;

    public void setSwipeEnabled(boolean z) {
        this.f30131a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30131a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30131a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
