package com.google.android.gms.internal.ads;

final class bjy implements Runnable {

    /* renamed from: a */
    private final bqk f42364a;

    /* renamed from: b */
    private final bwf f42365b;

    /* renamed from: c */
    private final Runnable f42366c;

    public bjy(bqk bqk, bwf bwf, Runnable runnable) {
        this.f42364a = bqk;
        this.f42365b = bwf;
        this.f42366c = runnable;
    }

    public final void run() {
        if (this.f42365b.f44047c == null) {
            this.f42364a.mo39252a(this.f42365b.f44045a);
        } else {
            this.f42364a.mo41149a(this.f42365b.f44047c);
        }
        if (this.f42365b.f44048d) {
            this.f42364a.mo41150b("intermediate-response");
        } else {
            this.f42364a.mo41152c("done");
        }
        if (this.f42366c != null) {
            this.f42366c.run();
        }
    }
}
