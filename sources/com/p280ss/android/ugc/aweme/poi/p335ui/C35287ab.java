package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.ab */
final /* synthetic */ class C35287ab implements AnimatorUpdateListener {

    /* renamed from: a */
    private final PoiRouteFragment f92499a;

    /* renamed from: b */
    private final float f92500b;

    C35287ab(PoiRouteFragment poiRouteFragment, float f) {
        this.f92499a = poiRouteFragment;
        this.f92500b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f92499a.mo89779a(this.f92500b, valueAnimator);
    }
}
