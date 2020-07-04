package com.bytedance.android.live.core.utils;

import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.facebook.appevents.C13192m;
import com.p280ss.android.vesdk.C45323k;

/* renamed from: com.bytedance.android.live.core.utils.e */
public final class C3385e {
    /* renamed from: e */
    public static boolean m12595e(long j) {
        return j >= 1000;
    }

    /* renamed from: a */
    public static String m12591a(long j) {
        return m12594d(j);
    }

    /* renamed from: c */
    public static String m12593c(long j) {
        if (C9290a.f25466a) {
            return m12594d(j);
        }
        return m12597g(j);
    }

    /* renamed from: b */
    public static String m12592b(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder();
        double d = (double) j;
        Double.isNaN(d);
        sb.append(C9078p.m27100a("%.1f", Double.valueOf((d * 1.0d) / 10000.0d)));
        sb.append("万");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m12596f(long j) {
        if (j < 10000000) {
            return String.valueOf(j);
        }
        StringBuilder sb = new StringBuilder();
        double d = (double) j;
        Double.isNaN(d);
        sb.append(C9078p.m27100a("%.0f", Double.valueOf((d * 1.0d) / 10000.0d)));
        sb.append("万");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m12594d(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C9078p.m27100a("%.2f", Double.valueOf((d * 1.0d) / 1000000.0d)));
            sb.append(C13192m.f34940a);
            return sb.toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C9078p.m27100a("%.2f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C45323k.f116730a);
            return sb2.toString();
        }
    }

    /* renamed from: g */
    private static String m12597g(long j) {
        if (j >= 100000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C9078p.m27100a("%.2f", Double.valueOf((d * 1.0d) / 1.0E8d)));
            sb.append("亿");
            return sb.toString();
        } else if (j < 10000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C9078p.m27100a("%.2f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb2.append("万");
            return sb2.toString();
        }
    }
}
