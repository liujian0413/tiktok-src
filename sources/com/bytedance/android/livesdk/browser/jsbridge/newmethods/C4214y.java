package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.y */
public final class C4214y extends C11155d<Object, JSONObject> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14339a(obj, callContext);
    }

    /* renamed from: a */
    private static JSONObject m14339a(Object obj, CallContext callContext) throws Exception {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : TTLiveSDKContext.getHostService().mo22368i().mo23274b("https://hotsoon.snssdk.com").entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("token", jSONObject2);
        return jSONObject;
    }
}
