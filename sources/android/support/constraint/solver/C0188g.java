package android.support.constraint.solver;

/* renamed from: android.support.constraint.solver.g */
final class C0188g {

    /* renamed from: android.support.constraint.solver.g$a */
    interface C0189a<T> {
        /* renamed from: a */
        T mo507a();

        /* renamed from: a */
        void mo508a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo509a(T t);
    }

    /* renamed from: android.support.constraint.solver.g$b */
    static class C0190b<T> implements C0189a<T> {

        /* renamed from: a */
        private final Object[] f670a = new Object[256];

        /* renamed from: b */
        private int f671b;

        /* renamed from: a */
        public final T mo507a() {
            if (this.f671b <= 0) {
                return null;
            }
            int i = this.f671b - 1;
            T t = this.f670a[i];
            this.f670a[i] = null;
            this.f671b--;
            return t;
        }

        C0190b(int i) {
        }

        /* renamed from: a */
        public final boolean mo509a(T t) {
            if (this.f671b >= this.f670a.length) {
                return false;
            }
            this.f670a[this.f671b] = t;
            this.f671b++;
            return true;
        }

        /* renamed from: a */
        public final void mo508a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f671b < this.f670a.length) {
                    this.f670a[this.f671b] = t;
                    this.f671b++;
                }
            }
        }
    }
}
