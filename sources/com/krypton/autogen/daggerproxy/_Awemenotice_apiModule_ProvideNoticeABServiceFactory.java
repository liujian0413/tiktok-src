package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeABServiceFactory implements C47373d<NoticeABService> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50128a;

    public final NoticeABService get() {
        return provideInstance(this.f50128a);
    }

    public _Awemenotice_apiModule_ProvideNoticeABServiceFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50128a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeABServiceFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeABServiceFactory(_awemenotice_apimodule);
    }

    public static NoticeABService provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeABService(_awemenotice_apimodule);
    }

    public static NoticeABService proxyProvideNoticeABService(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeABService) C47375f.m147940a(_awemenotice_apimodule.provideNoticeABService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
