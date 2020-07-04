package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wo */
final class C16144wo implements agz<C15889nb> {

    /* renamed from: a */
    private final /* synthetic */ C16143wn f45250a;

    C16144wo(C16143wn wnVar) {
        this.f45250a = wnVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo39342a(Object obj) {
        try {
            ((C15889nb) obj).mo39814b("AFMA_getAdapterLessMediationAd", this.f45250a.f45247a);
        } catch (Exception e) {
            acd.m45778b("Error requesting an ad url", e);
            C16140wk.f45237f.mo41650b(this.f45250a.f45248b);
        }
    }
}
