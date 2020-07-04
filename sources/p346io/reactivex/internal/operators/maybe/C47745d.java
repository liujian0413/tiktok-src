package p346io.reactivex.internal.operators.maybe;

import p346io.reactivex.C47856n;
import p346io.reactivex.C7490k;
import p346io.reactivex.internal.p353b.C7367g;
import p346io.reactivex.p347b.C47563d;

/* renamed from: io.reactivex.internal.operators.maybe.d */
public final class C47745d<T> extends C7490k<T> implements C7367g<T> {

    /* renamed from: a */
    final T f122399a;

    public final T call() {
        return this.f122399a;
    }

    public C47745d(T t) {
        this.f122399a = t;
    }

    /* renamed from: a */
    public final void mo10198a(C47856n<? super T> nVar) {
        nVar.onSubscribe(C47563d.m148351b());
        nVar.onSuccess(this.f122399a);
    }
}
