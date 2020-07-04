package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.k */
final /* synthetic */ class C14844k implements Runnable {

    /* renamed from: a */
    private final C14843j f38454a;

    /* renamed from: b */
    private final Drawable f38455b;

    C14844k(C14843j jVar, Drawable drawable) {
        this.f38454a = jVar;
        this.f38455b = drawable;
    }

    public final void run() {
        C14843j jVar = this.f38454a;
        jVar.f38453a.f38425a.getWindow().setBackgroundDrawable(this.f38455b);
    }
}
