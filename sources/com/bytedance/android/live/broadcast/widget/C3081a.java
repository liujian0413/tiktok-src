package com.bytedance.android.live.broadcast.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.live.broadcast.widget.a */
final /* synthetic */ class C3081a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final AudioWidget f9552a;

    C3081a(AudioWidget audioWidget) {
        this.f9552a = audioWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9552a.mo9786a(valueAnimator);
    }
}
