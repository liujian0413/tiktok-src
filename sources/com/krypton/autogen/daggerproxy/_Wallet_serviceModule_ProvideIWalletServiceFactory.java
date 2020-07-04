package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Wallet_serviceModule_ProvideIWalletServiceFactory implements C47373d<IWalletService> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50157a;

    public final IWalletService get() {
        return provideInstance(this.f50157a);
    }

    public _Wallet_serviceModule_ProvideIWalletServiceFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50157a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletServiceFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletServiceFactory(_wallet_servicemodule);
    }

    public static IWalletService provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletService(_wallet_servicemodule);
    }

    public static IWalletService proxyProvideIWalletService(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletService) C47375f.m147940a(_wallet_servicemodule.provideIWalletService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
