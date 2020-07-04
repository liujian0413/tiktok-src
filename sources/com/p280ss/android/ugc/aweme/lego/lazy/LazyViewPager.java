package com.p280ss.android.ugc.aweme.lego.lazy;

import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.lego.lazy.LazyViewPager */
public class LazyViewPager extends ViewPager {

    /* renamed from: a */
    private LazyPagerAdapter f84446a;

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

    public void setAdapter(PagerAdapter pagerAdapter) {
        LazyPagerAdapter lazyPagerAdapter;
        super.setAdapter(pagerAdapter);
        if (pagerAdapter instanceof LazyPagerAdapter) {
            lazyPagerAdapter = (LazyPagerAdapter) pagerAdapter;
        } else {
            lazyPagerAdapter = null;
        }
        this.f84446a = lazyPagerAdapter;
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f84446a != null) {
            if (getCurrentItem() == i) {
                int i3 = i + 1;
                if (f >= 0.1f && this.f84446a.mo67893a(i3)) {
                    this.f84446a.startUpdate((ViewGroup) this);
                    this.f84446a.mo67894b(this, i3);
                    this.f84446a.finishUpdate((ViewGroup) this);
                }
            } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.f84446a.mo67893a(i)) {
                this.f84446a.startUpdate((ViewGroup) this);
                this.f84446a.mo67894b(this, i);
                this.f84446a.finishUpdate((ViewGroup) this);
            }
        }
        super.onPageScrolled(i, f, i2);
    }
}
