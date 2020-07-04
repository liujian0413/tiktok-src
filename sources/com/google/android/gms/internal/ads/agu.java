package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C6505uv
public class agu<T> implements agj<T> {

    /* renamed from: a */
    private final Object f40197a = new Object();

    /* renamed from: b */
    private T f40198b;

    /* renamed from: c */
    private Throwable f40199c;

    /* renamed from: d */
    private boolean f40200d;

    /* renamed from: e */
    private boolean f40201e;

    /* renamed from: f */
    private final agk f40202f = new agk();

    /* renamed from: a */
    public final void mo39308a(Runnable runnable, Executor executor) {
        this.f40202f.mo39320a(runnable, executor);
    }

    /* renamed from: b */
    public final void mo39333b(T t) {
        synchronized (this.f40197a) {
            if (!this.f40201e) {
                if (mo39331a()) {
                    C14793ay.m42898d().mo39092b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f40200d = true;
                this.f40198b = t;
                this.f40197a.notifyAll();
                this.f40202f.mo39319a();
            }
        }
    }

    /* renamed from: a */
    public final void mo39332a(Throwable th) {
        synchronized (this.f40197a) {
            if (!this.f40201e) {
                if (mo39331a()) {
                    C14793ay.m42898d().mo39092b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f40199c = th;
                this.f40197a.notifyAll();
                this.f40202f.mo39319a();
            }
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f40197a) {
            while (!mo39331a()) {
                this.f40197a.wait();
            }
            if (this.f40199c != null) {
                throw new ExecutionException(this.f40199c);
            } else if (!this.f40201e) {
                t = this.f40198b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f40197a) {
            long millis = timeUnit.toMillis(j);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = millis + currentTimeMillis;
            while (!mo39331a() && currentTimeMillis < j2) {
                this.f40197a.wait(j2 - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
            if (this.f40201e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else if (this.f40199c != null) {
                throw new ExecutionException(this.f40199c);
            } else if (this.f40200d) {
                t = this.f40198b;
            } else {
                throw new TimeoutException("SettableFuture timed out.");
            }
        }
        return t;
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f40197a) {
            if (mo39331a()) {
                return false;
            }
            this.f40201e = true;
            this.f40200d = true;
            this.f40197a.notifyAll();
            this.f40202f.mo39319a();
            return true;
        }
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f40197a) {
            z = this.f40201e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f40197a) {
            a = mo39331a();
        }
        return a;
    }

    /* renamed from: a */
    private final boolean mo39331a() {
        return this.f40199c != null || this.f40200d;
    }
}
