package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod */
public class MonitorLogMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            aVar.mo71362a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo71362a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            m137909a(jSONObject, jSONObject2, "status");
            m137909a(jSONObject, jSONObject2, "value");
            C6877n.m21407a(optString, optString2, jSONObject2);
            aVar.mo71363a((Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder("service is required while log_type=");
        sb.append(optString);
        aVar.mo71362a(0, sb.toString());
    }

    /* renamed from: a */
    private static void m137909a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            jSONObject2.put(str, opt);
        }
    }
}
