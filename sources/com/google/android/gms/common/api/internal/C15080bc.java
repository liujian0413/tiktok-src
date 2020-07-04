package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C15133d.C15134a;

/* renamed from: com.google.android.gms.common.api.internal.bc */
final class C15080bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f39015a;

    /* renamed from: b */
    private final /* synthetic */ C15134a f39016b;

    C15080bc(C15134a aVar, ConnectionResult connectionResult) {
        this.f39016b = aVar;
        this.f39015a = connectionResult;
    }

    public final void run() {
        this.f39016b.mo38259a(this.f39015a);
    }
}
