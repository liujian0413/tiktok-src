package p346io.reactivex.internal.operators.observable;

import p346io.reactivex.C47560b;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p353b.C7366c;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.observable.ac */
public final class C7379ac<T> extends C7318a implements C7366c<T> {

    /* renamed from: a */
    final C7496w<T> f20476a;

    /* renamed from: io.reactivex.internal.operators.observable.ac$a */
    static final class C7380a<T> implements C7321c, C7498y<T> {

        /* renamed from: a */
        final C47560b f20477a;

        /* renamed from: b */
        C7321c f20478b;

        public final void onNext(T t) {
        }

        public final void dispose() {
            this.f20478b.dispose();
        }

        public final boolean isDisposed() {
            return this.f20478b.isDisposed();
        }

        public final void onComplete() {
            this.f20477a.onComplete();
        }

        C7380a(C47560b bVar) {
            this.f20477a = bVar;
        }

        public final void onError(Throwable th) {
            this.f20477a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f20478b = cVar;
            this.f20477a.onSubscribe(this);
        }
    }

    public final C7492s<T> bZ_() {
        return C7332a.m23018a((C7492s<T>) new C47771ab<T>(this.f20476a));
    }

    public C7379ac(C7496w<T> wVar) {
        this.f20476a = wVar;
    }

    /* renamed from: b */
    public final void mo19121b(C47560b bVar) {
        this.f20476a.mo19189a(new C7380a(bVar));
    }
}
