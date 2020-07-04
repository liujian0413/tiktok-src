package com.p280ss.android.medialib.model;

import java.util.List;

/* renamed from: com.ss.android.medialib.model.c */
public class C19755c {

    /* renamed from: a */
    public long f53617a;

    /* renamed from: b */
    public double f53618b;

    /* renamed from: a */
    public static int m65125a(List<? extends C19755c> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (C19755c cVar : list) {
            i = (int) (((long) i) + m65126a(cVar.f53617a, cVar.f53618b));
        }
        return i;
    }

    public C19755c(long j, double d) {
        this.f53617a = j;
        this.f53618b = d;
    }

    /* renamed from: a */
    private static long m65126a(long j, double d) {
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) ((d2 * 1.0d) / d);
    }
}
