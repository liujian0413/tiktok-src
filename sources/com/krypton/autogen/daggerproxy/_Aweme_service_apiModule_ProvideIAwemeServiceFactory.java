package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_service_apiModule_ProvideIAwemeServiceFactory implements C47373d<IAwemeService> {

    /* renamed from: a */
    private final _Aweme_service_apiModule f50120a;

    public final IAwemeService get() {
        return provideInstance(this.f50120a);
    }

    public _Aweme_service_apiModule_ProvideIAwemeServiceFactory(_Aweme_service_apiModule _aweme_service_apimodule) {
        this.f50120a = _aweme_service_apimodule;
    }

    public static _Aweme_service_apiModule_ProvideIAwemeServiceFactory create(_Aweme_service_apiModule _aweme_service_apimodule) {
        return new _Aweme_service_apiModule_ProvideIAwemeServiceFactory(_aweme_service_apimodule);
    }

    public static IAwemeService provideInstance(_Aweme_service_apiModule _aweme_service_apimodule) {
        return proxyProvideIAwemeService(_aweme_service_apimodule);
    }

    public static IAwemeService proxyProvideIAwemeService(_Aweme_service_apiModule _aweme_service_apimodule) {
        return (IAwemeService) C47375f.m147940a(_aweme_service_apimodule.provideIAwemeService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
