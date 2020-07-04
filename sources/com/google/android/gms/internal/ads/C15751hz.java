package com.google.android.gms.internal.ads;

import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.hz */
public final class C15751hz implements C15742hq<Object> {

    /* renamed from: a */
    private final C15753ia f44499a;

    public C15751hz(C15753ia iaVar) {
        this.f44499a = iaVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            acd.m45778b("Fail to parse float", e);
        }
        this.f44499a.mo37804d(equals);
        this.f44499a.mo37802a(equals2, f);
    }
}
