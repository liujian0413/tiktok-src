package p346io.reactivex.internal.subscribers;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.subscribers.DeferredScalarSubscriber */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements C47597i<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected C48294d upstream;

    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public DeferredScalarSubscriber(C48293c<? super R> cVar) {
        super(cVar);
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
