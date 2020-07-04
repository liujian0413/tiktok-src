package p346io.reactivex.internal.operators.p1871a;

import java.util.concurrent.Callable;
import p346io.reactivex.C47560b;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7322c;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.internal.operators.a.a */
public final class C47618a extends C7318a {

    /* renamed from: a */
    final Callable<? extends C7322c> f122072a;

    public C47618a(Callable<? extends C7322c> callable) {
        this.f122072a = callable;
    }

    /* renamed from: b */
    public final void mo19121b(C47560b bVar) {
        try {
            ((C7322c) C7364b.m23081a(this.f122072a.call(), "The completableSupplier returned a null CompletableSource")).mo10176a(bVar);
        } catch (Throwable th) {
            C7331a.m23009b(th);
            EmptyDisposable.error(th, bVar);
        }
    }
}
