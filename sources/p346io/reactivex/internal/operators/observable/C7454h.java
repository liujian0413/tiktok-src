package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.observers.C47867c;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.observable.h */
public final class C7454h<T> extends C7376a<T, T> {

    /* renamed from: b */
    final long f20736b;

    /* renamed from: c */
    final TimeUnit f20737c;

    /* renamed from: d */
    final C7499z f20738d;

    /* renamed from: e */
    final boolean f20739e;

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    static final class C7455a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C7498y<? super T> f20740a;

        /* renamed from: b */
        final long f20741b;

        /* renamed from: c */
        final TimeUnit f20742c;

        /* renamed from: d */
        final C7502c f20743d;

        /* renamed from: e */
        final boolean f20744e;

        /* renamed from: f */
        C7321c f20745f;

        /* renamed from: io.reactivex.internal.operators.observable.h$a$a */
        final class C7456a implements Runnable {
            public final void run() {
                try {
                    C7455a.this.f20740a.onComplete();
                } finally {
                    C7455a.this.f20743d.dispose();
                }
            }

            C7456a() {
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.h$a$b */
        final class C7457b implements Runnable {

            /* renamed from: b */
            private final Throwable f20748b;

            public final void run() {
                try {
                    C7455a.this.f20740a.onError(this.f20748b);
                } finally {
                    C7455a.this.f20743d.dispose();
                }
            }

            C7457b(Throwable th) {
                this.f20748b = th;
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.h$a$c */
        final class C7458c implements Runnable {

            /* renamed from: b */
            private final T f20750b;

            public final void run() {
                C7455a.this.f20740a.onNext(this.f20750b);
            }

            C7458c(T t) {
                this.f20750b = t;
            }
        }

        public final boolean isDisposed() {
            return this.f20743d.isDisposed();
        }

        public final void dispose() {
            this.f20745f.dispose();
            this.f20743d.dispose();
        }

        public final void onComplete() {
            this.f20743d.mo19344a(new C7456a(), this.f20741b, this.f20742c);
        }

        public final void onNext(T t) {
            this.f20743d.mo19344a(new C7458c(t), this.f20741b, this.f20742c);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f20745f, cVar)) {
                this.f20745f = cVar;
                this.f20740a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            long j;
            C7502c cVar = this.f20743d;
            C7457b bVar = new C7457b(th);
            if (this.f20744e) {
                j = this.f20741b;
            } else {
                j = 0;
            }
            cVar.mo19344a(bVar, j, this.f20742c);
        }

        C7455a(C7498y<? super T> yVar, long j, TimeUnit timeUnit, C7502c cVar, boolean z) {
            this.f20740a = yVar;
            this.f20741b = j;
            this.f20742c = timeUnit;
            this.f20743d = cVar;
            this.f20744e = z;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C7498y<? super T> yVar2;
        if (this.f20739e) {
            yVar2 = yVar;
        } else {
            yVar2 = new C47867c<>(yVar);
        }
        C7502c a = this.f20738d.mo19338a();
        C7496w wVar = this.f20473a;
        C7455a aVar = new C7455a(yVar2, this.f20736b, this.f20737c, a, this.f20739e);
        wVar.mo19189a(aVar);
    }

    public C7454h(C7496w<T> wVar, long j, TimeUnit timeUnit, C7499z zVar, boolean z) {
        super(wVar);
        this.f20736b = j;
        this.f20737c = timeUnit;
        this.f20738d = zVar;
        this.f20739e = z;
    }
}
