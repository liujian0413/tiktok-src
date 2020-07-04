package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: com.google.android.gms.measurement.internal.ch */
final class C16862ch implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConditionalUserProperty f47140a;

    /* renamed from: b */
    private final /* synthetic */ C16858cd f47141b;

    C16862ch(C16858cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        this.f47141b = cdVar;
        this.f47140a = conditionalUserProperty;
    }

    public final void run() {
        this.f47141b.m55608d(this.f47140a);
    }
}
