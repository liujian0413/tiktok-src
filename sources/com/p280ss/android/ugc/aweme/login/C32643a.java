package com.p280ss.android.ugc.aweme.login;

import com.facebook.C13499h;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.login.a */
public final class C32643a {

    /* renamed from: a */
    private static final int f85094a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f85095b;

    /* renamed from: c */
    private static final int f85096c;

    /* renamed from: d */
    private static final ThreadFactory f85097d = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f85101a = new AtomicInteger(1);

        /* renamed from: b */
        private UncaughtExceptionHandler f85102b = C32649b.f85104a;

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("Facebook-SDK #");
            sb.append(this.f85101a.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setUncaughtExceptionHandler(this.f85102b);
            return thread;
        }
    };

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f85098e = new LinkedBlockingQueue(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);

    /* renamed from: f */
    private static final Executor f85099f;

    /* renamed from: g */
    private static AtomicBoolean f85100g = new AtomicBoolean();

    /* renamed from: a */
    public static void m105728a() {
        if (f85100g.compareAndSet(false, true)) {
            C13499h.m39708a(f85099f);
        }
    }

    static {
        int max = Math.max(2, Math.min(f85094a - 1, 4));
        f85095b = max;
        f85096c = (max * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f85095b, f85096c, 10, TimeUnit.SECONDS, f85098e, f85097d);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f85099f = threadPoolExecutor;
    }
}
