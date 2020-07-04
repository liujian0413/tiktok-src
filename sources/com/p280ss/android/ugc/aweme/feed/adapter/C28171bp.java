package com.p280ss.android.ugc.aweme.feed.adapter;

import com.C1642a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bp */
final class C28171bp {
    /* renamed from: a */
    private static boolean m92474a(int i, int i2) {
        return i <= 0 || i2 <= 0;
    }

    /* renamed from: b */
    private static boolean m92475b(int i, int i2, int i3, int i4) {
        return (i > i2 && i3 < i4) || (i < i2 && i3 > i4);
    }

    /* renamed from: a */
    static int m92473a(int i, int i2, int i3, int i4) {
        if (m92474a(i, i2)) {
            return 1;
        }
        if (m92475b(i, i2, i3, i4)) {
            return 2;
        }
        if (m92476c(i, i2, i3, i4)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: c */
    private static boolean m92476c(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        try {
            double parseDouble = Double.parseDouble(C1642a.m8035a(Locale.US, "%.2f", new Object[]{Double.valueOf(d3)}));
            double parseDouble2 = Double.parseDouble(C1642a.m8035a(Locale.US, "%.2f", new Object[]{Double.valueOf(d6)}));
            if (parseDouble <= 0.0d || parseDouble2 <= 0.0d || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }
}
