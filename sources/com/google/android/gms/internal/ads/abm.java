package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C6505uv
final class abm {

    /* renamed from: a */
    public long f39910a = -1;

    /* renamed from: b */
    private long f39911b = -1;

    /* renamed from: c */
    private final /* synthetic */ abl f39912c;

    public abm(abl abl) {
        this.f39912c = abl;
    }

    /* renamed from: a */
    public final void mo39083a() {
        this.f39910a = this.f39912c.f39898b.mo38685b();
    }

    /* renamed from: b */
    public final void mo39084b() {
        this.f39911b = this.f39912c.f39898b.mo38685b();
    }

    /* renamed from: c */
    public final Bundle mo39085c() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f39911b);
        bundle.putLong("tclose", this.f39910a);
        return bundle;
    }
}
