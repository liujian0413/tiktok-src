package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;

/* renamed from: com.google.android.gms.common.api.internal.ai */
final class C15058ai implements C15039b, C15040c {

    /* renamed from: a */
    private final /* synthetic */ C15159z f38949a;

    private C15058ai(C15159z zVar) {
        this.f38949a = zVar;
    }

    /* renamed from: a */
    public final void mo38257a(int i) {
    }

    /* renamed from: a */
    public final void mo38258a(Bundle bundle) {
        this.f38949a.f39223k.mo44183a(new C15056ag(this.f38949a));
    }

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
        this.f38949a.f39214b.lock();
        try {
            if (this.f38949a.m44101a(connectionResult)) {
                this.f38949a.m44117g();
                this.f38949a.m44112e();
            } else {
                this.f38949a.m44104b(connectionResult);
            }
        } finally {
            this.f38949a.f39214b.unlock();
        }
    }

    /* synthetic */ C15058ai(C15159z zVar, C15050aa aaVar) {
        this(zVar);
    }
}
