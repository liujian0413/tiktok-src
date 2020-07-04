package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Awemenotice_apiModule_ProvideSchemaPageHelperFactory implements C47373d<SchemaPageHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50140a;

    public final SchemaPageHelper get() {
        return provideInstance(this.f50140a);
    }

    public _Awemenotice_apiModule_ProvideSchemaPageHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50140a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideSchemaPageHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideSchemaPageHelperFactory(_awemenotice_apimodule);
    }

    public static SchemaPageHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideSchemaPageHelper(_awemenotice_apimodule);
    }

    public static SchemaPageHelper proxyProvideSchemaPageHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (SchemaPageHelper) C47375f.m147940a(_awemenotice_apimodule.provideSchemaPageHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
