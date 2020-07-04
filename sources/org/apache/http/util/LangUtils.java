package org.apache.http.util;

public final class LangUtils {
    public static int hashCode(int i, int i2) {
        return (i * 37) + i2;
    }

    public static int hashCode(int i, boolean z) {
        return hashCode(i, z ? 1 : 0);
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static int hashCode(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode(i, i2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            if (objArr2 == null) {
                return true;
            }
            return false;
        } else if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        } else {
            for (int i = 0; i < objArr.length; i++) {
                if (!equals(objArr[i], objArr2[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
