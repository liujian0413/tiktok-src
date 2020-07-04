package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.app.C6877n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.br */
public final class C25290br {
    /* renamed from: a */
    public static void m83094a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", str);
        } catch (JSONException unused) {
        }
        C6877n.m21444a("aweme_screen_ad_open_media_error_rate", 0, jSONObject);
    }

    /* renamed from: a */
    public static void m83095a(String str, int i, int i2, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", str);
        } catch (JSONException unused) {
        }
        C6877n.m21444a("aweme_screen_ad_open_media_error_rate", 1, jSONObject);
    }
}
