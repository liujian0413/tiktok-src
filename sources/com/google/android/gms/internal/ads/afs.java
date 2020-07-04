package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;

@C6505uv
public abstract class afs extends AbstractExecutorService implements agn {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new agm(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new agm(callable);
    }

    /* renamed from: a */
    public final agj<?> submit(Runnable runnable) throws RejectedExecutionException {
        return (agj) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> agj<T> submit(Callable<T> callable) throws RejectedExecutionException {
        return (agj) super.submit(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (agj) super.submit(runnable, obj);
    }
}
