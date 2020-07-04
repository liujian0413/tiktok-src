package com.p280ss.android.ugc.aweme.filter;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.filter.bu */
public final class C29266bu {

    /* renamed from: b */
    public static final int f77212b = m96007b(1);

    /* renamed from: c */
    public static final int f77213c = m96007b(0);

    /* renamed from: d */
    public static final C29267a f77214d = new C29267a(null);

    /* renamed from: a */
    public final int f77215a;

    /* renamed from: com.ss.android.ugc.aweme.filter.bu$a */
    public static final class C29267a {
        private C29267a() {
        }

        /* renamed from: a */
        public static int m96009a() {
            return C29266bu.f77212b;
        }

        /* renamed from: b */
        public static int m96010b() {
            return C29266bu.f77213c;
        }

        public /* synthetic */ C29267a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private /* synthetic */ int m96004a() {
        return this.f77215a;
    }

    /* renamed from: a */
    private static boolean m96006a(int i, Object obj) {
        if (obj instanceof C29266bu) {
            if (i == ((C29266bu) obj).m96004a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int m96007b(int i) {
        return i;
    }

    /* renamed from: c */
    private static int m96008c(int i) {
        return i;
    }

    public final int hashCode() {
        return m96008c(this.f77215a);
    }

    public final String toString() {
        return m96005a(this.f77215a);
    }

    /* renamed from: a */
    private static String m96005a(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        return m96006a(this.f77215a, obj);
    }
}
