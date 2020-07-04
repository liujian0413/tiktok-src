package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ac */
final /* synthetic */ class C5578ac implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C5400a f16640a;

    /* renamed from: b */
    private final int f16641b;

    /* renamed from: c */
    private final int f16642c;

    C5578ac(C5400a aVar, int i, int i2) {
        this.f16640a = aVar;
        this.f16641b = i;
        this.f16642c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16640a.mo13718b(this.f16641b, this.f16642c, valueAnimator);
    }
}
