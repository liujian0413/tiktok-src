package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.subscribers.SubscriberResourceWrapper */
public final class SubscriberResourceWrapper<T> extends AtomicReference<C7321c> implements C7321c, C47597i<T>, C48294d {
    private static final long serialVersionUID = -8612022020200669122L;
    final C48293c<? super T> downstream;
    final AtomicReference<C48294d> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    public final boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    public final void setResource(C7321c cVar) {
        DisposableHelper.set(this, cVar);
    }

    public final void onNext(T t) {
        this.downstream.onNext(t);
    }

    public SubscriberResourceWrapper(C48293c<? super T> cVar) {
        this.downstream = cVar;
    }

    public final void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            ((C48294d) this.upstream.get()).request(j);
        }
    }
}
