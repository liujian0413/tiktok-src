package com.p280ss.videoarch.liveplayer.p1834a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.a.c */
public final class C46283c {

    /* renamed from: a */
    private JSONObject f118918a;

    public C46283c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f118918a = jSONObject.getJSONObject("data");
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo115025a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = this.f118918a.getJSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo115023a(String str, String str2) {
        String str3;
        if (!mo115025a(str)) {
            return null;
        }
        try {
            str3 = new JSONObject(this.f118918a.getJSONObject(str).getJSONObject(str2).optString("sdk_params")).optString("VCodec");
        } catch (JSONException unused) {
            str3 = null;
        }
        return str3;
    }

    /* renamed from: a */
    public final String mo115024a(String str, String str2, String str3) {
        String str4;
        if (!mo115025a(str)) {
            return null;
        }
        try {
            str4 = this.f118918a.getJSONObject(str).getJSONObject(str3).optString(str2);
        } catch (JSONException unused) {
            str4 = null;
        }
        return str4;
    }
}
