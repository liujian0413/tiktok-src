package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.j */
public final class C4173j extends C11152c<JSONObject, Object> {

    /* renamed from: a */
    private Dialog f12225a;

    public final void onTerminate() {
        if (this.f12225a != null && this.f12225a.isShowing()) {
            C4174k.m14275a(this.f12225a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (TextUtils.equals(jSONObject.optString("type"), "recharge")) {
            String str = "";
            String str2 = "";
            ChargeDeal chargeDeal = new ChargeDeal();
            Bundle bundle = new Bundle();
            if (optJSONObject != null) {
                bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
                bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, str2);
                chargeDeal.f25519e = optJSONObject.optInt("diamond_count");
                chargeDeal.f25516b = optJSONObject.optInt("exchange_price");
                chargeDeal.f25517c = optJSONObject.optInt("price");
                chargeDeal.f25515a = (long) optJSONObject.optInt("id");
                chargeDeal.f25520f = optJSONObject.optInt("giving_count");
            }
            this.f12225a = ((IWalletService) C3596c.m13172a(IWalletService.class)).getPayDialog(callContext.f30265a, 0, bundle, chargeDeal);
            this.f12225a.show();
        }
        finishWithSuccess();
    }
}
