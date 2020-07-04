package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cl */
final class C16866cl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f47155a;

    /* renamed from: b */
    private final /* synthetic */ C16858cd f47156b;

    C16866cl(C16858cd cdVar, boolean z) {
        this.f47156b = cdVar;
        this.f47155a = z;
    }

    public final void run() {
        boolean t = this.f47156b.f47095q.mo43672t();
        boolean s = this.f47156b.f47095q.mo43671s();
        this.f47156b.f47095q.mo43657a(this.f47155a);
        if (s == this.f47155a) {
            this.f47156b.f47095q.mo43585q().f47495i.mo44161a("Default data collection state already set to", Boolean.valueOf(this.f47155a));
        }
        if (this.f47156b.f47095q.mo43672t() == t || this.f47156b.f47095q.mo43672t() != this.f47156b.f47095q.mo43671s()) {
            this.f47156b.f47095q.mo43585q().f47492f.mo44162a("Default data collection is different than actual status", Boolean.valueOf(this.f47155a), Boolean.valueOf(t));
        }
        this.f47156b.m55594E();
    }
}
