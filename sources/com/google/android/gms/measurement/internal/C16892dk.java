package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.dk */
final class C16892dk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16888dg f47240a;

    C16892dk(C16888dg dgVar) {
        this.f47240a = dgVar;
    }

    public final void run() {
        this.f47240a.f47231a.m55707a(new ComponentName(this.f47240a.f47231a.mo43581m(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
