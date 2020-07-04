package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eb */
final class C15646eb implements C15742hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C16075tz f44380a;

    /* renamed from: b */
    private final /* synthetic */ C15640dw f44381b;

    C15646eb(C15640dw dwVar, C16075tz tzVar) {
        this.f44381b = dwVar;
        this.f44380a = tzVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f44381b.f44370b);
            this.f44380a.mo42005a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            acd.m45778b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
