package android.support.design.p015a;

import android.animation.TimeInterpolator;
import android.support.p022v4.view.animation.FastOutLinearInInterpolator;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.a.a */
public final class C0234a {

    /* renamed from: a */
    public static final TimeInterpolator f872a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f873b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    public static final TimeInterpolator f874c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    public static final TimeInterpolator f875d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public static final TimeInterpolator f876e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m830a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m831a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
