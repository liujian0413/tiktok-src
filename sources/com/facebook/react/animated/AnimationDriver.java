package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

abstract class AnimationDriver {
    ValueAnimatedNode mAnimatedValue;
    Callback mEndCallback;
    boolean mHasFinished;
    int mId;

    AnimationDriver() {
    }

    public abstract void runAnimationStep(long j);

    public void resetConfig(ReadableMap readableMap) {
        StringBuilder sb = new StringBuilder("Animation config for ");
        sb.append(getClass().getSimpleName());
        sb.append(" cannot be reset");
        throw new JSApplicationCausedNativeException(sb.toString());
    }
}
