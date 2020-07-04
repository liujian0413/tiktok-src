package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Shopping_apiModule_ProvideICommerceServiceFactory implements C47373d<ICommerceService> {

    /* renamed from: a */
    private final _Shopping_apiModule f50154a;

    public final ICommerceService get() {
        return provideInstance(this.f50154a);
    }

    public _Shopping_apiModule_ProvideICommerceServiceFactory(_Shopping_apiModule _shopping_apimodule) {
        this.f50154a = _shopping_apimodule;
    }

    public static _Shopping_apiModule_ProvideICommerceServiceFactory create(_Shopping_apiModule _shopping_apimodule) {
        return new _Shopping_apiModule_ProvideICommerceServiceFactory(_shopping_apimodule);
    }

    public static ICommerceService provideInstance(_Shopping_apiModule _shopping_apimodule) {
        return proxyProvideICommerceService(_shopping_apimodule);
    }

    public static ICommerceService proxyProvideICommerceService(_Shopping_apiModule _shopping_apimodule) {
        return (ICommerceService) C47375f.m147940a(_shopping_apimodule.provideICommerceService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
