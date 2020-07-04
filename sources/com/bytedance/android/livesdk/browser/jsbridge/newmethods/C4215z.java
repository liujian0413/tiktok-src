package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z */
public final class C4215z extends C11155d<Object, JSONObject> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14340a(obj, callContext);
    }

    /* renamed from: a */
    private static JSONObject m14340a(Object obj, CallContext callContext) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_teen_mode", C9469i.m27993e().mo14561a().isNeedProtectUnderage());
        return jSONObject;
    }
}
