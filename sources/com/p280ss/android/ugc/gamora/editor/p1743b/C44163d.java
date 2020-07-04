package com.p280ss.android.ugc.gamora.editor.p1743b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.gamora.editor.b.d */
final /* synthetic */ class C44163d implements AnimatorUpdateListener {

    /* renamed from: a */
    private final C44148a f114221a;

    /* renamed from: b */
    private final boolean f114222b;

    /* renamed from: c */
    private final int f114223c;

    /* renamed from: d */
    private final int f114224d;

    /* renamed from: e */
    private final float f114225e;

    /* renamed from: f */
    private final int f114226f;

    /* renamed from: g */
    private final int f114227g;

    /* renamed from: h */
    private final int f114228h;

    /* renamed from: i */
    private final int f114229i;

    /* renamed from: j */
    private final int f114230j;

    C44163d(C44148a aVar, boolean z, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        this.f114221a = aVar;
        this.f114222b = z;
        this.f114223c = i;
        this.f114224d = i2;
        this.f114225e = f;
        this.f114226f = i3;
        this.f114227g = i4;
        this.f114228h = i5;
        this.f114229i = i6;
        this.f114230j = i7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f114221a.mo106642a(this.f114222b, this.f114223c, this.f114224d, this.f114225e, this.f114226f, this.f114227g, this.f114228h, this.f114229i, this.f114230j, valueAnimator);
    }
}
