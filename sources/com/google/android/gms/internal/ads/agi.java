package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C6505uv
final class agi<T> implements agj<T> {

    /* renamed from: a */
    private final T f40181a;

    /* renamed from: b */
    private final agk f40182b = new agk();

    agi(T t) {
        this.f40181a = t;
        this.f40182b.mo39319a();
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

    public final T get() {
        return this.f40181a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f40181a;
    }

    /* renamed from: a */
    public final void mo39308a(Runnable runnable, Executor executor) {
        this.f40182b.mo39320a(runnable, executor);
    }
}
