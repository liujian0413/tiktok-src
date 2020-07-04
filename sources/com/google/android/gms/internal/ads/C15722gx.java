package com.google.android.gms.internal.ads;

import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.gx */
public final class C15722gx implements C15742hq<Object> {

    /* renamed from: a */
    private final C15723gy f44451a;

    public C15722gx(C15723gy gyVar) {
        this.f44451a = gyVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            acd.m45783e("App event with no name parameter.");
        } else {
            this.f44451a.mo37605a(str, (String) map.get("info"));
        }
    }
}
