package com.google.common.base;

import java.io.Serializable;

public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        public final T get() {
            return this.reference;
        }

        public final int hashCode() {
            return this.equivalence.mo44881a(this.reference);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.equivalence);
            sb.append(".wrap(");
            sb.append(this.reference);
            sb.append(")");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.equivalence.equals(wrapper.equivalence)) {
                    return this.equivalence.mo44882a(this.reference, wrapper.reference);
                }
            }
            return false;
        }

        private Wrapper(Equivalence<? super T> equivalence2, T t) {
            this.equivalence = (Equivalence) C17439m.m57962a(equivalence2);
            this.reference = t;
        }
    }

    /* renamed from: com.google.common.base.Equivalence$a */
    static final class C17396a extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C17396a f48337a = new C17396a();
        private static final long serialVersionUID = 1;

        C17396a() {
        }

        private Object readResolve() {
            return f48337a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo44883b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo44884b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.google.common.base.Equivalence$b */
    static final class C17397b extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C17397b f48338a = new C17397b();
        private static final long serialVersionUID = 1;

        C17397b() {
        }

        private Object readResolve() {
            return f48338a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo44884b(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo44883b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    /* renamed from: a */
    public static Equivalence<Object> m57863a() {
        return C17396a.f48337a;
    }

    /* renamed from: b */
    public static Equivalence<Object> m57864b() {
        return C17397b.f48338a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo44883b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo44884b(T t, T t2);

    /* renamed from: a */
    public final int mo44881a(T t) {
        if (t == null) {
            return 0;
        }
        return mo44883b(t);
    }

    /* renamed from: a */
    public final boolean mo44882a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo44884b(t, t2);
    }
}
