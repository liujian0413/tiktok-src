package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p346io.reactivex.internal.disposables.C47605a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.schedulers.ScheduledRunnable */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements C7321c, Runnable, Callable<Object> {
    static final Object ASYNC_DISPOSED = new Object();
    static final Object DONE = new Object();
    static final Object PARENT_DISPOSED = new Object();
    static final Object SYNC_DISPOSED = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    public final Object call() {
        run();
        return null;
    }

    public final boolean isDisposed() {
        Object obj = get(0);
        if (obj == PARENT_DISPOSED || obj == DONE) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = DONE
            r3 = 0
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = SYNC_DISPOSED
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = ASYNC_DISPOSED
            if (r1 == r2) goto L_0x0034
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r4 = ASYNC_DISPOSED
            goto L_0x0027
        L_0x0025:
            java.lang.Object r4 = SYNC_DISPOSED
        L_0x0027:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0034
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0034:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = DONE
            if (r0 == r1) goto L_0x0051
            java.lang.Object r1 = PARENT_DISPOSED
            if (r0 == r1) goto L_0x0051
            if (r0 != 0) goto L_0x0043
            goto L_0x0051
        L_0x0043:
            java.lang.Object r1 = PARENT_DISPOSED
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0034
            io.reactivex.internal.disposables.a r0 = (p346io.reactivex.internal.disposables.C47605a) r0
            r0.mo119664c(r5)
            return
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.schedulers.ScheduledRunnable.dispose():void");
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == PARENT_DISPOSED || !compareAndSet(0, obj3, DONE) || obj3 == null)) {
                ((C47605a) obj3).mo119664c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == SYNC_DISPOSED || obj2 == ASYNC_DISPOSED) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, DONE));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == PARENT_DISPOSED || !compareAndSet(0, obj4, DONE) || obj4 == null)) {
            ((C47605a) obj4).mo119664c(this);
        }
        do {
            obj = get(1);
            if (obj == SYNC_DISPOSED || obj == ASYNC_DISPOSED) {
                return;
            }
        } while (!compareAndSet(1, obj, DONE));
    }

    public final void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != DONE) {
                if (obj == SYNC_DISPOSED) {
                    future.cancel(false);
                    return;
                } else if (obj == ASYNC_DISPOSED) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public ScheduledRunnable(Runnable runnable, C47605a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }
}
