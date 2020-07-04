package com.p280ss.android.ugc.aweme.common.widget.tablayout;

import android.support.p022v4.view.animation.FastOutLinearInInterpolator;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.a */
final class C25780a {

    /* renamed from: a */
    static final Interpolator f68175a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f68176b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    static final Interpolator f68177c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    static final Interpolator f68178d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    static final Interpolator f68179e = new DecelerateInterpolator();

    /* renamed from: a */
    static int m84738a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
