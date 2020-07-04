package com.google.common.base;

import java.util.Arrays;

/* renamed from: com.google.common.base.i */
public final class C17430i {

    /* renamed from: com.google.common.base.i$a */
    public static final class C17432a {

        /* renamed from: a */
        private final String f48391a;

        /* renamed from: b */
        private final C17433a f48392b;

        /* renamed from: c */
        private C17433a f48393c;

        /* renamed from: d */
        private boolean f48394d;

        /* renamed from: com.google.common.base.i$a$a */
        static final class C17433a {

            /* renamed from: a */
            String f48395a;

            /* renamed from: b */
            Object f48396b;

            /* renamed from: c */
            C17433a f48397c;

            private C17433a() {
            }
        }

        /* renamed from: a */
        private C17433a m57946a() {
            C17433a aVar = new C17433a();
            this.f48393c.f48397c = aVar;
            this.f48393c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f48394d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f48391a);
            sb.append('{');
            for (C17433a aVar = this.f48392b.f48397c; aVar != null; aVar = aVar.f48397c) {
                Object obj = aVar.f48396b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f48395a != null) {
                        sb.append(aVar.f48395a);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                }
            }
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: b */
        private C17432a m57947b(Object obj) {
            m57946a().f48396b = obj;
            return this;
        }

        /* renamed from: a */
        public final C17432a mo44919a(Object obj) {
            return m57947b(obj);
        }

        private C17432a(String str) {
            this.f48392b = new C17433a();
            this.f48393c = this.f48392b;
            this.f48394d = false;
            this.f48391a = (String) C17439m.m57962a(str);
        }

        /* renamed from: b */
        private C17432a m57948b(String str, Object obj) {
            C17433a a = m57946a();
            a.f48396b = obj;
            a.f48395a = (String) C17439m.m57962a(str);
            return this;
        }

        /* renamed from: a */
        public final C17432a mo44920a(String str, double d) {
            return m57948b(str, String.valueOf(d));
        }

        /* renamed from: a */
        public final C17432a mo44921a(String str, int i) {
            return m57948b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C17432a mo44922a(String str, long j) {
            return m57948b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C17432a mo44923a(String str, Object obj) {
            return m57948b(str, obj);
        }
    }

    /* renamed from: a */
    public static C17432a m57944a(Object obj) {
        return new C17432a(obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static <T> T m57945a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
