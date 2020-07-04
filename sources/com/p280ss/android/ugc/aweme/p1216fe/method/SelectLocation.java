package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36442dz;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36442dz.C36444a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SelectLocation */
public class SelectLocation extends BaseCommonJavaMethod {
    public SelectLocation(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        C36442dz dzVar = new C36442dz(C6405d.m19984g());
        dzVar.mo92514a();
        dzVar.f95624f = new C36444a() {
            /* renamed from: a */
            public final void mo71404a(boolean z, String str) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventName", "locationSelected");
                    if (!z) {
                        jSONObject.put("code", 0);
                    } else {
                        jSONObject.put("code", 1);
                        jSONObject.put("location", str);
                    }
                    SelectLocation.this.mo71359a("notification", jSONObject, 2);
                } catch (JSONException unused) {
                }
            }
        };
    }
}
