package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hl */
final class C15737hl implements C15742hq<ami> {
    C15737hl() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            ami.mo37683z_();
            return;
        }
        if ("resume".equals(str)) {
            ami.mo37682A_();
        }
    }
}
