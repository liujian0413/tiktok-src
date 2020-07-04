package com.bytedance.p073ad.symphony.p081e.p082a;

import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.util.C2203f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a.a */
public class C2142a {

    /* renamed from: a */
    public int f7276a;

    /* renamed from: b */
    public long f7277b;

    /* renamed from: c */
    public long f7278c;

    /* renamed from: d */
    public String f7279d;

    /* renamed from: e */
    public String f7280e;

    /* renamed from: f */
    public HashMap<String, C2143b> f7281f = new HashMap<>();

    /* renamed from: g */
    public String f7282g;

    /* renamed from: h */
    private String f7283h;

    public String toString() {
        if (this.f7283h == null) {
            return "";
        }
        return this.f7283h;
    }

    /* renamed from: a */
    public final C2143b mo7824a(String str) {
        return (C2143b) this.f7281f.get(C2143b.m9367a(str));
    }

    /* renamed from: a */
    public static Map<String, List<String>> m9365a(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("config_type");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("contain_placement_types");
                if (!(optString == null || optJSONArray == null)) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (optString2 != null) {
                            arrayList.add(optString2);
                        }
                    }
                    if (!C2203f.m9514a((List<?>) arrayList)) {
                        hashMap.put(optString, arrayList);
                    }
                }
            }
        }
        new StringBuilder("config-->").append(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static List<C2142a> m9364a(JSONArray jSONArray, int i) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    C2142a a = m9363a(optJSONObject, i);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C2142a m9363a(JSONObject jSONObject, int i) {
        C2143b bVar;
        if (jSONObject != null) {
            try {
                C2142a aVar = new C2142a();
                aVar.f7276a = jSONObject.getInt("provider_id");
                aVar.f7277b = jSONObject.optLong("expire_time");
                aVar.f7278c = jSONObject.optLong("request_timeout");
                aVar.f7279d = jSONObject.optString("mid");
                aVar.f7280e = jSONObject.optString("app_id");
                aVar.f7283h = jSONObject.toString();
                if (C2114c.m9317b()) {
                    aVar.f7282g = jSONObject.optString("test_key");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("placements");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (i == 2) {
                            bVar = new C2144c(jSONObject2);
                        } else {
                            bVar = new C2143b(jSONObject2);
                        }
                        if (bVar.mo7826a()) {
                            aVar.f7281f.put(bVar.f7285b, bVar);
                        }
                    }
                }
                return aVar;
            } catch (JSONException unused) {
                new StringBuilder("adconfig json is not valid,json:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
