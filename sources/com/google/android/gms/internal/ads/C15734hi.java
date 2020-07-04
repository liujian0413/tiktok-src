package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hi */
final class C15734hi implements C15742hq<Object> {
    C15734hi() {
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        acd.m45781d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
