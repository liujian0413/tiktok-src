package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.pay.service.IPayService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Pay_apiModule_ProvideIPayServiceFactory implements C47373d<IPayService> {

    /* renamed from: a */
    private final _Pay_apiModule f50149a;

    public final IPayService get() {
        return provideInstance(this.f50149a);
    }

    public _Pay_apiModule_ProvideIPayServiceFactory(_Pay_apiModule _pay_apimodule) {
        this.f50149a = _pay_apimodule;
    }

    public static _Pay_apiModule_ProvideIPayServiceFactory create(_Pay_apiModule _pay_apimodule) {
        return new _Pay_apiModule_ProvideIPayServiceFactory(_pay_apimodule);
    }

    public static IPayService provideInstance(_Pay_apiModule _pay_apimodule) {
        return proxyProvideIPayService(_pay_apimodule);
    }

    public static IPayService proxyProvideIPayService(_Pay_apiModule _pay_apimodule) {
        return (IPayService) C47375f.m147940a(_pay_apimodule.provideIPayService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
