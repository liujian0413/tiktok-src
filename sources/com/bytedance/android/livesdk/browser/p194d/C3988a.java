package com.bytedance.android.livesdk.browser.p194d;

import android.text.TextUtils;
import com.bytedance.android.live.core.p148d.C3172e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.d.a */
public final class C3988a {

    /* renamed from: a */
    private static long f11872a;

    /* renamed from: b */
    private static long f11873b;

    /* renamed from: a */
    public static void m13980a() {
        f11872a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m13984b() {
        f11873b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m13981a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - f11872a;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m13983a(jSONObject, "from", str);
        C3172e.m12004a("ttlive_webview_init_all", currentTimeMillis, jSONObject);
    }

    /* renamed from: a */
    private static void m13983a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m13982a(String str, String str2, int i) {
        long currentTimeMillis = System.currentTimeMillis() - f11873b;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        m13983a(jSONObject, "from", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        m13983a(jSONObject, "url", str2);
        if (i == 0) {
            C3172e.m12000a("ttlive_webview_offline_all", i, currentTimeMillis, jSONObject);
        } else {
            C3172e.m12008b("ttlive_webview_offline_all", i, jSONObject);
        }
    }
}
