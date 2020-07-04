package com.p280ss.android.ugc.aweme.i18n;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.i18n.o */
public final class C30537o {
    /* renamed from: a */
    public static String m99738a(long j) {
        if (!C30538p.m99745a()) {
            return m99742c(j);
        }
        return m99744e(j);
    }

    /* renamed from: b */
    public static String m99741b(long j) {
        if (!C30538p.m99745a()) {
            return m99743d(j);
        }
        return m99744e(j);
    }

    /* renamed from: c */
    private static String m99742c(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= 100000000) {
            return m99739a(j, 100000000, "亿");
        }
        return m99740a(j, 10000, "w", "10000.0", "1.0亿");
    }

    /* renamed from: d */
    private static String m99743d(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= 100000000) {
            return m99739a(j, 100000000, "亿");
        }
        return m99740a(j, 10000, "万", "10000.0", "1.0亿");
    }

    /* renamed from: e */
    private static String m99744e(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m99740a(j, 1000, "K", "1000.0", "1.0M");
        } else if (j >= 1000000000) {
            return m99739a(j, 1000000000, "B");
        } else {
            return m99740a(j, 1000000, "M", "1000.0", "1.0B");
        }
    }

    /* renamed from: a */
    private static String m99739a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimal);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m99740a(long j, long j2, String str, String str2, String str3) {
        String a = m99739a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }
}
