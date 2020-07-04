package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.C47838f;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ax */
public final class C7421ax<T, U> extends C7376a<T, T> {

    /* renamed from: b */
    final C7496w<? extends U> f20582b;

    /* renamed from: io.reactivex.internal.operators.observable.ax$a */
    static final class C7422a<T, U> extends AtomicInteger implements C7321c, C7498y<T> {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: a */
        final C7498y<? super T> f20583a;

        /* renamed from: b */
        final AtomicReference<C7321c> f20584b = new AtomicReference<>();

        /* renamed from: c */
        final C7423a f20585c = new C7423a<>();

        /* renamed from: d */
        final AtomicThrowable f20586d = new AtomicThrowable();

        /* renamed from: io.reactivex.internal.operators.observable.ax$a$a */
        final class C7423a extends AtomicReference<C7321c> implements C7498y<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public final void onComplete() {
                C7422a.this.mo19212a();
            }

            public final void onSubscribe(C7321c cVar) {
                DisposableHelper.setOnce(this, cVar);
            }

            C7423a() {
            }

            public final void onError(Throwable th) {
                C7422a.this.mo19213a(th);
            }

            public final void onNext(U u) {
                DisposableHelper.dispose(this);
                C7422a.this.mo19212a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19212a() {
            DisposableHelper.dispose(this.f20584b);
            C47838f.m148722a(this.f20583a, (AtomicInteger) this, this.f20586d);
        }

        public final void dispose() {
            DisposableHelper.dispose(this.f20584b);
            DisposableHelper.dispose(this.f20585c);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) this.f20584b.get());
        }

        public final void onComplete() {
            DisposableHelper.dispose(this.f20585c);
            C47838f.m148722a(this.f20583a, (AtomicInteger) this, this.f20586d);
        }

        public final void onNext(T t) {
            C47838f.m148720a(this.f20583a, t, (AtomicInteger) this, this.f20586d);
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.setOnce(this.f20584b, cVar);
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this.f20585c);
            C47838f.m148721a(this.f20583a, th, (AtomicInteger) this, this.f20586d);
        }

        C7422a(C7498y<? super T> yVar) {
            this.f20583a = yVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19213a(Throwable th) {
            DisposableHelper.dispose(this.f20584b);
            C47838f.m148721a(this.f20583a, th, (AtomicInteger) this, this.f20586d);
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7422a aVar = new C7422a(yVar);
        yVar.onSubscribe(aVar);
        this.f20582b.mo19189a(aVar.f20585c);
        this.f20473a.mo19189a(aVar);
    }

    public C7421ax(C7496w<T> wVar, C7496w<? extends U> wVar2) {
        super(wVar);
        this.f20582b = wVar2;
    }
}
