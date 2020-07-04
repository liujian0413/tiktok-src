package p346io.reactivex.internal.subscribers;

import org.p361a.C48294d;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.p353b.C47598a;
import p346io.reactivex.internal.p353b.C47602f;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.subscribers.a */
public abstract class C47826a<T, R> implements C47598a<T>, C47602f<R> {

    /* renamed from: e */
    protected final C47598a<? super R> f122605e;

    /* renamed from: f */
    protected C48294d f122606f;

    /* renamed from: g */
    protected C47602f<T> f122607g;

    /* renamed from: h */
    protected boolean f122608h;

    /* renamed from: i */
    protected int f122609i;

    public void cancel() {
        this.f122606f.cancel();
    }

    public void clear() {
        this.f122607g.clear();
    }

    public boolean isEmpty() {
        return this.f122607g.isEmpty();
    }

    public void onComplete() {
        if (!this.f122608h) {
            this.f122608h = true;
            this.f122605e.onComplete();
        }
    }

    public C47826a(C47598a<? super R> aVar) {
        this.f122605e = aVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f122606f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119848a(Throwable th) {
        C7331a.m23009b(th);
        this.f122606f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo119847a(int i) {
        C47602f<T> fVar = this.f122607g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f122609i = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f122608h) {
            C7332a.m23029a(th);
            return;
        }
        this.f122608h = true;
        this.f122605e.onError(th);
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.validate(this.f122606f, dVar)) {
            this.f122606f = dVar;
            if (dVar instanceof C47602f) {
                this.f122607g = (C47602f) dVar;
            }
            this.f122605e.onSubscribe(this);
        }
    }
}
