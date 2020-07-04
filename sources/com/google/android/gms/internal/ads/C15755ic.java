package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ic */
public final class C15755ic implements C15742hq<Object> {

    /* renamed from: a */
    private final Context f44501a;

    public C15755ic(Context context) {
        this.f44501a = context;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        if (C14793ay.m42913s().mo39043a(this.f44501a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c = 1;
                    }
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    C14793ay.m42913s().mo39049d(this.f44501a, str2);
                    return;
                case 1:
                    C14793ay.m42913s().mo39051e(this.f44501a, str2);
                    return;
                case 2:
                    C14793ay.m42913s().mo39055g(this.f44501a, str2);
                    return;
                default:
                    acd.m45779c("logScionEvent gmsg contained unsupported eventName");
                    return;
            }
        }
    }
}
