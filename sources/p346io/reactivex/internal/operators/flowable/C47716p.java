package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.p353b.C7367g;
import p346io.reactivex.internal.subscriptions.ScalarSubscription;

/* renamed from: io.reactivex.internal.operators.flowable.p */
public final class C47716p<T> extends C7329e<T> implements C7367g<T> {

    /* renamed from: a */
    private final T f122322a;

    public final T call() {
        return this.f122322a;
    }

    public C47716p(T t) {
        this.f122322a = t;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        cVar.onSubscribe(new ScalarSubscription(cVar, this.f122322a));
    }
}
