package com.krypton.autogen.daggerproxy;

import com.p280ss.android.ugc.aweme.conan.IConanService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

public final class _Conan_baseModule_ProvideIConanServiceFactory implements C47373d<IConanService> {

    /* renamed from: a */
    private final _Conan_baseModule f50143a;

    public final IConanService get() {
        return provideInstance(this.f50143a);
    }

    public _Conan_baseModule_ProvideIConanServiceFactory(_Conan_baseModule _conan_basemodule) {
        this.f50143a = _conan_basemodule;
    }

    public static _Conan_baseModule_ProvideIConanServiceFactory create(_Conan_baseModule _conan_basemodule) {
        return new _Conan_baseModule_ProvideIConanServiceFactory(_conan_basemodule);
    }

    public static IConanService provideInstance(_Conan_baseModule _conan_basemodule) {
        return proxyProvideIConanService(_conan_basemodule);
    }

    public static IConanService proxyProvideIConanService(_Conan_baseModule _conan_basemodule) {
        return (IConanService) C47375f.m147940a(_conan_basemodule.provideIConanService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
