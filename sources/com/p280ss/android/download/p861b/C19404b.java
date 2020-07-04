package com.p280ss.android.download.p861b;

/* renamed from: com.ss.android.download.b.b */
final class C19404b {

    /* renamed from: a */
    static final boolean[] f52509a = new boolean[0];

    /* renamed from: b */
    static final int[] f52510b = new int[0];

    /* renamed from: c */
    static final long[] f52511c = new long[0];

    /* renamed from: d */
    static final Object[] f52512d = new Object[0];

    /* renamed from: a */
    static int m63752a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }
}
