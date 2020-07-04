package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory implements C47373d<NoticeLiveWatcherUtil> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50136a;

    public final NoticeLiveWatcherUtil get() {
        return provideInstance(this.f50136a);
    }

    public _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50136a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeLiveWatcherUtilFactory(_awemenotice_apimodule);
    }

    public static NoticeLiveWatcherUtil provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeLiveWatcherUtil(_awemenotice_apimodule);
    }

    public static NoticeLiveWatcherUtil proxyProvideNoticeLiveWatcherUtil(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeLiveWatcherUtil) C47375f.m147940a(_awemenotice_apimodule.provideNoticeLiveWatcherUtil(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
