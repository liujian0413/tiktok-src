package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideLogHelperFactory implements C47373d<LogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50127a;

    public final LogHelper get() {
        return provideInstance(this.f50127a);
    }

    public _Awemenotice_apiModule_ProvideLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50127a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideLogHelperFactory(_awemenotice_apimodule);
    }

    public static LogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideLogHelper(_awemenotice_apimodule);
    }

    public static LogHelper proxyProvideLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (LogHelper) C47375f.m147940a(_awemenotice_apimodule.provideLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
