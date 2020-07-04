package com.google.android.gms.internal.ads;

final class bat {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m48245d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m48246e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m48247f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m48248g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m48242b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m48241b(byte b, byte b2, char[] cArr, int i) throws zzcdx {
        if (b < -62 || m48248g(b2)) {
            throw zzcdx.zzaub();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m48240b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzcdx {
        if (m48248g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m48248g(b3)))) {
            throw zzcdx.zzaub();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m48239b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzcdx {
        if (m48248g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m48248g(b3) || m48248g(b4)) {
            throw zzcdx.zzaub();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
