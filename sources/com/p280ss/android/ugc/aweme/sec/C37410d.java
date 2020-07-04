package com.p280ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.d */
final class C37410d {
    C37410d() {
    }

    /* renamed from: a */
    static int m120036a(String str, JSONObject jSONObject) throws IOException, JSONException {
        if (((ISecApi) ServiceManager.get().getService(ISecApi.class)).isCaptchaUrl(str)) {
            String str2 = "";
            if (jSONObject.has("message")) {
                str2 = jSONObject.optString("message");
            }
            if (TextUtils.equals(str2, "error")) {
                return new JSONObject(jSONObject.optString("data")).optInt("error_code");
            }
        }
        return 0;
    }
}
