package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.b */
final /* synthetic */ class C31987b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f83658a;

    /* renamed from: b */
    private final float f83659b;

    /* renamed from: c */
    private final float f83660c;

    /* renamed from: d */
    private final float f83661d;

    /* renamed from: e */
    private final float f83662e;

    /* renamed from: f */
    private final int f83663f;

    /* renamed from: g */
    private final int f83664g;

    /* renamed from: h */
    private final float f83665h;

    /* renamed from: i */
    private final float f83666i;

    C31987b(DragView dragView, float f, float f2, float f3, float f4, int i, int i2, float f5, float f6) {
        this.f83658a = dragView;
        this.f83659b = f;
        this.f83660c = f2;
        this.f83661d = f3;
        this.f83662e = f4;
        this.f83663f = i;
        this.f83664g = i2;
        this.f83665h = f5;
        this.f83666i = f6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f83658a.mo82819a(this.f83659b, this.f83660c, this.f83661d, this.f83662e, this.f83663f, this.f83664g, this.f83665h, this.f83666i, valueAnimator);
    }
}
