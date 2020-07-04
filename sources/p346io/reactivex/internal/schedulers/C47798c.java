package p346io.reactivex.internal.schedulers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.schedulers.c */
final class C47798c implements Future<Object> {

    /* renamed from: a */
    final C7321c f122533a;

    public final Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    C47798c(C7321c cVar) {
        this.f122533a = cVar;
    }

    public final boolean cancel(boolean z) {
        this.f122533a.dispose();
        return false;
    }
}
