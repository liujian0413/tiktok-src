package com.p280ss.android.ugc.aweme.sdk.wallet.module.pay;

import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.pay.IPay */
public interface IPay {
    void checkOrderStatus();

    void createOrder();

    boolean pay(JSONObject jSONObject, C37304a aVar) throws Exception;
}
