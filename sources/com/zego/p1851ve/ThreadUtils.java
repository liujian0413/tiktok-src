package com.zego.p1851ve;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zego.ve.ThreadUtils */
public class ThreadUtils {

    /* renamed from: com.zego.ve.ThreadUtils$BlockingOperation */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    /* renamed from: com.zego.ve.ThreadUtils$ThreadChecker */
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

    public static <V> V invokeUninterruptibly(Handler handler, final Callable<V> callable) {
        final AnonymousClass1Result r0 = new Object() {
            public V value;
        };
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() {
            public final void run() {
                try {
                    r0.value = callable.call();
                    countDownLatch.countDown();
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Callable threw exception: ");
                    sb.append(e);
                    RuntimeException runtimeException = new RuntimeException(sb.toString());
                    runtimeException.setStackTrace(e.getStackTrace());
                    throw runtimeException;
                }
            }
        });
        awaitUninterruptibly(countDownLatch);
        return r0.value;
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

    public static void invokeUninterruptibly(Handler handler, final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() {
            public final void run() {
                runnable.run();
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
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
}
