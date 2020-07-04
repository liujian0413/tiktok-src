package com.p280ss.android.p281a.p282a.p283a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.a.a.a.a */
public final class C6726a {

    /* renamed from: a */
    public static ExecutorService f19199a;

    /* renamed from: b */
    private static Handler f19200b;

    /* renamed from: a */
    private static void m20841a() {
        if (f19199a == null || f19199a.isTerminated()) {
            f19199a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f19200b = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static void m20842a(Runnable runnable) {
        m20841a();
        try {
            f19199a.execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m20844b(Runnable runnable) {
        m20841a();
        if (f19200b != null) {
            f19200b.post(runnable);
        }
    }

    /* renamed from: c */
    public static void m20845c(Runnable runnable) {
        m20841a();
        f19200b.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m20843a(Runnable runnable, int i) {
        m20841a();
        f19200b.postDelayed(runnable, (long) i);
    }
}
