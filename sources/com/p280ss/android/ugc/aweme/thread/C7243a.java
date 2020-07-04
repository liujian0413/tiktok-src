package com.p280ss.android.ugc.aweme.thread;

import android.os.Build.VERSION;
import android.os.Looper;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.thread.a */
class C7243a extends ThreadPoolExecutor {

    /* renamed from: b */
    private static volatile Field f20253b;

    /* renamed from: a */
    public ThreadPoolType f20254a;

    /* renamed from: a */
    private boolean m22694a() {
        return C7258h.m22723a().f20308b.contains(this.f20254a);
    }

    public void shutdown() {
        if (!C7258h.m22728a((ExecutorService) this)) {
            super.shutdown();
        }
    }

    public List<Runnable> shutdownNow() {
        if (C7258h.m22728a((ExecutorService) this)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    /* renamed from: b */
    private static void m22695b() {
        try {
            if (f20253b == null) {
                synchronized (C7243a.class) {
                    if (f20253b == null) {
                        if (VERSION.SDK_INT >= 24) {
                            f20253b = Thread.class.getDeclaredField("threadLocals");
                        } else {
                            f20253b = Thread.class.getDeclaredField("localValues");
                        }
                        f20253b.setAccessible(true);
                    }
                }
            }
            f20253b.set(Thread.currentThread(), null);
        } catch (Exception unused) {
        }
    }

    public void execute(Runnable runnable) {
        if (m22694a()) {
            super.execute(new C7244b(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                m22695b();
            }
        } catch (Exception unused) {
        }
    }

    C7243a(ThreadPoolType threadPoolType, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30, timeUnit, blockingQueue, threadFactory);
        this.f20254a = threadPoolType;
    }

    C7243a(ThreadPoolType threadPoolType, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f20254a = threadPoolType;
    }
}
