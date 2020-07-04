package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ap */
public final class C4110ap extends C11155d<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14197a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14197a(JSONObject jSONObject, CallContext callContext) throws Exception {
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        Iterator keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString2 = optJSONObject.optString(str);
            keys.remove();
            hashMap.put(str, optString2);
        }
        hashMap.put("sdk_version", "1380");
        hashMap.put("_param_live_platform", "live");
        TTLiveSDKContext.getHostService().mo22363d().mo23269a(optString, hashMap);
        return null;
    }
}
