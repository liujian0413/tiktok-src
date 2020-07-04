package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public abstract class NativeArray {
    private HybridData mHybridData;

    public native String toString();

    protected NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
