package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory implements C47373d<DeepLinkReturnHelperService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50123a;

    public final DeepLinkReturnHelperService get() {
        return provideInstance(this.f50123a);
    }

    public _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50123a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideDeepLinkReturnHelperServiceFactory(_awemenotice_apimodule);
    }

    public static DeepLinkReturnHelperService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideDeepLinkReturnHelperService(_awemenotice_apimodule);
    }

    public static DeepLinkReturnHelperService proxyProvideDeepLinkReturnHelperService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (DeepLinkReturnHelperService) C47375f.m147940a(_awemenotice_apimodule.provideDeepLinkReturnHelperService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
