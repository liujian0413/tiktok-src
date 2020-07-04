package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wm */
final class C16142wm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abk f45245a;

    /* renamed from: b */
    private final /* synthetic */ C16140wk f45246b;

    C16142wm(C16140wk wkVar, abk abk) {
        this.f45246b = wkVar;
        this.f45245a = abk;
    }

    public final void run() {
        this.f45246b.f45239h.mo37586a(this.f45245a);
        if (this.f45246b.f45243l != null) {
            this.f45246b.f45243l.mo41761a();
            this.f45246b.f45243l = null;
        }
    }
}
