package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ib */
public final class C15754ib implements C15742hq<Object> {

    /* renamed from: a */
    private final HashMap<String, agu<JSONObject>> f44500a = new HashMap<>();

    /* renamed from: a */
    public final Future<JSONObject> mo41649a(String str) {
        agu agu = new agu();
        this.f44500a.put(str, agu);
        return agu;
    }

    /* renamed from: b */
    public final void mo41650b(String str) {
        agu agu = (agu) this.f44500a.get(str);
        if (agu == null) {
            acd.m45779c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!agu.isDone()) {
            agu.cancel(true);
        }
        this.f44500a.remove(str);
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        acd.m45777b("Received ad from the cache.");
        agu agu = (agu) this.f44500a.get(str);
        if (agu == null) {
            acd.m45779c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            agu.mo39333b(new JSONObject(str2));
        } catch (JSONException e) {
            acd.m45778b("Failed constructing JSON object from value passed from javascript", e);
            agu.mo39333b(null);
        } finally {
            this.f44500a.remove(str);
        }
    }
}
