package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.Callable;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.b.h */
public final class C47637h<T> extends C7319aa<T> {

    /* renamed from: a */
    final Callable<? extends T> f122110a;

    public C47637h(Callable<? extends T> callable) {
        this.f122110a = callable;
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        C7321c a = C47563d.m148348a();
        adVar.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object a2 = C7364b.m23081a(this.f122110a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    adVar.onSuccess(a2);
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                if (!a.isDisposed()) {
                    adVar.onError(th);
                } else {
                    C7332a.m23029a(th);
                }
            }
        }
    }
}
