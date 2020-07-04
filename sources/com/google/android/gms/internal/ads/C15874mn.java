package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mn */
final class C15874mn implements agz<C15851lr> {

    /* renamed from: a */
    private final /* synthetic */ C15883mw f44661a;

    /* renamed from: b */
    private final /* synthetic */ C15863mc f44662b;

    C15874mn(C15863mc mcVar, C15883mw mwVar) {
        this.f44662b = mcVar;
        this.f44661a = mwVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo39342a(Object obj) {
        synchronized (this.f44662b.f44630a) {
            this.f44662b.f44637h = 0;
            if (!(this.f44662b.f44636g == null || this.f44661a == this.f44662b.f44636g)) {
                acd.m45438a("New JS engine is loaded, marking previous one as destroyable.");
                this.f44662b.f44636g.mo41764c();
            }
            this.f44662b.f44636g = this.f44661a;
        }
    }
}
