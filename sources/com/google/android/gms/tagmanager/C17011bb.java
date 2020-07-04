package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.bb */
final class C17011bb implements C17026b {

    /* renamed from: a */
    private final Context f47654a;

    public C17011bb(Context context) {
        this.f47654a = context;
    }

    /* renamed from: a */
    public final void mo44228a(Map<String, Object> map) {
        Object obj = map.get("gtm.url");
        if (obj == null) {
            Object obj2 = map.get("gtm");
            if (obj2 != null && (obj2 instanceof Map)) {
                obj = ((Map) obj2).get("url");
            }
        }
        if (obj != null && (obj instanceof String)) {
            String queryParameter = Uri.parse((String) obj).getQueryParameter("referrer");
            if (queryParameter != null) {
                C17050y.m56572b(this.f47654a, queryParameter);
            }
        }
    }
}
