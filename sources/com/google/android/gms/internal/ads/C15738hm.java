package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hm */
final class C15738hm implements C15742hq<ami> {
    C15738hm() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        if (map.keySet().contains("start")) {
            ami.mo39761w().mo39788h();
        } else if (map.keySet().contains("stop")) {
            ami.mo39761w().mo39789i();
        } else {
            if (map.keySet().contains("cancel")) {
                ami.mo39761w().mo39790j();
            }
        }
    }
}
