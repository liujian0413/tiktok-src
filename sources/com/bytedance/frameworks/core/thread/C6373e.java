package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority.Priority;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.frameworks.core.thread.e */
public final class C6373e {

    /* renamed from: a */
    private static final int f18667a;

    /* renamed from: b */
    private static final int f18668b;

    /* renamed from: c */
    private static final int f18669c;

    /* renamed from: d */
    private static final PriorityBlockingQueue<Runnable> f18670d = new PriorityBlockingQueue<>();

    /* renamed from: e */
    private static final PriorityBlockingQueue<Runnable> f18671e = new PriorityBlockingQueue<>();

    /* renamed from: c */
    public static ScheduledExecutorService m19808c() {
        return C6374f.m19809a(new C6372d(Priority.LOW, "tt-delay-thread-"));
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m19806a() {
        int i = f18668b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 1, TimeUnit.SECONDS, f18670d, new C6372d(Priority.NORMAL, "tt-api-thread-"));
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m19807b() {
        int i = f18669c;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 1, TimeUnit.SECONDS, f18671e, new C6372d(Priority.NORMAL, "tt-default-thread-"));
        return threadPoolExecutor;
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f18667a = availableProcessors;
        int i2 = 4;
        if ((availableProcessors / 2) + 1 < 4) {
            i = 4;
        } else {
            i = (f18667a / 2) + 1;
        }
        f18668b = i;
        if ((f18667a / 2) + 1 >= 4) {
            i2 = (f18667a / 2) + 1;
        }
        f18669c = i2;
    }
}
