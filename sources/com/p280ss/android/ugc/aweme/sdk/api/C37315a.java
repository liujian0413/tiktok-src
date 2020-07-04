package com.p280ss.android.ugc.aweme.sdk.api;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.C37316b;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.bean.C37322b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.sdk.api.a */
public final class C37315a {

    /* renamed from: a */
    private static WeakReference<WalletApi> f97460a = new WeakReference<>(null);

    /* renamed from: a */
    public static C37322b m119813a() throws Exception {
        return (C37322b) m119814b().getMyWallet(1).get();
    }

    /* renamed from: b */
    private static WalletApi m119814b() {
        if (f97460a.get() != null) {
            return (WalletApi) f97460a.get();
        }
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        IWalletMainProxy iWalletMainProxy = (IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class);
        if (iRetrofitService == null) {
            return null;
        }
        WalletApi walletApi = (WalletApi) iRetrofitService.createNewRetrofit(C37316b.m119815a(iWalletMainProxy.getHost())).create(WalletApi.class);
        f97460a = new WeakReference<>(walletApi);
        return walletApi;
    }
}
