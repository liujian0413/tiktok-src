package p346io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.util.AtomicThrowable */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final Throwable terminate() {
        return C47836e.m148717a((AtomicReference<Throwable>) this);
    }

    public final boolean isTerminated() {
        if (get() == C47836e.f122622a) {
            return true;
        }
        return false;
    }

    public final boolean addThrowable(Throwable th) {
        return C47836e.m148718a(this, th);
    }
}
