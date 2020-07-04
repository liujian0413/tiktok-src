package p346io.reactivex.internal.p352a;

import p346io.reactivex.p348d.C7325d;

/* renamed from: io.reactivex.internal.a.b */
public final class C7364b {

    /* renamed from: a */
    static final C7325d<Object, Object> f20449a = new C7365a();

    /* renamed from: io.reactivex.internal.a.b$a */
    static final class C7365a implements C7325d<Object, Object> {
        C7365a() {
        }

        /* renamed from: a */
        public final boolean mo19141a(Object obj, Object obj2) {
            return C7364b.m23082a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m23077a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m23079a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> C7325d<T, T> m23080a() {
        return f20449a;
    }

    /* renamed from: a */
    public static int m23078a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static <T> T m23081a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m23082a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
