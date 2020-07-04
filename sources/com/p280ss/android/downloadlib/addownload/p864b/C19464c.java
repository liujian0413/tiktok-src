package com.p280ss.android.downloadlib.addownload.p864b;

import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.b.c */
public final class C19464c {

    /* renamed from: a */
    public Long f52704a;

    /* renamed from: b */
    public String f52705b;

    public C19464c() {
        this.f52704a = Long.valueOf(0);
        this.f52705b = "";
    }

    /* renamed from: a */
    public final JSONObject mo51533a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mAdId", this.f52704a);
            jSONObject.put("mPackageName", this.f52705b);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo51534a(JSONObject jSONObject) {
        try {
            this.f52704a = Long.valueOf(jSONObject.optLong("mAdId"));
            this.f52705b = jSONObject.optString("mPackageName");
        } catch (Exception unused) {
        }
    }

    public C19464c(Long l, String str) {
        this.f52704a = l;
        this.f52705b = str;
    }
}
