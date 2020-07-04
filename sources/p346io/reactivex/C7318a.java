package p346io.reactivex;

import java.util.concurrent.Callable;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.operators.p1871a.C47618a;
import p346io.reactivex.internal.operators.p1871a.C47619b;
import p346io.reactivex.internal.operators.p1871a.C47620c;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.a */
public abstract class C7318a implements C7322c {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19121b(C47560b bVar);

    /* renamed from: a */
    public static C7318a m22916a() {
        return C7332a.m23010a(C47619b.f122073a);
    }

    /* renamed from: a */
    public static C7318a m22917a(Throwable th) {
        C7364b.m23081a(th, "error is null");
        return C7332a.m23010a((C7318a) new C47620c(th));
    }

    /* renamed from: b */
    private static NullPointerException m22919b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: a */
    public static C7318a m22918a(Callable<? extends C7322c> callable) {
        C7364b.m23081a(callable, "completableSupplier");
        return C7332a.m23010a((C7318a) new C47618a(callable));
    }

    /* renamed from: a */
    public final void mo10176a(C47560b bVar) {
        C7364b.m23081a(bVar, "s is null");
        try {
            C47560b a = C7332a.m23013a(this, bVar);
            C7364b.m23081a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo19121b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C7331a.m23009b(th);
            C7332a.m23029a(th);
            throw m22919b(th);
        }
    }
}
