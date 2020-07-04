package com.bytedance.android.live.core.p148d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.a */
public class C3168a {
    /* renamed from: a */
    public static void m11982a(JSONObject jSONObject, String str, float f) {
        try {
            jSONObject.put(str, (double) f);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m11983a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m11984a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m11985a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
