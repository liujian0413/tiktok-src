package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.k */
final /* synthetic */ class C9266k implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PKProgressBar f25433a;

    C9266k(PKProgressBar pKProgressBar) {
        this.f25433a = pKProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25433a.mo22571b(valueAnimator);
    }
}
