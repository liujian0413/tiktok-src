package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.j */
final /* synthetic */ class C9265j implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f25432a;

    C9265j(PKProgressBar pKProgressBar) {
        this.f25432a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25432a.mo22572c(valueAnimator);
    }
}
