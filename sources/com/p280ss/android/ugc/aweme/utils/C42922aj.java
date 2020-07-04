package com.p280ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.utils.aj */
final /* synthetic */ class C42922aj implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TextView f111451a;

    C42922aj(TextView textView) {
        this.f111451a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C42920ah.m136267a(this.f111451a, valueAnimator);
    }
}
