package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aq */
public final class C4111aq extends C11155d<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14198a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14198a(JSONObject jSONObject, CallContext callContext) throws Exception {
        jSONObject.optString("eventName");
        jSONObject.optString("labelName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        HashMap hashMap = new HashMap();
        Iterator keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString = optJSONObject.optString(str);
            keys.remove();
            hashMap.put(str, optString);
        }
        C3596c.m13172a(C9295a.class);
        return null;
    }
}
