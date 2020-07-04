package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class bkf {

    /* renamed from: a */
    private static final byte[] f42376a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f42377b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f42378c = {0, 1, 2, 3, 4, 5, 6, 8};

    /* renamed from: a */
    public static Pair<Integer, Integer> m49061a(byte[] bArr) {
        boolean z = false;
        int i = (bArr[0] >> 3) & 31;
        int i2 = (i == 5 || i == 29) ? 1 : 0;
        int i3 = i2 + 1;
        int i4 = ((bArr[i2] & 7) << 1) | ((bArr[i3] >> 7) & 1);
        if (i4 < 13) {
            z = true;
        }
        bke.m49060b(z);
        return Pair.create(Integer.valueOf(f42377b[i4]), Integer.valueOf((bArr[i3] >> 3) & 15));
    }

    /* renamed from: a */
    public static byte[] m49062a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f42376a.length + i2)];
        System.arraycopy(f42376a, 0, bArr2, 0, f42376a.length);
        System.arraycopy(bArr, i, bArr2, f42376a.length, i2);
        return bArr2;
    }
}
