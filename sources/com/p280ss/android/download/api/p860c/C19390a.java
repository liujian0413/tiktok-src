package com.p280ss.android.download.api.p860c;

import org.json.JSONObject;

/* renamed from: com.ss.android.download.api.c.a */
public final class C19390a {
    /* renamed from: a */
    public static long m63716a(JSONObject jSONObject, String str) {
        long j;
        if (jSONObject == null) {
            return 0;
        }
        try {
            j = Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
            j = 0;
        }
        return j;
    }
}
