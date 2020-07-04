package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hn */
final class C15739hn implements C15742hq<ami> {
    C15739hn() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        if (map.keySet().contains("start")) {
            ami.mo39730e(true);
        }
        if (map.keySet().contains("stop")) {
            ami.mo39730e(false);
        }
    }
}
