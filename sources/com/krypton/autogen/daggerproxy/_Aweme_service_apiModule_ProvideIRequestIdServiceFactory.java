package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_service_apiModule_ProvideIRequestIdServiceFactory implements C47373d<IRequestIdService> {

    /* renamed from: a */
    private final _Aweme_service_apiModule f50121a;

    public final IRequestIdService get() {
        return provideInstance(this.f50121a);
    }

    public _Aweme_service_apiModule_ProvideIRequestIdServiceFactory(_Aweme_service_apiModule _aweme_service_apimodule) {
        this.f50121a = _aweme_service_apimodule;
    }

    public static _Aweme_service_apiModule_ProvideIRequestIdServiceFactory create(_Aweme_service_apiModule _aweme_service_apimodule) {
        return new _Aweme_service_apiModule_ProvideIRequestIdServiceFactory(_aweme_service_apimodule);
    }

    public static IRequestIdService provideInstance(_Aweme_service_apiModule _aweme_service_apimodule) {
        return proxyProvideIRequestIdService(_aweme_service_apimodule);
    }

    public static IRequestIdService proxyProvideIRequestIdService(_Aweme_service_apiModule _aweme_service_apimodule) {
        return (IRequestIdService) C47375f.m147940a(_aweme_service_apimodule.provideIRequestIdService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
