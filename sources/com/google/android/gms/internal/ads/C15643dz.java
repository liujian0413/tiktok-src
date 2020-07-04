package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dz */
final class C15643dz implements C15742hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16075tz f44376a;

    /* renamed from: b */
    private final /* synthetic */ C15640dw f44377b;

    C15643dz(C15640dw dwVar, C16075tz tzVar) {
        this.f44377b = dwVar;
        this.f44376a = tzVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        ami ami = (ami) this.f44377b.f44369a.get();
        if (ami == null) {
            this.f44376a.mo42007b("/showOverlay", this);
        } else {
            ami.getView().setVisibility(0);
        }
    }
}
