package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34305d;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideRedPointServiceFactory implements C47373d<C34305d> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50139a;

    public final C34305d get() {
        return provideInstance(this.f50139a);
    }

    public _Awemenotice_apiModule_ProvideRedPointServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50139a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideRedPointServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideRedPointServiceFactory(_awemenotice_apimodule);
    }

    public static C34305d provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideRedPointService(_awemenotice_apimodule);
    }

    public static C34305d proxyProvideRedPointService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C34305d) C47375f.m147940a(_awemenotice_apimodule.provideRedPointService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
