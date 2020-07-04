package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.b.c */
public final class C47627c<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<T> f122089a;

    /* renamed from: b */
    final C7326g<? super T> f122090b;

    /* renamed from: io.reactivex.internal.operators.b.c$a */
    static final class C47628a<T> implements C47557ad<T>, C7321c {

        /* renamed from: a */
        final C47557ad<? super T> f122091a;

        /* renamed from: b */
        final C7326g<? super T> f122092b;

        /* renamed from: c */
        C7321c f122093c;

        public final void dispose() {
            this.f122093c.dispose();
        }

        public final boolean isDisposed() {
            return this.f122093c.isDisposed();
        }

        public final void onError(Throwable th) {
            this.f122091a.onError(th);
        }

        public final void onSubscribe(C7321c cVar) {
            if (DisposableHelper.validate(this.f122093c, cVar)) {
                this.f122093c = cVar;
                this.f122091a.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.f122091a.onSuccess(t);
            try {
                this.f122092b.accept(t);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
        }

        C47628a(C47557ad<? super T> adVar, C7326g<? super T> gVar) {
            this.f122091a = adVar;
            this.f122092b = gVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122089a.mo19137b(new C47628a(adVar, this.f122090b));
    }

    public C47627c(C7320af<T> afVar, C7326g<? super T> gVar) {
        this.f122089a = afVar;
        this.f122090b = gVar;
    }
}
