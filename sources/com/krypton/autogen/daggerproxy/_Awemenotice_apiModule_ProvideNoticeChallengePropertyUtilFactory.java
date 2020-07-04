package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory implements C47373d<NoticeChallengePropertyUtil> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50130a;

    public final NoticeChallengePropertyUtil get() {
        return provideInstance(this.f50130a);
    }

    public _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50130a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeChallengePropertyUtilFactory(_awemenotice_apimodule);
    }

    public static NoticeChallengePropertyUtil provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeChallengePropertyUtil(_awemenotice_apimodule);
    }

    public static NoticeChallengePropertyUtil proxyProvideNoticeChallengePropertyUtil(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeChallengePropertyUtil) C47375f.m147940a(_awemenotice_apimodule.provideNoticeChallengePropertyUtil(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
