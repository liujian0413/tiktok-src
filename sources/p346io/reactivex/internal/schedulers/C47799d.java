package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.internal.queue.C47789a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: io.reactivex.internal.schedulers.d */
public final class C47799d extends C7499z {

    /* renamed from: c */
    static final C7499z f122534c = C7333a.m23047e();

    /* renamed from: b */
    final Executor f122535b;

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    final class C47800a implements Runnable {

        /* renamed from: b */
        private final C47801b f122537b;

        public final void run() {
            this.f122537b.f122539b.replace(C47799d.this.mo19335a(this.f122537b));
        }

        C47800a(C47801b bVar) {
            this.f122537b = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    static final class C47801b extends AtomicReference<Runnable> implements C7321c, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: a */
        final SequentialDisposable f122538a = new SequentialDisposable();

        /* renamed from: b */
        final SequentialDisposable f122539b = new SequentialDisposable();

        public final boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            if (getAndSet(null) != null) {
                this.f122538a.dispose();
                this.f122539b.dispose();
            }
        }

        public final void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f122538a.lazySet(DisposableHelper.DISPOSED);
                    this.f122539b.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        C47801b(Runnable runnable) {
            super(runnable);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    public static final class C47802c extends C7502c implements Runnable {

        /* renamed from: a */
        final Executor f122540a;

        /* renamed from: b */
        final C47789a<Runnable> f122541b;

        /* renamed from: c */
        volatile boolean f122542c;

        /* renamed from: d */
        final AtomicInteger f122543d = new AtomicInteger();

        /* renamed from: e */
        final C47562b f122544e = new C47562b();

        /* renamed from: io.reactivex.internal.schedulers.d$c$a */
        static final class C47803a extends AtomicBoolean implements C7321c, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: a */
            final Runnable f122545a;

            public final void dispose() {
                lazySet(true);
            }

            public final boolean isDisposed() {
                return get();
            }

            public final void run() {
                if (!get()) {
                    try {
                        this.f122545a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            C47803a(Runnable runnable) {
                this.f122545a = runnable;
            }
        }

        /* renamed from: io.reactivex.internal.schedulers.d$c$b */
        final class C47804b implements Runnable {

            /* renamed from: b */
            private final SequentialDisposable f122547b;

            /* renamed from: c */
            private final Runnable f122548c;

            public final void run() {
                this.f122547b.replace(C47802c.this.mo19342a(this.f122548c));
            }

            C47804b(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f122547b = sequentialDisposable;
                this.f122548c = runnable;
            }
        }

        public final boolean isDisposed() {
            return this.f122542c;
        }

        public final void dispose() {
            if (!this.f122542c) {
                this.f122542c = true;
                this.f122544e.dispose();
                if (this.f122543d.getAndIncrement() == 0) {
                    this.f122541b.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            if (r3.f122542c == false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            r1 = r3.f122543d.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                io.reactivex.internal.queue.a<java.lang.Runnable> r0 = r3.f122541b
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f122542c
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 == 0) goto L_0x001e
                r2.run()
                boolean r2 = r3.f122542c
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x001e:
                boolean r2 = r3.f122542c
                if (r2 == 0) goto L_0x0026
                r0.clear()
                return
            L_0x0026:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f122543d
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.schedulers.C47799d.C47802c.run():void");
        }

        public C47802c(Executor executor) {
            this.f122540a = executor;
            this.f122541b = new C47789a<>();
        }

        /* renamed from: a */
        public final C7321c mo19342a(Runnable runnable) {
            if (this.f122542c) {
                return EmptyDisposable.INSTANCE;
            }
            C47803a aVar = new C47803a(C7332a.m23025a(runnable));
            this.f122541b.offer(aVar);
            if (this.f122543d.getAndIncrement() == 0) {
                try {
                    this.f122540a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f122542c = true;
                    this.f122541b.clear();
                    C7332a.m23029a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo19342a(runnable);
            }
            if (this.f122542c) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new C47804b(sequentialDisposable2, C7332a.m23025a(runnable)), this.f122544e);
            this.f122544e.mo119661a((C7321c) scheduledRunnable);
            if (this.f122540a instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) this.f122540a).schedule(scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f122542c = true;
                    C7332a.m23029a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new C47798c(C47799d.f122534c.mo19337a(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47802c(this.f122535b);
    }

    public C47799d(Executor executor) {
        this.f122535b = executor;
    }

    /* renamed from: a */
    public final C7321c mo19335a(Runnable runnable) {
        Runnable a = C7332a.m23025a(runnable);
        try {
            if (this.f122535b instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(a);
                scheduledDirectTask.setFuture(((ExecutorService) this.f122535b).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            C47803a aVar = new C47803a(a);
            this.f122535b.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            C7332a.m23029a((Throwable) e);
            return EmptyDisposable.INSTANCE;
        }
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C7332a.m23025a(runnable);
        if (this.f122535b instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(a);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.f122535b).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                C7332a.m23029a((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            C47801b bVar = new C47801b(a);
            bVar.f122538a.replace(f122534c.mo19337a(new C47800a(bVar), j, timeUnit));
            return bVar;
        }
    }

    /* renamed from: a */
    public final C7321c mo19336a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f122535b instanceof ScheduledExecutorService)) {
            return super.mo19336a(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(C7332a.m23025a(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.f122535b).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            C7332a.m23029a((Throwable) e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
