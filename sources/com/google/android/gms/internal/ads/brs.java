package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class brs {

    /* renamed from: a */
    private static final byte[] f43364a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f43365b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f43366c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m49876a(byte[] bArr) {
        brz brz = new brz(bArr);
        int a = m49875a(brz);
        int b = m49878b(brz);
        int a2 = brz.mo41215a(4);
        if (a == 5 || a == 29) {
            b = m49878b(brz);
            if (m49875a(brz) == 22) {
                a2 = brz.mo41215a(4);
            }
        }
        int i = f43366c[a2];
        brr.m49871a(i != -1);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static byte[] m49877a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(f43364a.length + i2)];
        System.arraycopy(f43364a, 0, bArr2, 0, f43364a.length);
        System.arraycopy(bArr, i, bArr2, f43364a.length, i2);
        return bArr2;
    }

    /* renamed from: a */
    private static int m49875a(brz brz) {
        int a = brz.mo41215a(5);
        return a == 31 ? brz.mo41215a(6) + 32 : a;
    }

    /* renamed from: b */
    private static int m49878b(brz brz) {
        int a = brz.mo41215a(4);
        if (a == 15) {
            return brz.mo41215a(24);
        }
        brr.m49871a(a < 13);
        return f43365b[a];
    }
}
