package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _ImserviceModule_ProvideIIMServiceFactory implements C47373d<IIMService> {

    /* renamed from: a */
    private final _ImserviceModule f50148a;

    public final IIMService get() {
        return provideInstance(this.f50148a);
    }

    public _ImserviceModule_ProvideIIMServiceFactory(_ImserviceModule _imservicemodule) {
        this.f50148a = _imservicemodule;
    }

    public static _ImserviceModule_ProvideIIMServiceFactory create(_ImserviceModule _imservicemodule) {
        return new _ImserviceModule_ProvideIIMServiceFactory(_imservicemodule);
    }

    public static IIMService provideInstance(_ImserviceModule _imservicemodule) {
        return proxyProvideIIMService(_imservicemodule);
    }

    public static IIMService proxyProvideIIMService(_ImserviceModule _imservicemodule) {
        return (IIMService) C47375f.m147940a(_imservicemodule.provideIIMService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
