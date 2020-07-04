package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cj */
final class C16864cj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47144a;

    /* renamed from: b */
    private final /* synthetic */ String f47145b;

    /* renamed from: c */
    private final /* synthetic */ String f47146c;

    /* renamed from: d */
    private final /* synthetic */ String f47147d;

    /* renamed from: e */
    private final /* synthetic */ C16858cd f47148e;

    C16864cj(C16858cd cdVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f47148e = cdVar;
        this.f47144a = atomicReference;
        this.f47145b = str;
        this.f47146c = str2;
        this.f47147d = str3;
    }

    public final void run() {
        this.f47148e.f47095q.mo43667k().mo43780a(this.f47144a, this.f47145b, this.f47146c, this.f47147d);
    }
}
