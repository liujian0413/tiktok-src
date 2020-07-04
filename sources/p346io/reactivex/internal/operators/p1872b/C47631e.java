package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: io.reactivex.internal.operators.b.e */
public final class C47631e<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<T> f122099a;

    /* renamed from: b */
    final C7326g<? super T> f122100b;

    /* renamed from: io.reactivex.internal.operators.b.e$a */
    final class C47632a implements C47557ad<T> {

        /* renamed from: a */
        final C47557ad<? super T> f122101a;

        public final void onError(Throwable th) {
            this.f122101a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f122101a.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            try {
                C47631e.this.f122100b.accept(t);
                this.f122101a.onSuccess(t);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122101a.onError(th);
            }
        }

        C47632a(C47557ad<? super T> adVar) {
            this.f122101a = adVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122099a.mo19137b(new C47632a(adVar));
    }

    public C47631e(C7320af<T> afVar, C7326g<? super T> gVar) {
        this.f122099a = afVar;
        this.f122100b = gVar;
    }
}
