package com.facebook.react.bridge;

import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;

public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create() throws Exception;

    JavaScriptExecutor create(SplitCommonType splitCommonType) throws Exception;
}
