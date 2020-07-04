package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.l */
final class C3267l {
    /* renamed from: a */
    private static long m12323a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    static long m12324a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m12323a(j2, j)));
        return j2;
    }
}
