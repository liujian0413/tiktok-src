package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.observers.C47867c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.g */
public final class C7451g<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f20721b;

    /* renamed from: c */
    final TimeUnit f20722c;

    /* renamed from: d */
    final C7499z f20723d;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    static final class C7452a<T> extends AtomicReference<C7321c> implements C7321c, Runnable {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: a */
        final T f20724a;

        /* renamed from: b */
        final long f20725b;

        /* renamed from: c */
        final C7453b<T> f20726c;

        /* renamed from: d */
        final AtomicBoolean f20727d = new AtomicBoolean();

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            if (get() == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void run() {
            if (this.f20727d.compareAndSet(false, true)) {
                this.f20726c.mo19244a(this.f20725b, this.f20724a, this);
            }
        }

        /* renamed from: a */
        public final void mo19242a(C7321c cVar) {
            DisposableHelper.replace(this, cVar);
        }

        C7452a(T t, long j, C7453b<T> bVar) {
            this.f20724a = t;
            this.f20725b = j;
            this.f20726c = bVar;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.g$b */
    static final class C7453b<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20728a;

        /* renamed from: b */
        final long f20729b;

        /* renamed from: c */
        final TimeUnit f20730c;

        /* renamed from: d */
        final C7502c f20731d;

        /* renamed from: e */
        C7321c f20732e;

        /* renamed from: f */
        C7321c f20733f;

        /* renamed from: g */
        volatile long f20734g;

        /* renamed from: h */
        boolean f20735h;

        public final boolean isDisposed() {
            return this.f20731d.isDisposed();
        }

        public final void dispose() {
            this.f20732e.dispose();
            this.f20731d.dispose();
        }

        public final void onComplete() {
            if (!this.f20735h) {
                this.f20735h = true;
                C7321c cVar = this.f20733f;
                if (cVar != null) {
                    cVar.dispose();
                }
                C7452a aVar = (C7452a) cVar;
                if (aVar != null) {
                    aVar.run();
                }
                this.f20728a.onComplete();
                this.f20731d.dispose();
            }
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20732e, cVar)) {
                this.f20732e = cVar;
                this.f20728a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f20735h) {
                C7332a.m23029a(th);
                return;
            }
            C7321c cVar = this.f20733f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f20735h = true;
            this.f20728a.onError(th);
            this.f20731d.dispose();
        }

        public final void onNext(T t) {
            if (!this.f20735h) {
                long j = this.f20734g + 1;
                this.f20734g = j;
                C7321c cVar = this.f20733f;
                if (cVar != null) {
                    cVar.dispose();
                }
                C7452a aVar = new C7452a(t, j, this);
                this.f20733f = aVar;
                aVar.mo19242a(this.f20731d.mo19344a(aVar, this.f20729b, this.f20730c));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19244a(long j, T t, C7452a<T> aVar) {
            if (j == this.f20734g) {
                this.f20728a.onNext(t);
                aVar.dispose();
            }
        }

        C7453b(C7498y<? super T> yVar, long j, TimeUnit timeUnit, C7502c cVar) {
            this.f20728a = yVar;
            this.f20729b = j;
            this.f20730c = timeUnit;
            this.f20731d = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7496w wVar = this.f20473a;
        C7453b bVar = new C7453b(new C47867c(yVar), this.f20721b, this.f20722c, this.f20723d.mo19338a());
        wVar.mo19189a(bVar);
    }

    public C7451g(C7496w<T> wVar, long j, TimeUnit timeUnit, C7499z zVar) {
        super(wVar);
        this.f20721b = j;
        this.f20722c = timeUnit;
        this.f20723d = zVar;
    }
}
