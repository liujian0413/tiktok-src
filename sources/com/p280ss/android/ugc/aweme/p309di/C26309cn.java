package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.IapWalletProxy;
import com.p280ss.android.ugc.aweme.sdk.WalletService;
import com.p280ss.android.ugc.aweme.wallet.WalletMainProxy;

/* renamed from: com.ss.android.ugc.aweme.di.cn */
public final class C26309cn {
    /* renamed from: a */
    public static IWalletMainProxy m86529a() {
        return new WalletMainProxy();
    }

    /* renamed from: b */
    public static IIapWalletProxy m86530b() {
        return new IapWalletProxy();
    }

    /* renamed from: c */
    public static IWalletService m86531c() {
        return new WalletService();
    }
}
