package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14845l;

/* renamed from: com.google.android.gms.internal.ads.rc */
final class C15998rc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f44896a;

    /* renamed from: b */
    private final /* synthetic */ zzasq f44897b;

    C15998rc(zzasq zzasq, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f44897b = zzasq;
        this.f44896a = adOverlayInfoParcel;
    }

    public final void run() {
        C14845l.m43136a(this.f44897b.f45535a, this.f44896a, true);
    }
}
