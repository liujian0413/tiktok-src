package com.bytedance.frameworks.baselib.network.http.util;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.e */
public final class C10185e {
    /* renamed from: a */
    public static int m30252a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m30253a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m30252a(i, i2);
    }
}
