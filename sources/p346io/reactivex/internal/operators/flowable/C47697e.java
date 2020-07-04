package p346io.reactivex.internal.operators.flowable;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.C7329e;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.subscriptions.EmptySubscription;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p348d.C47573k;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.operators.flowable.e */
public final class C47697e<T> extends C7368a<T, T> {

    /* renamed from: c */
    private final C7326g<? super C48294d> f122258c;

    /* renamed from: d */
    private final C47573k f122259d;

    /* renamed from: e */
    private final C7323a f122260e;

    /* renamed from: io.reactivex.internal.operators.flowable.e$a */
    static final class C47698a<T> implements C47597i<T>, C48294d {

        /* renamed from: a */
        final C48293c<? super T> f122261a;

        /* renamed from: b */
        final C7326g<? super C48294d> f122262b;

        /* renamed from: c */
        final C47573k f122263c;

        /* renamed from: d */
        final C7323a f122264d;

        /* renamed from: e */
        C48294d f122265e;

        public final void onComplete() {
            if (this.f122265e != SubscriptionHelper.CANCELLED) {
                this.f122261a.onComplete();
            }
        }

        public final void cancel() {
            C48294d dVar = this.f122265e;
            if (dVar != SubscriptionHelper.CANCELLED) {
                this.f122265e = SubscriptionHelper.CANCELLED;
                try {
                    this.f122264d.mo8975a();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    C7332a.m23029a(th);
                }
                dVar.cancel();
            }
        }

        public final void onNext(T t) {
            this.f122261a.onNext(t);
        }

        public final void request(long j) {
            this.f122265e.request(j);
        }

        public final void onError(Throwable th) {
            if (this.f122265e != SubscriptionHelper.CANCELLED) {
                this.f122261a.onError(th);
            } else {
                C7332a.m23029a(th);
            }
        }

        public final void onSubscribe(C48294d dVar) {
            try {
                this.f122262b.accept(dVar);
                if (SubscriptionHelper.validate(this.f122265e, dVar)) {
                    this.f122265e = dVar;
                    this.f122261a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                dVar.cancel();
                this.f122265e = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.f122261a);
            }
        }

        C47698a(C48293c<? super T> cVar, C7326g<? super C48294d> gVar, C47573k kVar, C7323a aVar) {
            this.f122261a = cVar;
            this.f122262b = gVar;
            this.f122264d = aVar;
            this.f122263c = kVar;
        }
    }

    /* renamed from: a_ */
    public final void mo10197a_(C48293c<? super T> cVar) {
        this.f20450a.mo19154a((C47597i<? super T>) new C47698a<Object>(cVar, this.f122258c, this.f122259d, this.f122260e));
    }

    public C47697e(C7329e<T> eVar, C7326g<? super C48294d> gVar, C47573k kVar, C7323a aVar) {
        super(eVar);
        this.f122258c = gVar;
        this.f122259d = kVar;
        this.f122260e = aVar;
    }
}
