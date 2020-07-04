package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.C34301b;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideLivePushServiceFactory implements C47373d<C34301b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50126a;

    public final C34301b get() {
        return provideInstance(this.f50126a);
    }

    public _Awemenotice_apiModule_ProvideLivePushServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50126a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideLivePushServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideLivePushServiceFactory(_awemenotice_apimodule);
    }

    public static C34301b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideLivePushService(_awemenotice_apimodule);
    }

    public static C34301b proxyProvideLivePushService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C34301b) C47375f.m147940a(_awemenotice_apimodule.provideLivePushService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
