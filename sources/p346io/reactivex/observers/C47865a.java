package p346io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C47560b;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.util.C47835d;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.observers.a */
public abstract class C47865a implements C47560b, C7321c {

    /* renamed from: b */
    final AtomicReference<C7321c> f122673b = new AtomicReference<>();

    public final void dispose() {
        DisposableHelper.dispose(this.f122673b);
    }

    public final boolean isDisposed() {
        if (this.f122673b.get() == DisposableHelper.DISPOSED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C7321c cVar) {
        C47835d.m148714a(this.f122673b, cVar, getClass());
    }
}
