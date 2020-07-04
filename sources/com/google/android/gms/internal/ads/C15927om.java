package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.om */
final class C15927om implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ agj f44809a;

    /* renamed from: b */
    private final /* synthetic */ C15925ok f44810b;

    C15927om(C15925ok okVar, agj agj) {
        this.f44810b = okVar;
        this.f44809a = agj;
    }

    public final void run() {
        for (agj agj : this.f44810b.f44802k.keySet()) {
            if (agj != this.f44809a) {
                ((C15919oe) this.f44810b.f44802k.get(agj)).mo41803a();
            }
        }
    }
}
