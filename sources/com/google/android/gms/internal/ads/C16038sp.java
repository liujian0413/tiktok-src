package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sp */
final class C16038sp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C16037so f44975a;

    C16038sp(C16037so soVar) {
        this.f44975a = soVar;
    }

    public final void run() {
        if (this.f44975a.f44974h.get()) {
            acd.m45779c("Timed out waiting for WebView to finish loading.");
            this.f44975a.mo39127b();
        }
    }
}
