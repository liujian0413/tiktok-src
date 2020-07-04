package com.bytedance.android.live.uikit.viewpager;

import android.view.MotionEvent;

public class SwipeControlledViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f10772a;

    public void setSwipeEnabled(boolean z) {
        this.f10772a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f10772a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10772a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
