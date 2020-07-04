package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ea */
final class C15645ea implements C15742hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16075tz f44378a;

    /* renamed from: b */
    private final /* synthetic */ C15640dw f44379b;

    C15645ea(C15640dw dwVar, C16075tz tzVar) {
        this.f44379b = dwVar;
        this.f44378a = tzVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        ami ami = (ami) this.f44379b.f44369a.get();
        if (ami == null) {
            this.f44378a.mo42007b("/hideOverlay", this);
        } else {
            ami.getView().setVisibility(8);
        }
    }
}
