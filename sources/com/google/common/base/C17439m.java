package com.google.common.base;

/* renamed from: com.google.common.base.m */
public final class C17439m {
    /* renamed from: a */
    public static void m57969a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m57970a(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: a */
    public static void m57971a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m57973a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static void m57976a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m57972a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: a */
    public static void m57974a(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* renamed from: a */
    public static void m57975a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: a */
    public static void m57977a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m57966a(str, obj, obj2));
        }
    }

    /* renamed from: b */
    public static void m57981b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m57962a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m57968a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m57960a(int i, int i2) {
        return m57961a(i, i2, "index");
    }

    /* renamed from: b */
    public static int m57978b(int i, int i2) {
        return m57986c(i, i2, "index");
    }

    /* renamed from: b */
    public static void m57982b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m57963a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    private static String m57966a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, i2, indexOf);
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf, i2, valueOf.length());
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
    private static int m57961a(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m57980b(i, i2, str));
    }

    /* renamed from: c */
    private static int m57986c(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m57987d(i, i2, str));
    }

    /* renamed from: b */
    private static String m57979b(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m57987d(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m57987d(i2, i3, "end index");
        }
        return m57966a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: b */
    private static String m57980b(int i, int i2, String str) {
        if (i < 0) {
            return m57966a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m57966a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private static String m57987d(int i, int i2, String str) {
        if (i < 0) {
            return m57966a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m57966a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m57965a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m57966a(str, objArr));
    }

    /* renamed from: b */
    public static void m57983b(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(m57966a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    public static void m57984b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(m57966a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static void m57967a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m57979b(i, i2, i3));
        }
    }

    /* renamed from: b */
    public static void m57985b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m57966a(str, obj));
        }
    }

    /* renamed from: a */
    public static <T> T m57964a(T t, String str, Object obj, Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m57966a(str, obj, obj2));
    }
}
