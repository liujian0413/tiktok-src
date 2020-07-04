package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cg */
final class C16861cg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47135a;

    /* renamed from: b */
    private final /* synthetic */ String f47136b;

    /* renamed from: c */
    private final /* synthetic */ Object f47137c;

    /* renamed from: d */
    private final /* synthetic */ long f47138d;

    /* renamed from: e */
    private final /* synthetic */ C16858cd f47139e;

    C16861cg(C16858cd cdVar, String str, String str2, Object obj, long j) {
        this.f47139e = cdVar;
        this.f47135a = str;
        this.f47136b = str2;
        this.f47137c = obj;
        this.f47138d = j;
    }

    public final void run() {
        this.f47139e.mo43733a(this.f47135a, this.f47136b, this.f47137c, this.f47138d);
    }
}
