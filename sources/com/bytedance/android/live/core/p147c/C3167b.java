package com.bytedance.android.live.core.p147c;

import android.text.TextUtils;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.c.b */
public abstract class C3167b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract JSONObject mo9998a();

    /* renamed from: a */
    private static JSONObject m11968a(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m11969a(int i, StackTraceElement[] stackTraceElementArr) {
        C3166a.m11955a(i, "ttlive_exception", stackTraceElementArr);
    }

    /* renamed from: c */
    public final void mo10004c(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            C3166a.m11966e(str, m11967a(str, jSONObject, null));
        }
    }

    /* renamed from: d */
    public final void mo10005d(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            C3166a.m11965d(str, m11967a(str, jSONObject, null));
        }
    }

    /* renamed from: a */
    public static void m11970a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3166a.m11964c(str, str2);
        }
    }

    /* renamed from: b */
    public static void m11971b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3166a.m11961b(str, str2);
        }
    }

    /* renamed from: c */
    public static void m11972c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3166a.m11966e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m11973d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3166a.m11965d(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo10001b(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C3166a.m11961b(str, m11967a(str, m11968a(map), null));
        }
    }

    /* renamed from: c */
    public final void mo10003c(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C3166a.m11966e(str, m11967a(str, m11968a(map), null));
        }
    }

    /* renamed from: b */
    public final void mo10002b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C3166a.m11961b(str, m11967a(str, jSONObject, null));
        }
    }

    /* renamed from: a */
    public final void mo9999a(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            mo10000a(str, m11968a(map));
        }
    }

    /* renamed from: a */
    public final void mo10000a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C3166a.m11964c(str, m11967a(str, jSONObject, null));
        }
    }

    /* renamed from: a */
    private String m11967a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        mo9998a();
        try {
            jSONObject3.put("tag", str);
            jSONObject3.put("params", mo9998a());
            jSONObject3.put("data", jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }
}
