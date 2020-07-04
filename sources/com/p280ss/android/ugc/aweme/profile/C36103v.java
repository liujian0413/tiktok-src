package com.p280ss.android.ugc.aweme.profile;

import com.p280ss.android.ugc.aweme.app.C6877n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.v */
public final class C36103v {
    /* renamed from: a */
    public static void m116261a(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", exc.toString());
            jSONObject.put("success", 1);
            jSONObject.put("errorResponse", jSONObject2.toString());
        } catch (JSONException unused) {
        }
        C6877n.m21447a("aweme_profile_recyclerview_crash_log", jSONObject);
    }
}
