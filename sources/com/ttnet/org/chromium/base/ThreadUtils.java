package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object sLock = new Object();
    private static boolean sThreadAssertsDisabled;
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnBackgroundThread() {
        if (!sThreadAssertsDisabled) {
        }
    }

    public static void assertOnUiThread() {
        if (!sThreadAssertsDisabled) {
        }
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    public static void checkUiThread() {
        if (!sThreadAssertsDisabled && !runningOnUiThread()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static boolean runningOnUiThread() {
        if (getUiThreadHandler().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static Handler getUiThreadHandler() {
        Handler handler;
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                if (!sWillOverride) {
                    sUiThreadHandler = new Handler(Looper.getMainLooper());
                } else {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
            }
            handler = sUiThreadHandler;
        }
        return handler;
    }

    public static void setThreadAssertsDisabledForTesting(boolean z) {
        sThreadAssertsDisabled = z;
    }

    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    private static boolean isThreadPriorityAudio(int i) {
        if (Process.getThreadPriority(i) == -16) {
            return true;
        }
        return false;
    }

    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
        return runOnUiThread(new FutureTask<>(callable));
    }

    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
        try {
            return runOnUiThreadBlocking(callable);
        } catch (ExecutionException e) {
            throw new RuntimeException("Error occurred waiting for callable", e);
        }
    }

    public static void setWillOverrideUiThread(boolean z) {
        synchronized (sLock) {
            sWillOverride = z;
        }
    }

    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
        } else {
            postOnUiThread(futureTask);
        }
        return futureTask;
    }

    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws ExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException("Interrupted waiting for callable", e);
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    public static void runOnUiThreadBlocking(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while waiting for runnable", e);
        }
    }

    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            if (looper == null) {
                try {
                    sUiThreadHandler = null;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (sUiThreadHandler != null) {
                    if (sUiThreadHandler.getLooper() != looper) {
                        StringBuilder sb = new StringBuilder("UI thread looper is already set to ");
                        sb.append(sUiThreadHandler.getLooper());
                        sb.append(" (Main thread looper is ");
                        sb.append(Looper.getMainLooper());
                        sb.append("), cannot set to new looper ");
                        sb.append(looper);
                        throw new RuntimeException(sb.toString());
                    }
                }
                sUiThreadHandler = new Handler(looper);
            }
        }
    }

    public static void postOnUiThreadDelayed(Runnable runnable, long j) {
        getUiThreadHandler().postDelayed(runnable, j);
    }
}
