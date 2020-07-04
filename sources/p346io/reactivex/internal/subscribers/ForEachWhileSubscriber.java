package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.subscribers.ForEachWhileSubscriber */
public final class ForEachWhileSubscriber<T> extends AtomicReference<C48294d> implements C7321c, C47597i<T> {
    private static final long serialVersionUID = -4403180040475402120L;
    boolean done;
    final C7323a onComplete;
    final C7326g<? super Throwable> onError;
    final C7328l<? super T> onNext;

    public final void dispose() {
        SubscriptionHelper.cancel(this);
    }

    public final boolean isDisposed() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (!this.done) {
            this.done = true;
            try {
                this.onComplete.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
        }
    }

    public final void onSubscribe(C48294d dVar) {
        SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
    }

    public final void onNext(T t) {
        if (!this.done) {
            try {
                if (!this.onNext.mo9283a(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                C7331a.m23009b(th);
                dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.done) {
            C7332a.m23029a(th);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            C7331a.m23009b(th2);
            C7332a.m23029a((Throwable) new CompositeException(th, th2));
        }
    }

    public ForEachWhileSubscriber(C7328l<? super T> lVar, C7326g<? super Throwable> gVar, C7323a aVar) {
        this.onNext = lVar;
        this.onError = gVar;
        this.onComplete = aVar;
    }
}
