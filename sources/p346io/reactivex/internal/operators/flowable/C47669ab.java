package p346io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import org.p361a.C48293c;
import org.p361a.C7704b;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.internal.subscriptions.ScalarSubscription;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.ab */
public final class C47669ab {

    /* renamed from: io.reactivex.internal.operators.flowable.ab$a */
    static final class C47670a<T, R> extends C7329e<R> {

        /* renamed from: a */
        final T f122187a;

        /* renamed from: c */
        final C7327h<? super T, ? extends C7704b<? extends R>> f122188c;

        /* renamed from: a_ */
        public final void mo10197a_(C48293c<? super R> cVar) {
            try {
                C7704b bVar = (C7704b) C7364b.m23081a(this.f122188c.apply(this.f122187a), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            EmptySubscription.complete(cVar);
                        } else {
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                        }
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        EmptySubscription.error(th, cVar);
                    }
                } else {
                    bVar.mo19155a(cVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }

        C47670a(T t, C7327h<? super T, ? extends C7704b<? extends R>> hVar) {
            this.f122187a = t;
            this.f122188c = hVar;
        }
    }

    /* renamed from: a */
    public static <T, U> C7329e<U> m148472a(T t, C7327h<? super T, ? extends C7704b<? extends U>> hVar) {
        return C7332a.m23015a((C7329e<T>) new C47670a<T>(t, hVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m148473a(C7704b<T> bVar, C48293c<? super R> cVar, C7327h<? super T, ? extends C7704b<? extends R>> hVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                EmptySubscription.complete(cVar);
                return true;
            }
            try {
                C7704b bVar2 = (C7704b) C7364b.m23081a(hVar.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            EmptySubscription.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new ScalarSubscription(cVar, call2));
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        EmptySubscription.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.mo19155a(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                EmptySubscription.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C7331a.m23009b(th3);
            EmptySubscription.error(th3, cVar);
            return true;
        }
    }
}
