package com.p280ss.android.ugc.aweme.sdk.iap.adapter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sdk.bean.DiamondStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.adapter.a */
public final class C37332a {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public int f97499a;
    @C6593c(mo15949a = "iapId")

    /* renamed from: b */
    public String f97500b;
    @C6593c(mo15949a = "price")

    /* renamed from: c */
    public String f97501c;
    @C6593c(mo15949a = "count")

    /* renamed from: d */
    public int f97502d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Diamond{id=");
        sb.append(this.f97499a);
        sb.append(", iapId='");
        sb.append(this.f97500b);
        sb.append('\'');
        sb.append(", price='");
        sb.append(this.f97501c);
        sb.append('\'');
        sb.append(", count='");
        sb.append(this.f97502d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C37332a m119857a(DiamondStruct diamondStruct) {
        C37332a aVar = new C37332a();
        aVar.f97499a = diamondStruct.f97461id;
        aVar.f97500b = diamondStruct.iapId;
        aVar.f97502d = diamondStruct.diamondCount;
        return aVar;
    }

    /* renamed from: a */
    public static JSONObject m119858a(C37332a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", aVar.f97499a);
            jSONObject.put("iapId", aVar.f97500b);
            jSONObject.put("price", aVar.f97501c);
            jSONObject.put("count", aVar.f97502d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
