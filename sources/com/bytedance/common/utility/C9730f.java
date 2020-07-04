package com.bytedance.common.utility;

import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.f */
public final class C9730f {
    /* renamed from: a */
    public static long m28664a(JSONObject jSONObject, String str, long j) {
        if (jSONObject == null || C6319n.m19593a(str) || !jSONObject.has(str)) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: a */
    public static String m28665a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || C6319n.m19593a(str) || !jSONObject.has(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
