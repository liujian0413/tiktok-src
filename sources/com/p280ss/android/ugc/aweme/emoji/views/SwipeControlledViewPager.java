package com.p280ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager */
public class SwipeControlledViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f72967a = true;

    public void setSwipeEnabled(boolean z) {
        this.f72967a = z;
    }

    public SwipeControlledViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f72967a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f72967a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeControlledViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
