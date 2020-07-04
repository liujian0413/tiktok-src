package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.au */
public final class C7414au<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7499z f20567b;

    /* renamed from: io.reactivex.internal.operators.observable.au$a */
    static final class C7415a<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C7498y<? super T> f20568a;

        /* renamed from: b */
        final AtomicReference<C7321c> f20569b = new AtomicReference<>();

        public final void onComplete() {
            this.f20568a.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this.f20569b);
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) get());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19210a(C7321c cVar) {
            DisposableHelper.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f20568a.onError(th);
        }

        public final void onNext(T t) {
            this.f20568a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this.f20569b, cVar);
        }

        C7415a(C7498y<? super T> yVar) {
            this.f20568a = yVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.au$b */
    final class C7416b implements Runnable {

        /* renamed from: b */
        private final C7415a<T> f20571b;

        public final void run() {
            C7414au.this.f20473a.mo19189a(this.f20571b);
        }

        C7416b(C7415a<T> aVar) {
            this.f20571b = aVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7415a aVar = new C7415a(yVar);
        yVar.onSubscribe(aVar);
        aVar.mo19210a(this.f20567b.mo19335a(new C7416b(aVar)));
    }

    public C7414au(C7496w<T> wVar, C7499z zVar) {
        super(wVar);
        this.f20567b = zVar;
    }
}
