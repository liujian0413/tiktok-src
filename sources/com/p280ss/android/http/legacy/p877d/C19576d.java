package com.p280ss.android.http.legacy.p877d;

/* renamed from: com.ss.android.http.legacy.d.d */
public final class C19576d {
    /* renamed from: a */
    public static int m64493a(int i, int i2) {
        return (i * 37) + i2;
    }

    /* renamed from: a */
    public static int m64494a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return m64493a(i, i2);
    }

    /* renamed from: a */
    public static boolean m64495a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64496a(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            if (objArr2 == null) {
                return true;
            }
            return false;
        } else if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        } else {
            for (int i = 0; i < objArr.length; i++) {
                if (!m64495a(objArr[i], objArr2[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
