package p346io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.internal.operators.observable.r */
public final class C7471r<T> extends C7492s<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f20789a;

    public C7471r(Callable<? extends Throwable> callable) {
        this.f20789a = callable;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        try {
            th = (Throwable) C7364b.m23081a(this.f20789a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C7331a.m23009b(th);
        }
        EmptyDisposable.error(th, yVar);
    }
}
