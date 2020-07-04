package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.AtomicThrowable;
import p346io.reactivex.internal.util.C47838f;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: io.reactivex.internal.operators.observable.ao */
public final class C47778ao<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7327h<? super C7492s<Throwable>, ? extends C7496w<?>> f122475b;

    /* renamed from: io.reactivex.internal.operators.observable.ao$a */
    static final class C47779a<T> extends AtomicInteger implements C7321c, C7498y<T> {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: a */
        final C7498y<? super T> f122476a;

        /* renamed from: b */
        final AtomicInteger f122477b = new AtomicInteger();

        /* renamed from: c */
        final AtomicThrowable f122478c = new AtomicThrowable();

        /* renamed from: d */
        final C7489f<Throwable> f122479d;

        /* renamed from: e */
        final C47780a f122480e = new C47780a<>();

        /* renamed from: f */
        final AtomicReference<C7321c> f122481f = new AtomicReference<>();

        /* renamed from: g */
        final C7496w<T> f122482g;

        /* renamed from: h */
        volatile boolean f122483h;

        /* renamed from: io.reactivex.internal.operators.observable.ao$a$a */
        final class C47780a extends AtomicReference<C7321c> implements C7498y<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public final void onComplete() {
                C47779a.this.mo119789b();
            }

            public final void onSubscribe(C7321c cVar) {
                DisposableHelper.setOnce(this, cVar);
            }

            C47780a() {
            }

            public final void onError(Throwable th) {
                C47779a.this.mo119788a(th);
            }

            public final void onNext(Object obj) {
                C47779a.this.mo119787a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119787a() {
            mo119790c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo119789b() {
            DisposableHelper.dispose(this.f122481f);
            C47838f.m148722a(this.f122476a, (AtomicInteger) this, this.f122478c);
        }

        public final void dispose() {
            DisposableHelper.dispose(this.f122481f);
            DisposableHelper.dispose(this.f122480e);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((C7321c) this.f122481f.get());
        }

        public final void onComplete() {
            DisposableHelper.dispose(this.f122480e);
            C47838f.m148722a(this.f122476a, (AtomicInteger) this, this.f122478c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo119790c() {
            if (this.f122477b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f122483h) {
                        this.f122483h = true;
                        this.f122482g.mo19189a(this);
                    }
                    if (this.f122477b.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void onNext(T t) {
            C47838f.m148720a(this.f122476a, t, (AtomicInteger) this, this.f122478c);
        }

        public final void onSubscribe(C7321c cVar) {
            DisposableHelper.replace(this.f122481f, cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119788a(Throwable th) {
            DisposableHelper.dispose(this.f122481f);
            C47838f.m148721a(this.f122476a, th, (AtomicInteger) this, this.f122478c);
        }

        public final void onError(Throwable th) {
            DisposableHelper.replace(this.f122481f, null);
            this.f122483h = false;
            this.f122479d.onNext(th);
        }

        C47779a(C7498y<? super T> yVar, C7489f<Throwable> fVar, C7496w<T> wVar) {
            this.f122476a = yVar;
            this.f122479d = fVar;
            this.f122482g = wVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7489f n = C7486b.m23223a().mo19260n();
        try {
            C7496w wVar = (C7496w) C7364b.m23081a(this.f122475b.apply(n), "The handler returned a null ObservableSource");
            C47779a aVar = new C47779a(yVar, n, this.f20473a);
            yVar.onSubscribe(aVar);
            wVar.mo19189a(aVar.f122480e);
            aVar.mo119790c();
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptyDisposable.error(th, yVar);
        }
    }

    public C47778ao(C7496w<T> wVar, C7327h<? super C7492s<Throwable>, ? extends C7496w<?>> hVar) {
        super(wVar);
        this.f122475b = hVar;
    }
}
