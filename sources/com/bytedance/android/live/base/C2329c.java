package com.bytedance.android.live.base;

/* renamed from: com.bytedance.android.live.base.c */
public final class C2329c {
    /* renamed from: a */
    private static int m9947a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m9948a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m9947a(i, i2);
    }

    /* renamed from: a */
    public static boolean m9949a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
