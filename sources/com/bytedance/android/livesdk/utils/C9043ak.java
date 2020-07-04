package com.bytedance.android.livesdk.utils;

import android.os.SystemClock;

/* renamed from: com.bytedance.android.livesdk.utils.ak */
public final class C9043ak {

    /* renamed from: a */
    private static long f24711a;

    /* renamed from: a */
    public static boolean m27009a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - f24711a;
        f24711a = uptimeMillis;
        if (j > 500) {
            return true;
        }
        return false;
    }
}
