package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.common.base.o */
public final class C17441o {

    /* renamed from: com.google.common.base.o$a */
    static class C17443a<T> implements C17440n<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends C17440n<? super T>> f48400a;

        public final int hashCode() {
            return this.f48400a.hashCode() + 306654252;
        }

        public final String toString() {
            return C17441o.m57994a("and", (Iterable<?>) this.f48400a);
        }

        private C17443a(List<? extends C17440n<? super T>> list) {
            this.f48400a = list;
        }

        public final boolean apply(T t) {
            for (int i = 0; i < this.f48400a.size(); i++) {
                if (!((C17440n) this.f48400a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17443a)) {
                return false;
            }
            return this.f48400a.equals(((C17443a) obj).f48400a);
        }
    }

    /* renamed from: com.google.common.base.o$b */
    static class C17444b<A, B> implements C17440n<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17440n<B> f48401a;

        /* renamed from: b */
        final C17427g<A, ? extends B> f48402b;

        public final int hashCode() {
            return this.f48402b.hashCode() ^ this.f48401a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f48401a);
            sb.append("(");
            sb.append(this.f48402b);
            sb.append(")");
            return sb.toString();
        }

        public final boolean apply(A a) {
            return this.f48401a.apply(this.f48402b.mo44914b(a));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17444b)) {
                return false;
            }
            C17444b bVar = (C17444b) obj;
            if (!this.f48402b.equals(bVar.f48402b) || !this.f48401a.equals(bVar.f48401a)) {
                return false;
            }
            return true;
        }

        private C17444b(C17440n<B> nVar, C17427g<A, ? extends B> gVar) {
            this.f48401a = (C17440n) C17439m.m57962a(nVar);
            this.f48402b = (C17427g) C17439m.m57962a(gVar);
        }
    }

    /* renamed from: com.google.common.base.o$c */
    static class C17445c<T> implements C17440n<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Collection<?> f48403a;

        public final int hashCode() {
            return this.f48403a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Predicates.in(");
            sb.append(this.f48403a);
            sb.append(")");
            return sb.toString();
        }

        private C17445c(Collection<?> collection) {
            this.f48403a = (Collection) C17439m.m57962a(collection);
        }

        public final boolean apply(T t) {
            try {
                return this.f48403a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17445c)) {
                return false;
            }
            return this.f48403a.equals(((C17445c) obj).f48403a);
        }
    }

    /* renamed from: com.google.common.base.o$d */
    static class C17446d<T> implements C17440n<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final T f48404a;

        public final int hashCode() {
            return this.f48404a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Predicates.equalTo(");
            sb.append(this.f48404a);
            sb.append(")");
            return sb.toString();
        }

        private C17446d(T t) {
            this.f48404a = t;
        }

        public final boolean apply(T t) {
            return this.f48404a.equals(t);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17446d)) {
                return false;
            }
            return this.f48404a.equals(((C17446d) obj).f48404a);
        }
    }

    /* renamed from: com.google.common.base.o$e */
    static class C17447e<T> implements C17440n<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17440n<T> f48405a;

        public final int hashCode() {
            return this.f48405a.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Predicates.not(");
            sb.append(this.f48405a);
            sb.append(")");
            return sb.toString();
        }

        C17447e(C17440n<T> nVar) {
            this.f48405a = (C17440n) C17439m.m57962a(nVar);
        }

        public final boolean apply(T t) {
            if (!this.f48405a.apply(t)) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17447e)) {
                return false;
            }
            return this.f48405a.equals(((C17447e) obj).f48405a);
        }
    }

    /* renamed from: com.google.common.base.o$f */
    enum C17448f implements C17440n<Object> {
        ALWAYS_TRUE {
            public final boolean apply(Object obj) {
                return true;
            }

            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public final boolean apply(Object obj) {
                return false;
            }

            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public final boolean apply(Object obj) {
                return obj == null;
            }

            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public final boolean apply(Object obj) {
                return obj != null;
            }

            public final String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <T> C17440n<T> mo44936a() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> C17440n<T> m57988a() {
        return C17448f.ALWAYS_TRUE.mo44936a();
    }

    /* renamed from: b */
    private static <T> C17440n<T> m57995b() {
        return C17448f.IS_NULL.mo44936a();
    }

    /* renamed from: a */
    public static <T> C17440n<T> m57989a(C17440n<T> nVar) {
        return new C17447e(nVar);
    }

    /* renamed from: a */
    public static <T> C17440n<T> m57992a(T t) {
        if (t == null) {
            return m57995b();
        }
        return new C17446d(t);
    }

    /* renamed from: a */
    public static <T> C17440n<T> m57993a(Collection<? extends T> collection) {
        return new C17445c(collection);
    }

    /* renamed from: b */
    private static <T> List<C17440n<? super T>> m57996b(C17440n<? super T> nVar, C17440n<? super T> nVar2) {
        return Arrays.asList(new C17440n[]{nVar, nVar2});
    }

    /* renamed from: a */
    public static <A, B> C17440n<A> m57990a(C17440n<B> nVar, C17427g<A, ? extends B> gVar) {
        return new C17444b(nVar, gVar);
    }

    /* renamed from: a */
    public static <T> C17440n<T> m57991a(C17440n<? super T> nVar, C17440n<? super T> nVar2) {
        return new C17443a(m57996b((C17440n) C17439m.m57962a(nVar), (C17440n) C17439m.m57962a(nVar2)));
    }

    /* renamed from: a */
    public static String m57994a(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
