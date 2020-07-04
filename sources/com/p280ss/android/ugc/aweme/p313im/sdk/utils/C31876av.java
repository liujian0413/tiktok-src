package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.av */
public final class C31876av {

    /* renamed from: a */
    private static long f83341a;

    /* renamed from: b */
    private static long f83342b;

    /* renamed from: c */
    private static Map<String, Long> f83343c = new HashMap(10);

    /* renamed from: b */
    public static void m103570b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        f83342b = currentTimeMillis;
        f83341a = currentTimeMillis;
    }

    /* renamed from: c */
    public static Long m103571c(String str) {
        return (Long) f83343c.get(str);
    }

    /* renamed from: a */
    public static void m103569a(String str) {
        f83341a = System.currentTimeMillis();
        f83343c.put(str, Long.valueOf(f83341a));
    }
}
