package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory implements C47373d<NoticeCaptchaHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50129a;

    public final NoticeCaptchaHelper get() {
        return provideInstance(this.f50129a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50129a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCaptchaHelperFactory(_awemenotice_apimodule);
    }

    public static NoticeCaptchaHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCaptchaHelper(_awemenotice_apimodule);
    }

    public static NoticeCaptchaHelper proxyProvideNoticeCaptchaHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeCaptchaHelper) C47375f.m147940a(_awemenotice_apimodule.provideNoticeCaptchaHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
