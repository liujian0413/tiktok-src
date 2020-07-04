package p346io.reactivex.internal.operators.p1872b;

import java.util.concurrent.Callable;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.internal.operators.b.f */
public final class C47633f<T> extends C7319aa<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f122103a;

    public C47633f(Callable<? extends Throwable> callable) {
        this.f122103a = callable;
    }

    /* renamed from: a */
    public final void mo10199a(C47557ad<? super T> adVar) {
        try {
            th = (Throwable) C7364b.m23081a(this.f122103a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C7331a.m23009b(th);
        }
        EmptyDisposable.error(th, adVar);
    }
}
