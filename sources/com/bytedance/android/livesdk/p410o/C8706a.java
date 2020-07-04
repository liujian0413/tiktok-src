package com.bytedance.android.livesdk.p410o;

/* renamed from: com.bytedance.android.livesdk.o.a */
final class C8706a {
    /* renamed from: a */
    public static <T> int m26021a(T... tArr) {
        int i;
        if (tArr == null) {
            return 0;
        }
        int i2 = 1;
        for (T t : tArr) {
            if (t == null) {
                i = 0;
            } else {
                i = t.hashCode();
            }
            i2 = ((i2 << 5) - i2) ^ i;
        }
        return i2;
    }
}
