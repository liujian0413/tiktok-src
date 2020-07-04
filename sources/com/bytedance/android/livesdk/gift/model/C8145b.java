package com.bytedance.android.livesdk.gift.model;

import com.google.gson.p276a.C6593c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.gift.model.b */
public final class C8145b {
    @C6593c(mo15949a = "data")

    /* renamed from: a */
    public C8146a f22208a;

    /* renamed from: com.bytedance.android.livesdk.gift.model.b$a */
    public static class C8146a {
        @C6593c(mo15949a = "addend")

        /* renamed from: a */
        public int f22209a;
        @C6593c(mo15949a = "anchor_rank_best_score")

        /* renamed from: b */
        public int f22210b;
        @C6593c(mo15949a = "anchor_rank_best_user_name")

        /* renamed from: c */
        public String f22211c;
        @C6593c(mo15949a = "best_score_self")

        /* renamed from: d */
        public int f22212d;
        @C6593c(mo15949a = "multiplier")

        /* renamed from: e */
        public int f22213e;
        @C6593c(mo15949a = "seed")

        /* renamed from: f */
        public long f22214f;
        @C6593c(mo15949a = "token")

        /* renamed from: g */
        public String f22215g;
        @C6593c(mo15949a = "rangeMap")

        /* renamed from: h */
        public List<C8147b> f22216h;
    }

    /* renamed from: com.bytedance.android.livesdk.gift.model.b$b */
    public static class C8147b {
        @C6593c(mo15949a = "max")

        /* renamed from: a */
        public int f22217a;
        @C6593c(mo15949a = "min")

        /* renamed from: b */
        public int f22218b;
        @C6593c(mo15949a = "result")

        /* renamed from: c */
        public int f22219c;
    }

    /* renamed from: a */
    public static String m24987a(C8146a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("multiplier", aVar.f22213e);
            jSONObject.put("addend", aVar.f22209a);
            jSONObject.put("seed", aVar.f22214f);
            jSONObject.put("token", aVar.f22215g);
            jSONObject.put("maxScore", aVar.f22212d);
            JSONArray jSONArray = new JSONArray();
            for (C8147b bVar : aVar.f22216h) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("min", bVar.f22218b);
                jSONObject2.put("max", bVar.f22217a);
                jSONObject2.put("result", bVar.f22219c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rangeMap", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
