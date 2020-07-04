package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p347b.C47563d;

/* renamed from: io.reactivex.internal.operators.b.k */
public final class C47641k<T> extends C7319aa<T> {

    /* renamed from: a */
    final T f122114a;

    public C47641k(T t) {
        this.f122114a = t;
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        adVar.onSubscribe(C47563d.m148351b());
        adVar.onSuccess(this.f122114a);
    }
}
