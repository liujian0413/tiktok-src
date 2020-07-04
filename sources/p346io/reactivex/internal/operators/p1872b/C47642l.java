package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.b.l */
public final class C47642l<T, R> extends C7319aa<R> {

    /* renamed from: a */
    final C7320af<? extends T> f122115a;

    /* renamed from: b */
    final C7327h<? super T, ? extends R> f122116b;

    /* renamed from: io.reactivex.internal.operators.b.l$a */
    static final class C47643a<T, R> implements C47557ad<T> {

        /* renamed from: a */
        final C47557ad<? super R> f122117a;

        /* renamed from: b */
        final C7327h<? super T, ? extends R> f122118b;

        public final void onError(Throwable th) {
            this.f122117a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            this.f122117a.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            try {
                this.f122117a.onSuccess(C7364b.m23081a(this.f122118b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C7331a.m23009b(th);
                onError(th);
            }
        }

        C47643a(C47557ad<? super R> adVar, C7327h<? super T, ? extends R> hVar) {
            this.f122117a = adVar;
            this.f122118b = hVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super R> adVar) {
        this.f122115a.mo19137b(new C47643a(adVar, this.f122116b));
    }

    public C47642l(C7320af<? extends T> afVar, C7327h<? super T, ? extends R> hVar) {
        this.f122115a = afVar;
        this.f122116b = hVar;
    }
}
