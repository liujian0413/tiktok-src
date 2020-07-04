package com.bytedance.p263im.core.internal.p589b;

import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.p584a.C11198c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.im.core.internal.b.a */
public final class C11314a {

    /* renamed from: a */
    private static ExecutorService f30643a;

    /* renamed from: b */
    private static ExecutorService f30644b;

    /* renamed from: c */
    private static ExecutorService f30645c;

    /* renamed from: d */
    private static ExecutorService f30646d;

    /* renamed from: e */
    private static ThreadFactory f30647e = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            return thread;
        }
    };

    /* renamed from: c */
    public static Executor m33183c() {
        return m33182b();
    }

    /* renamed from: b */
    public static Executor m33182b() {
        if (f30643a == null) {
            f30643a = C11316b.m33187a(f30647e);
        }
        return f30643a;
    }

    /* renamed from: e */
    public static Executor m33185e() {
        if (f30646d == null) {
            f30646d = C11316b.m33187a(f30647e);
        }
        return f30646d;
    }

    /* renamed from: a */
    public static Executor m33181a() {
        if (f30645c == null) {
            ExecutorService executorService = C11198c.m32777a().mo27248b().f30397G;
            if (executorService != null) {
                f30645c = executorService;
            } else {
                f30645c = C11316b.m33186a(Runtime.getRuntime().availableProcessors(), f30647e);
            }
        }
        return f30645c;
    }

    /* renamed from: d */
    public static void m33184d() {
        C11432j.m33706a();
        if (f30643a != null) {
            f30643a.shutdown();
            f30643a = null;
        }
        if (f30644b != null) {
            f30644b.shutdown();
            f30644b = null;
        }
        if (f30646d != null) {
            f30646d.shutdown();
            f30646d = null;
        }
    }
}
