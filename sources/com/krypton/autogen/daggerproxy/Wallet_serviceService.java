package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;

public interface Wallet_serviceService {
    IIapWalletProxy provideIIapWalletProxy();

    IWalletMainProxy provideIWalletMainProxy();

    IWalletService provideIWalletService();
}
