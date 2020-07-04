package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.flowable.w */
public final class C47730w<T> extends C7368a<T, T> {

    /* renamed from: c */
    final C7327h<? super Throwable, ? extends T> f122371c;

    /* renamed from: io.reactivex.internal.operators.flowable.w$a */
    static final class C47731a<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* renamed from: a */
        final C7327h<? super Throwable, ? extends T> f122372a;

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                complete(C7364b.m23081a(this.f122372a.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        C47731a(C48293c<? super T> cVar, C7327h<? super Throwable, ? extends T> hVar) {
            super(cVar);
            this.f122372a = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C47731a<Object>(cVar, this.f122371c));
    }

    public C47730w(C7329e<T> eVar, C7327h<? super Throwable, ? extends T> hVar) {
        super(eVar);
        this.f122371c = hVar;
    }
}
