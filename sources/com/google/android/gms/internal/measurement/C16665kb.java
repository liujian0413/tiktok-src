package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kb */
final class C16665kb {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m54665d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m54666e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m54667f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m54668g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m54662b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m54661b(byte b, byte b2, char[] cArr, int i) throws zzuv {
        if (b < -62 || m54668g(b2)) {
            throw zzuv.zzwx();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m54660b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzuv {
        if (m54668g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m54668g(b3)))) {
            throw zzuv.zzwx();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m54659b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzuv {
        if (m54668g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m54668g(b3) || m54668g(b4)) {
            throw zzuv.zzwx();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
