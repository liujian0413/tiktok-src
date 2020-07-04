package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.l */
final /* synthetic */ class C9267l implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f25434a;

    C9267l(PKProgressBar pKProgressBar) {
        this.f25434a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25434a.mo22570a(valueAnimator);
    }
}
