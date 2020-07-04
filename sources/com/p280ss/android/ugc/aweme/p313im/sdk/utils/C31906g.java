package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.g */
public final class C31906g {

    /* renamed from: a */
    private static long f83385a;

    /* renamed from: a */
    public static synchronized long m103644a() {
        long currentTimeMillis;
        synchronized (C31906g.class) {
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= f83385a) {
                currentTimeMillis = f83385a + 1;
            }
            f83385a = currentTimeMillis;
        }
        return currentTimeMillis;
    }
}
