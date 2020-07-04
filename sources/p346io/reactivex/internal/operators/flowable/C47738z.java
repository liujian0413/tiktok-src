package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import org.p361a.C48294d;
import org.p361a.C7704b;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.p1869g.C47581a;
import p346io.reactivex.p1869g.C47585d;
import p346io.reactivex.p1873k.C47853b;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.flowable.z */
public final class C47738z<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7327h<? super C7329e<Throwable>, ? extends C7704b<?>> f122390c;

    /* renamed from: io.reactivex.internal.operators.flowable.z$a */
    static final class C47739a<T> extends C47735c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public final void onComplete() {
            this.f122380c.cancel();
            this.f122378a.onComplete();
        }

        public final void onError(Throwable th) {
            mo119765a(th);
        }

        C47739a(C48293c<? super T> cVar, C47581a<Throwable> aVar, C48294d dVar) {
            super(cVar, aVar, dVar);
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        C47853b bVar = new C47853b(cVar);
        C47581a g = C47585d.m148377b(8).mo119676g();
        try {
            C7704b bVar2 = (C7704b) C7364b.m23081a(this.f122390c.apply(g), "handler returned a null Publisher");
            C47734b bVar3 = new C47734b(this.f20450a);
            C47739a aVar = new C47739a(bVar, g, bVar3);
            bVar3.f122377d = aVar;
            cVar.onSubscribe(aVar);
            bVar2.mo19155a(bVar3);
            bVar3.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptySubscription.error(th, cVar);
        }
    }

    public C47738z(C7329e<T> eVar, C7327h<? super C7329e<Throwable>, ? extends C7704b<?>> hVar) {
        super(eVar);
        this.f122390c = hVar;
    }
}
