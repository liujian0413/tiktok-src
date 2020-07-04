package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.widget.m */
final /* synthetic */ class C9268m implements AnimatorUpdateListener {

    /* renamed from: a */
    private final WaveProgressView f25435a;

    C9268m(WaveProgressView waveProgressView) {
        this.f25435a = waveProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f25435a.mo22630a(valueAnimator);
    }
}
