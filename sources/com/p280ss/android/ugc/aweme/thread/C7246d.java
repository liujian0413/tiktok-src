package com.p280ss.android.ugc.aweme.thread;

import android.os.Process;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.thread.C7268n.C7270a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.thread.d */
final class C7246d implements C7270a {

    /* renamed from: a */
    public static AtomicInteger f20259a = new AtomicInteger(0);

    /* renamed from: b */
    public static ExecutorService f20260b = m22707a(f20267i, ThreadPoolType.IO, "tp-reject");

    /* renamed from: c */
    public static ExecutorService f20261c = m22707a(f20266h, ThreadPoolType.DEFAULT, "tp-default-reject");

    /* renamed from: d */
    public static long f20262d;

    /* renamed from: e */
    public static long f20263e;

    /* renamed from: f */
    public static final long f20264f = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: g */
    private static final int f20265g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    private static final int f20266h = (f20265g + 1);

    /* renamed from: i */
    private static final int f20267i = (Math.max(2, Math.min(f20265g - 1, 6)) * 2);

    /* renamed from: j */
    private static final int f20268j;

    /* renamed from: k */
    private static final int f20269k;

    /* renamed from: l */
    private static RejectedExecutionHandler f20270l = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C7246d.f20260b.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C7246d.f20262d >= C7246d.f20264f) {
                C7246d.f20262d = elapsedRealtime;
                C7252g.m22716a().mo18979a(runnable, threadPoolExecutor);
                return;
            }
            C7246d.f20262d = elapsedRealtime;
        }
    };

    /* renamed from: m */
    private static RejectedExecutionHandler f20271m = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C7246d.f20261c.execute(runnable);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - C7246d.f20263e >= C7246d.f20264f || C7258h.m22723a().f20307a) {
                C7246d.f20263e = elapsedRealtime;
                C7252g.m22716a().mo18979a(runnable, threadPoolExecutor);
                return;
            }
            C7246d.f20263e = elapsedRealtime;
        }
    };

    C7246d() {
    }

    /* renamed from: a */
    private static ExecutorService m22706a() {
        C7243a aVar = new C7243a(ThreadPoolType.IO, 0, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 30, TimeUnit.SECONDS, new SynchronousQueue(), m22708a("tp-io", false, 0), f20270l);
        return aVar;
    }

    /* renamed from: b */
    private static ExecutorService m22710b() {
        C7243a aVar = new C7243a(ThreadPoolType.DEFAULT, f20268j, f20269k, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH), m22708a("tp-default", false, 0), f20271m);
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }

    /* renamed from: c */
    private static ExecutorService m22712c() {
        C7243a aVar = new C7243a(ThreadPoolType.BACKGROUND, 0, 3, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH), m22708a("tp-background", true, 10), f20271m);
        return aVar;
    }

    static {
        int max = Math.max(2, Math.min(f20265g - 1, 4));
        f20268j = max;
        f20269k = (max * 2) + 1;
    }

    /* renamed from: a */
    public static void m22709a(int i) {
        try {
            Process.setThreadPriority(i);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static ExecutorService m22711b(C7265m mVar) {
        String str;
        long j;
        if (mVar.f20321b != null) {
            str = mVar.f20321b;
        } else {
            str = "tp-scheduled";
        }
        ThreadFactory a = m22708a(str, false, 0);
        int i = mVar.f20322c;
        if (mVar.f20326g != null) {
            a = mVar.f20326g;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, a);
        if (mVar.f20325f >= 0) {
            j = mVar.f20325f;
        } else {
            j = 15;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: c */
    private static ExecutorService m22713c(C7265m mVar) {
        String str;
        long j;
        BlockingQueue linkedBlockingQueue;
        RejectedExecutionHandler abortPolicy;
        if (mVar.f20321b != null) {
            str = mVar.f20321b;
        } else {
            str = "tp-serial";
        }
        ThreadFactory a = m22708a(str, false, 0);
        ThreadPoolType threadPoolType = ThreadPoolType.SERIAL;
        if (mVar.f20325f >= 0) {
            j = mVar.f20325f;
        } else {
            j = 30;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (mVar.f20323d != null) {
            linkedBlockingQueue = mVar.f20323d;
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        BlockingQueue blockingQueue = linkedBlockingQueue;
        if (mVar.f20326g != null) {
            a = mVar.f20326g;
        }
        ThreadFactory threadFactory = a;
        if (mVar.f20324e != null) {
            abortPolicy = mVar.f20324e;
        } else {
            abortPolicy = new AbortPolicy();
        }
        C7243a aVar = new C7243a(threadPoolType, 1, 1, j, timeUnit, blockingQueue, threadFactory, abortPolicy);
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }

    /* renamed from: d */
    private static ExecutorService m22714d(C7265m mVar) {
        String str;
        long j;
        BlockingQueue linkedBlockingQueue;
        RejectedExecutionHandler abortPolicy;
        if (mVar.f20321b != null) {
            str = mVar.f20321b;
        } else {
            str = "tp-fixed";
        }
        ThreadFactory a = m22708a(str, false, 0);
        ThreadPoolType threadPoolType = ThreadPoolType.FIXED;
        int i = mVar.f20322c;
        int i2 = mVar.f20322c;
        if (mVar.f20325f >= 0) {
            j = mVar.f20325f;
        } else {
            j = 30;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (mVar.f20323d != null) {
            linkedBlockingQueue = mVar.f20323d;
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        BlockingQueue blockingQueue = linkedBlockingQueue;
        if (mVar.f20326g != null) {
            a = mVar.f20326g;
        }
        ThreadFactory threadFactory = a;
        if (mVar.f20324e != null) {
            abortPolicy = mVar.f20324e;
        } else {
            abortPolicy = new AbortPolicy();
        }
        C7243a aVar = new C7243a(threadPoolType, i, i2, j, timeUnit, blockingQueue, threadFactory, abortPolicy);
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }

    /* renamed from: a */
    public final ExecutorService mo18972a(C7265m mVar) {
        switch (mVar.f20320a) {
            case IO:
                return m22706a();
            case DEFAULT:
                return m22710b();
            case BACKGROUND:
                return m22712c();
            case SCHEDULED:
                return m22711b(mVar);
            case SERIAL:
                return m22713c(mVar);
            case FIXED:
                return m22714d(mVar);
            default:
                return m22706a();
        }
    }

    /* renamed from: a */
    private static ThreadFactory m22708a(final String str, final boolean z, final int i) {
        return new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                Thread thread = new Thread(new Runnable() {
                    public final void run() {
                        C7246d.m22709a(i);
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(C7246d.f20259a.incrementAndGet());
                thread.setName(sb.toString());
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    private static ExecutorService m22707a(int i, ThreadPoolType threadPoolType, String str) {
        C7243a aVar = new C7243a(threadPoolType, i, i, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), m22708a(str, false, 0));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }
}
