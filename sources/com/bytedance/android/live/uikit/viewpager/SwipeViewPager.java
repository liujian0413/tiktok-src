package com.bytedance.android.live.uikit.viewpager;

import android.view.MotionEvent;

public class SwipeViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f10773a;

    public void setSwipeEnabled(boolean z) {
        this.f10773a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f10773a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10773a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
