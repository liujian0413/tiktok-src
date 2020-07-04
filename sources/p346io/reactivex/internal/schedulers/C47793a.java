package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.schedulers.a */
abstract class C47793a extends AtomicReference<Future<?>> implements C7321c {
    protected static final FutureTask<Void> DISPOSED = new FutureTask<>(C7342a.f20428b, null);
    protected static final FutureTask<Void> FINISHED = new FutureTask<>(C7342a.f20428b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == FINISHED || future == DISPOSED) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        boolean z;
        Future future = (Future) get();
        if (future != FINISHED && future != DISPOSED && compareAndSet(future, DISPOSED) && future != null) {
            if (this.runner != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    C47793a(Runnable runnable2) {
        this.runnable = runnable2;
    }

    public final void setFuture(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 == FINISHED) {
                break;
            } else if (future2 == DISPOSED) {
                if (this.runner != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
