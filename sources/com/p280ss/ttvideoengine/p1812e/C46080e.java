package com.p280ss.ttvideoengine.p1812e;

import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.e */
public final class C46080e {

    /* renamed from: a */
    private String f117794a;

    /* renamed from: b */
    private String f117795b;

    /* renamed from: c */
    private String f117796c;

    /* renamed from: a */
    public final String mo112214a(int i) {
        if (i == 215) {
            return this.f117794a;
        }
        switch (i) {
            case 108:
                return this.f117795b;
            case 109:
                return this.f117796c;
            default:
                return "";
        }
    }

    /* renamed from: a */
    public final void mo112215a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f117794a = jSONObject.optString("AdaptiveType");
            this.f117795b = jSONObject.optString("MainPlayUrl");
            this.f117796c = jSONObject.optString("BackupPlayUrl");
        }
    }
}
