package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod */
public class SetNativeItemMethod extends BaseCommonJavaMethod {
    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            if (C27870d.m91297a().mo71349a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo71363a((Object) null);
            } else {
                aVar.mo71362a(-1, "");
            }
        } catch (Exception unused) {
            aVar.mo71362a(-1, "");
        }
    }
}
