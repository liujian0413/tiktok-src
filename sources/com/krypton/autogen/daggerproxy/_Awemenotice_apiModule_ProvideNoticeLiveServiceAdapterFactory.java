package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory implements C47373d<NoticeLiveServiceAdapter> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50135a;

    public final NoticeLiveServiceAdapter get() {
        return provideInstance(this.f50135a);
    }

    public _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50135a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNoticeLiveServiceAdapterFactory(_awemenotice_apimodule);
    }

    public static NoticeLiveServiceAdapter provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNoticeLiveServiceAdapter(_awemenotice_apimodule);
    }

    public static NoticeLiveServiceAdapter proxyProvideNoticeLiveServiceAdapter(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NoticeLiveServiceAdapter) C47375f.m147940a(_awemenotice_apimodule.provideNoticeLiveServiceAdapter(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
