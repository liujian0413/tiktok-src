package p346io.reactivex.internal.observers;

import java.util.concurrent.CountDownLatch;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47560b;
import p346io.reactivex.C47856n;
import p346io.reactivex.internal.util.C47834c;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.c */
public final class C47610c<T> extends CountDownLatch implements C47557ad<T>, C47560b, C47856n<T> {

    /* renamed from: a */
    T f122056a;

    /* renamed from: b */
    Throwable f122057b;

    /* renamed from: c */
    C7321c f122058c;

    /* renamed from: d */
    volatile boolean f122059d;

    public final void onComplete() {
        countDown();
    }

    public C47610c() {
        super(1);
    }

    /* renamed from: b */
    private void m148404b() {
        this.f122059d = true;
        C7321c cVar = this.f122058c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public final T mo119706a() {
        if (getCount() != 0) {
            try {
                C47834c.m148711a();
                await();
            } catch (InterruptedException e) {
                m148404b();
                throw C47836e.m148716a((Throwable) e);
            }
        }
        Throwable th = this.f122057b;
        if (th == null) {
            return this.f122056a;
        }
        throw C47836e.m148716a(th);
    }

    public final void onError(Throwable th) {
        this.f122057b = th;
        countDown();
    }

    public final void onSuccess(T t) {
        this.f122056a = t;
        countDown();
    }

    public final void onSubscribe(C7321c cVar) {
        this.f122058c = cVar;
        if (this.f122059d) {
            cVar.dispose();
        }
    }
}
