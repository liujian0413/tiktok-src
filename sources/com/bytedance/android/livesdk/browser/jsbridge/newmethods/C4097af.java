package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.af */
public final class C4097af extends C11155d<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14180a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14180a(JSONObject jSONObject, CallContext callContext) throws Exception {
        char c;
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optString.hashCode() == -806191449 && optString.equals("recharge")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c == 0 && TextUtils.equals(optJSONObject.optString("status"), "1")) {
            C9097a.m27146a().mo22267a((Object) new C8296e(1, true));
        }
        return null;
    }
}
