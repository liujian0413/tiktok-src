package com.bytedance.ttnet.retrofit;

import com.bytedance.common.utility.C6319n;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.bytedance.ttnet.retrofit.a */
public final class C12990a {
    /* renamed from: a */
    public static int m37889a(int i) {
        return new Random((long) UUID.randomUUID().hashCode()).nextInt(i);
    }

    /* renamed from: a */
    public static boolean m37891a(String str, Set<String> set) {
        if (!C6319n.m19593a(str) && set != null && set.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m37890a(String str, String str2) {
        if (C6319n.m19593a(str) || C6319n.m19593a(str2)) {
            return false;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date parse = simpleDateFormat.parse(str);
            Date parse2 = simpleDateFormat.parse(str2);
            long currentTimeMillis = System.currentTimeMillis();
            Date date = new Date(currentTimeMillis);
            parse2.setDate(date.getDate());
            parse2.setMonth(date.getMonth());
            parse2.setYear(date.getYear());
            parse.setDate(date.getDate());
            parse.setMonth(date.getMonth());
            parse.setYear(date.getYear());
            if (!parse.before(parse2)) {
                Date parse3 = simpleDateFormat.parse("00:00:00");
                Date parse4 = simpleDateFormat.parse("00:00:00");
                parse4.setDate(date.getDate());
                parse4.setMonth(date.getMonth());
                parse4.setYear(date.getYear());
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                instance.add(5, 1);
                Date time = instance.getTime();
                parse3.setDate(time.getDate());
                parse3.setMonth(time.getMonth());
                parse3.setYear(time.getYear());
                if ((currentTimeMillis < parse4.getTime() || currentTimeMillis > parse2.getTime()) && (currentTimeMillis < parse.getTime() || currentTimeMillis >= parse3.getTime())) {
                    return false;
                }
                return true;
            } else if (currentTimeMillis < parse.getTime() || currentTimeMillis > parse2.getTime()) {
                return false;
            } else {
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
