package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.dn */
final /* synthetic */ class C16895dn implements Runnable {

    /* renamed from: a */
    private final C16894dm f47243a;

    /* renamed from: b */
    private final int f47244b;

    /* renamed from: c */
    private final C16953r f47245c;

    /* renamed from: d */
    private final Intent f47246d;

    C16895dn(C16894dm dmVar, int i, C16953r rVar, Intent intent) {
        this.f47243a = dmVar;
        this.f47244b = i;
        this.f47245c = rVar;
        this.f47246d = intent;
    }

    public final void run() {
        this.f47243a.mo43813a(this.f47244b, this.f47245c, this.f47246d);
    }
}
