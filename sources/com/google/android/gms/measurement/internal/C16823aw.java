package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.aw */
final class C16823aw<V> extends FutureTask<V> implements Comparable<C16823aw> {

    /* renamed from: a */
    final boolean f46990a;

    /* renamed from: b */
    private final long f46991b = C16820at.f46978j.getAndIncrement();

    /* renamed from: c */
    private final String f46992c;

    /* renamed from: d */
    private final /* synthetic */ C16820at f46993d;

    C16823aw(C16820at atVar, Callable<V> callable, boolean z, String str) {
        this.f46993d = atVar;
        super(callable);
        C15267r.m44384a(str);
        this.f46992c = str;
        this.f46990a = z;
        if (this.f46991b == Long.MAX_VALUE) {
            atVar.mo43585q().f47487a.mo44160a("Tasks index overflow");
        }
    }

    C16823aw(C16820at atVar, Runnable runnable, boolean z, String str) {
        this.f46993d = atVar;
        super(runnable, null);
        C15267r.m44384a(str);
        this.f46992c = str;
        this.f46990a = false;
        if (this.f46991b == Long.MAX_VALUE) {
            atVar.mo43585q().f47487a.mo44160a("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f46993d.mo43585q().f47487a.mo44161a(this.f46992c, th);
        if (th instanceof C16821au) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C16823aw awVar = (C16823aw) obj;
        if (this.f46990a != awVar.f46990a) {
            return this.f46990a ? -1 : 1;
        }
        if (this.f46991b < awVar.f46991b) {
            return -1;
        }
        if (this.f46991b > awVar.f46991b) {
            return 1;
        }
        this.f46993d.mo43585q().f47488b.mo44161a("Two tasks share the same index. index", Long.valueOf(this.f46991b));
        return 0;
    }
}
