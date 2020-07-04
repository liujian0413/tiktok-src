package com.p280ss.android.common.applog;

import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.TeaUtils */
public class TeaUtils {
    public static long now() {
        return System.currentTimeMillis();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void ensureNonNull(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("can not be null");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static long optLong(JSONObject jSONObject, String str) {
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
