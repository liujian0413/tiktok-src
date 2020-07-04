package com.ttnet.org.chromium.base;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;

@JNINamespace("base::android")
public class JavaHandlerThread {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final HandlerThread mThread;
    public Throwable mUnhandledException;

    private Throwable getUncaughtExceptionIfAny() {
        return this.mUnhandledException;
    }

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeOnLooperStopped(long j);

    private boolean isAlive() {
        return this.mThread.isAlive();
    }

    public Looper getLooper() {
        return this.mThread.getLooper();
    }

    private boolean hasStarted() {
        if (this.mThread.getState() != State.NEW) {
            return true;
        }
        return false;
    }

    private void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.mThread.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.mThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.mUnhandledException = th;
            }
        });
    }

    public void maybeStart() {
        if (!hasStarted()) {
            this.mThread.start();
        }
    }

    private void quitThreadSafely(final long j) {
        new Handler(this.mThread.getLooper()).post(new Runnable() {
            public void run() {
                JavaHandlerThread.this.mThread.quit();
                JavaHandlerThread.this.nativeOnLooperStopped(j);
            }
        });
        if (VERSION.SDK_INT >= 18) {
            this.mThread.getLooper().quitSafely();
        }
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    public JavaHandlerThread(String str, int i) {
        this.mThread = new HandlerThread(str, i);
    }

    private void startAndInitialize(long j, long j2) {
        maybeStart();
        Handler handler = new Handler(this.mThread.getLooper());
        final long j3 = j;
        final long j4 = j2;
        C465971 r2 = new Runnable() {
            public void run() {
                JavaHandlerThread.this.nativeInitializeThread(j3, j4);
            }
        };
        handler.post(r2);
    }
}
