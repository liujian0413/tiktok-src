package com.facebook.react.bridge;

public interface JSInstance {
    void invokeCallback(int i, NativeArray nativeArray);

    void invokeCallbackDirect(long j, NativeArray nativeArray);
}
