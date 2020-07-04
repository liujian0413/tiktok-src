package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.schedulers.m */
public final class C47818m extends C7499z {

    /* renamed from: d */
    static final RxThreadFactory f122584d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f122585e;

    /* renamed from: b */
    final ThreadFactory f122586b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f122587c;

    /* renamed from: io.reactivex.internal.schedulers.m$a */
    static final class C47819a extends C7502c {

        /* renamed from: a */
        final ScheduledExecutorService f122588a;

        /* renamed from: b */
        final C47562b f122589b = new C47562b();

        /* renamed from: c */
        volatile boolean f122590c;

        public final boolean isDisposed() {
            return this.f122590c;
        }

        public final void dispose() {
            if (!this.f122590c) {
                this.f122590c = true;
                this.f122589b.dispose();
            }
        }

        C47819a(ScheduledExecutorService scheduledExecutorService) {
            this.f122588a = scheduledExecutorService;
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f122590c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C7332a.m23025a(runnable), this.f122589b);
            this.f122589b.mo119661a((C7321c) scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f122588a.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C7332a.m23029a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f122588a.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }
    }

    public C47818m() {
        this(f122584d);
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47819a((ScheduledExecutorService) this.f122587c.get());
    }

    static {
        ScheduledExecutorService a = C47820n.m148688a(0);
        f122585e = a;
        a.shutdown();
    }

    /* renamed from: b */
    public final void mo19339b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.f122587c.get();
            if (scheduledExecutorService != f122585e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m148682a(this.f122586b);
            }
        } while (!this.f122587c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    private static ScheduledExecutorService m148682a(ThreadFactory threadFactory) {
        return C47814k.m148676a(threadFactory);
    }

    private C47818m(ThreadFactory threadFactory) {
        this.f122587c = new AtomicReference<>();
        this.f122586b = threadFactory;
        this.f122587c.lazySet(m148682a(threadFactory));
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(C7332a.m23025a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f122587c.get()).submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C7332a.m23029a((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f122587c.get()).schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: a */
    public final C7321c mo19336a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C7332a.m23025a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f122587c.get();
            C47805e eVar = new C47805e(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C7332a.m23029a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo119822a(future);
            return eVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(a);
        try {
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.f122587c.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            C7332a.m23029a((Throwable) e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
