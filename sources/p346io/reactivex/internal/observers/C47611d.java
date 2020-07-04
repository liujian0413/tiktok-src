package p346io.reactivex.internal.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.d */
public final class C47611d<T> implements C7321c, C7498y<T> {

    /* renamed from: a */
    final C7498y<? super T> f122060a;

    /* renamed from: b */
    final C7326g<? super C7321c> f122061b;

    /* renamed from: c */
    final C7323a f122062c;

    /* renamed from: d */
    C7321c f122063d;

    public final boolean isDisposed() {
        return this.f122063d.isDisposed();
    }

    public final void onComplete() {
        if (this.f122063d != DisposableHelper.DISPOSED) {
            this.f122063d = DisposableHelper.DISPOSED;
            this.f122060a.onComplete();
        }
    }

    public final void dispose() {
        C7321c cVar = this.f122063d;
        if (cVar != DisposableHelper.DISPOSED) {
            this.f122063d = DisposableHelper.DISPOSED;
            try {
                this.f122062c.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
            cVar.dispose();
        }
    }

    public final void onNext(T t) {
        this.f122060a.onNext(t);
    }

    public final void onError(Throwable th) {
        if (this.f122063d != DisposableHelper.DISPOSED) {
            this.f122063d = DisposableHelper.DISPOSED;
            this.f122060a.onError(th);
            return;
        }
        C7332a.m23029a(th);
    }

    public final void onSubscribe(C7321c cVar) {
        try {
            this.f122061b.accept(cVar);
            if (DisposableHelper.validate(this.f122063d, cVar)) {
                this.f122063d = cVar;
                this.f122060a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C7331a.m23009b(th);
            cVar.dispose();
            this.f122063d = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.f122060a);
        }
    }

    public C47611d(C7498y<? super T> yVar, C7326g<? super C7321c> gVar, C7323a aVar) {
        this.f122060a = yVar;
        this.f122061b = gVar;
        this.f122062c = aVar;
    }
}
