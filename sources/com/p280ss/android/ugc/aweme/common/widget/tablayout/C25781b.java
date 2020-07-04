package com.p280ss.android.ugc.aweme.common.widget.tablayout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.p280ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.TabLayoutOnPageChangeListenerIndependent;

/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.b */
final /* synthetic */ class C25781b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TabLayoutOnPageChangeListenerIndependent f68180a;

    /* renamed from: b */
    private final int f68181b;

    /* renamed from: c */
    private final int f68182c;

    /* renamed from: d */
    private final CommonTabLayout f68183d;

    /* renamed from: e */
    private final boolean f68184e;

    /* renamed from: f */
    private final boolean f68185f;

    C25781b(TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, CommonTabLayout commonTabLayout, boolean z, boolean z2) {
        this.f68180a = tabLayoutOnPageChangeListenerIndependent;
        this.f68181b = i;
        this.f68182c = i2;
        this.f68183d = commonTabLayout;
        this.f68184e = z;
        this.f68185f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f68180a.mo66928a(this.f68181b, this.f68182c, this.f68183d, this.f68184e, this.f68185f, valueAnimator);
    }
}
