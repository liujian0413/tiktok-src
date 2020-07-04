package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.by */
final /* synthetic */ class C5231by implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveProfileDetailFragment f15330a;

    C5231by(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f15330a = liveProfileDetailFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15330a.mo13310b(valueAnimator);
    }
}
