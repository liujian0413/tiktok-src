package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Aweme_user_service_apiModule_ProvideIUserServiceFactory implements C47373d<C42846a> {

    /* renamed from: a */
    private final _Aweme_user_service_apiModule f50122a;

    public final C42846a get() {
        return provideInstance(this.f50122a);
    }

    public _Aweme_user_service_apiModule_ProvideIUserServiceFactory(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        this.f50122a = _aweme_user_service_apimodule;
    }

    public static _Aweme_user_service_apiModule_ProvideIUserServiceFactory create(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return new _Aweme_user_service_apiModule_ProvideIUserServiceFactory(_aweme_user_service_apimodule);
    }

    public static C42846a provideInstance(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return proxyProvideIUserService(_aweme_user_service_apimodule);
    }

    public static C42846a proxyProvideIUserService(_Aweme_user_service_apiModule _aweme_user_service_apimodule) {
        return (C42846a) C47375f.m147940a(_aweme_user_service_apimodule.provideIUserService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
