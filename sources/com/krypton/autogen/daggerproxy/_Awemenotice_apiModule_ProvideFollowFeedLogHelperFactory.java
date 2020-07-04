package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory implements C47373d<FollowFeedLogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50124a;

    public final FollowFeedLogHelper get() {
        return provideInstance(this.f50124a);
    }

    public _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50124a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideFollowFeedLogHelperFactory(_awemenotice_apimodule);
    }

    public static FollowFeedLogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideFollowFeedLogHelper(_awemenotice_apimodule);
    }

    public static FollowFeedLogHelper proxyProvideFollowFeedLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (FollowFeedLogHelper) C47375f.m147940a(_awemenotice_apimodule.provideFollowFeedLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
