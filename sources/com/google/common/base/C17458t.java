package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.t */
public final class C17458t {

    /* renamed from: com.google.common.base.t$a */
    static class C17459a<T> implements C17457s<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17457s<T> f48417a;

        /* renamed from: b */
        volatile transient boolean f48418b;

        /* renamed from: c */
        transient T f48419c;

        /* renamed from: a */
        public final T mo44946a() {
            if (!this.f48418b) {
                synchronized (this) {
                    if (!this.f48418b) {
                        T a = this.f48417a.mo44946a();
                        this.f48419c = a;
                        this.f48418b = true;
                        return a;
                    }
                }
            }
            return this.f48419c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            sb.append(this.f48417a);
            sb.append(")");
            return sb.toString();
        }

        C17459a(C17457s<T> sVar) {
            this.f48417a = (C17457s) C17439m.m57962a(sVar);
        }
    }

    /* renamed from: com.google.common.base.t$b */
    static class C17460b<T> implements C17457s<T> {

        /* renamed from: a */
        volatile C17457s<T> f48420a;

        /* renamed from: b */
        volatile boolean f48421b;

        /* renamed from: c */
        T f48422c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            sb.append(this.f48420a);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final T mo44946a() {
            if (!this.f48421b) {
                synchronized (this) {
                    if (!this.f48421b) {
                        T a = this.f48420a.mo44946a();
                        this.f48422c = a;
                        this.f48421b = true;
                        this.f48420a = null;
                        return a;
                    }
                }
            }
            return this.f48422c;
        }

        C17460b(C17457s<T> sVar) {
            this.f48420a = (C17457s) C17439m.m57962a(sVar);
        }
    }

    /* renamed from: com.google.common.base.t$c */
    static class C17461c<T> implements C17457s<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final T f48423a;

        /* renamed from: a */
        public final T mo44946a() {
            return this.f48423a;
        }

        public final int hashCode() {
            return C17434j.m57954a(this.f48423a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
            sb.append(this.f48423a);
            sb.append(")");
            return sb.toString();
        }

        C17461c(T t) {
            this.f48423a = t;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17461c)) {
                return false;
            }
            return C17434j.m57955a(this.f48423a, ((C17461c) obj).f48423a);
        }
    }

    /* renamed from: a */
    public static <T> C17457s<T> m58016a(T t) {
        return new C17461c(t);
    }

    /* renamed from: a */
    public static <T> C17457s<T> m58015a(C17457s<T> sVar) {
        if ((sVar instanceof C17460b) || (sVar instanceof C17459a)) {
            return sVar;
        }
        if (sVar instanceof Serializable) {
            return new C17459a(sVar);
        }
        return new C17460b(sVar);
    }
}
