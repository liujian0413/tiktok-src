package com.p280ss.android.ugc.aweme.app.api;

/* renamed from: com.ss.android.ugc.aweme.app.api.k */
public final class C22839k {

    /* renamed from: a */
    private static long f60565a;

    /* renamed from: b */
    private static long f60566b;

    /* renamed from: a */
    public static int m75280a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f60565a > 0) {
            currentTimeMillis = (f60565a + currentTimeMillis) - f60566b;
        }
        return (int) (currentTimeMillis / 1000);
    }

    /* renamed from: a */
    public static void m75281a(long j) {
        f60565a = j;
        f60566b = System.currentTimeMillis();
    }
}
