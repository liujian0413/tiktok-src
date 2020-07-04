package p346io.reactivex.p347b;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.internal.p352a.C7364b;

/* renamed from: io.reactivex.b.e */
abstract class C47564e<T> extends AtomicReference<T> implements C7321c {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119659a(T t);

    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo119659a(andSet);
            }
        }
    }

    C47564e(T t) {
        super(C7364b.m23081a(t, "value is null"));
    }
}
