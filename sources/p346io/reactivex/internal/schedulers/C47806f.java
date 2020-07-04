package p346io.reactivex.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.schedulers.f */
public final class C47806f extends C7499z {

    /* renamed from: b */
    static final RxThreadFactory f122555b;

    /* renamed from: c */
    static final RxThreadFactory f122556c;

    /* renamed from: d */
    static final C47809c f122557d;

    /* renamed from: g */
    static final C47807a f122558g;

    /* renamed from: h */
    private static final long f122559h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: i */
    private static final TimeUnit f122560i = TimeUnit.SECONDS;

    /* renamed from: e */
    final ThreadFactory f122561e;

    /* renamed from: f */
    final AtomicReference<C47807a> f122562f;

    /* renamed from: io.reactivex.internal.schedulers.f$a */
    static final class C47807a implements Runnable {

        /* renamed from: a */
        final C47562b f122563a;

        /* renamed from: b */
        private final long f122564b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C47809c> f122565c;

        /* renamed from: d */
        private final ScheduledExecutorService f122566d;

        /* renamed from: e */
        private final Future<?> f122567e;

        /* renamed from: f */
        private final ThreadFactory f122568f;

        public final void run() {
            m148662c();
        }

        /* renamed from: d */
        private static long m148663d() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo119826b() {
            this.f122563a.dispose();
            if (this.f122567e != null) {
                this.f122567e.cancel(true);
            }
            if (this.f122566d != null) {
                this.f122566d.shutdownNow();
            }
        }

        /* renamed from: c */
        private void m148662c() {
            if (!this.f122565c.isEmpty()) {
                long d = m148663d();
                Iterator it = this.f122565c.iterator();
                while (it.hasNext()) {
                    C47809c cVar = (C47809c) it.next();
                    if (cVar.f122573a > d) {
                        return;
                    }
                    if (this.f122565c.remove(cVar)) {
                        this.f122563a.mo119663b(cVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C47809c mo119824a() {
            if (this.f122563a.isDisposed()) {
                return C47806f.f122557d;
            }
            while (!this.f122565c.isEmpty()) {
                C47809c cVar = (C47809c) this.f122565c.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C47809c cVar2 = new C47809c(this.f122568f);
            this.f122563a.mo119661a((C7321c) cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119825a(C47809c cVar) {
            cVar.f122573a = m148663d() + this.f122564b;
            this.f122565c.offer(cVar);
        }

        C47807a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            Future<?> future;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            this.f122564b = j2;
            this.f122565c = new ConcurrentLinkedQueue<>();
            this.f122563a = new C47562b();
            this.f122568f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = C47810g.m148668a(1, C47806f.f122556c);
                future = scheduledExecutorService.scheduleWithFixedDelay(this, this.f122564b, this.f122564b, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f122566d = scheduledExecutorService;
            this.f122567e = future;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.f$b */
    static final class C47808b extends C7502c {

        /* renamed from: a */
        final AtomicBoolean f122569a = new AtomicBoolean();

        /* renamed from: b */
        private final C47562b f122570b;

        /* renamed from: c */
        private final C47807a f122571c;

        /* renamed from: d */
        private final C47809c f122572d;

        public final boolean isDisposed() {
            return this.f122569a.get();
        }

        public final void dispose() {
            if (this.f122569a.compareAndSet(false, true)) {
                this.f122570b.dispose();
                this.f122571c.mo119825a(this.f122572d);
            }
        }

        C47808b(C47807a aVar) {
            this.f122571c = aVar;
            this.f122570b = new C47562b();
            this.f122572d = aVar.mo119824a();
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f122570b.isDisposed()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f122572d.mo119828a(runnable, j, timeUnit, this.f122570b);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.f$c */
    static final class C47809c extends C47812i {

        /* renamed from: a */
        public long f122573a;

        C47809c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public C47806f() {
        this(f122555b);
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47808b((C47807a) this.f122562f.get());
    }

    /* renamed from: b */
    public final void mo19339b() {
        C47807a aVar = new C47807a(f122559h, f122560i, this.f122561e);
        if (!this.f122562f.compareAndSet(f122558g, aVar)) {
            aVar.mo119826b();
        }
    }

    static {
        C47809c cVar = new C47809c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f122557d = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f122555b = new RxThreadFactory("RxCachedThreadScheduler", max);
        f122556c = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        C47807a aVar = new C47807a(0, null, f122555b);
        f122558g = aVar;
        aVar.mo119826b();
    }

    private C47806f(ThreadFactory threadFactory) {
        this.f122561e = threadFactory;
        this.f122562f = new AtomicReference<>(f122558g);
        mo19339b();
    }
}
