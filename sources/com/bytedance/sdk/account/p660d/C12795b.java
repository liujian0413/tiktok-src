package com.bytedance.sdk.account.p660d;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p662f.p663a.C12828k;
import com.bytedance.sdk.account.p662f.p663a.C12829l;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p667h.C12885a;
import com.bytedance.sdk.account.p667h.C12894f;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.account.C18895c;
import com.p280ss.android.account.p814a.p815a.C18891a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.b */
public final class C12795b {

    /* renamed from: com.bytedance.sdk.account.d.b$a */
    public static class C12796a {

        /* renamed from: a */
        private static C18893a f33845a = new C18893a();

        /* renamed from: a */
        private static C12898b m37139a(JSONObject jSONObject) throws Exception {
            C18891a c = C18895c.m61672c();
            if (c != null) {
                return c.mo50253a().mo31364a(jSONObject);
            }
            return C18893a.m61663b(jSONObject);
        }

        /* renamed from: a */
        public static C12898b m37140a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
            return m37139a(jSONObject);
        }

        /* renamed from: a */
        public static void m37141a(C12894f fVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("error_code")) {
                    fVar.f34055g = jSONObject.optInt("error_code", fVar.f34055g);
                } else if (jSONObject.has("code")) {
                    fVar.f34055g = jSONObject.optInt("code", fVar.f34055g);
                }
                fVar.f34056h = jSONObject.optString("description");
                String optString = jSONObject.optString("name");
                if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                    fVar.f34074d = jSONObject.optString("description");
                    fVar.f34075e = jSONObject.optString("dialog_tips");
                    fVar.f34076f = jSONObject.optString("auth_token");
                }
                if (fVar.f34055g == 1075) {
                    fVar.f34061m = jSONObject.optLong("apply_time");
                    fVar.f34064p = jSONObject.optString("avatar_url");
                    fVar.f34063o = jSONObject.optString("nick_name");
                    fVar.f34060l = jSONObject.optString("token");
                    fVar.f34062n = jSONObject.optLong("cancel_time");
                }
            }
        }

        /* renamed from: a */
        public static void m37142a(JSONObject jSONObject, JSONObject jSONObject2, C12894f fVar) throws Exception {
            C12898b a = m37139a(jSONObject);
            if (a != null) {
                fVar.f34072b = a;
            }
        }

        /* renamed from: a */
        public static C12712g m37138a(C12894f fVar, boolean z, int i) {
            C12712g gVar = new C12712g(z, 0);
            gVar.f33702b = fVar.f34055g;
            gVar.f33703c = fVar.f34056h;
            gVar.f33712h = fVar.f34074d;
            gVar.f33713i = fVar.f34075e;
            gVar.f33714j = fVar.f34076f;
            gVar.f33711g = fVar.f34072b;
            return gVar;
        }
    }

    /* renamed from: a */
    public static void m37136a(C12828k kVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            kVar.f33960h = jSONObject.optInt("error_code", kVar.f33960h);
        } else if (jSONObject.has("code")) {
            kVar.f33960h = jSONObject.optInt("code", kVar.f33960h);
        }
        kVar.f33961i = jSONObject.optString("description");
        if (kVar instanceof C12828k) {
            kVar.f33962j = jSONObject.optString("captcha");
            kVar.f33963k = jSONObject.optString("alert_text");
        }
        if (kVar.f33960h == 1001 && (kVar instanceof C12836s)) {
            ((C12836s) kVar).f33999c = jSONObject.optString("dialog_tips");
        }
        if (kVar.f33960h == 1057 && (kVar instanceof C12836s)) {
            C12836s sVar = (C12836s) kVar;
            sVar.f33999c = jSONObject.optString("dialog_tips");
            sVar.f34000d = jSONObject.optString("next_url");
        }
        if (kVar.f33960h == 1057 && (kVar instanceof C12829l)) {
            C12829l lVar = (C12829l) kVar;
            lVar.f33972b = jSONObject.optString("dialog_tips");
            lVar.f33973c = jSONObject.optString("next_url");
        }
        if (kVar.f33960h == 1075) {
            kVar.f33966n = jSONObject.optLong("apply_time");
            kVar.f33969q = jSONObject.optString("avatar_url");
            kVar.f33968p = jSONObject.optString("nick_name");
            kVar.f33965m = jSONObject.optString("token");
            kVar.f33967o = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static void m37137a(C12885a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.has("error_code")) {
            aVar.f34055g = jSONObject.optInt("error_code", aVar.f34055g);
        } else if (jSONObject.has("code")) {
            aVar.f34055g = jSONObject.optInt("code", aVar.f34055g);
        }
        aVar.f34056h = jSONObject.optString("description");
        if (aVar.f34055g == 1075) {
            aVar.f34061m = jSONObject.optLong("apply_time");
            aVar.f34064p = jSONObject.optString("avatar_url");
            aVar.f34063o = jSONObject.optString("nick_name");
            aVar.f34060l = jSONObject.optString("token");
            aVar.f34062n = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static C12791a m37135a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        C12791a aVar = new C12791a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo31344a("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo31344a("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.mo31344a("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.mo31344a("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            aVar.mo31344a("profile_key", (String) null);
        }
        if (!TextUtils.isEmpty(str6)) {
            aVar.mo31344a("platform_app_id", str6);
        }
        if (map != null && !map.isEmpty()) {
            for (String str7 : map.keySet()) {
                if (!TextUtils.isEmpty(str7)) {
                    aVar.mo31344a(str7, (String) map.get(str7));
                }
            }
        }
        return aVar;
    }
}
