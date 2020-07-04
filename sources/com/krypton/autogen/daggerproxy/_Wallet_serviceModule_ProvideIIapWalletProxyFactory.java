package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.sdk.IIapWalletProxy;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Wallet_serviceModule_ProvideIIapWalletProxyFactory implements C47373d<IIapWalletProxy> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50155a;

    public final IIapWalletProxy get() {
        return provideInstance(this.f50155a);
    }

    public _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50155a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIIapWalletProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_wallet_servicemodule);
    }

    public static IIapWalletProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIIapWalletProxy(_wallet_servicemodule);
    }

    public static IIapWalletProxy proxyProvideIIapWalletProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IIapWalletProxy) C47375f.m147940a(_wallet_servicemodule.provideIIapWalletProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
