package com.bytedance.polaris.p634b;

import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.b.s */
public final class C12368s {
    /* renamed from: a */
    public static boolean m35919a(JSONObject jSONObject) {
        if (jSONObject.optInt("err_no", -1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m35920b(JSONObject jSONObject) {
        return jSONObject.optInt("err_no", 10002);
    }
}
