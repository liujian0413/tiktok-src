package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3777e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C3597a;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4034d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.p436c.C9292a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ah */
public final class C4099ah extends C11155d<JSONObject, Object> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return null;
        }
        if (callContext.f30265a instanceof C9292a) {
            String optString = jSONObject2.optString("diamond");
            if (!TextUtils.isEmpty(optString)) {
                Bundle bundle = new Bundle();
                bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, "h5");
                ((IWalletService) C3596c.m13172a(IWalletService.class)).getConsumeDialog((Activity) callContext.f30265a, bundle, jSONObject2, new C3597a() {
                    /* renamed from: a */
                    public final void mo11022a(Dialog dialog, C3777e eVar) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", "success");
                            jSONObject.put("code", "1");
                        } catch (Exception e) {
                            C3166a.m11963b("PackagePurchaseMethod", (Throwable) e);
                        }
                        C9178j.m27302j().mo22374c().mo11543a("H5_payStatus", jSONObject);
                    }
                }, optString).show();
            }
        } else {
            C4034d dVar = new C4034d(jSONObject2, jSONObject2.getString("diamond"));
            String str2 = "";
            try {
                str = Uri.parse(callContext.f30266b).getQueryParameter("event_page");
            } catch (Exception e) {
                C3166a.m11963b("PackagePurchaseMethod", (Throwable) e);
                str = str2;
            }
            dVar.f12013c = str;
            C9097a.m27146a().mo22267a((Object) dVar);
        }
        return null;
    }
}
