package com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.support.p022v4.view.animation.FastOutLinearInInterpolator;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.a */
final class C41014a {

    /* renamed from: a */
    static final Interpolator f106715a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f106716b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    static final Interpolator f106717c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    static final Interpolator f106718d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    static final Interpolator f106719e = new DecelerateInterpolator();

    /* renamed from: a */
    static int m131066a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
