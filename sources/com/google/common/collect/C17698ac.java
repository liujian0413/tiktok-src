package com.google.common.collect;

/* renamed from: com.google.common.collect.ac */
public abstract class C17698ac {

    /* renamed from: a */
    public static final C17698ac f48925a = new C17698ac() {
        /* renamed from: b */
        public final int mo45815b() {
            return 0;
        }

        /* renamed from: a */
        private static C17698ac m58890a(int i) {
            if (i < 0) {
                return C17698ac.f48926b;
            }
            if (i > 0) {
                return C17698ac.f48927c;
            }
            return C17698ac.f48925a;
        }

        /* renamed from: a */
        public final C17698ac mo45814a(Comparable comparable, Comparable comparable2) {
            return m58890a(comparable.compareTo(comparable2));
        }
    };

    /* renamed from: b */
    public static final C17698ac f48926b = new C17700a(-1);

    /* renamed from: c */
    public static final C17698ac f48927c = new C17700a(1);

    /* renamed from: com.google.common.collect.ac$a */
    static final class C17700a extends C17698ac {

        /* renamed from: d */
        final int f48928d;

        /* renamed from: a */
        public final C17698ac mo45814a(Comparable comparable, Comparable comparable2) {
            return this;
        }

        /* renamed from: b */
        public final int mo45815b() {
            return this.f48928d;
        }

        C17700a(int i) {
            super();
            this.f48928d = i;
        }
    }

    private C17698ac() {
    }

    /* renamed from: a */
    public static C17698ac m58887a() {
        return f48925a;
    }

    /* renamed from: a */
    public abstract C17698ac mo45814a(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: b */
    public abstract int mo45815b();
}
