package com.p280ss.android.p817ad.splash.core.p828c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.j */
public final class C19011j {

    /* renamed from: a */
    public String f51342a;

    /* renamed from: b */
    public int f51343b;

    /* renamed from: c */
    public int f51344c;

    /* renamed from: d */
    public String f51345d;

    /* renamed from: e */
    public String f51346e;

    /* renamed from: f */
    public String f51347f;

    /* renamed from: g */
    public boolean f51348g;

    /* renamed from: a */
    public static C19011j m62071a(JSONObject jSONObject) {
        C19011j jVar = new C19011j();
        if (jSONObject != null) {
            jVar.f51342a = jSONObject.optString("countdown_unit", "");
            jVar.f51343b = jSONObject.optInt("height_extra_size");
            jVar.f51344c = jSONObject.optInt("width_extra_size");
            jVar.f51345d = jSONObject.optString("text_color");
            jVar.f51346e = jSONObject.optString("background_color");
            jVar.f51347f = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            jVar.f51348g = z;
        }
        return jVar;
    }
}
