package com.p280ss.android.p817ad.splash.p836g;

import java.util.Random;

/* renamed from: com.ss.android.ad.splash.g.k */
public final class C19133k {

    /* renamed from: a */
    private static final char[] f51727a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m62739a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = f51727a[b >>> 4];
            cArr[i2 + 1] = f51727a[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m62740a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static long m62738a(Random random, long j) {
        long nextLong;
        long j2;
        do {
            nextLong = (random.nextLong() << 1) >>> 1;
            j2 = nextLong % j;
        } while ((nextLong - j2) + (j - 1) < 0);
        return j2;
    }

    /* renamed from: a */
    public static int m62737a(long j, long j2) {
        int i;
        if (j2 > 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double d3 = (double) j2;
            Double.isNaN(d3);
            i = (int) ((d2 / d3) * 100.0d);
        } else {
            i = 0;
        }
        return Math.min(Math.max(0, i), 100);
    }
}
