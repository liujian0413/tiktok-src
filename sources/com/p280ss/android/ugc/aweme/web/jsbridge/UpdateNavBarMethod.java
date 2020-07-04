package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.p280ss.android.ugc.aweme.crossplatform.p1151a.C25809a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod */
public final class UpdateNavBarMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("topbar_type", "");
        } else {
            str = null;
        }
        C42961az.m136380a(new C25809a(str));
        aVar.mo71363a((Object) null);
    }
}
