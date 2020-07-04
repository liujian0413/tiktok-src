package com.facebook.common.p685b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.common.b.f */
public final class C13282f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f35177a;

    /* renamed from: b */
    private final FutureTask<V> f35178b;

    public final V get() throws InterruptedException, ExecutionException {
        return this.f35178b.get();
    }

    public final boolean isCancelled() {
        return this.f35178b.isCancelled();
    }

    public final boolean isDone() {
        return this.f35178b.isDone();
    }

    public final void run() {
        this.f35178b.run();
    }

    /* renamed from: a */
    private static int m38823a(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public final boolean cancel(boolean z) {
        return this.f35178b.cancel(z);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m38823a((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f35178b.get(j, timeUnit);
    }

    public C13282f(Handler handler, Callable<V> callable) {
        this.f35177a = handler;
        this.f35178b = new FutureTask<>(callable);
    }

    public C13282f(Handler handler, Runnable runnable, V v) {
        this.f35177a = handler;
        this.f35178b = new FutureTask<>(runnable, v);
    }
}
