package com.bytedance.ies.dmt.p262ui.widget.tablayout;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.TabLayoutOnPageChangeListenerIndependent;

/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.b */
final /* synthetic */ class C10829b implements AnimatorUpdateListener {

    /* renamed from: a */
    private final TabLayoutOnPageChangeListenerIndependent f29307a;

    /* renamed from: b */
    private final int f29308b;

    /* renamed from: c */
    private final int f29309c;

    /* renamed from: d */
    private final DmtTabLayout f29310d;

    /* renamed from: e */
    private final boolean f29311e;

    /* renamed from: f */
    private final boolean f29312f;

    C10829b(TabLayoutOnPageChangeListenerIndependent tabLayoutOnPageChangeListenerIndependent, int i, int i2, DmtTabLayout dmtTabLayout, boolean z, boolean z2) {
        this.f29307a = tabLayoutOnPageChangeListenerIndependent;
        this.f29308b = i;
        this.f29309c = i2;
        this.f29310d = dmtTabLayout;
        this.f29311e = z;
        this.f29312f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29307a.mo26110a(this.f29308b, this.f29309c, this.f29310d, this.f29311e, this.f29312f, valueAnimator);
    }
}
