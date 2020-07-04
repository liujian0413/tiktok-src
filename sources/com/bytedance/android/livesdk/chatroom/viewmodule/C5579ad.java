package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ad */
final /* synthetic */ class C5579ad implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C5400a f16643a;

    /* renamed from: b */
    private final int f16644b;

    /* renamed from: c */
    private final int f16645c;

    C5579ad(C5400a aVar, int i, int i2) {
        this.f16643a = aVar;
        this.f16644b = i;
        this.f16645c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16643a.mo13717a(this.f16644b, this.f16645c, valueAnimator);
    }
}
