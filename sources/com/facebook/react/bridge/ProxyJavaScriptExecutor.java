package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.RNJavaScriptRuntime.SplitCommonType;

public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    private JavaJSExecutor mJavaJSExecutor;

    public static class Factory implements JavaScriptExecutorFactory {
        private final com.facebook.react.bridge.JavaJSExecutor.Factory mJavaJSExecutorFactory;

        public JavaScriptExecutor create() throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }

        public Factory(com.facebook.react.bridge.JavaJSExecutor.Factory factory) {
            this.mJavaJSExecutorFactory = factory;
        }

        public JavaScriptExecutor create(SplitCommonType splitCommonType) throws Exception {
            return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
        }
    }

    private static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    public void close() {
        if (this.mJavaJSExecutor != null) {
            this.mJavaJSExecutor.close();
            this.mJavaJSExecutor = null;
        }
    }

    public ProxyJavaScriptExecutor(JavaJSExecutor javaJSExecutor) {
        super(initHybrid(javaJSExecutor));
        this.mJavaJSExecutor = javaJSExecutor;
    }
}
