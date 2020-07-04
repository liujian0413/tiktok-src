package p346io.reactivex.internal.operators.p1872b;

import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.b.d */
public final class C47629d<T> extends C7319aa<T> {

    /* renamed from: a */
    final C7320af<T> f122094a;

    /* renamed from: b */
    final C7326g<? super C7321c> f122095b;

    /* renamed from: io.reactivex.internal.operators.b.d$a */
    static final class C47630a<T> implements C47557ad<T> {

        /* renamed from: a */
        final C47557ad<? super T> f122096a;

        /* renamed from: b */
        final C7326g<? super C7321c> f122097b;

        /* renamed from: c */
        boolean f122098c;

        public final void onError(Throwable th) {
            if (this.f122098c) {
                C7332a.m23029a(th);
            } else {
                this.f122096a.onError(th);
            }
        }

        public final void onSuccess(T t) {
            if (!this.f122098c) {
                this.f122096a.onSuccess(t);
            }
        }

        public final void onSubscribe(C7321c cVar) {
            try {
                this.f122097b.accept(cVar);
                this.f122096a.onSubscribe(cVar);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                this.f122098c = true;
                cVar.dispose();
                EmptyDisposable.error(th, this.f122096a);
            }
        }

        C47630a(C47557ad<? super T> adVar, C7326g<? super C7321c> gVar) {
            this.f122096a = adVar;
            this.f122097b = gVar;
        }
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        this.f122094a.mo19137b(new C47630a(adVar, this.f122095b));
    }

    public C47629d(C7320af<T> afVar, C7326g<? super C7321c> gVar) {
        this.f122094a = afVar;
        this.f122095b = gVar;
    }
}
