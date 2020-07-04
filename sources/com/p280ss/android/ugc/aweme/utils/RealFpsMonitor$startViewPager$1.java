package com.p280ss.android.ugc.aweme.utils;

import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;

/* renamed from: com.ss.android.ugc.aweme.utils.RealFpsMonitor$startViewPager$1 */
public final class RealFpsMonitor$startViewPager$1 extends SimpleOnPageChangeListener {

    /* renamed from: a */
    final /* synthetic */ C43061dl f111426a;

    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            this.f111426a.mo104726b();
            return;
        }
        this.f111426a.mo104727c();
        this.f111426a.mo104725a();
    }
}
