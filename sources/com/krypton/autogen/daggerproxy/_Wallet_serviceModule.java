package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.graph.C7289f;

public class _Wallet_serviceModule {
    public IIapWalletProxy provideIIapWalletProxy() {
        return ((Wallet_serviceService) C7289f.m22851a(Wallet_serviceService.class)).provideIIapWalletProxy();
    }

    public IWalletMainProxy provideIWalletMainProxy() {
        return ((Wallet_serviceService) C7289f.m22851a(Wallet_serviceService.class)).provideIWalletMainProxy();
    }

    public IWalletService provideIWalletService() {
        return ((Wallet_serviceService) C7289f.m22851a(Wallet_serviceService.class)).provideIWalletService();
    }
}
