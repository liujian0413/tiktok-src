package com.bytedance.android.monitor.webview;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.k */
public final class C9544k {
    /* renamed from: a */
    public static boolean m28287a(Object obj) {
        return obj instanceof Number;
    }

    /* renamed from: a */
    public static long m28282a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static JSONObject m28290b(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static Object m28283a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.opt(i);
        } catch (Exception unused) {
            return new Object();
        }
    }

    /* renamed from: b */
    public static long m28289b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: c */
    public static String m28291c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* renamed from: d */
    public static JSONObject m28292d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: e */
    public static JSONArray m28293e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONArray();
        }
        return jSONObject.optJSONArray(str);
    }

    /* renamed from: f */
    public static Object m28294f(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: a */
    public static boolean m28288a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public static void m28284a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m28285a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m28286a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
