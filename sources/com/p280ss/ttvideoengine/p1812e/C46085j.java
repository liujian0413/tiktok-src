package com.p280ss.ttvideoengine.p1812e;

import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.j */
public final class C46085j {

    /* renamed from: a */
    public float f117909a = -1.0f;

    /* renamed from: b */
    public float f117910b = -1.0f;

    /* renamed from: c */
    public int f117911c = 1;

    /* renamed from: d */
    private float f117912d = -1.0f;

    /* renamed from: e */
    private float f117913e = -1.0f;

    /* renamed from: a */
    public final void mo112257a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("opening") || jSONObject.has("ending")) {
                this.f117911c = 1;
                try {
                    this.f117909a = (float) jSONObject.optDouble("opening");
                    this.f117910b = (float) jSONObject.optDouble("ending");
                } catch (Exception unused) {
                }
                return;
            }
            if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                this.f117911c = 2;
                try {
                    this.f117912d = (float) jSONObject.optDouble("Opening");
                    this.f117913e = (float) jSONObject.optDouble("Ending");
                } catch (Exception unused2) {
                }
            }
        }
    }
}
