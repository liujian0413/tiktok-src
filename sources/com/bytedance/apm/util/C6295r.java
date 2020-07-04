package com.bytedance.apm.util;

import java.util.Calendar;
import java.util.Date;

/* renamed from: com.bytedance.apm.util.r */
public final class C6295r {
    /* renamed from: a */
    public static long m19533a(int i) {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, -5);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        return instance.getTimeInMillis();
    }
}
