package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.bq */
final class C15094bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15093bp f39036a;

    C15094bq(C15093bp bpVar) {
        this.f39036a = bpVar;
    }

    public final void run() {
        this.f39036a.f39035h.mo38353b(new ConnectionResult(4));
    }
}
