package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.utils.ar */
public final class C42937ar {

    /* renamed from: com.ss.android.ugc.aweme.utils.ar$a */
    public static class C42938a {

        /* renamed from: a */
        public long f111468a;

        /* renamed from: b */
        public long f111469b;
    }

    /* renamed from: a */
    private static long m136293a(long j, long j2) {
        return j + j2;
    }

    /* renamed from: a */
    private static C42938a m136294a() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, -1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, -1);
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        C42938a aVar = new C42938a();
        aVar.f111468a = time;
        aVar.f111469b = time2;
        return aVar;
    }

    /* renamed from: b */
    private static C42938a m136296b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        C42938a aVar = new C42938a();
        aVar.f111468a = time;
        aVar.f111469b = time2;
        return aVar;
    }

    /* renamed from: f */
    private static long m136301f(long j) {
        return m136300e(j);
    }

    /* renamed from: d */
    public static int m136299d(long j) {
        return C23486n.m77128c(m136301f(j));
    }

    /* renamed from: e */
    private static long m136300e(long j) {
        return m136293a(j, (long) TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: a */
    public static boolean m136295a(long j) {
        C42938a b = m136296b();
        if (j <= b.f111468a || j >= b.f111469b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m136297b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis > 86400000 || currentTimeMillis < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m136298c(long j) {
        C42938a a = m136294a();
        if (j <= a.f111468a || j >= a.f111469b) {
            return false;
        }
        return true;
    }
}
