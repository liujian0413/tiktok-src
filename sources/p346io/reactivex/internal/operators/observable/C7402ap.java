package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.observers.C47867c;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.ap */
public final class C7402ap<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f20535b;

    /* renamed from: c */
    final TimeUnit f20536c;

    /* renamed from: d */
    final C7499z f20537d;

    /* renamed from: e */
    final boolean f20538e = false;

    /* renamed from: io.reactivex.internal.operators.observable.ap$a */
    static final class C7403a<T> extends C7405c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: a */
        final AtomicInteger f20539a = new AtomicInteger(1);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19206a() {
            mo19209b();
            if (this.f20539a.decrementAndGet() == 0) {
                this.f20540b.onComplete();
            }
        }

        public final void run() {
            if (this.f20539a.incrementAndGet() == 2) {
                mo19209b();
                if (this.f20539a.decrementAndGet() == 0) {
                    this.f20540b.onComplete();
                }
            }
        }

        C7403a(C7498y<? super T> yVar, long j, TimeUnit timeUnit, C7499z zVar) {
            super(yVar, j, timeUnit, zVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ap$b */
    static final class C7404b<T> extends C7405c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public final void run() {
            mo19209b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19206a() {
            this.f20540b.onComplete();
        }

        C7404b(C7498y<? super T> yVar, long j, TimeUnit timeUnit, C7499z zVar) {
            super(yVar, j, timeUnit, zVar);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ap$c */
    static abstract class C7405c<T> extends AtomicReference<T> implements C7321c, C7498y<T>, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        final C7498y<? super T> f20540b;

        /* renamed from: c */
        final long f20541c;

        /* renamed from: d */
        final TimeUnit f20542d;

        /* renamed from: e */
        final C7499z f20543e;

        /* renamed from: f */
        final AtomicReference<C7321c> f20544f = new AtomicReference<>();

        /* renamed from: g */
        C7321c f20545g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo19206a();

        /* renamed from: c */
        private void m23131c() {
            DisposableHelper.dispose(this.f20544f);
        }

        public boolean isDisposed() {
            return this.f20545g.isDisposed();
        }

        public void onComplete() {
            m23131c();
            mo19206a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo19209b() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f20540b.onNext(andSet);
            }
        }

        public void dispose() {
            m23131c();
            this.f20545g.dispose();
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            m23131c();
            this.f20540b.onError(th);
        }

        public void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20545g, cVar)) {
                this.f20545g = cVar;
                this.f20540b.onSubscribe(this);
                DisposableHelper.replace(this.f20544f, this.f20543e.mo19336a(this, this.f20541c, this.f20541c, this.f20542d));
            }
        }

        C7405c(C7498y<? super T> yVar, long j, TimeUnit timeUnit, C7499z zVar) {
            this.f20540b = yVar;
            this.f20541c = j;
            this.f20542d = timeUnit;
            this.f20543e = zVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C47867c cVar = new C47867c(yVar);
        if (this.f20538e) {
            C7496w wVar = this.f20473a;
            C7403a aVar = new C7403a(cVar, this.f20535b, this.f20536c, this.f20537d);
            wVar.mo19189a(aVar);
            return;
        }
        C7496w wVar2 = this.f20473a;
        C7404b bVar = new C7404b(cVar, this.f20535b, this.f20536c, this.f20537d);
        wVar2.mo19189a(bVar);
    }

    public C7402ap(C7496w<T> wVar, long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        super(wVar);
        this.f20535b = j;
        this.f20536c = timeUnit;
        this.f20537d = zVar;
    }
}
