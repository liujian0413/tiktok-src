package com.bytedance.android.live.core.p148d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.b */
public final class C3169b {

    /* renamed from: a */
    private static long f9751a;

    /* renamed from: a */
    public static void m11986a() {
        f9751a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m11987b() {
        if (f9751a > 0) {
            long currentTimeMillis = System.currentTimeMillis() - f9751a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cold_start_cost_time", currentTimeMillis);
            } catch (JSONException unused) {
            }
            C3172e.m12008b("ttlive_cold_start_enter_room_all", 0, jSONObject);
            f9751a = 0;
        }
    }
}
