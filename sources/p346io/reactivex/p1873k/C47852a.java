package p346io.reactivex.p1873k;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.internal.util.C47835d;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.k.a */
public abstract class C47852a<T> implements C7321c, C47597i<T> {

    /* renamed from: c */
    final AtomicReference<C48294d> f122666c = new AtomicReference<>();

    public final void dispose() {
        SubscriptionHelper.cancel(this.f122666c);
    }

    public final boolean isDisposed() {
        if (this.f122666c.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m148769a() {
        ((C48294d) this.f122666c.get()).request(Long.MAX_VALUE);
    }

    public final void onSubscribe(C48294d dVar) {
        if (C47835d.m148715a(this.f122666c, dVar, getClass())) {
            m148769a();
        }
    }
}
