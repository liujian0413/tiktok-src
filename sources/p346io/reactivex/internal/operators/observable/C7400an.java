package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.SequentialDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7328l;

/* renamed from: io.reactivex.internal.operators.observable.an */
public final class C7400an<T> extends C7376a<T, T> {

    /* renamed from: b */
    final C7328l<? super Throwable> f20528b;

    /* renamed from: c */
    final long f20529c;

    /* renamed from: io.reactivex.internal.operators.observable.an$a */
    static final class C7401a<T> extends AtomicInteger implements C7498y<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: a */
        final C7498y<? super T> f20530a;

        /* renamed from: b */
        final SequentialDisposable f20531b;

        /* renamed from: c */
        final C7496w<? extends T> f20532c;

        /* renamed from: d */
        final C7328l<? super Throwable> f20533d;

        /* renamed from: e */
        long f20534e;

        public final void onComplete() {
            this.f20530a.onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19205a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f20531b.isDisposed()) {
                    this.f20532c.mo19189a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void onNext(T t) {
            this.f20530a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f20531b.replace(cVar);
        }

        public final void onError(Throwable th) {
            long j = this.f20534e;
            if (j != Long.MAX_VALUE) {
                this.f20534e = j - 1;
            }
            if (j == 0) {
                this.f20530a.onError(th);
                return;
            }
            try {
                if (!this.f20533d.mo9283a(th)) {
                    this.f20530a.onError(th);
                } else {
                    mo19205a();
                }
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                this.f20530a.onError(new CompositeException(th, th2));
            }
        }

        C7401a(C7498y<? super T> yVar, long j, C7328l<? super Throwable> lVar, SequentialDisposable sequentialDisposable, C7496w<? extends T> wVar) {
            this.f20530a = yVar;
            this.f20531b = sequentialDisposable;
            this.f20532c = wVar;
            this.f20533d = lVar;
            this.f20534e = j;
        }
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        yVar.onSubscribe(sequentialDisposable);
        C7401a aVar = new C7401a(yVar, this.f20529c, this.f20528b, sequentialDisposable, this.f20473a);
        aVar.mo19205a();
    }

    public C7400an(C7492s<T> sVar, long j, C7328l<? super Throwable> lVar) {
        super(sVar);
        this.f20528b = lVar;
        this.f20529c = j;
    }
}
