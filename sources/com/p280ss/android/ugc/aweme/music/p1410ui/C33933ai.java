package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ai */
public final class C33933ai {
    /* renamed from: a */
    public static JSONObject m109379a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject((String) map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
