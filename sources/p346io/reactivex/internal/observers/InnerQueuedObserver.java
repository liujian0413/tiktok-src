package p346io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p353b.C47600d;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.util.C47842j;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.InnerQueuedObserver */
public final class InnerQueuedObserver<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final C47612e<T> parent;
    final int prefetch;
    C47604i<T> queue;

    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final int fusionMode() {
        return this.fusionMode;
    }

    public final boolean isDone() {
        return this.done;
    }

    public final C47604i<T> queue() {
        return this.queue;
    }

    public final void setDone() {
        this.done = true;
    }

    public final void onComplete() {
        this.parent.mo19235a(this);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed((C7321c) get());
    }

    public final void onError(Throwable th) {
        this.parent.mo19237a(this, th);
    }

    public final void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.mo19236a(this, t);
        } else {
            this.parent.mo19234a();
        }
    }

    public final void onSubscribe(C7321c cVar) {
        if (DisposableHelper.setOnce(this, cVar)) {
            if (cVar instanceof C47600d) {
                C47600d dVar = (C47600d) cVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    this.done = true;
                    this.parent.mo19235a(this);
                    return;
                } else if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = dVar;
                    return;
                }
            }
            this.queue = C47842j.m148737a(-this.prefetch);
        }
    }

    public InnerQueuedObserver(C47612e<T> eVar, int i) {
        this.parent = eVar;
        this.prefetch = i;
    }
}
