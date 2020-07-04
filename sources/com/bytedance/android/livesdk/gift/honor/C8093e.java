package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.gift.honor.e */
final /* synthetic */ class C8093e implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22101a;

    /* renamed from: b */
    private final float f22102b;

    C8093e(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, float f) {
        this.f22101a = liveGiftHonorLevelWidget;
        this.f22102b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22101a.mo21179a(this.f22102b, valueAnimator);
    }
}
