package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.measurement.ab */
final class C16382ab implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f45857a;

    /* renamed from: b */
    private final /* synthetic */ C16703z f45858b;

    C16382ab(C16703z zVar, ComponentName componentName) {
        this.f45858b = zVar;
        this.f45857a = componentName;
    }

    public final void run() {
        this.f45858b.f46668a.m54878a(this.f45857a);
    }
}
