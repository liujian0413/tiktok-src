package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bc */
final class C16830bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47040a;

    /* renamed from: b */
    private final /* synthetic */ long f47041b;

    /* renamed from: c */
    private final /* synthetic */ C16800a f47042c;

    C16830bc(C16800a aVar, String str, long j) {
        this.f47042c = aVar;
        this.f47040a = str;
        this.f47041b = j;
    }

    public final void run() {
        this.f47042c.m55370d(this.f47040a, this.f47041b);
    }
}
