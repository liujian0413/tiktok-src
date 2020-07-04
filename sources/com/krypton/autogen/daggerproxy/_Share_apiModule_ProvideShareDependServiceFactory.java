package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.share.ShareDependService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Share_apiModule_ProvideShareDependServiceFactory implements C47373d<ShareDependService> {

    /* renamed from: a */
    private final _Share_apiModule f50151a;

    public final ShareDependService get() {
        return provideInstance(this.f50151a);
    }

    public _Share_apiModule_ProvideShareDependServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50151a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareDependServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareDependServiceFactory(_share_apimodule);
    }

    public static ShareDependService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareDependService(_share_apimodule);
    }

    public static ShareDependService proxyProvideShareDependService(_Share_apiModule _share_apimodule) {
        return (ShareDependService) C47375f.m147940a(_share_apimodule.provideShareDependService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
