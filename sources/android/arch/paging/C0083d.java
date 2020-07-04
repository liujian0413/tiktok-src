package android.arch.paging;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.paging.d */
public abstract class C0083d<Key, Value> {

    /* renamed from: a */
    private AtomicBoolean f151a = new AtomicBoolean(false);

    /* renamed from: b */
    private CopyOnWriteArrayList<C0085b> f152b = new CopyOnWriteArrayList<>();

    /* renamed from: android.arch.paging.d$a */
    public static abstract class C0084a<Key, Value> {
        /* renamed from: a */
        public abstract C0083d<Key, Value> mo186a();
    }

    /* renamed from: android.arch.paging.d$b */
    public interface C0085b {
        /* renamed from: g_ */
        void mo187g_();
    }

    /* renamed from: android.arch.paging.d$c */
    static class C0086c<T> {

        /* renamed from: a */
        final int f153a;

        /* renamed from: b */
        public final C0099a<T> f154b;

        /* renamed from: c */
        private final C0083d f155c;

        /* renamed from: d */
        private final Object f156d = new Object();

        /* renamed from: e */
        private Executor f157e = null;

        /* renamed from: f */
        private boolean f158f = false;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo190a() {
            if (!this.f155c.mo185c()) {
                return false;
            }
            mo188a(C0098g.m222a());
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo189a(Executor executor) {
            synchronized (this.f156d) {
                this.f157e = executor;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo188a(final C0098g<T> gVar) {
            Executor executor;
            synchronized (this.f156d) {
                if (!this.f158f) {
                    this.f158f = true;
                    executor = this.f157e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C0086c.this.f154b.mo179a(C0086c.this.f153a, gVar);
                    }
                });
            } else {
                this.f154b.mo179a(this.f153a, gVar);
            }
        }

        C0086c(C0083d dVar, int i, Executor executor, C0099a<T> aVar) {
            this.f155c = dVar;
            this.f153a = i;
            this.f157e = executor;
            this.f154b = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo167a();

    /* renamed from: c */
    public boolean mo185c() {
        return this.f151a.get();
    }

    C0083d() {
    }

    /* renamed from: b */
    public void mo183b() {
        if (this.f151a.compareAndSet(false, true)) {
            Iterator it = this.f152b.iterator();
            while (it.hasNext()) {
                ((C0085b) it.next()).mo187g_();
            }
        }
    }

    /* renamed from: a */
    public void mo182a(C0085b bVar) {
        this.f152b.add(bVar);
    }

    /* renamed from: b */
    public void mo184b(C0085b bVar) {
        this.f152b.remove(bVar);
    }
}
