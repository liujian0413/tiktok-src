package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.e */
public final class C4165e extends C11155d<Object, JSONObject> {
    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14268a(obj, callContext);
    }

    /* renamed from: a */
    private static JSONObject m14268a(Object obj, CallContext callContext) throws Exception {
        JSONObject jSONObject = new JSONObject();
        Map commonParams = ((INetworkService) C3596c.m13172a(INetworkService.class)).getCommonParams();
        for (String str : commonParams.keySet()) {
            String str2 = (String) commonParams.get(str);
            if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
                jSONObject.put(str, str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : TTLiveSDKContext.getHostService().mo22368i().mo23274b("https://hotsoon.snssdk.com").entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
