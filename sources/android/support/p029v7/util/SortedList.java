package android.support.p029v7.util;

import java.util.Comparator;

/* renamed from: android.support.v7.util.SortedList */
public final class SortedList<T> {

    /* renamed from: android.support.v7.util.SortedList$BatchedCallback */
    public static class BatchedCallback<T2> extends Callback<T2> {

        /* renamed from: a */
        final Callback<T2> f4115a;

        /* renamed from: b */
        private final BatchingListUpdateCallback f4116b;

        /* renamed from: a */
        public final void mo253a(int i, int i2) {
            this.f4116b.mo253a(i, i2);
        }

        /* renamed from: b */
        public final void mo255b(int i, int i2) {
            this.f4116b.mo255b(i, i2);
        }

        /* renamed from: c */
        public final void mo256c(int i, int i2) {
            this.f4116b.mo256c(i, i2);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f4115a.compare(t2, t22);
        }

        /* renamed from: d */
        public final void mo4545d(int i, int i2) {
            this.f4116b.mo254a(i, i2, null);
        }

        /* renamed from: a */
        public final void mo254a(int i, int i2, Object obj) {
            this.f4116b.mo254a(i, i2, obj);
        }
    }

    /* renamed from: android.support.v7.util.SortedList$Callback */
    public static abstract class Callback<T2> implements C1151b, Comparator<T2> {
        public abstract int compare(T2 t2, T2 t22);

        /* renamed from: d */
        public abstract void mo4545d(int i, int i2);

        /* renamed from: a */
        public void mo254a(int i, int i2, Object obj) {
            mo4545d(i, i2);
        }
    }
}
