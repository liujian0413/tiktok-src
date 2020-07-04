package com.p280ss.android.ugc.aweme.feed.guide;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p029v7.widget.RecyclerView.C1293v;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.o */
final /* synthetic */ class C28408o implements AnimatorUpdateListener {

    /* renamed from: a */
    private final SwitchItemAnimator f74856a;

    /* renamed from: b */
    private final C1293v f74857b;

    /* renamed from: c */
    private final float f74858c;

    C28408o(SwitchItemAnimator switchItemAnimator, C1293v vVar, float f) {
        this.f74856a = switchItemAnimator;
        this.f74857b = vVar;
        this.f74858c = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f74856a.mo72091a(this.f74857b, this.f74858c, valueAnimator);
    }
}
