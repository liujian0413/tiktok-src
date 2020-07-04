package com.p280ss.videoarch.liveplayer.p1834a;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.a.d */
public final class C46284d {

    /* renamed from: a */
    public final String f118919a;

    /* renamed from: b */
    public final String f118920b = null;

    /* renamed from: c */
    public String f118921c;

    /* renamed from: a */
    public final String mo115026a() {
        JSONObject jSONObject;
        try {
            if (this.f118921c != null) {
                jSONObject = new JSONObject(this.f118921c);
                if (jSONObject != null || !jSONObject.has("VCodec")) {
                    return null;
                }
                String optString = jSONObject.optString("VCodec");
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
                return null;
            }
        } catch (JSONException unused) {
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return null;
    }

    public C46284d(String str, String str2, String str3) {
        this.f118919a = str;
        this.f118921c = str3;
    }
}
