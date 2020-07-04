package com.p280ss.android.account;

import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.p816b.C18894a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.a */
public class C18890a extends C12898b {

    /* renamed from: h */
    public String f50900h;

    /* renamed from: i */
    public String f50901i;

    /* renamed from: j */
    public String f50902j;

    /* renamed from: k */
    private final Map<String, C18894a> f50903k = new HashMap();

    /* renamed from: b */
    public final Map<String, C18894a> mo31366b() {
        return this.f50903k;
    }

    /* renamed from: a */
    public void mo31365a() throws Exception {
        super.mo31365a();
        m61657a(this, this.f34083f);
    }

    public C18890a(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: a */
    private static void m61657a(C18890a aVar, JSONObject jSONObject) throws Exception {
        if (jSONObject.has("name")) {
            aVar.f50900h = jSONObject.optString("name");
        } else if (jSONObject.has("username")) {
            aVar.f50900h = jSONObject.optString("username");
        }
        aVar.f50902j = jSONObject.optString("avatar_url");
        aVar.f50901i = jSONObject.optString("description");
    }
}
