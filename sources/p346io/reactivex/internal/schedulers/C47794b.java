package p346io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.C47606b;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.schedulers.b */
public final class C47794b extends C7499z {

    /* renamed from: b */
    static final C47796b f122519b;

    /* renamed from: c */
    static final RxThreadFactory f122520c = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: d */
    static final int f122521d = m148642a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e */
    static final C47797c f122522e;

    /* renamed from: f */
    final ThreadFactory f122523f;

    /* renamed from: g */
    final AtomicReference<C47796b> f122524g;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    static final class C47795a extends C7502c {

        /* renamed from: a */
        volatile boolean f122525a;

        /* renamed from: b */
        private final C47606b f122526b = new C47606b();

        /* renamed from: c */
        private final C47562b f122527c = new C47562b();

        /* renamed from: d */
        private final C47606b f122528d = new C47606b();

        /* renamed from: e */
        private final C47797c f122529e;

        public final boolean isDisposed() {
            return this.f122525a;
        }

        public final void dispose() {
            if (!this.f122525a) {
                this.f122525a = true;
                this.f122528d.dispose();
            }
        }

        /* renamed from: a */
        public final C7321c mo19342a(Runnable runnable) {
            if (this.f122525a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f122529e.mo119828a(runnable, 0, TimeUnit.MILLISECONDS, this.f122526b);
        }

        C47795a(C47797c cVar) {
            this.f122529e = cVar;
            this.f122528d.mo119661a((C7321c) this.f122526b);
            this.f122528d.mo119661a((C7321c) this.f122527c);
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f122525a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f122529e.mo119828a(runnable, j, timeUnit, this.f122527c);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$b */
    static final class C47796b {

        /* renamed from: a */
        final int f122530a;

        /* renamed from: b */
        final C47797c[] f122531b;

        /* renamed from: c */
        long f122532c;

        /* renamed from: b */
        public final void mo119811b() {
            for (C47797c dispose : this.f122531b) {
                dispose.dispose();
            }
        }

        /* renamed from: a */
        public final C47797c mo119810a() {
            int i = this.f122530a;
            if (i == 0) {
                return C47794b.f122522e;
            }
            C47797c[] cVarArr = this.f122531b;
            long j = this.f122532c;
            this.f122532c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        C47796b(int i, ThreadFactory threadFactory) {
            this.f122530a = i;
            this.f122531b = new C47797c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f122531b[i2] = new C47797c(threadFactory);
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$c */
    static final class C47797c extends C47812i {
        C47797c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    /* renamed from: a */
    private static int m148642a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    public C47794b() {
        this(f122520c);
    }

    /* renamed from: b */
    public final void mo19339b() {
        C47796b bVar = new C47796b(f122521d, this.f122523f);
        if (!this.f122524g.compareAndSet(f122519b, bVar)) {
            bVar.mo119811b();
        }
    }

    static {
        C47797c cVar = new C47797c(new RxThreadFactory("RxComputationShutdown"));
        f122522e = cVar;
        cVar.dispose();
        C47796b bVar = new C47796b(0, f122520c);
        f122519b = bVar;
        bVar.mo119811b();
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47795a(((C47796b) this.f122524g.get()).mo119810a());
    }

    private C47794b(ThreadFactory threadFactory) {
        this.f122523f = threadFactory;
        this.f122524g = new AtomicReference<>(f122519b);
        mo19339b();
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C47796b) this.f122524g.get()).mo119810a().mo119831b(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public final C7321c mo19336a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C47796b) this.f122524g.get()).mo119810a().mo119830b(runnable, j, j2, timeUnit);
    }
}
