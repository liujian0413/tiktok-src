package com.bytedance.ies.uikit.viewpager;

import android.view.MotionEvent;

public class SwipeControlledViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f30130a;

    public void setSwipeEnabled(boolean z) {
        this.f30130a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30130a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30130a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
