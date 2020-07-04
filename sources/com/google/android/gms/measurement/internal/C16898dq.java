package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dq */
final class C16898dq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16912ed f47251a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f47252b;

    C16898dq(C16894dm dmVar, C16912ed edVar, Runnable runnable) {
        this.f47251a = edVar;
        this.f47252b = runnable;
    }

    public final void run() {
        this.f47251a.mo43873n();
        this.f47251a.mo43854a(this.f47252b);
        this.f47251a.mo43872k();
    }
}
