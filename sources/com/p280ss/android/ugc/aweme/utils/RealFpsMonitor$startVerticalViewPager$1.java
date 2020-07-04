package com.p280ss.android.ugc.aweme.utils;

import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;

/* renamed from: com.ss.android.ugc.aweme.utils.RealFpsMonitor$startVerticalViewPager$1 */
public final class RealFpsMonitor$startVerticalViewPager$1 extends SimpleOnPageChangeListener {

    /* renamed from: a */
    final /* synthetic */ C43061dl f111425a;

    RealFpsMonitor$startVerticalViewPager$1(C43061dl dlVar) {
        this.f111425a = dlVar;
    }

    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            this.f111425a.mo104726b();
            return;
        }
        this.f111425a.mo104727c();
        this.f111425a.mo104725a();
    }
}
