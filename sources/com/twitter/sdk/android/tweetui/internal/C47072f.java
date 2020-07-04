package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.twitter.sdk.android.tweetui.internal.f */
final /* synthetic */ class C47072f implements AnimatorUpdateListener {

    /* renamed from: a */
    private final MultiTouchImageView f120798a;

    /* renamed from: b */
    private final float f120799b;

    /* renamed from: c */
    private final float f120800c;

    C47072f(MultiTouchImageView multiTouchImageView, float f, float f2) {
        this.f120798a = multiTouchImageView;
        this.f120799b = f;
        this.f120800c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f120798a.mo118260a(this.f120799b, this.f120800c, valueAnimator);
    }
}
