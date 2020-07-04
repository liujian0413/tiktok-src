package p346io.reactivex.internal.subscribers;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.C47597i;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.subscribers.LambdaSubscriber */
public final class LambdaSubscriber<T> extends AtomicReference<C48294d> implements C7321c, C47597i<T>, C48294d {
    private static final long serialVersionUID = -7251123623727029452L;
    final C7323a onComplete;
    final C7326g<? super Throwable> onError;
    final C7326g<? super T> onNext;
    final C7326g<? super C48294d> onSubscribe;

    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public final void dispose() {
        cancel();
    }

    public final boolean hasCustomOnError() {
        if (this.onError != C7342a.f20432f) {
            return true;
        }
        return false;
    }

    public final boolean isDisposed() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.mo8975a();
            } catch (Throwable th) {
                C7331a.m23009b(th);
                C7332a.m23029a(th);
            }
        }
    }

    public final void request(long j) {
        ((C48294d) get()).request(j);
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                ((C48294d) get()).cancel();
                onError(th);
            }
        }
    }

    public final void onSubscribe(C48294d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                C7331a.m23009b(th);
                dVar.cancel();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                C7331a.m23009b(th2);
                C7332a.m23029a((Throwable) new CompositeException(th, th2));
            }
        } else {
            C7332a.m23029a(th);
        }
    }

    public LambdaSubscriber(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar, C7326g<? super C48294d> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
    }
}
