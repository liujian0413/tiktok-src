package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ce */
final class C16859ce implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47124a;

    /* renamed from: b */
    private final /* synthetic */ C16858cd f47125b;

    public final void run() {
        synchronized (this.f47124a) {
            try {
                this.f47124a.set(Boolean.valueOf(this.f47125b.mo43587s().mo44061h(this.f47125b.mo43574f().mo44135v())));
                this.f47124a.notify();
            } catch (Throwable th) {
                this.f47124a.notify();
                throw th;
            }
        }
    }
}
