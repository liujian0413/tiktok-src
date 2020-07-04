package com.facebook.react.animation;

import android.view.View;

public class OpacityAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public OpacityAnimationPropertyUpdater(float f) {
        super(f);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getAlpha();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f) {
        view.setAlpha(f);
    }

    public OpacityAnimationPropertyUpdater(float f, float f2) {
        super(f, f2);
    }
}
