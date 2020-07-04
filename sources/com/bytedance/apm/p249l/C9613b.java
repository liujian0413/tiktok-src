package com.bytedance.apm.p249l;

import android.text.TextUtils;
import com.bytedance.apm.p245h.C6214f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.b */
public final class C9613b {
    /* renamed from: a */
    public static JSONObject m28454a(JSONObject jSONObject, C6214f fVar) throws JSONException {
        if (fVar == null) {
            return jSONObject;
        }
        if (!TextUtils.isEmpty(fVar.f18301b)) {
            jSONObject.put("version_code", fVar.f18301b);
        }
        if (!TextUtils.isEmpty(fVar.f18302c)) {
            jSONObject.put("version_name", fVar.f18302c);
        }
        if (!TextUtils.isEmpty(fVar.f18303d)) {
            jSONObject.put("manifest_version_code", fVar.f18303d);
        }
        if (!TextUtils.isEmpty(fVar.f18304e)) {
            jSONObject.put("update_version_code", fVar.f18304e);
        }
        if (!TextUtils.isEmpty(fVar.f18305f)) {
            jSONObject.put("app_version", fVar.f18305f);
        }
        return jSONObject;
    }
}
