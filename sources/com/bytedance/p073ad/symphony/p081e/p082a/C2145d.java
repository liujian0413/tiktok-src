package com.bytedance.p073ad.symphony.p081e.p082a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.d */
public final class C2145d {

    /* renamed from: a */
    private Map<String, String> f7292a = new HashMap();

    /* renamed from: a */
    public final String mo7828a(String str) {
        return (String) this.f7292a.get(str);
    }

    /* renamed from: a */
    public static C2145d m9369a(JSONArray jSONArray) {
        C2145d dVar = new C2145d();
        if (jSONArray == null) {
            return dVar;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    dVar.m9370a(optJSONObject.optString("placement_type"), optJSONObject.optString("fill_strategy"));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private void m9370a(String str, String str2) {
        this.f7292a.put(str, str2);
    }
}
