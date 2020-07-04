package com.p280ss.android.ttve.utils;

import android.animation.TimeInterpolator;

/* renamed from: com.ss.android.ttve.utils.a */
public final class C20503a implements TimeInterpolator {
    public final float getInterpolation(float f) {
        double d = (double) f;
        if (d < 0.36363636363636365d) {
            return 7.5625f * f * f;
        }
        if (d < 0.7272727272727273d) {
            float f2 = f - 0.54545456f;
            return (7.5625f * f2 * f2) + 0.75f;
        } else if (d < 0.9090909090909091d) {
            float f3 = f - 0.8181818f;
            return (7.5625f * f3 * f3) + 0.9375f;
        } else {
            float f4 = f - 0.95454544f;
            return (7.5625f * f4 * f4) + 0.984375f;
        }
    }
}
