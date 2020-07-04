package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14845l;

/* renamed from: com.google.android.gms.ads.internal.r */
final class C14861r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f38478a;

    /* renamed from: b */
    private final /* synthetic */ C14860q f38479b;

    C14861r(C14860q qVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f38479b = qVar;
        this.f38478a = adOverlayInfoParcel;
    }

    public final void run() {
        C14845l.m43136a(this.f38479b.f38476a.f38140e.f38268c, this.f38478a, true);
    }
}
