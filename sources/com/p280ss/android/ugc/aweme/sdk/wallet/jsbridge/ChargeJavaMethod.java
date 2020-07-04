package com.p280ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.jsbridge.ChargeJavaMethod */
public class ChargeJavaMethod implements C11093e {
    public C11087a jsBridge;

    public ChargeJavaMethod(C11087a aVar) {
        this.jsBridge = aVar;
    }

    public void call(C11097i iVar, JSONObject jSONObject) {
        try {
            String string = iVar.f30171d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                JSONObject optJSONObject = iVar.f30171d.optJSONObject("args");
                if (optJSONObject != null) {
                    iWalletService.pay(string, optJSONObject, new C37304a() {
                        public void onFail(Exception exc) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            ChargeJavaMethod.this.jsBridge.mo27034b("H5_chargeStatus", jSONObject);
                        }
                    });
                }
                jSONObject.put("code", 1);
            }
        } catch (Exception unused) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException unused2) {
            }
        }
    }
}
