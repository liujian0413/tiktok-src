package com.facebook.react.bridge;

public interface NotThreadSafeBridgeIdleDebugListener {
    void onTransitionToBridgeBusy();

    void onTransitionToBridgeIdle();
}
