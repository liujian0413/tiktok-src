package com.bytedance.apm.p241f;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.b */
final class C6198b {
    /* renamed from: a */
    static void m19243a(C6189a aVar, String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (str2 == "fps" && z && jSONObject != null) {
            try {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("extra_values");
                JSONObject jSONObject3 = (JSONObject) jSONObject.get("extra_status");
                if (!(jSONObject2 == null || jSONObject3 == null)) {
                    String string = jSONObject3.getString("scene");
                    double d = jSONObject2.getDouble("fps");
                    if (!TextUtils.isEmpty(string) && d >= 0.0d && d <= 60.0d) {
                        C6907h.m21525a("ui_sample_report", new C6909j().mo16966a("ui_scene", string).mo16966a("ui_fps", Double.toString(d)).mo16967a());
                    }
                }
            } catch (JSONException unused) {
            }
        }
        aVar.mo14919b(str, str2, jSONObject, z, z2);
    }
}
