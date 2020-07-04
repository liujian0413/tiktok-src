package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;

class SimpleSpringInterpolator implements Interpolator {
    SimpleSpringInterpolator() {
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        double d = (double) (f - 0.125f);
        Double.isNaN(d);
        return (float) ((pow * Math.sin(((d * 3.141592653589793d) * 2.0d) / 0.5d)) + 1.0d);
    }
}
