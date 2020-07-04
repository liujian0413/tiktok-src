package com.p280ss.android.ugc.aweme.commercialize.link;

import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet */
public class LinkAuthBridgeSet extends BaseCommonJavaMethod {
    public LinkAuthBridgeSet() {
    }

    public LinkAuthBridgeSet(C11087a aVar) {
        super(aVar);
    }

    public LinkAuthBridgeSet(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        String str;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.optString("data", "");
        }
        C24773c.m81300a(str);
        aVar.mo71363a((Object) null);
    }
}
