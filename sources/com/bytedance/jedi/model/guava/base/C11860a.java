package com.bytedance.jedi.model.guava.base;

import java.util.Arrays;

/* renamed from: com.bytedance.jedi.model.guava.base.a */
public final class C11860a {

    /* renamed from: com.bytedance.jedi.model.guava.base.a$a */
    public static final class C11862a {

        /* renamed from: a */
        private final String f31660a;

        /* renamed from: b */
        private final C11863a f31661b;

        /* renamed from: c */
        private C11863a f31662c;

        /* renamed from: d */
        private boolean f31663d;

        /* renamed from: com.bytedance.jedi.model.guava.base.a$a$a */
        static final class C11863a {

            /* renamed from: a */
            String f31664a;

            /* renamed from: b */
            Object f31665b;

            /* renamed from: c */
            C11863a f31666c;

            private C11863a() {
            }
        }

        /* renamed from: a */
        private C11863a m34648a() {
            C11863a aVar = new C11863a();
            this.f31662c.f31666c = aVar;
            this.f31662c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f31663d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f31660a);
            sb.append('{');
            for (C11863a aVar = this.f31661b.f31666c; aVar != null; aVar = aVar.f31666c) {
                Object obj = aVar.f31665b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f31664a != null) {
                        sb.append(aVar.f31664a);
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
        private C11862a m34649b(Object obj) {
            m34648a().f31665b = obj;
            return this;
        }

        /* renamed from: a */
        public final C11862a mo29391a(Object obj) {
            return m34649b(obj);
        }

        private C11862a(String str) {
            this.f31661b = new C11863a();
            this.f31662c = this.f31661b;
            this.f31663d = false;
            this.f31660a = (String) C11864b.m34655a(str);
        }

        /* renamed from: b */
        private C11862a m34650b(String str, Object obj) {
            C11863a a = m34648a();
            a.f31665b = obj;
            a.f31664a = (String) C11864b.m34655a(str);
            return this;
        }

        /* renamed from: a */
        public final C11862a mo29392a(String str, int i) {
            return m34650b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C11862a mo29393a(String str, long j) {
            return m34650b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C11862a mo29394a(String str, Object obj) {
            return m34650b(str, obj);
        }
    }

    /* renamed from: a */
    public static C11862a m34646a(Object obj) {
        return new C11862a(obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static <T> T m34647a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
