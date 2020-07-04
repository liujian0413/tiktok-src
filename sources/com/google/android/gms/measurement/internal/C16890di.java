package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.di */
final class C16890di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f47236a;

    /* renamed from: b */
    private final /* synthetic */ C16888dg f47237b;

    C16890di(C16888dg dgVar, ComponentName componentName) {
        this.f47237b = dgVar;
        this.f47236a = componentName;
    }

    public final void run() {
        this.f47237b.f47231a.m55707a(this.f47236a);
    }
}
