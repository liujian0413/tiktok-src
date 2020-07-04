package com.facebook.react.animation;

import android.view.View;

public class ScaleXYAnimationPairPropertyUpdater extends AbstractFloatPairPropertyUpdater {
    public ScaleXYAnimationPairPropertyUpdater(float f, float f2) {
        super(f, f2);
    }

    /* access modifiers changed from: protected */
    public void getProperty(View view, float[] fArr) {
        fArr[0] = view.getScaleX();
        fArr[1] = view.getScaleY();
    }

    /* access modifiers changed from: protected */
    public void setProperty(View view, float[] fArr) {
        view.setScaleX(fArr[0]);
        view.setScaleY(fArr[1]);
    }

    public ScaleXYAnimationPairPropertyUpdater(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }
}
