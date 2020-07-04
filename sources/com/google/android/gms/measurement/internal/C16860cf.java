package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cf */
final class C16860cf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47126a;

    /* renamed from: b */
    private final /* synthetic */ String f47127b;

    /* renamed from: c */
    private final /* synthetic */ long f47128c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f47129d;

    /* renamed from: e */
    private final /* synthetic */ boolean f47130e;

    /* renamed from: f */
    private final /* synthetic */ boolean f47131f;

    /* renamed from: g */
    private final /* synthetic */ boolean f47132g;

    /* renamed from: h */
    private final /* synthetic */ String f47133h;

    /* renamed from: i */
    private final /* synthetic */ C16858cd f47134i;

    C16860cf(C16858cd cdVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f47134i = cdVar;
        this.f47126a = str;
        this.f47127b = str2;
        this.f47128c = j;
        this.f47129d = bundle;
        this.f47130e = z;
        this.f47131f = z2;
        this.f47132g = z3;
        this.f47133h = str3;
    }

    public final void run() {
        this.f47134i.m55598a(this.f47126a, this.f47127b, this.f47128c, this.f47129d, this.f47130e, this.f47131f, this.f47132g, this.f47133h);
    }
}
