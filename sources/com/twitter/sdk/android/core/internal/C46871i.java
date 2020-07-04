package com.twitter.sdk.android.core.internal;

import com.C1642a;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.twitter.sdk.android.core.internal.i */
public final class C46871i {

    /* renamed from: a */
    private static final int f120179a;

    /* renamed from: b */
    private static final int f120180b;

    /* renamed from: c */
    private static final int f120181c = ((f120179a * 2) + 1);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f120179a = availableProcessors;
        f120180b = availableProcessors + 1;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m146617b(String str) {
        ScheduledExecutorService a = C46874l.m146619a(m146618c(str));
        m146614a(str, a);
        return a;
    }

    /* renamed from: c */
    private static ThreadFactory m146618c(String str) {
        return new C46872j(str, new AtomicLong(1));
    }

    /* renamed from: a */
    public static ExecutorService m146613a(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f120180b, f120181c, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), m146618c(str));
        m146614a(str, threadPoolExecutor);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    private static void m146614a(String str, ExecutorService executorService) {
        m146615a(str, executorService, 1, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m146612a(String str, AtomicLong atomicLong, Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(atomicLong.getAndIncrement());
        newThread.setName(sb.toString());
        return newThread;
    }

    /* renamed from: a */
    private static void m146615a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C46873k kVar = new C46873k(executorService, 1, timeUnit, str);
        StringBuilder sb = new StringBuilder("Twitter Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(kVar, sb.toString()));
    }

    /* renamed from: a */
    static final /* synthetic */ void m146616a(ExecutorService executorService, long j, TimeUnit timeUnit, String str) {
        try {
            executorService.shutdown();
            if (!executorService.awaitTermination(j, timeUnit)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" did not shutdown in the allocated time. Requesting immediate shutdown.");
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C1642a.m8035a(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str});
            executorService.shutdownNow();
        }
    }
}
