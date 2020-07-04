package com.bytedance.jirafast.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.jirafast.utils.m */
public final class C12085m {

    /* renamed from: a */
    public static ExecutorService f32167a;

    /* renamed from: b */
    private static Handler f32168b;

    /* renamed from: a */
    private static void m35244a() {
        if (f32167a == null || f32167a.isTerminated()) {
            f32167a = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
            f32168b = new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public static void m35245a(Runnable runnable) {
        m35244a();
        try {
            f32167a.execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m35246b(Runnable runnable) {
        m35244a();
        if (f32168b != null) {
            f32168b.post(runnable);
        }
    }
}
