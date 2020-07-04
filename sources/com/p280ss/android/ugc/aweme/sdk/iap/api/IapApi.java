package com.p280ss.android.ugc.aweme.sdk.iap.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.C37357a;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.TokenResponse;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.api.IapApi */
public interface IapApi {
    @C7730f(mo20420a = "/aweme/v1/wallet/order/result/")
    C18253l<PayOrderResultResponse> checkOrderResult(@C7744t(mo20436a = "order_id") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/wallet/diamond/buy/")
    C18253l<DiamondOrderResponse> createOrder(@C7727c(mo20417a = "pay_channel") int i, @C7727c(mo20417a = "diamond_id") int i2);

    @C7739o(mo20429a = "/passport/auth/get_token/")
    C18253l<TokenResponse> getToken();

    @C7730f(mo20420a = "/aweme/v1/wallet/mywallet/")
    C18253l<C37357a> queryMyWallet(@C7744t(mo20436a = "diamond_type") int i);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/wallet/googlepay/verify/")
    C18253l<BaseResponse> verifyOrder(@C7727c(mo20417a = "order_id") String str, @C7727c(mo20417a = "data") String str2);
}
