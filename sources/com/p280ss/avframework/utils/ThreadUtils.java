package com.p280ss.avframework.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.avframework.utils.ThreadUtils */
public class ThreadUtils {

    /* renamed from: com.ss.avframework.utils.ThreadUtils$BlockingOperation */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    /* renamed from: com.ss.avframework.utils.ThreadUtils$ThreadChecker */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            public final void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            public final void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, (Callable<V>) new Callable<Void>() {
            public final Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                z2 = true;
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return z;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        boolean z = false;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (!thread.isAlive()) {
            return true;
        }
        return false;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final AnonymousClass1Result r0 = new Object() {
                public V value;
            };
            final AnonymousClass1CaughtException r1 = new Object() {

                /* renamed from: e */
                Exception f117100e;
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                public final void run() {
                    try {
                        r0.value = callable.call();
                    } catch (Exception e) {
                        r1.f117100e = e;
                    }
                    countDownLatch.countDown();
                }
            })) {
                Exception exc = new Exception("Handler is invalid");
                StringBuilder sb = new StringBuilder();
                sb.append(exc.getCause());
                sb.append(" ");
                sb.append(Log.getStackTraceString(exc));
                AVLog.ioe("ThreadUtils", sb.toString());
                countDownLatch.countDown();
            }
            awaitUninterruptibly(countDownLatch);
            if (r1.f117100e == null) {
                return r0.value;
            }
            RuntimeException runtimeException = new RuntimeException(r1.f117100e);
            runtimeException.setStackTrace(concatStackTraces(r1.f117100e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
