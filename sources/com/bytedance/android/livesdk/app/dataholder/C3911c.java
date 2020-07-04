package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.c */
final class C3911c {

    /* renamed from: a */
    static final boolean[] f11703a = new boolean[0];

    /* renamed from: b */
    static final int[] f11704b = new int[0];

    /* renamed from: c */
    static final long[] f11705c = new long[0];

    /* renamed from: d */
    static final Object[] f11706d = new Object[0];

    /* renamed from: a */
    static int m13794a(long[] jArr, int i, long j) {
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
