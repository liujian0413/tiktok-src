package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abz;
import com.google.android.gms.internal.ads.acl;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.q */
final class C14860q extends abz {

    /* renamed from: a */
    final /* synthetic */ C14832n f38476a;

    /* renamed from: b */
    private final int f38477b;

    public C14860q(C14832n nVar, int i) {
        this.f38476a = nVar;
        this.f38477b = i;
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    /* renamed from: a */
    public final void mo37835a() {
        zzar zzar = new zzar(this.f38476a.f38140e.f38258M, acl.m45567o(this.f38476a.f38140e.f38268c), this.f38476a.f38398l, this.f38476a.f38399m, this.f38476a.f38140e.f38258M ? this.f38477b : -1, this.f38476a.f38400o, this.f38476a.f38140e.f38275j.f39851L, this.f38476a.f38140e.f38275j.f39854O);
        int requestedOrientation = this.f38476a.f38140e.f38275j.f39862b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f38476a.f38140e.f38275j.f39868h;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.f38476a, this.f38476a, this.f38476a, this.f38476a.f38140e.f38275j.f39862b, requestedOrientation, this.f38476a.f38140e.f38270e, this.f38476a.f38140e.f38275j.f39840A, zzar);
        acl.f40003a.post(new C14861r(this, adOverlayInfoParcel));
    }
}
