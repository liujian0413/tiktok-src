package com.bytedance.android.live.core.p148d;

import android.text.TextUtils;
import com.bytedance.android.live.base.C2322a;
import com.bytedance.android.live.base.p118b.C2325a;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.e */
public final class C3172e {
    /* renamed from: a */
    public static void m12005a(String str, String str2, float f) {
        if (m11994a() != null) {
            m11994a().mo8143a(str, str2, f);
        }
    }

    /* renamed from: a */
    public static void m12006a(String str, String str2, JSONObject jSONObject) {
        if (m11994a() != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
            m11994a().mo8144a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m12004a(String str, long j, JSONObject jSONObject) {
        m12007a(str, m11995a(j), m11997a(jSONObject));
    }

    /* renamed from: a */
    private static void m12007a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m11994a() != null) {
            m11994a().mo8145a(str, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public static void m12003a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m11994a() != null) {
            m11994a().mo8142a(str, i, jSONObject, m11997a(jSONObject2));
        }
    }

    /* renamed from: a */
    private static C2325a m11994a() {
        return (C2325a) C2322a.m9938a(C2325a.class);
    }

    /* renamed from: a */
    private static JSONObject m11995a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m11996a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m11997a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "1380");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* renamed from: b */
    public static void m12008b(String str, int i, JSONObject jSONObject) {
        m12003a(str, i, (JSONObject) null, jSONObject);
    }

    /* renamed from: c */
    public static void m12009c(String str, int i, JSONObject jSONObject) {
        if (m11994a() != null) {
            m11994a().mo8141a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m11998a(String str, int i, long j) {
        m12003a(str, 0, m11995a(j), (JSONObject) null);
    }

    /* renamed from: a */
    public static void m12001a(String str, int i, Map<String, Object> map) {
        if (m11994a() != null) {
            m12002a(str, i, m11996a(map));
        }
    }

    /* renamed from: a */
    public static void m12002a(String str, int i, JSONObject jSONObject) {
        if (m11994a() != null) {
            m11994a().mo8141a(str, i, m11997a(jSONObject));
        }
    }

    /* renamed from: a */
    public static void m12000a(String str, int i, long j, JSONObject jSONObject) {
        m12003a(str, i, m11995a(j), jSONObject);
    }

    /* renamed from: a */
    public static void m11999a(String str, int i, long j, Map<String, Object> map) {
        m12003a(str, i, m11995a(j), m11996a(map));
    }
}
