package android.arch.paging;

import android.arch.paging.C0083d.C0085b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.k */
public abstract class C0113k<T> extends C0083d<Integer, T> {

    /* renamed from: android.arch.paging.k$a */
    static class C0114a<Value> extends C0078b<Integer, Value> {

        /* renamed from: a */
        final C0113k<Value> f244a;

        /* renamed from: c */
        public final boolean mo185c() {
            return this.f244a.mo185c();
        }

        /* renamed from: b */
        public final void mo183b() {
            this.f244a.mo183b();
        }

        C0114a(C0113k<Value> kVar) {
            this.f244a = kVar;
        }

        /* renamed from: a */
        public final void mo182a(C0085b bVar) {
            this.f244a.mo182a(bVar);
        }

        /* renamed from: b */
        public final void mo184b(C0085b bVar) {
            this.f244a.mo184b(bVar);
        }

        /* renamed from: b */
        private static Integer m295b(int i, Value value) {
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo164a(int i, Object obj) {
            return m295b(i, obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo165a(int i, Value value, int i2, Executor executor, C0099a<Value> aVar) {
            this.f244a.mo257a(1, i + 1, i2, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo168b(int i, Value value, int i2, Executor executor, C0099a<Value> aVar) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.f244a.mo257a(2, i3, 0, executor, aVar);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.f244a.mo257a(2, (i3 - min) + 1, min, executor, aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo166a(Integer num, int i, int i2, boolean z, Executor executor, C0099a<Value> aVar) {
            int i3;
            if (num == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            this.f244a.mo258a(false, i3, i, i2, executor, aVar);
        }
    }

    /* renamed from: android.arch.paging.k$b */
    public static abstract class C0115b<T> {
    }

    /* renamed from: android.arch.paging.k$c */
    static class C0116c<T> extends C0115b<T> {

        /* renamed from: a */
        final C0086c<T> f245a;

        /* renamed from: b */
        private final boolean f246b;

        /* renamed from: c */
        private final int f247c;

        C0116c(C0113k kVar, boolean z, int i, C0099a<T> aVar) {
            this.f245a = new C0086c<>(kVar, 0, null, aVar);
            this.f246b = z;
            this.f247c = i;
            if (this.f247c <= 0) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }
    }

    /* renamed from: android.arch.paging.k$d */
    public static class C0117d {

        /* renamed from: a */
        public final int f248a;

        /* renamed from: b */
        public final int f249b;

        /* renamed from: c */
        public final int f250c;

        /* renamed from: d */
        public final boolean f251d;

        public C0117d(int i, int i2, int i3, boolean z) {
            this.f248a = i;
            this.f249b = i2;
            this.f250c = i3;
            this.f251d = z;
        }
    }

    /* renamed from: android.arch.paging.k$e */
    public static abstract class C0118e<T> {
        /* renamed from: a */
        public abstract void mo260a(List<T> list);
    }

    /* renamed from: android.arch.paging.k$f */
    static class C0119f<T> extends C0118e<T> {

        /* renamed from: a */
        private C0086c<T> f252a;

        /* renamed from: b */
        private final int f253b;

        /* renamed from: a */
        public final void mo260a(List<T> list) {
            if (!this.f252a.mo190a()) {
                this.f252a.mo188a(new C0098g<>(list, 0, 0, this.f253b));
            }
        }

        C0119f(C0113k kVar, int i, int i2, Executor executor, C0099a<T> aVar) {
            this.f252a = new C0086c<>(kVar, i, executor, aVar);
            this.f253b = i2;
        }
    }

    /* renamed from: android.arch.paging.k$g */
    public static class C0120g {

        /* renamed from: a */
        public final int f254a;

        /* renamed from: b */
        public final int f255b;

        public C0120g(int i, int i2) {
            this.f254a = i;
            this.f255b = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C0078b<Integer, T> mo259d() {
        return new C0114a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo257a(int i, int i2, int i3, Executor executor, C0099a<T> aVar) {
        C0119f fVar = new C0119f(this, i, i2, executor, aVar);
        if (i3 == 0) {
            fVar.mo260a(Collections.emptyList());
        } else {
            new C0120g(i2, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo258a(boolean z, int i, int i2, int i3, Executor executor, C0099a<T> aVar) {
        C0116c cVar = new C0116c(this, z, i3, aVar);
        new C0117d(i, i2, i3, z);
        cVar.f245a.mo189a(executor);
    }
}
