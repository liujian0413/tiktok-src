package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25280bm;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.MakeCallMethod */
public class MakeCallMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (this.f73443f != null && this.f73443f.get() != null && jSONObject != null) {
            String optString = jSONObject.optString("phone_number");
            String optString2 = jSONObject.optString("phone_id");
            String optString3 = jSONObject.optString("encrypt_key");
            String optString4 = jSONObject.optString("log_tag");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C25280bm.m83074a().mo65891a((Activity) this.f73443f.get(), optString, optString2, optString3, optString4);
            }
        }
    }
}
