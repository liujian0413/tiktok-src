package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AppSettingMethod */
public class AppSettingMethod extends BaseCommonJavaMethod {
    /* renamed from: c */
    private static JSONObject m91337c() {
        JSONObject jSONObject = new JSONObject();
        String str = "isTeenagersModel";
        try {
            int i = 1;
            if (C7213d.m22500a().mo18769ag() != 1 || !TimeLockRuler.isContentFilterOn()) {
                i = 0;
            }
            jSONObject.put(str, i);
            jSONObject.put("language", C32326h.m104885g());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        aVar.mo71363a((Object) m91337c());
    }
}
