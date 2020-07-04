package com.ttnet.org.chromium.base1;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
class JavaHandlerThread {
    final HandlerThread mThread;

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeStopThread(long j, long j2);

    private static JavaHandlerThread create(String str) {
        return new JavaHandlerThread(str);
    }

    private JavaHandlerThread(String str) {
        this.mThread = new HandlerThread(str);
    }

    private void start(long j, long j2) {
        this.mThread.start();
        Handler handler = new Handler(this.mThread.getLooper());
        final long j3 = j;
        final long j4 = j2;
        C466341 r2 = new Runnable() {
            public void run() {
                JavaHandlerThread.this.nativeInitializeThread(j3, j4);
            }
        };
        handler.post(r2);
    }

    private void stop(long j, long j2) {
        boolean z;
        if (VERSION.SDK_INT >= 18) {
            z = true;
        } else {
            z = false;
        }
        Handler handler = new Handler(this.mThread.getLooper());
        final long j3 = j;
        final long j4 = j2;
        final boolean z2 = z;
        C466352 r1 = new Runnable() {
            public void run() {
                JavaHandlerThread.this.nativeStopThread(j3, j4);
                if (!z2) {
                    JavaHandlerThread.this.mThread.quit();
                }
            }
        };
        handler.post(r1);
        if (z) {
            this.mThread.quitSafely();
        }
    }
}
