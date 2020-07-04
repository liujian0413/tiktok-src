package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.p109c.p112b.C2291e;
import com.bytedance.android.p109c.p112b.C2307i;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.an */
public final class C4107an extends C11155d<JSONObject, Object> {

    /* renamed from: a */
    private C2291e f12089a = C2307i.m9914a("webcast_jsb_local_data");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        String optString = jSONObject.optString("key");
        String optString2 = jSONObject.optString("data");
        if (this.f12089a != null) {
            this.f12089a.mo8099a(optString, optString2);
        }
        return null;
    }
}
