package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.at */
public final class C16820at extends C16849bv {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicLong f46978j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C16824ax f46979a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C16824ax f46980b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C16823aw<?>> f46981c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final BlockingQueue<C16823aw<?>> f46982d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final UncaughtExceptionHandler f46983e = new C16822av(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: f */
    private final UncaughtExceptionHandler f46984f = new C16822av(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f46985g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Semaphore f46986h = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f46987i;

    C16820at(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43602d() {
        return false;
    }

    /* renamed from: c */
    public final void mo43571c() {
        if (Thread.currentThread() != this.f46979a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: b */
    public final void mo43569b() {
        if (Thread.currentThread() != this.f46980b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: f */
    public final boolean mo43648f() {
        return Thread.currentThread() == this.f46979a;
    }

    /* renamed from: a */
    public final <V> Future<V> mo43644a(Callable<V> callable) throws IllegalStateException {
        mo43718x();
        C15267r.m44384a(callable);
        C16823aw awVar = new C16823aw(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46979a) {
            if (!this.f46981c.isEmpty()) {
                mo43585q().f47490d.mo44160a("Callable skipped the worker queue.");
            }
            awVar.run();
        } else {
            m55470a(awVar);
        }
        return awVar;
    }

    /* renamed from: b */
    public final <V> Future<V> mo43646b(Callable<V> callable) throws IllegalStateException {
        mo43718x();
        C15267r.m44384a(callable);
        C16823aw awVar = new C16823aw(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46979a) {
            awVar.run();
        } else {
            m55470a(awVar);
        }
        return awVar;
    }

    /* renamed from: a */
    public final void mo43645a(Runnable runnable) throws IllegalStateException {
        mo43718x();
        C15267r.m44384a(runnable);
        m55470a(new C16823aw<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: a */
    private final void m55470a(C16823aw<?> awVar) {
        synchronized (this.f46985g) {
            this.f46981c.add(awVar);
            if (this.f46979a == null) {
                this.f46979a = new C16824ax(this, "Measurement Worker", this.f46981c);
                this.f46979a.setUncaughtExceptionHandler(this.f46983e);
                this.f46979a.start();
            } else {
                this.f46979a.mo43652a();
            }
        }
    }

    /* renamed from: b */
    public final void mo43647b(Runnable runnable) throws IllegalStateException {
        mo43718x();
        C15267r.m44384a(runnable);
        C16823aw awVar = new C16823aw(this, runnable, false, "Task exception on network thread");
        synchronized (this.f46985g) {
            this.f46982d.add(awVar);
            if (this.f46980b == null) {
                this.f46980b = new C16824ax(this, "Measurement Network", this.f46982d);
                this.f46980b.setUncaughtExceptionHandler(this.f46984f);
                this.f46980b.start();
            } else {
                this.f46980b.mo43652a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
