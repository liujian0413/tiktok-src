package p346io.reactivex.internal.subscriptions;

import org.p361a.C48293c;

/* renamed from: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final C48293c<? super T> downstream;
    protected T value;

    public void cancel() {
        set(4);
        this.value = null;
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    public DeferredScalarSubscription(C48293c<? super T> cVar) {
        this.downstream = cVar;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.value;
                            if (t != null) {
                                this.value = null;
                                C48293c<? super T> cVar = this.downstream;
                                cVar.onNext(t);
                                if (get() != 4) {
                                    cVar.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C48293c<? super T> cVar = this.downstream;
                    cVar.onNext(t);
                    if (get() != 4) {
                        cVar.onComplete();
                    }
                    return;
                }
                this.value = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.value = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t;
        lazySet(16);
        C48293c<? super T> cVar2 = this.downstream;
        cVar2.onNext(t);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }
}
