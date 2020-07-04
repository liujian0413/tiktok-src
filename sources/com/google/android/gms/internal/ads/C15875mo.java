package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mo */
final class C15875mo implements agx {

    /* renamed from: a */
    private final /* synthetic */ C15883mw f44663a;

    /* renamed from: b */
    private final /* synthetic */ C15863mc f44664b;

    C15875mo(C15863mc mcVar, C15883mw mwVar) {
        this.f44664b = mcVar;
        this.f44663a = mwVar;
    }

    /* renamed from: a */
    public final void mo39341a() {
        synchronized (this.f44664b.f44630a) {
            this.f44664b.f44637h = 1;
            acd.m45438a("Failed loading new engine. Marking new engine destroyable.");
            this.f44663a.mo41764c();
        }
    }
}
