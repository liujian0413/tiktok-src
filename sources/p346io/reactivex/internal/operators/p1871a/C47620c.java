package p346io.reactivex.internal.operators.p1871a;

import p346io.reactivex.C47560b;
import p346io.reactivex.C7318a;
import p346io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: io.reactivex.internal.operators.a.c */
public final class C47620c extends C7318a {

    /* renamed from: a */
    final Throwable f122074a;

    public C47620c(Throwable th) {
        this.f122074a = th;
    }

    /* renamed from: b */
    public final void mo19121b(C47560b bVar) {
        EmptyDisposable.error(this.f122074a, bVar);
    }
}
