package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.core.utils.C3390j;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.facebook.appevents.C13192m;
import com.p280ss.android.vesdk.C45323k;
import java.text.DecimalFormat;

/* renamed from: com.bytedance.android.livesdk.utils.x */
public final class C9094x {
    /* renamed from: a */
    public static String m27135a(long j) {
        if (C9290a.f25466a) {
            return m27138d(j);
        }
        return m27137c(j);
    }

    /* renamed from: b */
    public static String m27136b(long j) {
        String str = "万";
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sb = new StringBuilder("#.#");
            sb.append(str);
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString());
            double d = (double) j;
            Double.isNaN(d);
            return decimalFormat.format((d * 1.0d) / 10000.0d);
        }
        StringBuilder sb2 = new StringBuilder();
        double d2 = (double) j;
        Double.isNaN(d2);
        sb2.append(C3390j.m12609a("%.0f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: d */
    private static String m27138d(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C3390j.m12609a("%.1f", Double.valueOf((d * 1.0d) / 1000.0d)));
            sb.append(C45323k.f116730a);
            return sb.toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C3390j.m12609a("%.0f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C45323k.f116730a);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            sb3.append(C3390j.m12609a("%.1f", Double.valueOf((d3 * 1.0d) / 1000000.0d)));
            sb3.append(C13192m.f34940a);
            return sb3.toString();
        }
    }

    /* renamed from: c */
    private static String m27137c(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C3390j.m12609a("%.1f", Double.valueOf((d * 1.0d) / 10000.0d)));
            sb.append("万");
            return sb.toString();
        } else if (j < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C3390j.m12609a("%.0f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
            sb2.append("万");
            return sb2.toString();
        } else if (j < 10000000) {
            StringBuilder sb3 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            sb3.append(C3390j.m12609a("%.0f", Double.valueOf((d3 * 1.0d) / 10000.0d)));
            sb3.append("万");
            return sb3.toString();
        } else if (j < 100000000) {
            StringBuilder sb4 = new StringBuilder();
            double d4 = (double) j;
            Double.isNaN(d4);
            sb4.append(C3390j.m12609a("%.1f", Double.valueOf((d4 * 1.0d) / 1.0E7d)));
            sb4.append("千万");
            return sb4.toString();
        } else if (j < 1000000000) {
            StringBuilder sb5 = new StringBuilder();
            double d5 = (double) j;
            Double.isNaN(d5);
            sb5.append(C3390j.m12609a("%.1f", Double.valueOf((d5 * 1.0d) / 1.0E8d)));
            sb5.append("亿");
            return sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            double d6 = (double) j;
            Double.isNaN(d6);
            sb6.append(C3390j.m12609a("%.0f", Double.valueOf((d6 * 1.0d) / 1.0E8d)));
            sb6.append("亿");
            return sb6.toString();
        }
    }
}
