package p346io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.util.C47835d;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.observers.b */
public abstract class C47866b<T> implements C7321c, C7498y<T> {

    /* renamed from: c */
    final AtomicReference<C7321c> f122674c = new AtomicReference<>();

    public final void dispose() {
        DisposableHelper.dispose(this.f122674c);
    }

    public final boolean isDisposed() {
        if (this.f122674c.get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C7321c cVar) {
        C47835d.m148714a(this.f122674c, cVar, getClass());
    }
}
