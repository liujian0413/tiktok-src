package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.share.ShareExtService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Share_apiModule_ProvideShareExtServiceFactory implements C47373d<ShareExtService> {

    /* renamed from: a */
    private final _Share_apiModule f50152a;

    public final ShareExtService get() {
        return provideInstance(this.f50152a);
    }

    public _Share_apiModule_ProvideShareExtServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50152a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareExtServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareExtServiceFactory(_share_apimodule);
    }

    public static ShareExtService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareExtService(_share_apimodule);
    }

    public static ShareExtService proxyProvideShareExtService(_Share_apiModule _share_apimodule) {
        return (ShareExtService) C47375f.m147940a(_share_apimodule.provideShareExtService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
