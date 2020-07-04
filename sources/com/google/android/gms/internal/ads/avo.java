package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class avo {
    /* renamed from: a */
    private static long m47377a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: a */
    private static long m47378a(byte[] bArr, int i, int i2) {
        return (m47377a(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    private static void m47379a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: a */
    static byte[] m47380a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long a = m47378a(bArr3, 0, 0) & 67108863;
        int i = 2;
        long a2 = m47378a(bArr3, 3, 2) & 67108611;
        int i2 = 6;
        long a3 = m47378a(bArr3, 6, 4) & 67092735;
        long a4 = m47378a(bArr3, 9, 6) & 66076671;
        long a5 = m47378a(bArr3, 12, 8) & 1048575;
        long j = a2 * 5;
        long j2 = a3 * 5;
        long j3 = a4 * 5;
        long j4 = a5 * 5;
        byte[] bArr5 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr4.length) {
            int min = Math.min(16, bArr4.length - i3);
            System.arraycopy(bArr4, i3, bArr5, 0, min);
            bArr5[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr5, min + 1, 17, 0);
            }
            long a6 = j9 + m47378a(bArr5, 0, 0);
            long a7 = j5 + m47378a(bArr5, 3, i);
            long a8 = j6 + m47378a(bArr5, i2, 4);
            long a9 = j7 + m47378a(bArr5, 9, i2);
            long a10 = j8 + (m47378a(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
            long j10 = (a6 * a) + (a7 * j4) + (a8 * j3) + (a9 * j2) + (a10 * j);
            long j11 = (a6 * a3) + (a7 * a2) + (a8 * a) + (a9 * j4) + (a10 * j3);
            long j12 = (a6 * a2) + (a7 * a) + (a8 * j4) + (a9 * j3) + (a10 * j2) + (j10 >> 26);
            long j13 = j11 + (j12 >> 26);
            long j14 = (a6 * a4) + (a7 * a3) + (a8 * a2) + (a9 * a) + (a10 * j4) + (j13 >> 26);
            long j15 = (a6 * a5) + (a7 * a4) + (a8 * a3) + (a9 * a2) + (a10 * a) + (j14 >> 26);
            long j16 = (j10 & 67108863) + ((j15 >> 26) * 5);
            j5 = (j12 & 67108863) + (j16 >> 26);
            i3 += 16;
            j6 = j13 & 67108863;
            j7 = j14 & 67108863;
            j8 = j15 & 67108863;
            i = 2;
            j9 = j16 & 67108863;
            i2 = 6;
        }
        long j17 = j6 + (j5 >> 26);
        long j18 = j17 & 67108863;
        long j19 = j7 + (j17 >> 26);
        long j20 = j19 & 67108863;
        long j21 = j8 + (j19 >> 26);
        long j22 = j21 & 67108863;
        long j23 = j9 + ((j21 >> 26) * 5);
        long j24 = j23 & 67108863;
        long j25 = (j5 & 67108863) + (j23 >> 26);
        long j26 = j24 + 5;
        long j27 = j26 & 67108863;
        long j28 = (j26 >> 26) + j25;
        long j29 = j18 + (j28 >> 26);
        long j30 = j20 + (j29 >> 26);
        long j31 = j30 & 67108863;
        long j32 = (j22 + (j30 >> 26)) - 67108864;
        long j33 = j32 >> 63;
        long j34 = j24 & j33;
        long j35 = j25 & j33;
        long j36 = j18 & j33;
        long j37 = j20 & j33;
        long j38 = j22 & j33;
        long j39 = j33 ^ -1;
        long j40 = (j28 & 67108863 & j39) | j35;
        long j41 = (j29 & 67108863 & j39) | j36;
        long j42 = (j31 & j39) | j37;
        long j43 = (j32 & j39) | j38;
        long j44 = j40 << 26;
        long j45 = ((j40 >> 6) | (j41 << 20)) & 4294967295L;
        long j46 = ((j41 >> 12) | (j42 << 14)) & 4294967295L;
        long j47 = ((j42 >> 18) | (j43 << 8)) & 4294967295L;
        long a11 = ((j44 | j34 | (j27 & j39)) & 4294967295L) + m47377a(bArr3, 16);
        long j48 = a11 & 4294967295L;
        long a12 = j45 + m47377a(bArr3, 20) + (a11 >> 32);
        long j49 = a12 & 4294967295L;
        long a13 = j46 + m47377a(bArr3, 24) + (a12 >> 32);
        long j50 = a13 & 4294967295L;
        long a14 = (j47 + m47377a(bArr3, 28) + (a13 >> 32)) & 4294967295L;
        byte[] bArr6 = new byte[16];
        m47379a(bArr6, j48, 0);
        m47379a(bArr6, j49, 4);
        m47379a(bArr6, j50, 8);
        m47379a(bArr6, a14, 12);
        return bArr6;
    }
}
