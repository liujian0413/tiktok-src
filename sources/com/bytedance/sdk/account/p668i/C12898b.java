package com.bytedance.sdk.account.p668i;

import android.text.TextUtils;
import com.p280ss.android.account.p816b.C18894a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.i.b */
public class C12898b {

    /* renamed from: a */
    public long f34078a;

    /* renamed from: b */
    protected final Map<String, C18894a> f34079b = new HashMap();

    /* renamed from: c */
    public int f34080c;

    /* renamed from: d */
    public boolean f34081d;

    /* renamed from: e */
    public String f34082e;

    /* renamed from: f */
    public JSONObject f34083f;

    /* renamed from: g */
    public JSONObject f34084g;

    /* renamed from: b */
    public Map<String, C18894a> mo31366b() {
        return this.f34079b;
    }

    /* renamed from: a */
    public void mo31365a() throws Exception {
        m37538a(this, this.f34084g, this.f34083f);
    }

    public C12898b(JSONObject jSONObject) {
        this.f34084g = jSONObject;
        this.f34083f = jSONObject.optJSONObject("data");
    }

    /* renamed from: a */
    private static void m37538a(C12898b bVar, JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        boolean z;
        bVar.f34078a = jSONObject2.optLong("user_id", 0);
        bVar.f34082e = jSONObject2.optString("session_key", "");
        if (jSONObject2.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.f34081d = z;
        String optString = jSONObject2.optString("mobile");
        String optString2 = jSONObject2.optString("email");
        C18894a a = C18894a.m61665a("mobile");
        C18894a a2 = C18894a.m61665a("email");
        a2.f50929e = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            bVar.mo31366b().put(a2.f50926b, a2);
        }
        a.f50929e = optString;
        if (!TextUtils.isEmpty(optString)) {
            bVar.mo31366b().put(a.f50926b, a);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                String string = jSONObject3.getString("platform");
                if (!(string == null || string.length() == 0)) {
                    C18894a a3 = C18894a.m61665a(string);
                    if (jSONObject3.has("screen_name")) {
                        a3.f50929e = jSONObject3.optString("screen_name");
                    } else if (jSONObject3.has("platform_screen_name")) {
                        a3.f50929e = jSONObject3.optString("platform_screen_name");
                    }
                    a3.f50930f = jSONObject3.optString("profile_image_url");
                    a3.f50931g = jSONObject3.optString("platform_uid");
                    a3.f50932h = jSONObject3.optString("create_time");
                    long optLong = jSONObject3.optLong("expires_in");
                    if (optLong > 0) {
                        a3.f50933i = (1000 * optLong) + currentTimeMillis;
                    }
                    a3.f50934j = optLong;
                    bVar.mo31366b().put(string, a3);
                }
            }
        }
        bVar.f34080c = jSONObject2.optInt("country_code", -1);
    }
}
