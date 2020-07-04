package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ck */
final class C16865ck implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47149a;

    /* renamed from: b */
    private final /* synthetic */ String f47150b;

    /* renamed from: c */
    private final /* synthetic */ String f47151c;

    /* renamed from: d */
    private final /* synthetic */ String f47152d;

    /* renamed from: e */
    private final /* synthetic */ boolean f47153e;

    /* renamed from: f */
    private final /* synthetic */ C16858cd f47154f;

    C16865ck(C16858cd cdVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f47154f = cdVar;
        this.f47149a = atomicReference;
        this.f47150b = str;
        this.f47151c = str2;
        this.f47152d = str3;
        this.f47153e = z;
    }

    public final void run() {
        this.f47154f.f47095q.mo43667k().mo43781a(this.f47149a, this.f47150b, this.f47151c, this.f47152d, this.f47153e);
    }
}
