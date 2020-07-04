package beancopy;

/* renamed from: beancopy.a */
public final class C1580a {
    /* renamed from: a */
    public static boolean m7823a(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }

    /* renamed from: a */
    public static Long m7820a(Integer num, Long l) {
        return num == null ? l : Long.valueOf(num.longValue());
    }

    /* renamed from: a */
    public static String m7821a(Double d, String str) {
        return d == null ? str : String.valueOf(d.doubleValue());
    }

    /* renamed from: a */
    public static String m7822a(Long l, String str) {
        return l == null ? str : String.valueOf(l.longValue());
    }

    /* renamed from: a */
    public static boolean m7824a(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        return num.intValue() != 0;
    }

    /* renamed from: a */
    public static long m7818a(Long l) {
        return m7819a(l, 0);
    }

    /* renamed from: a */
    public static double m7811a(Double d, double d2) {
        if (d == null) {
            return d2;
        }
        return d.doubleValue();
    }

    /* renamed from: a */
    public static float m7812a(Double d, float f) {
        if (d == null) {
            return f;
        }
        return d.floatValue();
    }

    /* renamed from: a */
    public static int m7813a(Boolean bool, int i) {
        if (bool == null) {
            return i;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m7814a(Double d, int i) {
        if (d == null) {
            return i;
        }
        return d.intValue();
    }

    /* renamed from: a */
    public static int m7815a(Integer num, int i) {
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static long m7816a(Double d, long j) {
        if (d == null) {
            return j;
        }
        return d.longValue();
    }

    /* renamed from: a */
    public static long m7817a(Integer num, long j) {
        if (num == null) {
            return j;
        }
        return num.longValue();
    }

    /* renamed from: a */
    public static long m7819a(Long l, long j) {
        if (l == null) {
            return j;
        }
        return l.longValue();
    }
}
