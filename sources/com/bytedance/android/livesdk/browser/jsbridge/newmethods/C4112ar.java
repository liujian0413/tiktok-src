package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.fansclub.C5896a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ar */
public final class C4112ar extends C11152c<JSONObject, Object> {
    public final void onTerminate() {
    }

    public final /* synthetic */ void invoke(Object obj, CallContext callContext) throws Exception {
        m14199a((JSONObject) obj, callContext);
    }

    /* renamed from: a */
    private static void m14199a(JSONObject jSONObject, CallContext callContext) throws Exception {
        int i = jSONObject.getInt("status");
        C5896a aVar = new C5896a();
        aVar.f17470a = i;
        C9097a.m27146a().mo22267a((Object) aVar);
    }
}
