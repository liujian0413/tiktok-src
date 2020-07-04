package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.observable.ak */
public final class C7394ak<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7327h<? super Throwable, ? extends T> f20513b;

    /* renamed from: io.reactivex.internal.operators.observable.ak$a */
    static final class C7395a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20514a;

        /* renamed from: b */
        final C7327h<? super Throwable, ? extends T> f20515b;

        /* renamed from: c */
        C7321c f20516c;

        public final void dispose() {
            this.f20516c.dispose();
        }

        public final boolean isDisposed() {
            return this.f20516c.isDisposed();
        }

        public final void onComplete() {
            this.f20514a.onComplete();
        }

        public final void onNext(T t) {
            this.f20514a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20516c, cVar)) {
                this.f20516c = cVar;
                this.f20514a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                Object apply = this.f20515b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f20514a.onError(nullPointerException);
                    return;
                }
                this.f20514a.onNext(apply);
                this.f20514a.onComplete();
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f20514a.onError(new CompositeException(th, th2));
            }
        }

        C7395a(C7498y<? super T> yVar, C7327h<? super Throwable, ? extends T> hVar) {
            this.f20514a = yVar;
            this.f20515b = hVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        this.f20473a.mo19189a(new C7395a(yVar, this.f20513b));
    }

    public C7394ak(C7496w<T> wVar, C7327h<? super Throwable, ? extends T> hVar) {
        super(wVar);
        this.f20513b = hVar;
    }
}
