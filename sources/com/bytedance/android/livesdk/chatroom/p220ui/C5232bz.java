package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bz */
final /* synthetic */ class C5232bz implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveProfileDetailFragment f15331a;

    C5232bz(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f15331a = liveProfileDetailFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15331a.mo13305a(valueAnimator);
    }
}
