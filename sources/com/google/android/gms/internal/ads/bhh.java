package com.google.android.gms.internal.ads;

import android.view.Surface;

final class bhh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Surface f42007a;

    /* renamed from: b */
    private final /* synthetic */ bhf f42008b;

    bhh(bhf bhf, Surface surface) {
        this.f42008b = bhf;
        this.f42007a = surface;
    }

    public final void run() {
        this.f42008b.f41987e.mo39511a(this.f42007a);
    }
}
