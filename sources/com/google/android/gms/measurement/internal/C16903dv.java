package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dv */
final class C16903dv extends C16939fc {

    /* renamed from: a */
    private final /* synthetic */ C16900ds f47261a;

    C16903dv(C16900ds dsVar, C16850bw bwVar) {
        this.f47261a = dsVar;
        super(bwVar);
    }

    /* renamed from: a */
    public final void mo43787a() {
        C16900ds dsVar = this.f47261a;
        dsVar.mo43571c();
        dsVar.mo43585q().f47495i.mo44160a("Current session is expired, remove the session number and Id");
        if (dsVar.mo43587s().mo44070p(dsVar.mo43574f().mo44135v())) {
            dsVar.mo43573e().mo43733a("auto", "_sid", (Object) null, dsVar.mo43580l().mo38684a());
        }
        if (dsVar.mo43587s().mo44071q(dsVar.mo43574f().mo44135v())) {
            dsVar.mo43573e().mo43733a("auto", "_sno", (Object) null, dsVar.mo43580l().mo38684a());
        }
    }
}
