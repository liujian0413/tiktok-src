package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ii */
public final class C15761ii implements C15742hq<Object> {

    /* renamed from: a */
    private final C15762ij f44513a;

    public C15761ii(C15762ij ijVar) {
        this.f44513a = ijVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbaz zzbaz = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbaz = new zzbaz(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                acd.m45780c("Unable to parse reward amount.", e);
            }
            this.f44513a.mo37803b(zzbaz);
        } else if ("video_start".equals(str)) {
            this.f44513a.mo37800G();
        } else {
            if ("video_complete".equals(str)) {
                this.f44513a.mo37801H();
            }
        }
    }
}
