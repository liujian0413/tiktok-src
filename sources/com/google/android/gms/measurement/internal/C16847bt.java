package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bt */
final class C16847bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47090a;

    /* renamed from: b */
    private final /* synthetic */ String f47091b;

    /* renamed from: c */
    private final /* synthetic */ String f47092c;

    /* renamed from: d */
    private final /* synthetic */ long f47093d;

    /* renamed from: e */
    private final /* synthetic */ C16828ba f47094e;

    C16847bt(C16828ba baVar, String str, String str2, String str3, long j) {
        this.f47094e = baVar;
        this.f47090a = str;
        this.f47091b = str2;
        this.f47092c = str3;
        this.f47093d = j;
    }

    public final void run() {
        if (this.f47090a == null) {
            this.f47094e.f47035a.f47278a.mo43666j().mo43765a(this.f47091b, (C16870cp) null);
            return;
        }
        this.f47094e.f47035a.f47278a.mo43666j().mo43765a(this.f47091b, new C16870cp(this.f47092c, this.f47090a, this.f47093d));
    }
}
