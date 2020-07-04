package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.views.ChallengeViewPager */
public class ChallengeViewPager extends RtlViewPager {

    /* renamed from: b */
    private boolean f112215b;

    public ChallengeViewPager(Context context) {
        super(context);
    }

    public void setPagingEnable(boolean z) {
        this.f112215b = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f112215b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f112215b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public ChallengeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
