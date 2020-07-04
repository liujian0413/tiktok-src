package com.p280ss.android.message.push.connection.p887a;

/* renamed from: com.ss.android.message.push.connection.a.a */
public final class C19862a {
    /* renamed from: a */
    public static void m65589a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(i);
            sb.append("; regionStart=");
            sb.append(i2);
            sb.append("; regionLength=");
            sb.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }
}
