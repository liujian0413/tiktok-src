package com.google.common.math;

import com.C1642a;
import com.google.common.base.C17439m;

/* renamed from: com.google.common.math.d */
public abstract class C18121d {

    /* renamed from: com.google.common.math.d$a */
    public static final class C18123a {

        /* renamed from: a */
        private final double f49473a;

        /* renamed from: b */
        private final double f49474b;

        /* renamed from: a */
        public final C18121d mo46762a(double d) {
            C17439m.m57968a(!Double.isNaN(d));
            if (C18118b.m59884b(d)) {
                return new C18125c(d, this.f49474b - (this.f49473a * d));
            }
            return new C18126d(this.f49473a);
        }

        private C18123a(double d, double d2) {
            this.f49473a = d;
            this.f49474b = d2;
        }
    }

    /* renamed from: com.google.common.math.d$b */
    static final class C18124b extends C18121d {

        /* renamed from: a */
        static final C18124b f49475a = new C18124b();

        private C18124b() {
        }

        public final String toString() {
            return "NaN";
        }
    }

    /* renamed from: com.google.common.math.d$c */
    static final class C18125c extends C18121d {

        /* renamed from: a */
        final double f49476a;

        /* renamed from: b */
        final double f49477b;

        public final String toString() {
            return C1642a.m8034a("y = %g * x + %g", new Object[]{Double.valueOf(this.f49476a), Double.valueOf(this.f49477b)});
        }

        C18125c(double d, double d2) {
            this.f49476a = d;
            this.f49477b = d2;
        }
    }

    /* renamed from: com.google.common.math.d$d */
    static final class C18126d extends C18121d {

        /* renamed from: a */
        final double f49478a;

        public final String toString() {
            return C1642a.m8034a("x = %g", new Object[]{Double.valueOf(this.f49478a)});
        }

        C18126d(double d) {
            this.f49478a = d;
        }
    }

    /* renamed from: a */
    public static C18121d m59893a() {
        return C18124b.f49475a;
    }

    /* renamed from: a */
    public static C18121d m59894a(double d) {
        C17439m.m57968a(C18118b.m59884b(d));
        return new C18126d(d);
    }

    /* renamed from: b */
    public static C18121d m59895b(double d) {
        C17439m.m57968a(C18118b.m59884b(d));
        return new C18125c(0.0d, d);
    }

    /* renamed from: a */
    public static C18123a m59892a(double d, double d2) {
        boolean z;
        if (!C18118b.m59884b(d) || !C18118b.m59884b(d2)) {
            z = false;
        } else {
            z = true;
        }
        C17439m.m57968a(z);
        C18123a aVar = new C18123a(d, d2);
        return aVar;
    }
}
