package android.arch.paging;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.paging.h */
public abstract class C0100h<T> extends AbstractList<T> {

    /* renamed from: a */
    private int f193a = Integer.MAX_VALUE;

    /* renamed from: b */
    private int f194b = Integer.MIN_VALUE;

    /* renamed from: c */
    final Executor f195c;

    /* renamed from: d */
    final Executor f196d;

    /* renamed from: e */
    final C0103a<T> f197e;

    /* renamed from: f */
    public final C0106d f198f;

    /* renamed from: g */
    final C0108i<T> f199g;

    /* renamed from: h */
    int f200h;

    /* renamed from: i */
    T f201i;

    /* renamed from: j */
    public boolean f202j;

    /* renamed from: k */
    public boolean f203k;

    /* renamed from: l */
    private final AtomicBoolean f204l = new AtomicBoolean(false);

    /* renamed from: m */
    private final ArrayList<WeakReference<C0105c>> f205m = new ArrayList<>();

    /* renamed from: android.arch.paging.h$a */
    public static abstract class C0103a<T> {
        /* renamed from: a */
        public void mo220a() {
        }

        /* renamed from: a */
        public void mo221a(T t) {
        }
    }

    /* renamed from: android.arch.paging.h$b */
    public static final class C0104b<Key, Value> {

        /* renamed from: a */
        private final C0083d<Key, Value> f213a;

        /* renamed from: b */
        private final C0106d f214b;

        /* renamed from: c */
        private Executor f215c;

        /* renamed from: d */
        private Executor f216d;

        /* renamed from: e */
        private C0103a f217e;

        /* renamed from: f */
        private Key f218f;

        /* renamed from: a */
        public final C0100h<Value> mo225a() {
            if (this.f215c == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            } else if (this.f216d != null) {
                return C0100h.m225a(this.f213a, this.f215c, this.f216d, this.f217e, this.f214b, this.f218f);
            } else {
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
        }

        /* renamed from: a */
        public final C0104b<Key, Value> mo222a(C0103a aVar) {
            this.f217e = aVar;
            return this;
        }

        /* renamed from: b */
        public final C0104b<Key, Value> mo226b(Executor executor) {
            this.f216d = executor;
            return this;
        }

        /* renamed from: a */
        public final C0104b<Key, Value> mo223a(Key key) {
            this.f218f = key;
            return this;
        }

        /* renamed from: a */
        public final C0104b<Key, Value> mo224a(Executor executor) {
            this.f215c = executor;
            return this;
        }

        public C0104b(C0083d<Key, Value> dVar, C0106d dVar2) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (dVar2 != null) {
                this.f213a = dVar;
                this.f214b = dVar2;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }
    }

    /* renamed from: android.arch.paging.h$c */
    public static abstract class C0105c {
        /* renamed from: a */
        public abstract void mo160a(int i, int i2);

        /* renamed from: b */
        public abstract void mo161b(int i, int i2);
    }

    /* renamed from: android.arch.paging.h$d */
    public static class C0106d {

        /* renamed from: a */
        public final int f219a;

        /* renamed from: b */
        public final int f220b;

        /* renamed from: c */
        public final boolean f221c;

        /* renamed from: d */
        public final int f222d;

        /* renamed from: android.arch.paging.h$d$a */
        public static final class C0107a {

            /* renamed from: a */
            private int f223a = -1;

            /* renamed from: b */
            private int f224b = -1;

            /* renamed from: c */
            private int f225c = -1;

            /* renamed from: d */
            private boolean f226d = true;

