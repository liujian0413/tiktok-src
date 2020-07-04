package com.bytedance.android.livesdk.chatroom.p220ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ad */
final /* synthetic */ class C5178ad implements AnimatorUpdateListener {

    /* renamed from: a */
    private final InRoomPKAnimationView f15207a;

    C5178ad(InRoomPKAnimationView inRoomPKAnimationView) {
        this.f15207a = inRoomPKAnimationView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15207a.mo13206a(valueAnimator);
    }
}
