package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza;

final class bem implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f41784a;

    /* renamed from: b */
    private final /* synthetic */ boolean f41785b;

    /* renamed from: c */
    private final /* synthetic */ beh f41786c;

    bem(beh beh, int i, boolean z) {
        this.f41786c = beh;
        this.f41784a = i;
        this.f41785b = z;
    }

    public final void run() {
        zza b = this.f41786c.mo40556b(this.f41784a, this.f41785b);
        this.f41786c.f41765f = b;
        if (beh.m48537b(this.f41784a, b)) {
            this.f41786c.mo40553a(this.f41784a + 1, this.f41785b);
        }
    }
}
