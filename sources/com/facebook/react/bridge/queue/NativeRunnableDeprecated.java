package com.facebook.react.bridge.queue;

import com.facebook.jni.Countable;

public class NativeRunnableDeprecated extends Countable implements Runnable {
    private NativeRunnableDeprecated() {
    }

    public native void run();
}
