package com.p280ss.android.ugc.aweme.freeflowcard;

import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.a */
public final class C29968a {
    /* renamed from: a */
    public static int m98262a() {
        return Calendar.getInstance().getMaximum(5);
    }

    /* renamed from: b */
    public static long[] m98265b() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(2, -1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    /* renamed from: c */
    public static long[] m98266c() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.add(2, 1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    /* renamed from: a */
    public static long[] m98263a(int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, 25);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.add(2, 1);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }

    /* renamed from: a */
    public static long[] m98264a(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(5, i);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.setTime(new Date());
        instance.set(5, i2);
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.add(13, -1);
        return new long[]{instance.getTimeInMillis(), instance.getTimeInMillis()};
    }
}
