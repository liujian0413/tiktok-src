package com.p280ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.base.utils.n */
public final class C23486n {
    /* renamed from: a */
    public static long m77124a(long j) {
        return 120000;
    }

    /* renamed from: b */
    public static long m77126b(long j) {
        return j / 1000;
    }

    /* renamed from: c */
    public static int m77128c(long j) {
        return (int) (j / 86400000);
    }

    /* renamed from: b */
    public static int m77125b(double d) {
        double d2 = (double) C6399b.m19921a().getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d / d2) + 0.5d);
    }

    /* renamed from: c */
    public static int m77127c(double d) {
        double d2 = (double) C6399b.m19921a().getResources().getDisplayMetrics().scaledDensity;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m77122a(double d) {
        Context a = C6399b.m19921a();
        if (a == null || a.getResources() == null || a.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) a.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m77123a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) / 2.0f);
    }
}
