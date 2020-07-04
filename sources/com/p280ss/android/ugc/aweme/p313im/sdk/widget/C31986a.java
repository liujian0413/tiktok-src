package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.a */
final /* synthetic */ class C31986a implements AnimatorUpdateListener {

    /* renamed from: a */
    private final DragView f83652a;

    /* renamed from: b */
    private final float f83653b;

    /* renamed from: c */
    private final float f83654c;

    /* renamed from: d */
    private final float f83655d;

    /* renamed from: e */
    private final float f83656e;

    /* renamed from: f */
    private final float f83657f;

    C31986a(DragView dragView, float f, float f2, float f3, float f4, float f5) {
        this.f83652a = dragView;
        this.f83653b = f;
        this.f83654c = f2;
        this.f83655d = f3;
        this.f83656e = f4;
        this.f83657f = f5;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f83652a.mo82818a(this.f83653b, this.f83654c, this.f83655d, this.f83656e, this.f83657f, valueAnimator);
    }
}
