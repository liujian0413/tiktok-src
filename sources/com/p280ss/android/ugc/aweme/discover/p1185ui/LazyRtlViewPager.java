package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.adapter.ABLazyFragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.LazyRtlViewPager */
public class LazyRtlViewPager extends RtlViewPager {

    /* renamed from: b */
    private ABLazyFragmentPagerAdapter f71014b;

    public LazyRtlViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof ABLazyFragmentPagerAdapter) {
            this.f71014b = (ABLazyFragmentPagerAdapter) pagerAdapter;
            super.setAdapter(pagerAdapter);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && C27063a.m88826b()) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public LazyRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f && this.f71014b.mo67893a(i3)) {
                this.f71014b.startUpdate(this);
                this.f71014b.mo67894b((ViewGroup) this, i3);
                this.f71014b.finishUpdate(this);
            }
        } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.f71014b.mo67893a(i)) {
            this.f71014b.startUpdate(this);
            this.f71014b.mo67894b((ViewGroup) this, i);
            this.f71014b.finishUpdate(this);
        }
        super.onPageScrolled(i, f, i2);
    }
}
