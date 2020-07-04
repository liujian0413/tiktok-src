package com.p280ss.android.download.p861b;

/* renamed from: com.ss.android.download.b.a */
public final class C19403a {

    /* renamed from: a */
    private static Object[] f52507a = new Object[0];

    /* renamed from: b */
    private static Object[] f52508b = new Object[73];

    /* renamed from: b */
    private static int m63751b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m63750a(int i) {
        return m63751b(i * 8) / 8;
    }
}
