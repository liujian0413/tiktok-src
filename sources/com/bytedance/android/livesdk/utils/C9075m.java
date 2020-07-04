package com.bytedance.android.livesdk.utils;

/* renamed from: com.bytedance.android.livesdk.utils.m */
public final class C9075m {

    /* renamed from: a */
    private static int f24731a = -1;

    /* renamed from: b */
    private static long f24732b = 0;

    /* renamed from: c */
    private static long f24733c = 500;

    /* renamed from: a */
    private static void m27091a(int i) {
        if (f24731a != i) {
            f24731a = i;
            f24732b = 0;
        }
    }

    /* renamed from: a */
    private static boolean m27093a(long j) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f24732b < j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f24732b = currentTimeMillis;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m27092a(int i, long j) {
        m27091a(i);
        return m27093a(1000);
    }
}
