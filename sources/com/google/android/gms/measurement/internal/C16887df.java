package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.df */
final class C16887df implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f47227a;

    /* renamed from: b */
    private final /* synthetic */ zzfv f47228b;

    /* renamed from: c */
    private final /* synthetic */ zzk f47229c;

    /* renamed from: d */
    private final /* synthetic */ C16875cu f47230d;

    C16887df(C16875cu cuVar, boolean z, zzfv zzfv, zzk zzk) {
        this.f47230d = cuVar;
        this.f47227a = z;
        this.f47228b = zzfv;
        this.f47229c = zzk;
    }

    public final void run() {
        C16944i d = this.f47230d.f47176c;
        if (d == null) {
            this.f47230d.mo43585q().f47487a.mo44160a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f47230d.mo43775a(d, this.f47227a ? null : this.f47228b, this.f47229c);
        this.f47230d.m55701E();
    }
}
