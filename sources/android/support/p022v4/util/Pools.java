package android.support.p022v4.util;

/* renamed from: android.support.v4.util.Pools */
public final class Pools {

    /* renamed from: android.support.v4.util.Pools$SimplePool */
    public static class SimplePool<T> implements C0887a<T> {

        /* renamed from: a */
        private final Object[] f3108a;

        /* renamed from: b */
        private int f3109b;

        public T acquire() {
            if (this.f3109b <= 0) {
                return null;
            }
            int i = this.f3109b - 1;
            T t = this.f3108a[i];
            this.f3108a[i] = null;
            this.f3109b--;
            return t;
        }

        public SimplePool(int i) {
            if (i > 0) {
                this.f3108a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        private boolean m3765a(T t) {
            for (int i = 0; i < this.f3109b; i++) {
                if (this.f3108a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        public boolean release(T t) {
            if (m3765a(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f3109b >= this.f3108a.length) {
                return false;
            } else {
                this.f3108a[this.f3109b] = t;
                this.f3109b++;
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.util.Pools$SynchronizedPool */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: a */
        private final Object f3110a = new Object();

        public T acquire() {
            T acquire;
            synchronized (this.f3110a) {
                acquire = super.acquire();
            }
            return acquire;
        }

        public SynchronizedPool(int i) {
            super(i);
        }

        public boolean release(T t) {
            boolean release;
            synchronized (this.f3110a) {
                release = super.release(t);
            }
            return release;
        }
    }

    /* renamed from: android.support.v4.util.Pools$a */
    public interface C0887a<T> {
        T acquire();

        boolean release(T t);
    }
}
