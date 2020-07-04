package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.c */
final /* synthetic */ class C31988c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f83667a;

    /* renamed from: b */
    private final float f83668b;

    /* renamed from: c */
    private final float f83669c;

    /* renamed from: d */
    private final float f83670d;

    /* renamed from: e */
    private final float f83671e;

    C31988c(DragView dragView, float f, float f2, float f3, float f4) {
        this.f83667a = dragView;
        this.f83668b = f;
        this.f83669c = f2;
        this.f83670d = f3;
        this.f83671e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f83667a.mo82820a(this.f83668b, this.f83669c, this.f83670d, this.f83671e, valueAnimator);
    }
}
