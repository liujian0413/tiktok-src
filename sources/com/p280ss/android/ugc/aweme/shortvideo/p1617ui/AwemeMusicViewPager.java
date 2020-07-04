package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.support.p022v4.view.ViewPager;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AwemeMusicViewPager */
public class AwemeMusicViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f107018a;

    public void setNoScroll(boolean z) {
        this.f107018a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f107018a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f107018a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }
}
