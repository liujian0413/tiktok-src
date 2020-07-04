package com.facebook.react.animation;

import android.view.View;

public class NoopAnimationPropertyUpdater implements AnimationPropertyUpdater {
    public void onFinish(View view) {
    }

    public void onUpdate(View view, float f) {
    }

    public void prepare(View view) {
    }
}
