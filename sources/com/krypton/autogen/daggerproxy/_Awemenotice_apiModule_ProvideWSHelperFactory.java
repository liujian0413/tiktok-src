package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.WSHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideWSHelperFactory implements C47373d<WSHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50141a;

    public final WSHelper get() {
        return provideInstance(this.f50141a);
    }

    public _Awemenotice_apiModule_ProvideWSHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50141a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideWSHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideWSHelperFactory(_awemenotice_apimodule);
    }

    public static WSHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideWSHelper(_awemenotice_apimodule);
    }

    public static WSHelper proxyProvideWSHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (WSHelper) C47375f.m147940a(_awemenotice_apimodule.provideWSHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
