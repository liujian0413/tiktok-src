package com.p280ss.android.ugc.aweme.p1216fe.method.charge;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.charge.ChargeMethod */
public class ChargeMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, final C27876a aVar) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject == null) {
                aVar.mo71362a(-1, "args == null");
                return;
            }
            String string = jSONObject.getString("type");
            if (!TextUtils.isEmpty(string)) {
                ((IWalletService) ServiceManager.get().getService(IWalletService.class)).pay(string, optJSONObject, new C37304a() {
                    public final void onSuccess(JSONObject jSONObject) {
                        aVar.mo71363a((Object) jSONObject);
                    }

                    public final void onFail(Exception exc) {
                        aVar.mo71362a(-1, exc.getMessage());
                    }
                });
            }
        } catch (Exception e) {
            aVar.mo71362a(-1, e.getMessage());
        }
    }
}
