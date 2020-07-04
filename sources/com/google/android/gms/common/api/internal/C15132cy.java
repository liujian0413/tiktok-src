package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cy */
final class C15132cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f39139a;

    /* renamed from: b */
    private final /* synthetic */ String f39140b;

    /* renamed from: c */
    private final /* synthetic */ zzc f39141c;

    C15132cy(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.f39141c = zzc;
        this.f39139a = lifecycleCallback;
        this.f39140b = str;
    }

    public final void run() {
        if (this.f39141c.f39238c > 0) {
            this.f39139a.mo38278a(this.f39141c.f39239d != null ? this.f39141c.f39239d.getBundle(this.f39140b) : null);
        }
        if (this.f39141c.f39238c >= 2) {
            this.f39139a.mo38280b();
        }
        if (this.f39141c.f39238c >= 3) {
            this.f39139a.mo38282c();
        }
        if (this.f39141c.f39238c >= 4) {
            this.f39139a.mo38283d();
        }
    }
}
