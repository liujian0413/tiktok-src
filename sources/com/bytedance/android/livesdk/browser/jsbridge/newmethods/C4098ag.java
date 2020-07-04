package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag */
public final class C4098ag extends C11155d<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14181a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14181a(JSONObject jSONObject, CallContext callContext) throws Exception {
        String optString = jSONObject.optString("json_str");
        if (!TextUtils.isEmpty(optString)) {
            boolean a = TTLiveSDKContext.getHostService().mo22365f().mo22049a(optString);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", a);
                jSONObject2.put(C38347c.f99553h, optString);
            } catch (JSONException unused) {
            }
            C3172e.m12002a("ttlive_open_koi_packet", 0, jSONObject2);
        }
        return null;
    }
}
