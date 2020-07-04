package com.facebook.react.animation;

import android.view.View;

public abstract class AbstractFloatPairPropertyUpdater implements AnimationPropertyUpdater {
    private boolean mFromSource;
    private final float[] mFromValues;
    private final float[] mToValues;
    private final float[] mUpdateValues;

    /* access modifiers changed from: protected */
    public abstract void getProperty(View view, float[] fArr);

    /* access modifiers changed from: protected */
    public abstract void setProperty(View view, float[] fArr);

    public void onFinish(View view) {
        setProperty(view, this.mToValues);
    }

    public void prepare(View view) {
        if (this.mFromSource) {
            getProperty(view, this.mFromValues);
        }
    }

    protected AbstractFloatPairPropertyUpdater(float f, float f2) {
        this.mFromValues = new float[2];
        this.mToValues = new float[2];
        this.mUpdateValues = new float[2];
        this.mToValues[0] = f;
        this.mToValues[1] = f2;
        this.mFromSource = true;
    }

    public void onUpdate(View view, float f) {
        this.mUpdateValues[0] = this.mFromValues[0] + ((this.mToValues[0] - this.mFromValues[0]) * f);
        this.mUpdateValues[1] = this.mFromValues[1] + ((this.mToValues[1] - this.mFromValues[1]) * f);
        setProperty(view, this.mUpdateValues);
    }

    protected AbstractFloatPairPropertyUpdater(float f, float f2, float f3, float f4) {
        this(f3, f4);
        this.mFromValues[0] = f;
        this.mFromValues[1] = f2;
        this.mFromSource = false;
    }
}
