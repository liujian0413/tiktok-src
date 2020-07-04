package com.bytedance.android.livesdk.gift.honor;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.gift.honor.f */
final /* synthetic */ class C8094f implements AnimatorUpdateListener {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22103a;

    /* renamed from: b */
    private final float f22104b;

    /* renamed from: c */
    private final float f22105c;

    C8094f(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, float f, float f2) {
        this.f22103a = liveGiftHonorLevelWidget;
        this.f22104b = f;
        this.f22105c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f22103a.mo21178a(this.f22104b, this.f22105c, valueAnimator);
    }
}
