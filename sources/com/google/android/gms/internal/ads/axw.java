package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class axw {

    /* renamed from: a */
    static final Charset f41216a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f41217b;

    /* renamed from: c */
    private static final Charset f41218c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f41219d;

    /* renamed from: e */
    private static final awx f41220e;

    /* renamed from: a */
    public static int m47741a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m47742a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m47743a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static <T> T m47745a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m47746a(byte[] bArr) {
        return bas.m48226a(bArr);
    }

    /* renamed from: b */
    public static String m47747b(byte[] bArr) {
        return new String(bArr, f41216a);
    }

    /* renamed from: c */
    public static int m47748c(byte[] bArr) {
        int length = bArr.length;
        int a = m47740a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m47740a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    static Object m47744a(Object obj, Object obj2) {
        return ((aza) obj).mo40286m().mo40087a((aza) obj2).mo40292d();
    }

    static {
        byte[] bArr = new byte[0];
        f41217b = bArr;
        f41219d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f41217b;
        f41220e = awx.m47454a(bArr2, 0, bArr2.length, false);
    }
}
