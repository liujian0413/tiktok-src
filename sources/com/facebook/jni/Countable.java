package com.facebook.jni;

public class Countable {
    private long mInstance;

    public native void dispose();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
