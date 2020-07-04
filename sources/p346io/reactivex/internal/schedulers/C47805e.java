package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.schedulers.e */
final class C47805e implements C7321c, Callable<Void> {

    /* renamed from: f */
    static final FutureTask<Void> f122549f = new FutureTask<>(C7342a.f20428b, null);

    /* renamed from: a */
    final Runnable f122550a;

    /* renamed from: b */
    final AtomicReference<Future<?>> f122551b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<Future<?>> f122552c = new AtomicReference<>();

    /* renamed from: d */
    final ExecutorService f122553d;

    /* renamed from: e */
    Thread f122554e;

    public final boolean isDisposed() {
        if (this.f122552c.get() == f122549f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() throws Exception {
        this.f122554e = Thread.currentThread();
        try {
            this.f122550a.run();
            m148658b(this.f122553d.submit(this));
            this.f122554e = null;
        } catch (Throwable th) {
            this.f122554e = null;
            C7332a.m23029a(th);
        }
        return null;
    }

    public final void dispose() {
        boolean z;
        Future future = (Future) this.f122552c.getAndSet(f122549f);
        boolean z2 = false;
        if (!(future == null || future == f122549f)) {
            if (this.f122554e != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
        Future future2 = (Future) this.f122551b.getAndSet(f122549f);
        if (future2 != null && future2 != f122549f) {
            if (this.f122554e != Thread.currentThread()) {
                z2 = true;
            }
            future2.cancel(z2);
        }
    }

    /* renamed from: b */
    private void m148658b(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f122551b.get();
            if (future2 == f122549f) {
                if (this.f122554e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f122551b.compareAndSet(future2, future));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119822a(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) this.f122552c.get();
            if (future2 == f122549f) {
                if (this.f122554e != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!this.f122552c.compareAndSet(future2, future));
    }

    C47805e(Runnable runnable, ExecutorService executorService) {
        this.f122550a = runnable;
        this.f122553d = executorService;
    }
}
