package com.lynx.base;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread.State;

public class JavaHandlerThread extends HandlerThread {
    public native void nativeInitializeThread(long j, long j2);

    public native void nativeStopThread(long j, long j2);

    private boolean hasStarted() {
        if (getState() != State.NEW) {
            return true;
        }
        return false;
    }

    public void maybeStart() {
        if (!hasStarted()) {
            super.start();
        }
    }

    public JavaHandlerThread(String str) {
        super(str);
    }

    public static JavaHandlerThread create(String str) {
        return new JavaHandlerThread(str);
    }

    private void start(long j, long j2) {
        maybeStart();
        Handler handler = new Handler(getLooper());
        final long j3 = j;
        final long j4 = j2;
        C186061 r2 = new Runnable() {
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
        Handler handler = new Handler(getLooper());
        final long j3 = j;
        final long j4 = j2;
        final boolean z2 = z;
        C186072 r1 = new Runnable() {
            public void run() {
                JavaHandlerThread.this.nativeStopThread(j3, j4);
                if (!z2) {
                    JavaHandlerThread.this.quit();
                }
            }
        };
        handler.post(r1);
        if (z) {
            quitSafely();
        }
    }
}
