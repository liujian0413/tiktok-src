package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.C47605a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.schedulers.i */
public class C47812i extends C7502c implements C7321c {

    /* renamed from: a */
    private final ScheduledExecutorService f122576a;

    /* renamed from: b */
    volatile boolean f122577b;

    public boolean isDisposed() {
        return this.f122577b;
    }

    /* renamed from: a */
    public final void mo119829a() {
        if (!this.f122577b) {
            this.f122577b = true;
            this.f122576a.shutdown();
        }
    }

    public void dispose() {
        if (!this.f122577b) {
            this.f122577b = true;
            this.f122576a.shutdownNow();
        }
    }

    /* renamed from: a */
    public final C7321c mo19342a(Runnable runnable) {
        return mo19344a(runnable, 0, null);
    }

    public C47812i(ThreadFactory threadFactory) {
        this.f122576a = C47814k.m148676a(threadFactory);
    }

    /* renamed from: a */
    public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f122577b) {
            return EmptyDisposable.INSTANCE;
        }
        return mo119828a(runnable, j, timeUnit, null);
    }

    /* renamed from: b */
    public final C7321c mo119831b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(C7332a.m23025a(runnable));
        if (j <= 0) {
            try {
                future = this.f122576a.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                C7332a.m23029a((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f122576a.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: a */
    public final ScheduledRunnable mo119828a(Runnable runnable, long j, TimeUnit timeUnit, C47605a aVar) {
        Future future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C7332a.m23025a(runnable), aVar);
        if (aVar != null && !aVar.mo119661a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.f122576a.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo119663b(scheduledRunnable);
                }
                C7332a.m23029a((Throwable) e);
            }
        } else {
            future = this.f122576a.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.setFuture(future);
        return scheduledRunnable;
    }

    /* renamed from: b */
    public final C7321c mo119830b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C7332a.m23025a(runnable);
        if (j2 <= 0) {
            C47805e eVar = new C47805e(a, this.f122576a);
            if (j <= 0) {
                try {
                    future = this.f122576a.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C7332a.m23029a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f122576a.schedule(eVar, j, timeUnit);
            }
            eVar.mo119822a(future);
            return eVar;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(a);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f122576a.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            C7332a.m23029a((Throwable) e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
