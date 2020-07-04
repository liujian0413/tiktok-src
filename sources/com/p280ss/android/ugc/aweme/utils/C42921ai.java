package com.p280ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.utils.ai */
final /* synthetic */ class C42921ai implements AnimatorUpdateListener {

    /* renamed from: a */
    private final ViewGroup f111449a;

    /* renamed from: b */
    private final boolean f111450b;

    C42921ai(ViewGroup viewGroup, boolean z) {
        this.f111449a = viewGroup;
        this.f111450b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C42920ah.m136266a(this.f111449a, this.f111450b, valueAnimator);
    }
}
