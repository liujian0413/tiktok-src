package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;

public abstract class GuardedFrameCallback extends FrameCallback {
    private final ReactContext mReactContext;

    /* access modifiers changed from: protected */
    public abstract void doFrameGuarded(long j);

    protected GuardedFrameCallback(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public final void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (RuntimeException e) {
            this.mReactContext.handleException(e);
        }
    }
}
