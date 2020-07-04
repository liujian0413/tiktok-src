package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34304c;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideOldRedPointServiceFactory implements C47373d<C34304c> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50138a;

    public final C34304c get() {
        return provideInstance(this.f50138a);
    }

    public _Awemenotice_apiModule_ProvideOldRedPointServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50138a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideOldRedPointServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideOldRedPointServiceFactory(_awemenotice_apimodule);
    }

    public static C34304c provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideOldRedPointService(_awemenotice_apimodule);
    }

    public static C34304c proxyProvideOldRedPointService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C34304c) C47375f.m147940a(_awemenotice_apimodule.provideOldRedPointService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
