package com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.e */
public class C30737e {

    /* renamed from: a */
    private static Handler f80483a;

    /* renamed from: a */
    public static void m100132a(Runnable runnable) {
        synchronized (C30737e.class) {
            if (f80483a == null) {
                f80483a = new Handler(Looper.getMainLooper());
            }
        }
        f80483a.post(runnable);
    }

    /* renamed from: a */
    public static void m100133a(Runnable runnable, long j) {
        synchronized (C30737e.class) {
            if (f80483a == null) {
                f80483a = new Handler(Looper.getMainLooper());
            }
        }
        f80483a.postDelayed(runnable, j);
    }
}
