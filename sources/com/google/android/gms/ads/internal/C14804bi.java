package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;

/* renamed from: com.google.android.gms.ads.internal.bi */
final class C14804bi implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abk f38305a;

    /* renamed from: b */
    private final /* synthetic */ C14802bg f38306b;

    C14804bi(C14802bg bgVar, abk abk) {
        this.f38306b = bgVar;
        this.f38305a = abk;
    }

    public final void run() {
        C14802bg bgVar = this.f38306b;
        abj abj = new abj(this.f38305a, null, null, null, null, null, null, null);
        bgVar.mo37611b(abj);
    }
}
