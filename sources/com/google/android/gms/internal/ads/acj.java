package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C6505uv
public final class acj {

    /* renamed from: a */
    public static final agn f39998a;

    /* renamed from: b */
    public static final agn f39999b;

    /* renamed from: c */
    public static final ScheduledExecutorService f40000c = new ScheduledThreadPoolExecutor(3, m45510a("Schedule"));

    /* renamed from: a */
    public static <T> agj<T> m45509a(Callable<T> callable) {
        return f39998a.mo39293a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m45510a(String str) {
        return new ack(str);
    }

    /* renamed from: a */
    public static agj<?> m45508a(Runnable runnable) {
        return f39998a.mo39292a(runnable);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m45510a("Default"));
        f39998a = ago.m45838a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m45510a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f39999b = ago.m45838a(threadPoolExecutor2);
    }
}
