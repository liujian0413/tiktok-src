package com.bytedance.apm.util;

/* renamed from: com.bytedance.apm.util.b */
public final class C9639b {
    /* renamed from: a */
    public static int m28513a(Object[] objArr, Class<?> cls) {
        if (objArr == null || objArr.length == 0) {
            return -1;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] != null && objArr[i].getClass().equals(cls)) {
                return i;
            }
        }
        return -1;
    }
}
