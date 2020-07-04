package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory implements C47373d<NoticeDuetWithMovieHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50133a;

    public final NoticeDuetWithMovieHelper get() {
        return provideInstance(this.f50133a);
    }

    public _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50133a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeDuetWithMovieHelperFactory(_awemenotice_apimodule);
    }

    public static NoticeDuetWithMovieHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeDuetWithMovieHelper(_awemenotice_apimodule);
    }

    public static NoticeDuetWithMovieHelper proxyProvideNoticeDuetWithMovieHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeDuetWithMovieHelper) C47375f.m147940a(_awemenotice_apimodule.provideNoticeDuetWithMovieHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
