package com.p280ss.android.ugc.aweme.feed;

import android.os.SystemClock;

/* renamed from: com.ss.android.ugc.aweme.feed.a */
public final class C6914a {

    /* renamed from: a */
    public static long f19586a = 0;

    /* renamed from: b */
    public static long f19587b = 0;

    /* renamed from: c */
    private static long f19588c = -1;

    /* renamed from: a */
    public static long m21539a() {
        long j = f19588c;
        f19588c = 0;
        return j;
    }

    /* renamed from: b */
    public static void m21540b() {
        f19586a = SystemClock.elapsedRealtime();
        m21541c();
        f19587b = System.currentTimeMillis();
    }

    /* renamed from: c */
    private static void m21541c() {
        if (f19588c < 0) {
            f19588c = SystemClock.elapsedRealtime();
        }
    }
}
