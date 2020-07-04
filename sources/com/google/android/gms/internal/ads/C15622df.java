package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.df */
final class C15622df implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15621de f44289a;

    C15622df(C15621de deVar) {
        this.f44289a = deVar;
    }

    public final void run() {
        if (this.f44289a.f44288p != null) {
            this.f44289a.f44288p.mo41591l();
            this.f44289a.f44288p.mo41590k();
            this.f44289a.f44288p.mo41593n();
        }
        this.f44289a.f44288p = null;
    }
}
