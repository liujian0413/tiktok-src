package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cw */
final class C16877cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47182a;

    /* renamed from: b */
    private final /* synthetic */ zzk f47183b;

    /* renamed from: c */
    private final /* synthetic */ C16875cu f47184c;

    C16877cw(C16875cu cuVar, AtomicReference atomicReference, zzk zzk) {
        this.f47184c = cuVar;
        this.f47182a = atomicReference;
        this.f47183b = zzk;
    }

    public final void run() {
        synchronized (this.f47182a) {
            try {
                C16944i d = this.f47184c.f47176c;
                if (d == null) {
                    this.f47184c.mo43585q().f47487a.mo44160a("Failed to get app instance id");
                    this.f47182a.notify();
                    return;
                }
                this.f47182a.set(d.mo43696c(this.f47183b));
                String str = (String) this.f47182a.get();
                if (str != null) {
                    this.f47184c.mo43573e().mo43729a(str);
                    this.f47184c.mo43586r().f46924j.mo43619a(str);
                }
                this.f47184c.m55701E();
                this.f47182a.notify();
            } catch (RemoteException e) {
                try {
                    this.f47184c.mo43585q().f47487a.mo44161a("Failed to get app instance id", e);
                    this.f47182a.notify();
                } catch (Throwable th) {
                    this.f47182a.notify();
                    throw th;
                }
            }
        }
    }
}
