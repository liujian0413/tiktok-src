package com.google.api.client.util;

import com.google.api.client.repackaged.com.google.common.base.C17320f;

/* renamed from: com.google.api.client.util.v */
public final class C17380v {

    /* renamed from: com.google.api.client.util.v$a */
    public static final class C17382a {

        /* renamed from: a */
        private final String f48327a;

        /* renamed from: b */
        private C17383a f48328b = new C17383a();

        /* renamed from: c */
        private C17383a f48329c = this.f48328b;

        /* renamed from: d */
        private boolean f48330d;

        /* renamed from: com.google.api.client.util.v$a$a */
        static final class C17383a {

            /* renamed from: a */
            String f48331a;

            /* renamed from: b */
            Object f48332b;

            /* renamed from: c */
            C17383a f48333c;

            private C17383a() {
            }
        }

        /* renamed from: a */
        private C17383a m57844a() {
            C17383a aVar = new C17383a();
            this.f48329c.f48333c = aVar;
            this.f48329c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f48330d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f48327a);
            sb.append('{');
            for (C17383a aVar = this.f48328b.f48333c; aVar != null; aVar = aVar.f48333c) {
                if (!z || aVar.f48332b != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f48331a != null) {
                        sb.append(aVar.f48331a);
                        sb.append('=');
                    }
                    sb.append(aVar.f48332b);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        C17382a(String str) {
            this.f48327a = str;
        }

        /* renamed from: a */
        public final C17382a mo44870a(String str, Object obj) {
            return m57845b(str, obj);
        }

        /* renamed from: b */
        private C17382a m57845b(String str, Object obj) {
            C17383a a = m57844a();
            a.f48332b = obj;
            a.f48331a = (String) C17384w.m57847a(str);
            return this;
        }
    }

    /* renamed from: a */
    public static C17382a m57842a(Object obj) {
        return new C17382a(obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static boolean m57843a(Object obj, Object obj2) {
        return C17320f.m57679a(obj, obj2);
    }
}
