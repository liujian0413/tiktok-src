package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;

class JSCJavaScriptExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap, SplitCommonType splitCommonType) {
        super(initHybrid(readableNativeMap), splitCommonType);
    }
}
