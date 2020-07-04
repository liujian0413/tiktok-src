package com.facebook.common.internal;

import java.util.Arrays;

/* renamed from: com.facebook.common.internal.f */
public final class C13303f {

    /* renamed from: com.facebook.common.internal.f$a */
    public static final class C13305a {

        /* renamed from: a */
        private final String f35206a;

        /* renamed from: b */
        private C13306a f35207b;

        /* renamed from: c */
        private C13306a f35208c;

        /* renamed from: d */
        private boolean f35209d;

        /* renamed from: com.facebook.common.internal.f$a$a */
        static final class C13306a {

            /* renamed from: a */
            String f35210a;

            /* renamed from: b */
            Object f35211b;

            /* renamed from: c */
            C13306a f35212c;

            private C13306a() {
            }
        }

        /* renamed from: a */
        private C13306a m38933a() {
            C13306a aVar = new C13306a();
            this.f35208c.f35212c = aVar;
            this.f35208c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f35209d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f35206a);
            sb.append('{');
            for (C13306a aVar = this.f35207b.f35212c; aVar != null; aVar = aVar.f35212c) {
                if (!z || aVar.f35211b != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f35210a != null) {
                        sb.append(aVar.f35210a);
                        sb.append('=');
                    }
                    sb.append(aVar.f35211b);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C13305a(String str) {
            this.f35207b = new C13306a();
            this.f35208c = this.f35207b;
            this.f35209d = false;
            this.f35206a = (String) C13307g.m38940a(str);
        }

        /* renamed from: a */
        public final C13305a mo32569a(String str, Object obj) {
            return m38934b(str, obj);
        }

        /* renamed from: b */
        private C13305a m38934b(String str, Object obj) {
            C13306a a = m38933a();
            a.f35211b = obj;
            a.f35210a = (String) C13307g.m38940a(str);
            return this;
        }

        /* renamed from: a */
        public final C13305a mo32568a(String str, int i) {
            return m38934b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C13305a mo32570a(String str, boolean z) {
            return m38934b(str, String.valueOf(z));
        }
    }

    /* renamed from: a */
    public static int m38929a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C13305a m38930a(Object obj) {
        return new C13305a(m38931a(obj.getClass()));
    }

    /* renamed from: a */
    private static String m38931a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    public static boolean m38932a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
