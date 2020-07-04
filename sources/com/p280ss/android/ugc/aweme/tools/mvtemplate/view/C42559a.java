package com.p280ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.a */
final /* synthetic */ class C42559a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final MvThemeListViewPager f110653a;

    C42559a(MvThemeListViewPager mvThemeListViewPager) {
        this.f110653a = mvThemeListViewPager;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f110653a.mo104141a(valueAnimator);
    }
}
