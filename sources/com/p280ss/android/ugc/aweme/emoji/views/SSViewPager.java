package com.p280ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.SSViewPager */
public class SSViewPager extends ViewPager {
    public SSViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public SSViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
