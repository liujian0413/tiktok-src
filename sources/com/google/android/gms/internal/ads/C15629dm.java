package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dm */
final class C15629dm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15628dl f44334a;

    C15629dm(C15628dl dlVar) {
        this.f44334a = dlVar;
    }

    public final void run() {
        if (this.f44334a.f44333s != null) {
            this.f44334a.f44333s.mo41591l();
            this.f44334a.f44333s.mo41590k();
            this.f44334a.f44333s.mo41593n();
        }
        this.f44334a.f44333s = null;
    }
}
