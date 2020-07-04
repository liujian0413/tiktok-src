package com.p280ss.android.ugc.aweme.sdk.iap.api;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.C37316b;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.iap.model.request.IapPayBody;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.C37357a;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p280ss.android.ugc.aweme.sdk.iap.model.response.TokenResponse;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.api.a */
public final class C37333a {

    /* renamed from: a */
    private static IapApi f97503a;

    /* renamed from: b */
    public static TokenResponse m119863b() throws Exception {
        return (TokenResponse) m119864c().getToken().get();
    }

    /* renamed from: c */
    private static IapApi m119864c() {
        if (f97503a != null) {
            return f97503a;
        }
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            f97503a = (IapApi) iRetrofitService.createNewRetrofit(C37316b.m119815a(((IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class)).getHost())).create(IapApi.class);
        }
        return f97503a;
    }

    /* renamed from: a */
    public static C37357a m119862a() throws Exception {
        return (C37357a) m119864c().queryMyWallet(((IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class)).getDiamondType()).get();
    }

    /* renamed from: a */
    public static DiamondOrderResponse m119860a(int i) throws Exception {
        return (DiamondOrderResponse) m119864c().createOrder(5, i).get();
    }

    /* renamed from: a */
    public static PayOrderResultResponse m119861a(String str) throws Exception {
        return (PayOrderResultResponse) m119864c().checkOrderResult(str).get();
    }

    /* renamed from: a */
    public static BaseResponse m119859a(String str, IapPayBody iapPayBody) throws Exception {
        return (BaseResponse) m119864c().verifyOrder(str, new C6600e().mo15979b((Object) iapPayBody)).get();
    }
}
