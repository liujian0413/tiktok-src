package com.bytedance.sdk.account.bdplatform.impl.p658a;

import com.bytedance.sdk.account.bdplatform.p656b.C12758a;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12763d;
import com.bytedance.sdk.account.bdplatform.p656b.C12764e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a.a */
public final class C12778a {
    /* renamed from: a */
    public static C12758a m37100a(String str) {
        if (str == null) {
            return null;
        }
        C12758a aVar = new C12758a();
        try {
            m37101a(aVar, str);
            if (aVar.f33783e) {
                if (aVar.f33786h != null) {
                    aVar.f33748a = aVar.f33786h.optString("code");
                    return aVar;
                }
                aVar.f33784f = -1;
                return aVar;
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    /* renamed from: b */
    public static C12764e m37102b(String str) {
        if (str == null) {
            return null;
        }
        C12764e eVar = new C12764e();
        try {
            m37101a(eVar, str);
            if (eVar.f33783e) {
                if (eVar.f33786h != null) {
                    eVar.f33787a = eVar.f33786h.optString("ticket");
                    eVar.f33788b = eVar.f33786h.optBoolean("authorized");
                    return eVar;
                }
                eVar.f33784f = -1;
                return eVar;
            }
        } catch (Exception unused) {
        }
        return eVar;
    }

    /* renamed from: c */
    public static C12759b m37103c(String str) {
        if (str == null) {
            return null;
        }
        C12759b bVar = new C12759b();
        try {
            m37101a(bVar, str);
            if (bVar.f33783e) {
                if (bVar.f33786h != null) {
                    bVar.f33749a = bVar.f33786h.optString("client_name");
                    bVar.f33750b = bVar.f33786h.optString("client_icon");
                    JSONArray optJSONArray = bVar.f33786h.optJSONArray("scopes");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            bVar.f33751c.add(optJSONArray.optString(i));
                        }
                    }
                    JSONObject optJSONObject = bVar.f33786h.optJSONObject("scope_dict");
                    if (optJSONObject != null) {
                        bVar.f33752d = optJSONObject;
                    }
                    return bVar;
                }
                bVar.f33784f = -1;
                return bVar;
            }
        } catch (Exception unused) {
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m37101a(C12763d dVar, String str) throws Exception {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            if ("success".equals(jSONObject.optString("message"))) {
                dVar.f33783e = true;
                dVar.f33786h = jSONObject.optJSONObject("data");
                return;
            }
            dVar.f33783e = false;
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                dVar.f33784f = optJSONObject.optInt("error_code");
                dVar.f33785g = optJSONObject.optString("description");
            }
            return;
        }
        throw new IllegalArgumentException("argument is null");
    }
}
