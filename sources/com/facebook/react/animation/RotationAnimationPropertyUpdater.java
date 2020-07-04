package com.facebook.react.animation;

import android.view.View;

public class RotationAnimationPropertyUpdater extends AbstractSingleFloatProperyUpdater {
    public RotationAnimationPropertyUpdater(float f) {
        super(f);
    }

    /* access modifiers changed from: protected */
    public float getProperty(View view) {
        return view.getRotation();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float f) {
        view.setRotation((float) Math.toDegrees((double) f));
    }
}
