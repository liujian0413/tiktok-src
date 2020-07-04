package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34303b;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeCountServiceFactory implements C47373d<C34303b> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50132a;

    public final C34303b get() {
        return provideInstance(this.f50132a);
    }

    public _Awemenotice_apiModule_ProvideNoticeCountServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50132a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeCountServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeCountServiceFactory(_awemenotice_apimodule);
    }

    public static C34303b provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeCountService(_awemenotice_apimodule);
    }

    public static C34303b proxyProvideNoticeCountService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (C34303b) C47375f.m147940a(_awemenotice_apimodule.provideNoticeCountService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
