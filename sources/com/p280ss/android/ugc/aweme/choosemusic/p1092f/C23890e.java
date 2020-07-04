package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import com.p280ss.android.ugc.aweme.i18n.C30538p;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.e */
public final class C23890e {
    /* renamed from: a */
    public static String m78223a(long j) {
        if (!C30538p.m99745a()) {
            return m78226b(j);
        }
        return m78227c(j);
    }

    /* renamed from: b */
    private static String m78226b(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= 100000000) {
            return m78224a(j, 100000000, "亿");
        }
        return m78225a(j, 10000, "w", "10000.0", "1.0亿");
    }

    /* renamed from: c */
    private static String m78227c(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m78225a(j, 1000, "K", "1000.0", "1.0M");
        } else if (j >= 1000000000) {
            return m78224a(j, 1000000000, "B");
        } else {
            return m78225a(j, 1000000, "M", "1000.0", "1.0B");
        }
    }

    /* renamed from: a */
    private static String m78224a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimal);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m78225a(long j, long j2, String str, String str2, String str3) {
        String a = m78224a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }
}
