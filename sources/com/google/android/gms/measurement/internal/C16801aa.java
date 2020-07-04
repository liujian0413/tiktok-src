package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.aa */
final class C16801aa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f46900a;

    /* renamed from: b */
    private final /* synthetic */ long f46901b;

    /* renamed from: c */
    private final /* synthetic */ C16800a f46902c;

    C16801aa(C16800a aVar, String str, long j) {
        this.f46902c = aVar;
        this.f46900a = str;
        this.f46901b = j;
    }

    public final void run() {
        this.f46902c.m55369c(this.f46900a, this.f46901b);
    }
}
