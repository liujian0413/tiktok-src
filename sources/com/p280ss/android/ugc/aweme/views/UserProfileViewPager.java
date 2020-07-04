package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.views.UserProfileViewPager */
public class UserProfileViewPager extends RtlViewPager implements C43376l {

    /* renamed from: b */
    boolean f112317b = true;

    public void setScrollable(boolean z) {
        this.f112317b = z;
    }

    public UserProfileViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f112317b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public UserProfileViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
