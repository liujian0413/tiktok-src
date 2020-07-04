package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.common.api.internal.cm */
public final class C15120cm implements C15039b, C15040c {

    /* renamed from: a */
    public final C15017a<?> f39089a;

    /* renamed from: b */
    public C15121cn f39090b;

    /* renamed from: c */
    private final boolean f39091c;

    public C15120cm(C15017a<?> aVar, boolean z) {
        this.f39089a = aVar;
        this.f39091c = z;
    }

    /* renamed from: a */
    public final void mo38258a(Bundle bundle) {
        m43873a();
        this.f39090b.mo38258a(bundle);
    }

    /* renamed from: a */
    public final void mo38257a(int i) {
        m43873a();
        this.f39090b.mo38257a(i);
    }

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
        m43873a();
        this.f39090b.mo38313a(connectionResult, this.f39089a, this.f39091c);
    }

    /* renamed from: a */
    private final void m43873a() {
        C15267r.m44385a(this.f39090b, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
