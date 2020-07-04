package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;

public abstract class JavaScriptExecutor {
    private SplitCommonType mCommmonSplit = SplitCommonType.NONE;
    private final HybridData mHybridData;

    public SplitCommonType getCommonSplit() {
        return this.mCommmonSplit;
    }

    public void close() {
        this.mHybridData.resetNative();
    }

    protected JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    protected JavaScriptExecutor(HybridData hybridData, SplitCommonType splitCommonType) {
        this.mHybridData = hybridData;
        this.mCommmonSplit = splitCommonType;
    }
}
