package com.p280ss.android.p817ad.splash.core.p828c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.f */
public final class C19007f {

    /* renamed from: a */
    public String f51331a;

    /* renamed from: b */
    public int f51332b;

    /* renamed from: c */
    public String f51333c;

    /* renamed from: d */
    public String f51334d;

    /* renamed from: a */
    public static C19007f m62067a(JSONObject jSONObject) {
        C19007f fVar = new C19007f();
        if (jSONObject != null) {
            fVar.f51331a = jSONObject.optString("background_color");
            fVar.f51332b = jSONObject.optInt("position");
            fVar.f51333c = jSONObject.optString("text_color");
            fVar.f51334d = jSONObject.optString("text");
        }
        return fVar;
    }
}
