package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import org.p361a.C48293c;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.EmptySubscription;

/* renamed from: io.reactivex.internal.operators.flowable.g */
public final class C47700g<T> extends C7329e<T> {

    /* renamed from: a */
    final Callable<? extends Throwable> f122267a;

    public C47700g(Callable<? extends Throwable> callable) {
        this.f122267a = callable;
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        try {
            th = (Throwable) C7364b.m23081a(this.f122267a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C7331a.m23009b(th);
        }
        EmptySubscription.error(th, cVar);
    }
}
