package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@C6505uv
final class agm<V> extends FutureTask<V> implements agj<V> {

    /* renamed from: a */
    private final agk f40188a = new agk();

    agm(Callable<V> callable) {
        super(callable);
    }

    agm(Runnable runnable, V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public final void mo39308a(Runnable runnable, Executor executor) {
        this.f40188a.mo39320a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f40188a.mo39319a();
    }
}
