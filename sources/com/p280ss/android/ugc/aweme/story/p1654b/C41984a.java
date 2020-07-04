package com.p280ss.android.ugc.aweme.story.p1654b;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.b.a */
public final class C41984a {
    /* renamed from: a */
    public static JSONObject m133445a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject;
    }
}
