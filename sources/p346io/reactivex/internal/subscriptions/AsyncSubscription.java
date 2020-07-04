package p346io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.subscriptions.AsyncSubscription */
public final class AsyncSubscription extends AtomicLong implements C7321c, C48294d {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<C48294d> actual;
    final AtomicReference<C7321c> resource;

    public final void cancel() {
        dispose();
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    public final boolean isDisposed() {
        if (this.actual.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    public final boolean replaceResource(C7321c cVar) {
        return DisposableHelper.replace(this.resource, cVar);
    }

    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    public final boolean setResource(C7321c cVar) {
        return DisposableHelper.set(this.resource, cVar);
    }

    public final void setSubscription(C48294d dVar) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, dVar);
    }

    public AsyncSubscription(C7321c cVar) {
        this();
        this.resource.lazySet(cVar);
    }
}
