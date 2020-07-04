package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import com.bytedance.android.live.core.utils.C3408u;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair.Type;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.l */
public final class C4060l implements C11093e {
    /* renamed from: a */
    private static int m14144a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            FollowPair followPair = (FollowPair) C3408u.m12668a(jSONObject.toString(), FollowPair.class);
            if (followPair != null) {
                followPair.f25598f = Type.FromWeb;
                TTLiveSDKContext.getHostService().mo22367h().mo22175a(followPair);
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        int i;
        if ("follow".equals(iVar.f30171d.getString("type"))) {
            i = m14144a(iVar.f30171d.getJSONObject("args"));
        } else {
            i = 0;
        }
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
    }
}