            /* renamed from: a */
            public final C0106d mo229a() {
                if (this.f223a > 0) {
                    if (this.f224b < 0) {
                        this.f224b = this.f223a;
                    }
                    if (this.f225c < 0) {
                        this.f225c = this.f223a * 3;
                    }
                    if (this.f226d || this.f224b != 0) {
                        C0106d dVar = new C0106d(this.f223a, this.f224b, this.f226d, this.f225c);
                        return dVar;
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }

            /* renamed from: a */
            public final C0107a mo227a(int i) {
                this.f223a = i;
                return this;
            }

            /* renamed from: b */
            public final C0107a mo230b(int i) {
                this.f224b = i;
                return this;
            }

            /* renamed from: c */
            public final C0107a mo231c(int i) {
                this.f225c = i;
                return this;
            }

            /* renamed from: a */
            public final C0107a mo228a(boolean z) {
                this.f226d = false;
                return this;
            }
        }

        private C0106d(int i, int i2, boolean z, int i3) {
            this.f219a = i;
            this.f220b = i2;
            this.f221c = z;
            this.f222d = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo169a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo172a(C0100h<T> hVar, C0105c cVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo173a();

    /* renamed from: b */
    public abstract C0083d<?, T> mo174b();

    /* renamed from: c */
    public abstract Object mo177c();

    /* renamed from: h */
    private int m226h() {
        return this.f199g.f230c;
    }

    /* renamed from: d */
    public boolean mo211d() {
        return mo214f();
    }

    /* renamed from: f */
    public boolean mo214f() {
        return this.f204l.get();
    }

    /* renamed from: g */
    public final void mo215g() {
        this.f204l.set(true);
    }

    public int size() {
        return this.f199g.size();
    }

    /* renamed from: e */
    public final List<T> mo212e() {
        if (mo211d()) {
            return this;
        }
        return new C0121l(this);
    }

    public T get(int i) {
        T t = this.f199g.get(i);
        if (t != null) {
            this.f201i = t;
        }
        return t;
    }

    /* renamed from: d */
    public final void mo210d(int i) {
        this.f200h = m226h() + i;
        mo169a(i);
        this.f193a = Math.min(this.f193a, i);
        this.f194b = Math.max(this.f194b, i);
        mo205a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo213e(int i) {
        this.f193a += i;
        this.f194b += i;
    }

    /* renamed from: a */
    public final void mo203a(C0105c cVar) {
        for (int size = this.f205m.size() - 1; size >= 0; size--) {
            C0105c cVar2 = (C0105c) ((WeakReference) this.f205m.get(size)).get();
            if (cVar2 == null || cVar2 == cVar) {
                this.f205m.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final void mo205a(boolean z) {
        final boolean z2;
        final boolean z3 = true;
        if (!this.f202j || this.f193a > this.f198f.f220b) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.f203k || this.f194b < (size() - 1) - this.f198f.f220b) {
            z3 = false;
        }
        if (z2 || z3) {
            if (z2) {
                this.f202j = false;
            }
            if (z3) {
                this.f203k = false;
            }
            if (z) {
                this.f195c.execute(new Runnable() {
                    public final void run() {
                        C0100h.this.mo206a(z2, z3);
                    }
                });
            } else {
                mo206a(z2, z3);
            }
        }
    }

    /* renamed from: a */
    public final void mo206a(boolean z, boolean z2) {
        if (z) {
            this.f199g.mo243e();
        }
        if (z2) {
            this.f197e.mo221a(this.f199g.mo244f());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo208b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f205m.size() - 1; size >= 0; size--) {
                C0105c cVar = (C0105c) ((WeakReference) this.f205m.get(size)).get();
                if (cVar != null) {
                    cVar.mo160a(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo209c(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f205m.size() - 1; size >= 0; size--) {
                C0105c cVar = (C0105c) ((WeakReference) this.f205m.get(size)).get();
                if (cVar != null) {
                    cVar.mo161b(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo204a(List<T> list, C0105c cVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo172a((C0100h) list, cVar);
            } else if (!this.f199g.isEmpty()) {
                cVar.mo160a(0, this.f199g.size());
            }
        }
        for (int size = this.f205m.size() - 1; size >= 0; size--) {
            if (((C0105c) ((WeakReference) this.f205m.get(size)).get()) == null) {
                this.f205m.remove(size);
            }
        }
        this.f205m.add(new WeakReference(cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo207a(final boolean z, final boolean z2, final boolean z3) {
        if (this.f197e != null) {
            if (this.f193a == Integer.MAX_VALUE) {
                this.f193a = this.f199g.size();
            }
            if (this.f194b == Integer.MIN_VALUE) {
                this.f194b = 0;
            }
            if (z || z2 || z3) {
                this.f195c.execute(new Runnable() {
                    public final void run() {
                        if (z) {
                            C0100h.this.f197e.mo220a();
                        }
                        if (z2) {
                            C0100h.this.f202j = true;
                        }
                        if (z3) {
                            C0100h.this.f203k = true;
                        }
                        C0100h.this.mo205a(false);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
    }

    C0100h(C0108i<T> iVar, Executor executor, Executor executor2, C0103a<T> aVar, C0106d dVar) {
        this.f199g = iVar;
        this.f195c = executor;
        this.f196d = executor2;
        this.f197e = aVar;
        this.f198f = dVar;
    }

    /* renamed from: a */
    public static <K, T> C0100h<T> m225a(C0083d<K, T> dVar, Executor executor, Executor executor2, C0103a<T> aVar, C0106d dVar2, K k) {
        int i;
        int i2;
        if (dVar.mo167a() || !dVar2.f221c) {
            if (!dVar.mo167a()) {
                dVar = ((C0113k) dVar).mo259d();
                if (k != null) {
                    i = ((Integer) k).intValue();
                    C0079c cVar = new C0079c((C0078b) dVar, executor, executor2, aVar, dVar2, k, i);
                    return cVar;
                }
            }
            i = -1;
            C0079c cVar2 = new C0079c((C0078b) dVar, executor, executor2, aVar, dVar2, k, i);
            return cVar2;
        }
        C0113k kVar = (C0113k) dVar;
        if (k != null) {
            i2 = ((Integer) k).intValue();
        } else {
            i2 = 0;
        }
        C0122m mVar = new C0122m(kVar, executor, executor2, aVar, dVar2, i2);
        return mVar;
    }
}
