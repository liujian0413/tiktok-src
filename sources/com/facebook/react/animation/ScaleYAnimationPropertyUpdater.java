package com.facebook.react.animation;

import android.view.View;

public class ScaleYAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public ScaleYAnimationPropertyUpdater(float f) {
        super(f);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getScaleY();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f) {
        view.setScaleY(f);
    }

    public ScaleYAnimationPropertyUpdater(float f, float f2) {
        super(f, f2);
    }
}
