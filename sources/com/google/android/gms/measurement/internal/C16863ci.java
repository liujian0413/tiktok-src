package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.ci */
final class C16863ci implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f47142a;

    /* renamed from: b */
    private final /* synthetic */ C16858cd f47143b;

    C16863ci(C16858cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        this.f47143b = cdVar;
        this.f47142a = conditionalUserProperty;
    }

    public final void run() {
        this.f47143b.m55609e(this.f47142a);
    }
}
