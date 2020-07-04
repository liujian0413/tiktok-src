package com.facebook.jni;

public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
