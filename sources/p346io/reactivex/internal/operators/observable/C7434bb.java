package p346io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.p353b.C7366c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.bb */
public final class C7434bb<T, U extends Collection<? super T>> extends C7319aa<U> implements C7366c<U> {

    /* renamed from: a */
    final C7496w<T> f20633a;

    /* renamed from: b */
    final Callable<U> f20634b;

    /* renamed from: io.reactivex.internal.operators.observable.bb$a */
    static final class C7435a<T, U extends Collection<? super T>> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47557ad<? super U> f20635a;

        /* renamed from: b */
        U f20636b;

        /* renamed from: c */
        C7321c f20637c;

        public final void dispose() {
            this.f20637c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20637c.isDisposed();
        }

        public final void onComplete() {
            U u = this.f20636b;
            this.f20636b = null;
            this.f20635a.onSuccess(u);
        }

        public final void onNext(T t) {
            this.f20636b.add(t);
        }

        public final void onError(Throwable th) {
            this.f20636b = null;
            this.f20635a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20637c, cVar)) {
                this.f20637c = cVar;
                this.f20635a.onSubscribe(this);
            }
        }

        C7435a(C47557ad<? super U> adVar, U u) {
            this.f20635a = adVar;
            this.f20636b = u;
        }
    }

    public final C7492s<U> bZ_() {
        return C7332a.m23018a((C7492s<T>) new C47781ba<T>(this.f20633a, this.f20634b));
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super U> adVar) {
        try {
            this.f20633a.mo19189a(new C7435a(adVar, (Collection) C7364b.m23081a(this.f20634b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptyDisposable.error(th, adVar);
        }
    }

    public C7434bb(C7496w<T> wVar, int i) {
        this.f20633a = wVar;
        this.f20634b = C7342a.m23056a(i);
    }
}
