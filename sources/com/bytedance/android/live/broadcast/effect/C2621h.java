package com.bytedance.android.live.broadcast.effect;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.bytedance.android.live.broadcast.effect.h */
final /* synthetic */ class C2621h implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C2619g f8409a;

    /* renamed from: b */
    private final int f8410b;

    /* renamed from: c */
    private final int f8411c;

    /* renamed from: d */
    private final int f8412d;

    C2621h(C2619g gVar, int i, int i2, int i3) {
        this.f8409a = gVar;
        this.f8410b = i;
        this.f8411c = i2;
        this.f8412d = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8409a.mo9245a(this.f8410b, this.f8411c, this.f8412d, valueAnimator);
    }
}
