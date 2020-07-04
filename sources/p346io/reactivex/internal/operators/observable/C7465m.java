package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.observers.C47611d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: io.reactivex.internal.operators.observable.m */
public final class C7465m<T> extends C7376a<T, T> {

    /* renamed from: b */
    private final C7326g<? super C7321c> f20770b;

    /* renamed from: c */
    private final C7323a f20771c;

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C47611d(yVar, this.f20770b, this.f20771c));
    }

    public C7465m(C7492s<T> sVar, C7326g<? super C7321c> gVar, C7323a aVar) {
        super(sVar);
        this.f20770b = gVar;
        this.f20771c = aVar;
    }
}
