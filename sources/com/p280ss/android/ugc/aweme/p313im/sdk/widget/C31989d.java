package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.d */
final /* synthetic */ class C31989d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f83672a;

    /* renamed from: b */
    private final float f83673b;

    /* renamed from: c */
    private final float f83674c;

    /* renamed from: d */
    private final float f83675d;

    /* renamed from: e */
    private final float f83676e;

    /* renamed from: f */
    private final float f83677f;

    /* renamed from: g */
    private final float f83678g;

    /* renamed from: h */
    private final float f83679h;

    /* renamed from: i */
    private final float f83680i;

    /* renamed from: j */
    private final float f83681j;

    C31989d(DragView dragView, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f83672a = dragView;
        this.f83673b = f;
        this.f83674c = f2;
        this.f83675d = f3;
        this.f83676e = f4;
        this.f83677f = f5;
        this.f83678g = f6;
        this.f83679h = f7;
        this.f83680i = f8;
        this.f83681j = f9;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f83672a.mo82817a(this.f83673b, this.f83674c, this.f83675d, this.f83676e, this.f83677f, this.f83678g, this.f83679h, this.f83680i, this.f83681j, valueAnimator);
    }
}
