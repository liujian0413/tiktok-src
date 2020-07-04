package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideI18nLogHelperFactory implements C47373d<I18nLogHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50125a;

    public final I18nLogHelper get() {
        return provideInstance(this.f50125a);
    }

    public _Awemenotice_apiModule_ProvideI18nLogHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50125a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideI18nLogHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideI18nLogHelperFactory(_awemenotice_apimodule);
    }

    public static I18nLogHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideI18nLogHelper(_awemenotice_apimodule);
    }

    public static I18nLogHelper proxyProvideI18nLogHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (I18nLogHelper) C47375f.m147940a(_awemenotice_apimodule.provideI18nLogHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
