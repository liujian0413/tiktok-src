package p346io.reactivex.internal.subscribers;

import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.subscribers.b */
public abstract class C47827b<T, R> implements C47597i<T>, C47602f<R> {

    /* renamed from: e */
    protected final C48293c<? super R> f122610e;

    /* renamed from: f */
    protected C48294d f122611f;

    /* renamed from: g */
    protected C47602f<T> f122612g;

    /* renamed from: h */
    protected boolean f122613h;

    /* renamed from: i */
    protected int f122614i;

    public void cancel() {
        this.f122611f.cancel();
    }

    public void clear() {
        this.f122612g.clear();
    }

    public boolean isEmpty() {
        return this.f122612g.isEmpty();
    }

    public void onComplete() {
        if (!this.f122613h) {
            this.f122613h = true;
            this.f122610e.onComplete();
        }
    }

    public C47827b(C48293c<? super R> cVar) {
        this.f122610e = cVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f122611f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119850a(Throwable th) {
        C7331a.m23009b(th);
        this.f122611f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo119849a(int i) {
        C47602f<T> fVar = this.f122612g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f122614i = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f122613h) {
            C7332a.m23029a(th);
            return;
        }
        this.f122613h = true;
        this.f122610e.onError(th);
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.validate(this.f122611f, dVar)) {
            this.f122611f = dVar;
            if (dVar instanceof C47602f) {
                this.f122612g = (C47602f) dVar;
            }
            this.f122610e.onSubscribe(this);
        }
    }
}
