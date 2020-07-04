package org.webrtc;

public abstract /* synthetic */ class Predicate$$CC {
    /* renamed from: or */
    public static Predicate m150059or(Predicate predicate, Predicate predicate2) {
        return new Predicate<T>(predicate2) {
            final /* synthetic */ Predicate val$other;

            public Predicate and(Predicate predicate) {
                return Predicate$$CC.and(this, predicate);
            }

            public Predicate negate() {
                return Predicate$$CC.negate(this);
            }

            /* renamed from: or */
            public Predicate mo122514or(Predicate predicate) {
                return Predicate$$CC.m150059or(this, predicate);
            }

            public boolean test(T t) {
                if (Predicate.this.test(t) || this.val$other.test(t)) {
                    return true;
                }
                return false;
            }

            {
                this.val$other = r2;
            }
        };
    }

    public static Predicate and(Predicate predicate, Predicate predicate2) {
        return new Predicate<T>(predicate2) {
            final /* synthetic */ Predicate val$other;

            public Predicate and(Predicate predicate) {
                return Predicate$$CC.and(this, predicate);
            }

            public Predicate negate() {
                return Predicate$$CC.negate(this);
            }

            /* renamed from: or */
            public Predicate mo122514or(Predicate predicate) {
                return Predicate$$CC.m150059or(this, predicate);
            }

            public boolean test(T t) {
                if (!Predicate.this.test(t) || !this.val$other.test(t)) {
                    return false;
                }
                return true;
            }

            {
                this.val$other = r2;
            }
        };
    }

    public static Predicate negate(Predicate predicate) {
        return new Predicate<T>() {
            public Predicate and(Predicate predicate) {
                return Predicate$$CC.and(this, predicate);
            }

            public Predicate negate() {
                return Predicate$$CC.negate(this);
            }

            /* renamed from: or */
            public Predicate mo122514or(Predicate predicate) {
                return Predicate$$CC.m150059or(this, predicate);
            }

            public boolean test(T t) {
                if (!Predicate.this.test(t)) {
                    return true;
                }
                return false;
            }
        };
    }
}
