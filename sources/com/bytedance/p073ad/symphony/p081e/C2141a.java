package com.bytedance.p073ad.symphony.p081e;

import com.bytedance.p073ad.symphony.p085h.C2159a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.a */
public class C2141a {

    /* renamed from: e */
    private static final String f7271e = "a";

    /* renamed from: a */
    public C2159a f7272a;

    /* renamed from: b */
    public List<String> f7273b;

    /* renamed from: c */
    public JSONObject f7274c;

    /* renamed from: d */
    public long f7275d;

    private C2141a() {
    }

    /* renamed from: a */
    public static C2141a m9362a(JSONObject jSONObject) {
        C2141a aVar = new C2141a();
        try {
            aVar.f7275d = jSONObject.optLong("ad_id");
            aVar.f7273b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("placement_type");
            for (int i = 0; i < jSONArray.length(); i++) {
                aVar.f7273b.add(jSONArray.getString(i));
            }
            aVar.f7274c = jSONObject.optJSONObject("log_extra");
            aVar.f7272a = C2159a.m9417a(jSONObject.optJSONObject("fill_strategy"));
        } catch (Exception e) {
            e.getMessage();
        }
        return aVar;
    }
}
