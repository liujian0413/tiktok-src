package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import org.p361a.C48293c;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.l */
public final class C47712l<T> extends C7329e<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f122313a;

    public final T call() throws Exception {
        return C7364b.m23081a(this.f122313a.call(), "The callable returned a null value");
    }

    public C47712l(Callable<? extends T> callable) {
        this.f122313a = callable;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(C7364b.m23081a(this.f122313a.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            if (deferredScalarSubscription.isCancelled()) {
                C7332a.m23029a(th);
            } else {
                cVar.onError(th);
            }
        }
    }
}
