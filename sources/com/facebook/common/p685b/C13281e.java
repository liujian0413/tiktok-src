package com.facebook.common.p685b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.e */
public class C13281e extends AbstractExecutorService implements C13280d {

    /* renamed from: a */
    private final Handler f35176a;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo32508a() {
        if (Thread.currentThread() == this.f35176a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public C13281e(Handler handler) {
        this.f35176a = handler;
    }

    public void execute(Runnable runnable) {
        this.f35176a.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> C13282f<T> newTaskFor(Callable<T> callable) {
        return new C13282f<>(this.f35176a, callable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable != null) {
            C13282f a = newTaskFor(callable);
            execute(a);
            return a;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> C13282f<T> newTaskFor(Runnable runnable, T t) {
        return new C13282f<>(this.f35176a, runnable, t);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            C13282f a = newTaskFor(runnable, t);
            execute(a);
            return a;
        }
        throw new NullPointerException();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C13282f a = newTaskFor(runnable, null);
        this.f35176a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C13282f a = newTaskFor(callable);
        this.f35176a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
