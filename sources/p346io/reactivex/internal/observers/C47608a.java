package p346io.reactivex.internal.observers;

import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.observers.a */
public abstract class C47608a<T, R> implements C47600d<R>, C7498y<T> {

    /* renamed from: a */
    protected final C7498y<? super R> f122051a;

    /* renamed from: b */
    protected C7321c f122052b;

    /* renamed from: c */
    protected C47600d<T> f122053c;

    /* renamed from: d */
    protected boolean f122054d;

    /* renamed from: e */
    protected int f122055e;

    public void clear() {
        this.f122053c.clear();
    }

    public void dispose() {
        this.f122052b.dispose();
    }

    public boolean isDisposed() {
        return this.f122052b.isDisposed();
    }

    public boolean isEmpty() {
        return this.f122053c.isEmpty();
    }

    public void onComplete() {
        if (!this.f122054d) {
            this.f122054d = true;
            this.f122051a.onComplete();
        }
    }

    public C47608a(C7498y<? super R> yVar) {
        this.f122051a = yVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119705a(Throwable th) {
        C7331a.m23009b(th);
        this.f122052b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo119704a(int i) {
        C47600d<T> dVar = this.f122053c;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f122055e = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f122054d) {
            C7332a.m23029a(th);
            return;
        }
        this.f122054d = true;
        this.f122051a.onError(th);
    }

    public final void onSubscribe(C7321c cVar) {
        if (DisposableHelper.validate(this.f122052b, cVar)) {
            this.f122052b = cVar;
            if (cVar instanceof C47600d) {
                this.f122053c = (C47600d) cVar;
            }
            this.f122051a.onSubscribe(this);
        }
    }
}
