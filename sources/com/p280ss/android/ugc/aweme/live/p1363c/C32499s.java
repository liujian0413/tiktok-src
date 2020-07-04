package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9432a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9434c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9435d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9437f;
import com.p280ss.android.ugc.aweme.live.LiveBillingProxyActivity;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import com.p280ss.android.ugc.aweme.wallet.C43395a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.c.s */
public final class C32499s implements IHostWallet {
    public final C9432a getBillingClient(C9437f fVar) {
        return null;
    }

    public final String getCJAppId() {
        return null;
    }

    public final String getCJMerchantId() {
        return null;
    }

    public final Map<String, String> getHostWalletSetting() {
        return null;
    }

    public final void payWithAli(Activity activity, C9353b bVar, C9435d dVar) {
    }

    public final void verifyWithAli(Activity activity, String str, C9434c cVar) {
    }

    public final void openBillingProxyActivity(Context context, Bundle bundle) {
        Intent intent = new Intent(context, LiveBillingProxyActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    public final void payWithWX(Context context, C9353b bVar, final C9435d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", bVar.f25554i);
            jSONObject.put("prepay_id", bVar.f25556k);
            jSONObject.put("timestamp", bVar.f25558m);
            jSONObject.put("nonce_str", bVar.f25557l);
            jSONObject.put("order_id", bVar.f25546a);
            jSONObject.put("partner_id", bVar.f25555j);
            jSONObject.put("sign", bVar.f25559n);
            C325001 r4 = new C37304a() {
                public final void onFail(Exception exc) {
                }

                public final void onSuccess(JSONObject jSONObject) {
                    int i;
                    JSONObject optJSONObject = jSONObject.optJSONObject("args");
                    String str = "";
                    if (optJSONObject != null) {
                        optJSONObject.optString("order_id");
                        str = optJSONObject.optString("message");
                        i = optJSONObject.optInt("code");
                    } else {
                        i = 0;
                    }
                    if (i != 1) {
                        TextUtils.equals("支付取消", str);
                    }
                }
            };
            if (!C43395a.m137714a().pay("weixin", jSONObject, r4)) {
                r4.onFail(new RuntimeException("吊起微信失败"));
            }
        } catch (Exception unused) {
        }
    }
}
