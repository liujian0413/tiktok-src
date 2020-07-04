package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.b */
public final class C3910b {

    /* renamed from: a */
    private static Object[] f11701a = new Object[0];

    /* renamed from: b */
    private static Object[] f11702b = new Object[73];

    /* renamed from: b */
    private static int m13793b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m13792a(int i) {
        return m13793b(i * 8) / 8;
    }
}
