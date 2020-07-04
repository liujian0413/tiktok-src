package com.p280ss.android.ugc.gamora.editor.p1743b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.gamora.editor.b.c */
final /* synthetic */ class C44162c implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C44148a f114212a;

    /* renamed from: b */
    private final boolean f114213b;

    /* renamed from: c */
    private final float f114214c;

    /* renamed from: d */
    private final int f114215d;

    /* renamed from: e */
    private final int f114216e;

    /* renamed from: f */
    private final int f114217f;

    /* renamed from: g */
    private final int f114218g;

    /* renamed from: h */
    private final int f114219h;

    /* renamed from: i */
    private final int f114220i;

    C44162c(C44148a aVar, boolean z, float f, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f114212a = aVar;
        this.f114213b = z;
        this.f114214c = f;
        this.f114215d = i;
        this.f114216e = i2;
        this.f114217f = i3;
        this.f114218g = i4;
        this.f114219h = i5;
        this.f114220i = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f114212a.mo106641a(this.f114213b, this.f114214c, this.f114215d, this.f114216e, this.f114217f, this.f114218g, this.f114219h, this.f114220i, valueAnimator);
    }
}
