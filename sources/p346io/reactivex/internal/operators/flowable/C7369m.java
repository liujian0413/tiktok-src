package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.operators.flowable.m */
public final class C7369m<T> extends C7329e<T> {

    /* renamed from: a */
    private final C7492s<T> f20451a;

    /* renamed from: io.reactivex.internal.operators.flowable.m$a */
    static final class C7370a<T> implements C7498y<T>, C48294d {

        /* renamed from: a */
        final C48293c<? super T> f20452a;

        /* renamed from: b */
        C7321c f20453b;

        public final void request(long j) {
        }

        public final void cancel() {
            this.f20453b.dispose();
        }

        public final void onComplete() {
            this.f20452a.onComplete();
        }

        C7370a(C48293c<? super T> cVar) {
            this.f20452a = cVar;
        }

        public final void onError(Throwable th) {
            this.f20452a.onError(th);
        }

        public final void onNext(T t) {
            this.f20452a.onNext(t);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f20453b = cVar;
            this.f20452a.onSubscribe(this);
        }
    }

    public C7369m(C7492s<T> sVar) {
        this.f20451a = sVar;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20451a.mo19189a((C7498y<? super T>) new C7370a<Object>(cVar));
    }
}
