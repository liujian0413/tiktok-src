package com.p280ss.android.ugc.effectmanager.common.p1730e;

/* renamed from: com.ss.android.ugc.effectmanager.common.e.h */
public final class C43736h {
    /* renamed from: a */
    public static long m138610a(String str, long j) {
        long j2 = -1;
        if (str == null || str.isEmpty()) {
            return -1;
        }
        try {
            j2 = Long.valueOf(str).longValue();
        } catch (NumberFormatException unused) {
        }
        return j2;
    }
}
