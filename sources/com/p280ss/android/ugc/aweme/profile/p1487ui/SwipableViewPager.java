package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.views.UserProfileViewPager;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.SwipableViewPager */
public class SwipableViewPager extends UserProfileViewPager {

    /* renamed from: c */
    private boolean f95250c = true;

    /* renamed from: a */
    public final void mo92341a() {
        this.f95250c = false;
    }

    public SwipableViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f95250c || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public SwipableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
