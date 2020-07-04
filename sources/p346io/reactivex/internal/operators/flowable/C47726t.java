package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47833b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.t */
public final class C47726t<T> extends C7368a<T, T> implements C7326g<T> {

    /* renamed from: c */
    final C7326g<? super T> f122359c = this;

    /* renamed from: io.reactivex.internal.operators.flowable.t$a */
    static final class C47727a<T> extends AtomicLong implements C47597i<T>, C48294d {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: a */
        final C48293c<? super T> f122360a;

        /* renamed from: b */
        final C7326g<? super T> f122361b;

        /* renamed from: c */
        C48294d f122362c;

        /* renamed from: d */
        boolean f122363d;

        public final void cancel() {
            this.f122362c.cancel();
        }

        public final void onComplete() {
            if (!this.f122363d) {
                this.f122363d = true;
                this.f122360a.onComplete();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C47833b.m148707a((AtomicLong) this, j);
            }
        }

        public final void onError(Throwable th) {
            if (this.f122363d) {
                C7332a.m23029a(th);
                return;
            }
            this.f122363d = true;
            this.f122360a.onError(th);
        }

        public final void onSubscribe(C48294d dVar) {
            if (SubscriptionHelper.validate(this.f122362c, dVar)) {
                this.f122362c = dVar;
                this.f122360a.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.f122363d) {
                if (get() != 0) {
                    this.f122360a.onNext(t);
                    C47833b.m148709c(this, 1);
                    return;
                }
                try {
                    this.f122361b.accept(t);
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        C47727a(C48293c<? super T> cVar, C7326g<? super T> gVar) {
            this.f122360a = cVar;
            this.f122361b = gVar;
        }
    }

    public final void accept(T t) {
    }

    public C47726t(C7329e<T> eVar) {
        super(eVar);
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C47727a<Object>(cVar, this.f122359c));
    }
}
