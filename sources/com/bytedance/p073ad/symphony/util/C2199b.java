package com.bytedance.p073ad.symphony.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.common.utility.p254b.C9713b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.ad.symphony.util.b */
public class C2199b {

    /* renamed from: a */
    private static final HandlerThread f7438a;

    /* renamed from: b */
    private static Handler f7439b = new Handler(f7438a.getLooper());

    /* renamed from: c */
    private static final Handler f7440c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static ExecutorService f7441d;

    /* renamed from: a */
    public static Handler m9503a() {
        return f7440c;
    }

    /* renamed from: b */
    public static Looper m9506b() {
        return f7438a.getLooper();
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ad-symphony-single-thread");
        f7438a = handlerThread;
        handlerThread.start();
    }

    /* renamed from: c */
    private static ExecutorService m9507c() {
        if (f7441d == null) {
            synchronized (C2199b.class) {
                if (f7441d == null) {
                    f7441d = C2200c.m9508a(2, new C9713b("ad-symphony-thread-pool"));
                }
            }
        }
        return f7441d;
    }

    /* renamed from: a */
    public static void m9504a(Runnable runnable) {
        m9507c().execute(runnable);
    }

    /* renamed from: a */
    public static synchronized void m9505a(ExecutorService executorService) {
        synchronized (C2199b.class) {
            if (f7441d != null) {
                new StringBuilder("executor service not none:").append(f7441d);
            } else {
                f7441d = executorService;
            }
        }
    }
}
