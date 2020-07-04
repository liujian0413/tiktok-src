package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable;
import p346io.reactivex.internal.p353b.C7367g;

/* renamed from: io.reactivex.internal.operators.observable.ag */
public final class C7387ag<T> extends C7492s<T> implements C7367g<T> {

    /* renamed from: a */
    private final T f20488a;

    public final T call() {
        return this.f20488a;
    }

    public C7387ag(T t) {
        this.f20488a = t;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        ScalarDisposable scalarDisposable = new ScalarDisposable(yVar, this.f20488a);
        yVar.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
