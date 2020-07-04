package com.p280ss.ttvideoengine.p1816i;

import android.text.TextUtils;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.i.a */
public final class C46114a {
    /* renamed from: a */
    public static JSONObject m144500a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("url");
            if (!TextUtils.isEmpty(optString)) {
                String host = new URL(optString).getHost();
                if (!TextUtils.isEmpty(host)) {
                    jSONObject.put("host", host);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
