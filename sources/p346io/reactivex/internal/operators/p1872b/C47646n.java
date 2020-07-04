package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: io.reactivex.internal.operators.b.n */
public final class C47646n<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<? extends T> f122125a;

    /* renamed from: b */
    final C7327h<? super Throwable, ? extends T> f122126b;

    /* renamed from: c */
    final T f122127c = null;

    /* renamed from: io.reactivex.internal.operators.b.n$a */
    final class C47647a implements C47557ad<T> {

        /* renamed from: b */
        private final C47557ad<? super T> f122129b;

        public final void onSubscribe(C7321c cVar) {
            this.f122129b.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            this.f122129b.onSuccess(t);
        }

        public final void onError(Throwable th) {
            T t;
            if (C47646n.this.f122126b != null) {
                try {
                    t = C47646n.this.f122126b.apply(th);
                } catch (Throwable th2) {
                    C7331a.m23009b(th2);
                    this.f122129b.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = C47646n.this.f122127c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f122129b.onError(nullPointerException);
                return;
            }
            this.f122129b.onSuccess(t);
        }

        C47647a(C47557ad<? super T> adVar) {
            this.f122129b = adVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122125a.mo19137b(new C47647a(adVar));
    }

    public C47646n(C7320af<? extends T> afVar, C7327h<? super Throwable, ? extends T> hVar, T t) {
        this.f122125a = afVar;
        this.f122126b = hVar;
    }
}
