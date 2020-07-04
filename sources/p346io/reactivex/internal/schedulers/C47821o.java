package p346io.reactivex.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.schedulers.o */
public final class C47821o extends C7499z {

    /* renamed from: b */
    private static final C47821o f122591b = new C47821o();

    /* renamed from: io.reactivex.internal.schedulers.o$a */
    static final class C47822a implements Runnable {

        /* renamed from: a */
        private final Runnable f122592a;

        /* renamed from: b */
        private final C47824c f122593b;

        /* renamed from: c */
        private final long f122594c;

        public final void run() {
            if (!this.f122593b.f122601c) {
                long a = C47824c.m23376a(TimeUnit.MILLISECONDS);
                if (this.f122594c > a) {
                    try {
                        Thread.sleep(this.f122594c - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C7332a.m23029a((Throwable) e);
                        return;
                    }
                }
                if (!this.f122593b.f122601c) {
                    this.f122592a.run();
                }
            }
        }

        C47822a(Runnable runnable, C47824c cVar, long j) {
            this.f122592a = runnable;
            this.f122593b = cVar;
            this.f122594c = j;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.o$b */
    static final class C47823b implements Comparable<C47823b> {

        /* renamed from: a */
        final Runnable f122595a;

        /* renamed from: b */
        final long f122596b;

        /* renamed from: c */
        final int f122597c;

        /* renamed from: d */
        volatile boolean f122598d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C47823b bVar) {
            int a = C7364b.m23079a(this.f122596b, bVar.f122596b);
            if (a == 0) {
                return C7364b.m23077a(this.f122597c, bVar.f122597c);
            }
            return a;
        }

        C47823b(Runnable runnable, Long l, int i) {
            this.f122595a = runnable;
            this.f122596b = l.longValue();
            this.f122597c = i;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.o$c */
    static final class C47824c extends C7502c implements C7321c {

        /* renamed from: a */
        final PriorityBlockingQueue<C47823b> f122599a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f122600b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f122601c;

        /* renamed from: d */
        private final AtomicInteger f122602d = new AtomicInteger();

        /* renamed from: io.reactivex.internal.schedulers.o$c$a */
        final class C47825a implements Runnable {

            /* renamed from: a */
            final C47823b f122603a;

            public final void run() {
                this.f122603a.f122598d = true;
                C47824c.this.f122599a.remove(this.f122603a);
            }

            C47825a(C47823b bVar) {
                this.f122603a = bVar;
            }
        }

        public final void dispose() {
            this.f122601c = true;
        }

        public final boolean isDisposed() {
            return this.f122601c;
        }

        C47824c() {
        }

        /* renamed from: a */
        public final C7321c mo19342a(Runnable runnable) {
            return m148694a(runnable, m23376a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        private C7321c m148694a(Runnable runnable, long j) {
            if (this.f122601c) {
                return EmptyDisposable.INSTANCE;
            }
            C47823b bVar = new C47823b(runnable, Long.valueOf(j), this.f122600b.incrementAndGet());
            this.f122599a.add(bVar);
            if (this.f122602d.getAndIncrement() != 0) {
                return C47563d.m148350a((Runnable) new C47825a(bVar));
            }
            int i = 1;
            while (!this.f122601c) {
                C47823b bVar2 = (C47823b) this.f122599a.poll();
                if (bVar2 == null) {
                    i = this.f122602d.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVar2.f122598d) {
                    bVar2.f122595a.run();
                }
            }
            this.f122599a.clear();
            return EmptyDisposable.INSTANCE;
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = m23376a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m148694a(new C47822a(runnable, this, a), a);
        }
    }

    C47821o() {
    }

    /* renamed from: c */
    public static C47821o m148689c() {
        return f122591b;
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47824c();
    }

    /* renamed from: a */
    public final C7321c mo19335a(Runnable runnable) {
        C7332a.m23025a(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C7332a.m23025a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C7332a.m23029a((Throwable) e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
