package com.facebook.react.animation;

public class ImmediateAnimation extends Animation {
    public void run() {
        onUpdate(1.0f);
        finish();
    }

    public ImmediateAnimation(int i, AnimationPropertyUpdater animationPropertyUpdater) {
        super(i, animationPropertyUpdater);
    }
}
