package com.p280ss.avframework.engine;

import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.NativeObject */
public class NativeObject {
    protected long mNativeObj;

    private long getNativeObj() {
        return this.mNativeObj;
    }

    private native void nativeRelease(long j);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mNativeObj != 0) {
            release();
        }
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void setNativeObj(long j) {
        this.mNativeObj = j;
    }
}
