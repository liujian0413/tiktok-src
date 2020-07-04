package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.share.ShareService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Share_apiModule_ProvideShareServiceFactory implements C47373d<ShareService> {

    /* renamed from: a */
    private final _Share_apiModule f50153a;

    public final ShareService get() {
        return provideInstance(this.f50153a);
    }

    public _Share_apiModule_ProvideShareServiceFactory(_Share_apiModule _share_apimodule) {
        this.f50153a = _share_apimodule;
    }

    public static _Share_apiModule_ProvideShareServiceFactory create(_Share_apiModule _share_apimodule) {
        return new _Share_apiModule_ProvideShareServiceFactory(_share_apimodule);
    }

    public static ShareService provideInstance(_Share_apiModule _share_apimodule) {
        return proxyProvideShareService(_share_apimodule);
    }

    public static ShareService proxyProvideShareService(_Share_apiModule _share_apimodule) {
        return (ShareService) C47375f.m147940a(_share_apimodule.provideShareService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
