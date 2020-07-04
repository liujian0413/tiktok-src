package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Wallet_serviceModule_ProvideIWalletMainProxyFactory implements C47373d<IWalletMainProxy> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50156a;

    public final IWalletMainProxy get() {
        return provideInstance(this.f50156a);
    }

    public _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50156a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletMainProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_wallet_servicemodule);
    }

    public static IWalletMainProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletMainProxy(_wallet_servicemodule);
    }

    public static IWalletMainProxy proxyProvideIWalletMainProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletMainProxy) C47375f.m147940a(_wallet_servicemodule.provideIWalletMainProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
