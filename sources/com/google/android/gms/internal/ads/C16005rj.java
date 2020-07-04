package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rj */
public final class C16005rj {

    /* renamed from: a */
    private final ami f44927a;

    /* renamed from: b */
    private final boolean f44928b;

    /* renamed from: c */
    private final String f44929c;

    public C16005rj(ami ami, Map<String, String> map) {
        this.f44927a = ami;
        this.f44929c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f44928b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f44928b = true;
        }
    }

    /* renamed from: a */
    public final void mo41937a() {
        int i;
        if (this.f44927a == null) {
            acd.m45783e("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f44929c)) {
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f44929c)) {
            i = 6;
        } else if (this.f44928b) {
            i = -1;
        } else {
            i = C14793ay.m42896b().mo39191a();
        }
        this.f44927a.setRequestedOrientation(i);
    }
}
