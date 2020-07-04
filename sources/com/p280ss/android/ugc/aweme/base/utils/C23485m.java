package com.p280ss.android.ugc.aweme.base.utils;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.SoftReference;

/* renamed from: com.ss.android.ugc.aweme.base.utils.m */
public final class C23485m {

    /* renamed from: a */
    private static SoftReference<Handler> f61963a;

    /* renamed from: a */
    private static Handler m77115a() {
        if (f61963a != null) {
            Handler handler = (Handler) f61963a.get();
            if (handler != null) {
                return handler;
            }
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f61963a = new SoftReference<>(handler2);
        return handler2;
    }

    /* renamed from: b */
    public static void m77118b(Runnable runnable) {
        m77116a(runnable);
    }

    /* renamed from: c */
    public static void m77120c(Runnable runnable) {
        m77121d(runnable);
    }

    /* renamed from: a */
    public static void m77116a(Runnable runnable) {
        m77115a().post(runnable);
    }

    /* renamed from: d */
    private static void m77121d(Runnable runnable) {
        m77115a().removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m77117a(Runnable runnable, long j) {
        m77119b(runnable, j);
    }

    /* renamed from: b */
    private static void m77119b(Runnable runnable, long j) {
        m77115a().postDelayed(runnable, j);
    }
}
