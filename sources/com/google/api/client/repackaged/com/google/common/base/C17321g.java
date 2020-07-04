package com.google.api.client.repackaged.com.google.common.base;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.g */
public final class C17321g {
    /* renamed from: b */
    public static void m57690b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m57682a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m57686a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m57680a(int i, int i2) {
        return m57681a(i, i2, "index");
    }

    /* renamed from: a */
    public static <T> T m57683a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    private static String m57685a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (i5 < objArr.length) {
                sb.append(", ");
                int i6 = i5 + 1;
                sb.append(objArr[i5]);
                i5 = i6;
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m57687a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    private static int m57681a(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m57689b(i, i2, str));
    }

    /* renamed from: b */
    public static void m57691b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(m57685a(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T m57684a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m57685a(str, objArr));
    }

    /* renamed from: b */
    private static String m57689b(int i, int i2, String str) {
        if (i < 0) {
            return m57685a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m57685a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m57688a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m57685a(str, objArr));
        }
    }
}
