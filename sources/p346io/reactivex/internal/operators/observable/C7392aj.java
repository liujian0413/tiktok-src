package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.aj */
public final class C7392aj<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7327h<? super Throwable, ? extends C7496w<? extends T>> f20505b;

    /* renamed from: c */
    final boolean f20506c;

    /* renamed from: io.reactivex.internal.operators.observable.aj$a */
    static final class C7393a<T> implements C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20507a;

        /* renamed from: b */
        final C7327h<? super Throwable, ? extends C7496w<? extends T>> f20508b;

        /* renamed from: c */
        final boolean f20509c;

        /* renamed from: d */
        final SequentialDisposable f20510d = new SequentialDisposable();

        /* renamed from: e */
        boolean f20511e;

        /* renamed from: f */
        boolean f20512f;

        public final void onComplete() {
            if (!this.f20512f) {
                this.f20512f = true;
                this.f20511e = true;
                this.f20507a.onComplete();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            this.f20510d.replace(cVar);
        }

        public final void onNext(T t) {
            if (!this.f20512f) {
                this.f20507a.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!this.f20511e) {
                this.f20511e = true;
                if (!this.f20509c || (th instanceof Exception)) {
                    try {
                        C7496w wVar = (C7496w) this.f20508b.apply(th);
                        if (wVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f20507a.onError(nullPointerException);
                            return;
                        }
                        wVar.mo19189a(this);
                    } catch (Throwable th2) {
                        C7331a.m23009b(th2);
                        this.f20507a.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f20507a.onError(th);
                }
            } else if (this.f20512f) {
                C7332a.m23029a(th);
            } else {
                this.f20507a.onError(th);
            }
        }

        C7393a(C7498y<? super T> yVar, C7327h<? super Throwable, ? extends C7496w<? extends T>> hVar, boolean z) {
            this.f20507a = yVar;
            this.f20508b = hVar;
            this.f20509c = z;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7393a aVar = new C7393a(yVar, this.f20505b, this.f20506c);
        yVar.onSubscribe(aVar.f20510d);
        this.f20473a.mo19189a(aVar);
    }

    public C7392aj(C7496w<T> wVar, C7327h<? super Throwable, ? extends C7496w<? extends T>> hVar, boolean z) {
        super(wVar);
        this.f20505b = hVar;
        this.f20506c = z;
    }
}
