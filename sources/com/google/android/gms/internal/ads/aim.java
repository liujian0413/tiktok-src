package com.google.android.gms.internal.ads;

@C6505uv
final class aim implements Runnable {

    /* renamed from: a */
    private ahv f40338a;

    /* renamed from: b */
    private boolean f40339b;

    aim(ahv ahv) {
        this.f40338a = ahv;
    }

    public final void run() {
        if (!this.f40339b) {
            this.f40338a.mo39428o();
            m46014c();
        }
    }

    /* renamed from: a */
    public final void mo39483a() {
        this.f40339b = true;
        this.f40338a.mo39428o();
    }

    /* renamed from: b */
    public final void mo39484b() {
        this.f40339b = false;
        m46014c();
    }

    /* renamed from: c */
    private final void m46014c() {
        acl.f40003a.removeCallbacks(this);
        acl.f40003a.postDelayed(this, 250);
    }
}
