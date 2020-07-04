package p346io.reactivex;

import java.util.concurrent.TimeUnit;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.internal.schedulers.C47812i;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.z */
public abstract class C7499z {

    /* renamed from: a */
    static final long f20849a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: io.reactivex.z$a */
    static final class C7500a implements C7321c, Runnable {

        /* renamed from: a */
        final Runnable f20850a;

        /* renamed from: b */
        final C7502c f20851b;

        /* renamed from: c */
        Thread f20852c;

        public final boolean isDisposed() {
            return this.f20851b.isDisposed();
        }

        public final void dispose() {
            if (this.f20852c != Thread.currentThread() || !(this.f20851b instanceof C47812i)) {
                this.f20851b.dispose();
            } else {
                ((C47812i) this.f20851b).mo119829a();
            }
        }

        public final void run() {
            this.f20852c = Thread.currentThread();
            try {
                this.f20850a.run();
            } finally {
                dispose();
                this.f20852c = null;
            }
        }

        C7500a(Runnable runnable, C7502c cVar) {
            this.f20850a = runnable;
            this.f20851b = cVar;
        }
    }

    /* renamed from: io.reactivex.z$b */
    static final class C7501b implements C7321c, Runnable {

        /* renamed from: a */
        final Runnable f20853a;

        /* renamed from: b */
        final C7502c f20854b;

        /* renamed from: c */
        volatile boolean f20855c;

        public final boolean isDisposed() {
            return this.f20855c;
        }

        public final void dispose() {
            this.f20855c = true;
            this.f20854b.dispose();
        }

        public final void run() {
            if (!this.f20855c) {
                try {
                    this.f20853a.run();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    this.f20854b.dispose();
                    throw C47836e.m148716a(th);
                }
            }
        }

        C7501b(Runnable runnable, C7502c cVar) {
            this.f20853a = runnable;
            this.f20854b = cVar;
        }
    }

    /* renamed from: io.reactivex.z$c */
    public static abstract class C7502c implements C7321c {

        /* renamed from: io.reactivex.z$c$a */
        final class C7503a implements Runnable {

            /* renamed from: a */
            final Runnable f20856a;

            /* renamed from: b */
            final SequentialDisposable f20857b;

            /* renamed from: c */
            final long f20858c;

            /* renamed from: d */
            long f20859d;

            /* renamed from: e */
            long f20860e;

            /* renamed from: f */
            long f20861f;

            public final void run() {
                long j;
                this.f20856a.run();
                if (!this.f20857b.isDisposed()) {
                    long a = C7502c.m23376a(TimeUnit.NANOSECONDS);
                    if (C7499z.f20849a + a < this.f20860e || a >= this.f20860e + this.f20858c + C7499z.f20849a) {
                        j = this.f20858c + a;
                        long j2 = this.f20858c;
                        long j3 = this.f20859d + 1;
                        this.f20859d = j3;
                        this.f20861f = j - (j2 * j3);
                    } else {
                        long j4 = this.f20861f;
                        long j5 = this.f20859d + 1;
                        this.f20859d = j5;
                        j = j4 + (j5 * this.f20858c);
                    }
                    this.f20860e = a;
                    this.f20857b.replace(C7502c.this.mo19344a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }

            C7503a(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.f20856a = runnable;
                this.f20857b = sequentialDisposable;
                this.f20858c = j3;
                this.f20860e = j2;
                this.f20861f = j;
            }
        }

        /* renamed from: a */
        public abstract C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public static long m23376a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public C7321c mo19342a(Runnable runnable) {
            return mo19344a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public final C7321c mo19343a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable a = C7332a.m23025a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = m23376a(TimeUnit.NANOSECONDS);
            C7503a aVar = new C7503a(a2 + timeUnit2.toNanos(j3), a, a2, sequentialDisposable2, nanos);
            C7321c a3 = mo19344a(aVar, j3, timeUnit2);
            if (a3 == EmptyDisposable.INSTANCE) {
                return a3;
            }
            sequentialDisposable.replace(a3);
            return sequentialDisposable2;
        }
    }

    /* renamed from: a */
    public abstract C7502c mo19338a();

    /* renamed from: b */
    public void mo19339b() {
    }

    /* renamed from: a */
    public C7321c mo19335a(Runnable runnable) {
        return mo19337a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        C7502c a = mo19338a();
        C7500a aVar = new C7500a(C7332a.m23025a(runnable), a);
        a.mo19344a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public C7321c mo19336a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C7502c a = mo19338a();
        C7501b bVar = new C7501b(C7332a.m23025a(runnable), a);
        C7321c a2 = a.mo19343a(bVar, j, j2, timeUnit);
        if (a2 == EmptyDisposable.INSTANCE) {
            return a2;
        }
        return bVar;
    }
}
