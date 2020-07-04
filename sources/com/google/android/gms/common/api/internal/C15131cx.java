package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cx */
final class C15131cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f39136a;

    /* renamed from: b */
    private final /* synthetic */ String f39137b;

    /* renamed from: c */
    private final /* synthetic */ C15130cw f39138c;

    C15131cx(C15130cw cwVar, LifecycleCallback lifecycleCallback, String str) {
        this.f39138c = cwVar;
        this.f39136a = lifecycleCallback;
        this.f39137b = str;
    }

    public final void run() {
        if (this.f39138c.f39134c > 0) {
            this.f39136a.mo38278a(this.f39138c.f39135d != null ? this.f39138c.f39135d.getBundle(this.f39137b) : null);
        }
        if (this.f39138c.f39134c >= 2) {
            this.f39136a.mo38280b();
        }
        if (this.f39138c.f39134c >= 3) {
            this.f39136a.mo38282c();
        }
        if (this.f39138c.f39134c >= 4) {
            this.f39136a.mo38283d();
        }
    }
}
