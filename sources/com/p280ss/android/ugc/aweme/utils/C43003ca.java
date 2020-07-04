package com.p280ss.android.ugc.aweme.utils;

import com.facebook.appevents.C13192m;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.vesdk.C45323k;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.utils.ca */
public final class C43003ca {
    /* renamed from: a */
    public static String m136496a(long j) {
        if (!C30538p.m99745a()) {
            return m136499b(j);
        }
        return m136500c(j);
    }

    /* renamed from: b */
    private static String m136499b(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j >= 100000000) {
            return m136497a(j, 100000000, "亿");
        }
        return m136498a(j, 10000, "w", "10000.0", "1.0亿");
    }

    /* renamed from: c */
    private static String m136500c(long j) {
        if (j < 0) {
            return "0";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m136498a(j, 1000, C45323k.f116730a, "1000.0", "1.0m");
        } else if (j >= 1000000000) {
            return m136497a(j, 1000000000, "b");
        } else {
            return m136498a(j, 1000000, C13192m.f34940a, "1000.0", "1.0b");
        }
    }

    /* renamed from: a */
    private static String m136497a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimal);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m136498a(long j, long j2, String str, String str2, String str3) {
        String a = m136497a(j, j2, "");
        if (a.equals(str2)) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }
}
