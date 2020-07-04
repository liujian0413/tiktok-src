package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4035e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ab */
public final class C4091ab extends C11155d<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14173a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14173a(JSONObject jSONObject, CallContext callContext) throws JSONException {
        C9097a.m27146a().mo22267a((Object) new C4035e(jSONObject.getLong("gift_id")));
        return null;
    }
}
