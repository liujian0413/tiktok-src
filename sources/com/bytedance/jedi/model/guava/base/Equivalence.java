package com.bytedance.jedi.model.guava.base;

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
            return this.equivalence.mo29383a(this.reference);
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
                    return this.equivalence.mo29384a(this.reference, wrapper.reference);
                }
            }
            return false;
        }

        private Wrapper(Equivalence<? super T> equivalence2, T t) {
            this.equivalence = (Equivalence) C11864b.m34655a(equivalence2);
            this.reference = t;
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.base.Equivalence$a */
    static final class C11858a extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C11858a f31658a = new C11858a();
        private static final long serialVersionUID = 1;

        C11858a() {
        }

        private Object readResolve() {
            return f31658a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo29385b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo29386b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* renamed from: com.bytedance.jedi.model.guava.base.Equivalence$b */
    static final class C11859b extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C11859b f31659a = new C11859b();
        private static final long serialVersionUID = 1;

        C11859b() {
        }

        private Object readResolve() {
            return f31659a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo29386b(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo29385b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    /* renamed from: a */
    public static Equivalence<Object> m34636a() {
        return C11858a.f31658a;
    }

    /* renamed from: b */
    public static Equivalence<Object> m34637b() {
        return C11859b.f31659a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo29385b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo29386b(T t, T t2);

    /* renamed from: a */
    public final int mo29383a(T t) {
        if (t == null) {
            return 0;
        }
        return mo29385b(t);
    }

    /* renamed from: a */
    public final boolean mo29384a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo29386b(t, t2);
    }
}
