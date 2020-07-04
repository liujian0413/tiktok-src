package com.p280ss.android.account.token;

import android.text.TextUtils;
import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.token.f */
public final class C18905f {
    /* renamed from: a */
    public static void m61714a(String str) {
        C18907h c = C18900c.m61692a().mo50271c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                c.mo50274a("x_tt_token_lost", jSONObject, null);
                c.mo50273a("x_tt_token_lost", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61716a(String str, List list) {
        C18907h c = C18900c.m61692a().mo50271c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                String str2 = "";
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof C12461b) {
                            if ("X-TT-LOGID".equalsIgnoreCase(((C12461b) next).f33095a)) {
                                str2 = ((C12461b) next).f33096b;
                            }
                            jSONObject.put(((C12461b) next).f33095a, ((C12461b) next).f33096b);
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                String sb2 = sb.toString();
                jSONObject.put("extra", sb2);
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2.put("logid", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject2.put("urlpath", str);
                }
                if (!TextUtils.isEmpty(sb2)) {
                    jSONObject2.put("extra", sb2);
                }
                c.mo50274a("tt_token_logout", jSONObject, null);
                c.mo50273a("tt_token_logout", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61715a(String str, String str2, String str3, String str4) {
        C18907h c = C18900c.m61692a().mo50271c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                jSONObject.put("tokenSign", str2);
                jSONObject.put("token", str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("errorMsg", str4);
                }
                c.mo50274a("tt_token_decrypt_err", jSONObject, null);
                c.mo50273a("tt_token_decrypt_err", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61717a(String str, List list, int i, String str2) {
        C18907h c = C18900c.m61692a().mo50271c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", i);
                jSONObject.put("error_code_msg", str2);
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof C12461b) {
                            jSONObject.put(((C12461b) next).f33095a, ((C12461b) next).f33096b);
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                jSONObject.put("extra", sb.toString());
                c.mo50274a(str, jSONObject, null);
                c.mo50273a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
