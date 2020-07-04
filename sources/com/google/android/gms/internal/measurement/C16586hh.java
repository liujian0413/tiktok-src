package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.hh */
public final class C16586hh {

    /* renamed from: a */
    static final Charset f46424a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f46425b;

    /* renamed from: c */
    private static final Charset f46426c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f46427d;

    /* renamed from: e */
    private static final C16554gi f46428e;

    /* renamed from: a */
    public static int m54184a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m54185a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m54186a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m54188a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m54189a(byte[] bArr) {
        return C16664ka.m54646a(bArr);
    }

    /* renamed from: b */
    public static String m54190b(byte[] bArr) {
        return new String(bArr, f46424a);
    }

    /* renamed from: c */
    public static int m54191c(byte[] bArr) {
        int length = bArr.length;
        int a = m54183a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m54183a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m54187a(Object obj, Object obj2) {
        return ((C16615ij) obj).mo42935j().mo42730a((C16615ij) obj2).mo42941c();
    }

    static {
        byte[] bArr = new byte[0];
        f46425b = bArr;
        f46427d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f46425b;
        f46428e = C16554gi.m53916a(bArr2, 0, bArr2.length, false);
    }
}
