package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dy */
final /* synthetic */ class C15642dy implements anq {

    /* renamed from: a */
    private final C15641dx f44373a;

    /* renamed from: b */
    private final Map f44374b;

    /* renamed from: c */
    private final C16075tz f44375c;

    C15642dy(C15641dx dxVar, Map map, C16075tz tzVar) {
        this.f44373a = dxVar;
        this.f44374b = map;
        this.f44375c = tzVar;
    }

    /* renamed from: a */
    public final void mo37832a(boolean z) {
        C15641dx dxVar = this.f44373a;
        Map map = this.f44374b;
        C16075tz tzVar = this.f44375c;
        dxVar.f44371a.f44370b = (String) map.get("id");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put("id", dxVar.f44371a.f44370b);
            tzVar.mo42005a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            acd.m45778b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
