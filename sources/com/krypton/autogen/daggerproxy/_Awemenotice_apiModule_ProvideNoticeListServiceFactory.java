package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.p1428c.C34319b;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeListServiceFactory implements C47373d<C34319b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50134a;

    public final C34319b get() {
        return provideInstance(this.f50134a);
    }

    public _Awemenotice_apiModule_ProvideNoticeListServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50134a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeListServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeListServiceFactory(_awemenotice_apimodule);
    }

    public static C34319b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeListService(_awemenotice_apimodule);
    }

    public static C34319b proxyProvideNoticeListService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C34319b) C47375f.m147940a(_awemenotice_apimodule.provideNoticeListService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
