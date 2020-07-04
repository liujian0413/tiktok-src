package com.bytedance.common.utility.p254b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.c */
public final class C9714c {

    /* renamed from: a */
    public static final int f26438a;

    /* renamed from: b */
    public static final int f26439b;

    /* renamed from: c */
    public static final int f26440c;

    /* renamed from: d */
    public static final int f26441d;

    /* renamed from: e */
    public static final int f26442e = Math.max(2, Math.min(f26439b - 1, 3));

    /* renamed from: f */
    public static final int f26443f = ((f26439b * 2) + 1);

    /* renamed from: g */
    private static ExecutorService f26444g;

    /* renamed from: h */
    private static ExecutorService f26445h;

    /* renamed from: i */
    private static ExecutorService f26446i;

    /* renamed from: j */
    private static ScheduledExecutorService f26447j = C9717d.m28653a(3, f26450m);

    /* renamed from: k */
    private static final C9716a f26448k = new C9716a("TTDefaultExecutors");

    /* renamed from: l */
    private static final C9716a f26449l = new C9716a("TTCpuExecutors");

    /* renamed from: m */
    private static final C9716a f26450m = new C9716a("TTScheduledExecutors");

    /* renamed from: n */
    private static final C9716a f26451n = new C9716a("TTDownLoadExecutors");

    /* renamed from: o */
    private static final BlockingQueue<Runnable> f26452o = new LinkedBlockingQueue();

    /* renamed from: p */
    private static final BlockingQueue<Runnable> f26453p = new LinkedBlockingQueue();

    /* renamed from: q */
    private static final BlockingQueue<Runnable> f26454q = new LinkedBlockingQueue();

    /* renamed from: r */
    private static final RejectedExecutionHandler f26455r = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    };

    /* renamed from: com.bytedance.common.utility.b.c$a */
    static class C9716a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f26456a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f26457b;

        /* renamed from: c */
        private final AtomicInteger f26458c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f26459d;

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f26457b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26459d);
            sb.append(this.f26458c.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }

        C9716a(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f26457b = threadGroup;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(f26456a.getAndIncrement());
            sb.append("-Thread-");
            this.f26459d = sb.toString();
        }
    }

    /* renamed from: a */
    public static ExecutorService m28650a() {
        return f26444g;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m28652b() {
        return f26447j;
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f26438a = availableProcessors;
        if (availableProcessors > 0) {
            i = f26438a;
        } else {
            i = 1;
        }
        f26439b = i;
        int max = Math.max(2, Math.min(f26439b - 1, 6)) * 2;
        f26440c = max;
        f26441d = (max * 2) + 1;
        C9718e eVar = new C9718e(f26440c, f26441d, 30, TimeUnit.SECONDS, f26452o, f26448k, f26455r);
        f26444g = eVar;
        eVar.allowCoreThreadTimeOut(true);
        C9718e eVar2 = new C9718e(f26442e, f26443f, 30, TimeUnit.SECONDS, f26453p, f26449l, f26455r);
        f26445h = eVar2;
        eVar2.allowCoreThreadTimeOut(true);
        C9718e eVar3 = new C9718e(2, 2, 30, TimeUnit.SECONDS, f26454q, f26451n, f26455r);
        f26446i = eVar3;
        eVar3.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static void m28651a(ExecutorService executorService) {
        f26444g = executorService;
    }
}
