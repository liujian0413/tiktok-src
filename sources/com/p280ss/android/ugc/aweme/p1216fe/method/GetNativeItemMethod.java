package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod */
public class GetNativeItemMethod extends BaseCommonJavaMethod {
    public GetNativeItemMethod() {
    }

    public GetNativeItemMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        try {
            String a = C27870d.m91297a().mo71348a(jSONObject.getString("key"), "");
            if (!TextUtils.isEmpty(a)) {
                aVar.mo71363a((Object) a);
            } else {
                aVar.mo71362a(-1, "value为空");
            }
        } catch (Exception e) {
            aVar.mo71362a(-1, e.getMessage());
        }
    }
}
