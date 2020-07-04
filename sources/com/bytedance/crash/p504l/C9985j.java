package com.bytedance.crash.p504l;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.l.j */
public final class C9985j {
    /* renamed from: a */
    private static boolean m29568a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m29569a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29570a(JSONObject jSONObject, String str) {
        if (m29569a(jSONObject) || m29568a(jSONObject.optJSONArray(str))) {
            return true;
        }
        return false;
    }
}
