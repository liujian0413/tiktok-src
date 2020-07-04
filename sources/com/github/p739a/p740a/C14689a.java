package com.github.p739a.p740a;

/* renamed from: com.github.a.a.a */
public final class C14689a {
    /* renamed from: a */
    public static String m42504a(char c) {
        if (!m42506b(c)) {
            return String.valueOf(c);
        }
        if (c == 12295) {
            return "LING";
        }
        return C14693e.f37997b[m42507c(c)];
    }

    /* renamed from: b */
    private static boolean m42506b(char c) {
        if ((19968 > c || c > 40869 || m42507c(c) <= 0) && 12295 != c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static int m42507c(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return m42505a(C14690b.f37990a, C14690b.f37991b, i);
        }
        if (7000 > i || i >= 14000) {
            return m42505a(C14692d.f37994a, C14692d.f37995b, i - 14000);
        }
        return m42505a(C14691c.f37992a, C14691c.f37993b, i - 7000);
    }

    /* renamed from: a */
    private static short m42505a(byte[] bArr, byte[] bArr2, int i) {
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C14693e.f37996a[i % 8]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
