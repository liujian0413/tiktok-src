package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wt */
public final class C16149wt implements C15742hq<Object> {
    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        acd.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        C16140wk.f45237f.mo41650b(str);
    }
}
