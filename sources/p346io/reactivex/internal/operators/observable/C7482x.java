package p346io.reactivex.internal.operators.observable;

import java.util.Iterator;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.observers.C47609b;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.internal.operators.observable.x */
public final class C7482x<T> extends C7492s<T> {

    /* renamed from: a */
    final Iterable<? extends T> f20830a;

    /* renamed from: io.reactivex.internal.operators.observable.x$a */
    static final class C7483a<T> extends C47609b<T> {

        /* renamed from: a */
        final C7498y<? super T> f20831a;

        /* renamed from: b */
        final Iterator<? extends T> f20832b;

        /* renamed from: c */
        volatile boolean f20833c;

        /* renamed from: d */
        boolean f20834d;

        /* renamed from: e */
        boolean f20835e;

        /* renamed from: f */
        boolean f20836f;

        public final void clear() {
            this.f20835e = true;
        }

        public final void dispose() {
            this.f20833c = true;
        }

        public final boolean isDisposed() {
            return this.f20833c;
        }

        public final boolean isEmpty() {
            return this.f20835e;
        }

        public final T poll() {
            if (this.f20835e) {
                return null;
            }
            if (!this.f20836f) {
                this.f20836f = true;
            } else if (!this.f20832b.hasNext()) {
                this.f20835e = true;
                return null;
            }
            return C7364b.m23081a(this.f20832b.next(), "The iterator returned a null value");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19254a() {
            while (!isDisposed()) {
                try {
                    this.f20831a.onNext(C7364b.m23081a(this.f20832b.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f20832b.hasNext()) {
                                if (!isDisposed()) {
                                    this.f20831a.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C7331a.m23009b(th);
                            this.f20831a.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    this.f20831a.onError(th2);
                    return;
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f20834d = true;
            return 1;
        }

        C7483a(C7498y<? super T> yVar, Iterator<? extends T> it) {
            this.f20831a = yVar;
            this.f20832b = it;
        }
    }

    public C7482x(Iterable<? extends T> iterable) {
        this.f20830a = iterable;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        try {
            Iterator it = this.f20830a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(yVar);
                    return;
                }
                C7483a aVar = new C7483a(yVar, it);
                yVar.onSubscribe(aVar);
                if (!aVar.f20834d) {
                    aVar.mo19254a();
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                EmptyDisposable.error(th, yVar);
            }
        } catch (Throwable th2) {
            C7331a.m23009b(th2);
            EmptyDisposable.error(th2, yVar);
        }
    }
}
