package com.p280ss.android.ugc.aweme.effect;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;

/* renamed from: com.ss.android.ugc.aweme.effect.NoScrollViewPager */
public class NoScrollViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f72150a = true;

    public void setNoScroll(boolean z) {
        this.f72150a = z;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f72150a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f72150a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("cur_item:");
            sb2.append(getCurrentItem());
            sb.append(sb2.toString());
            if (getAdapter() != null) {
                StringBuilder sb3 = new StringBuilder(", count:");
                sb3.append(getAdapter().getCount());
                sb.append(sb3.toString());
            }
            C41530am.m132283b(sb.toString());
            return false;
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
