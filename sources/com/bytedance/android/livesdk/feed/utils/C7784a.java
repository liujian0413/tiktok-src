package com.bytedance.android.livesdk.feed.utils;

import com.bytedance.android.live.core.utils.C3390j;
import com.facebook.appevents.C13192m;
import com.p280ss.android.vesdk.C45323k;

/* renamed from: com.bytedance.android.livesdk.feed.utils.a */
public final class C7784a {
    /* renamed from: a */
    public static String m23910a(long j) {
        return m23911b(j);
    }

    /* renamed from: b */
    private static String m23911b(long j) {
        if (j >= 1000000) {
            StringBuilder sb = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb.append(C3390j.m12609a("%.2f", Double.valueOf((d * 1.0d) / 1000000.0d)));
            sb.append(C13192m.f34940a);
            return sb.toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb2.append(C3390j.m12609a("%.2f", Double.valueOf((d2 * 1.0d) / 1000.0d)));
            sb2.append(C45323k.f116730a);
            return sb2.toString();
        }
    }
}
