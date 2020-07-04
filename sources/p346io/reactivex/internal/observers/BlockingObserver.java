package p346io.reactivex.internal.observers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.util.NotificationLite;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.observers.BlockingObserver */
public final class BlockingObserver<T> extends AtomicReference<C7321c> implements C7321c, C7498y<T> {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public final void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public final boolean isDisposed() {
        if (get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    public final void onSubscribe(C7321c cVar) {
        DisposableHelper.setOnce(this, cVar);
    }

    public BlockingObserver(Queue<Object> queue2) {
        this.queue = queue2;
    }

    public final void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    public final void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }
}
