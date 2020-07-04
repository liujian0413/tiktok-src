package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.c */
public final class C43501c implements C11093e {
    /* renamed from: a */
    private static void m137978a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            String advertisingIdOb = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAdvertisingIdOb();
            if (!TextUtils.isEmpty(advertisingIdOb)) {
                jSONObject.put("gaid", advertisingIdOb);
            }
            jSONObject.put("code", 1);
        } catch (JSONException unused2) {
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        m137978a(jSONObject);
    }
}
