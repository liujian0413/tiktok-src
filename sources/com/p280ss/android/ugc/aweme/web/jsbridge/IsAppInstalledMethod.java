package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C43106er;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod */
public class IsAppInstalledMethod extends BaseCommonJavaMethod {
    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        String string = jSONObject.getString("packageName");
        if (C43106er.m136726a(C6399b.m19921a(), string)) {
            aVar.mo71363a((Object) new JSONObject());
        } else {
            aVar.mo71362a(-1, string);
        }
    }
}
