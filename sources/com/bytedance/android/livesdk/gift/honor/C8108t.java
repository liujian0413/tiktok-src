package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.gift.honor.t */
final /* synthetic */ class C8108t implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorProgressView f22124a;

    C8108t(LiveGiftHonorProgressView liveGiftHonorProgressView) {
        this.f22124a = liveGiftHonorProgressView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22124a.mo21201a(valueAnimator);
    }
}
