package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C6505uv
final class agh<T> implements agj<T> {

    /* renamed from: a */
    private final Throwable f40179a;

    /* renamed from: b */
    private final agk f40180b = new agk();

    agh(Throwable th) {
        this.f40179a = th;
        this.f40180b.mo39319a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f40179a);
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f40179a);
    }

    /* renamed from: a */
    public final void mo39308a(Runnable runnable, Executor executor) {
        this.f40180b.mo39320a(runnable, executor);
    }
}
