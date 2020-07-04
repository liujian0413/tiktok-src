package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewPager */
public class FriendTabViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f89048a = true;

    public void setCanScroll(boolean z) {
        this.f89048a = z;
    }

    public FriendTabViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f89048a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f89048a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        if (TextUtils.equals(TabChangeManager.m106432a((FragmentActivity) getContext()).f85773a, "HOME")) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return i2;
        }
    }

    public FriendTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
