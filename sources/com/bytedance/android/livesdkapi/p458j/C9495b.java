package com.bytedance.android.livesdkapi.p458j;

/* renamed from: com.bytedance.android.livesdkapi.j.b */
public final class C9495b {
    /* renamed from: a */
    private static int m28031a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m28032a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m28031a(i, i2);
    }

    /* renamed from: a */
    public static boolean m28033a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
